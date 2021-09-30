
package org.neo4j.cypher.internal

import io.github.onograph.config.MainSettings
import io.github.onograph.kernel.api.security.DefaultAuthManager
import io.github.onograph.server.security.auth.ElementEntitlementDTO.EntitlementActionType
import io.github.onograph.server.security.auth.SecurityElement
import io.github.onograph.server.security.systemgraph.DefaultSecuritySystemGraphComponent
import org.neo4j.common.DependencyResolver
import org.neo4j.configuration.Config
import org.neo4j.configuration.GraphDatabaseSettings
import org.neo4j.configuration.helpers.DatabaseNameValidator
import org.neo4j.configuration.helpers.NormalizedDatabaseName
import org.neo4j.dbms.api.DatabaseLimitReachedException
import org.neo4j.values.storable.LongValue

import java.util.UUID
import java.util.concurrent.ThreadLocalRandom;


import org.neo4j.cypher.internal.ast.ActionResource
import org.neo4j.cypher.internal.ast.AllLabelResource
import org.neo4j.cypher.internal.ast.AllPropertyResource
import org.neo4j.cypher.internal.ast.DatabaseResource
import org.neo4j.cypher.internal.ast.GraphScope
import org.neo4j.cypher.internal.ast.LabelResource
import org.neo4j.cypher.internal.ast.NoResource
import org.neo4j.cypher.internal.ast.PrivilegeQualifier
import org.neo4j.cypher.internal.ast.PropertyResource
import org.neo4j.cypher.internal.compiler.phases.LogicalPlanState
import org.neo4j.cypher.internal.expressions.Parameter
import org.neo4j.cypher.internal.logical.plans.AssertNotBlocked
import org.neo4j.cypher.internal.logical.plans.CreateDatabase
import org.neo4j.cypher.internal.logical.plans.EnsureValidNumberOfDatabases
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.ShowUsers
import org.neo4j.cypher.internal.procs.PredicateExecutionPlan
import org.neo4j.cypher.internal.procs.QueryHandler
import org.neo4j.cypher.internal.procs.SystemCommandExecutionPlan
import org.neo4j.cypher.internal.procs.UpdatingSystemCommandExecutionPlan
import org.neo4j.exceptions.CantCompileQueryException
import org.neo4j.exceptions.DatabaseAdministrationOnFollowerException
import org.neo4j.exceptions.InvalidArgumentException
import org.neo4j.graphdb.Transaction
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog
import org.neo4j.internal.kernel.api.security.PrivilegeAction
import org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler
import org.neo4j.kernel.api.exceptions.Status.HasStatus
import org.neo4j.kernel.impl.store.format.standard.Standard
import org.neo4j.values.storable.Value
import org.neo4j.values.storable.Values
import org.neo4j.values.virtual.MapValue
import org.neo4j.values.virtual.VirtualValues

case class EnterpriseAdministrationCommandRuntime(normalExecutionEngine: ExecutionEngine, resolver: DependencyResolver) extends AdministrationCommandRuntime {

  private lazy val securityAuthorizationHandler = new SecurityAuthorizationHandler(resolver.resolveDependency(classOf[AbstractSecurityLog]))

  val authManager = resolver.resolveDependency(classOf[DefaultAuthManager])
  val enterpriseSecurityGraphComponent: DefaultSecuritySystemGraphComponent = resolver.resolveDependency(classOf[DefaultSecuritySystemGraphComponent])
  val config: Config = resolver.resolveDependency(classOf[Config])

  private val communityCommandRuntime: CommunityAdministrationCommandRuntime =
    new CommunityAdministrationCommandRuntime(normalExecutionEngine,
      resolver,
      this.logicalToExecutable)
  private val maxDBLimit: Long = config.get(MainSettings.settingMamfbLong)
  private val _privilegeKeys: Map[String, String] = Map(
    "action" -> this.internalKey("action"),
    "resourceValue" -> this.internalKey("resourceValue"),
    "resource" -> this.internalKey("resource"),
    "label" -> this.internalKey("label")
  )

  def throwCantCompile(unknownPlan: LogicalPlan): Nothing = {
    throw new CantCompileQueryException(
      s"Bad Plan: ${unknownPlan.getClass.getSimpleName}")
  }

  def privilegeKeys(): Map[String, String] = {
    _privilegeKeys
  }

  override def compileToExecutable(state: LogicalQuery, context: RuntimeContext): ExecutionPlan = {

    fullLogicalToExecutable.applyOrElse(state.logicalPlan, throwCantCompile).apply(AdministrationCommandRuntimeContext(context))
  }

  override def isApplicableAdministrationCommand(logicalPlanState: LogicalPlanState): Boolean = {
    val res: Boolean = fullLogicalToExecutable.isDefinedAt(logicalPlanState.maybeLogicalPlan.get)

    res
  }

  override def name: String = "enterprise administration-commands"

  private def fullLogicalToExecutable = logicalToExecutable orElse communityCommandRuntime.logicalToExecutable

  private def getResourcePart(resource: ActionResource, startOfErrorMessage: String, grantName: String, matchOrMerge: String): (Value, Value, String) = {

    if (resource.isInstanceOf[DatabaseResource]) {
      return (Values.NO_VALUE, Values.utf8Value(SecurityElement.ElementType.DATABASE.toString()), (new StringBuilder(27)).append(matchOrMerge).append(" (res:Resource {type: $`").append(privilegeKeys.apply("resource")).append("`})").toString())
    }
    if (resource.isInstanceOf[PropertyResource]) {
      return (Values.utf8Value(name), Values.utf8Value(SecurityElement.ElementType.PROPERTY.toString()), (new StringBuilder(38)).append(matchOrMerge).append(" (res:Resource {type: $`").append(privilegeKeys.apply("resource")).append("`, arg1: $`").append(privilegeKeys.apply("resourceValue")).append("`})").toString())
    }

    if (resource.isInstanceOf[AllPropertyResource]) {
      return (Values.NO_VALUE, Values.utf8Value(SecurityElement.ElementType.ALL_PROPERTIES.toString()), (new StringBuilder(27)).append(matchOrMerge).append(" (res:Resource {type: $`").append(privilegeKeys.apply("resource")).append("`})").toString())
    }

    if (resource.isInstanceOf[LabelResource]) {
      return (Values.utf8Value(name), Values.utf8Value(SecurityElement.ElementType.LABEL.toString()), (new StringBuilder(38)).append(matchOrMerge).append(" (res:Resource {type: $`").append(privilegeKeys.apply("resource")).append("`, arg1: $`").append(privilegeKeys.apply("resourceValue")).append("`})").toString())
    }

    if (resource.isInstanceOf[AllLabelResource]) {
      return (Values.NO_VALUE, Values.utf8Value(SecurityElement.ElementType.ALL_LABELS.toString()), (new StringBuilder(27)).append(matchOrMerge).append(" (res:Resource {type: $`").append(privilegeKeys.apply("resource")).append("`})").toString())
    }

    if (!resource.isInstanceOf[NoResource]) {
      throw new IllegalStateException((new StringBuilder(35)).append(startOfErrorMessage).append(": Invalid privilege ").append(grantName).append(" resource type ").append(resource).toString())
    }

    (Values.NO_VALUE, Values.utf8Value(SecurityElement.ElementType.GRAPH.toString()), (new StringBuilder(27)).append(matchOrMerge).append(" (res:Resource {type: $`").append(privilegeKeys.apply("resource")).append("`})").toString())

  } // End getResourcePart

  private def getQualifierPart(qualifier: PrivilegeQualifier,
                               startOfErrorMessage: String,
                               grantName: String,
                               matchOrMerge: String): (String, Value, Function2[Transaction, MapValue, MapValue], String) = {
    null
  }

  private def escapeName(name: scala.Either[scala.Predef.String, scala.AnyRef]): scala.Predef.String = {
    null
  }

  private def makeGrantOrDenyExecutionPlan(privilegeAction: PrivilegeAction,
                                           resource: ActionResource,
                                           database: GraphScope,
                                           qualifier: PrivilegeQualifier,
                                           roleName: Either[String, Parameter],
                                           source: Option[ExecutionPlan],
                                           grant: EntitlementActionType,
                                           startOfErrorMessage: scala.Function1[MapValue, String]): UpdatingSystemCommandExecutionPlan = {
    null
  }

  private def makeRevokeExecutionPlan(privilegeAction: PrivilegeAction,
                                      resource: ActionResource,
                                      database: GraphScope,
                                      qualifier: PrivilegeQualifier,
                                      roleName: Either[String, Parameter],
                                      revokeType: String,
                                      source: Option[ExecutionPlan],
                                      startOfErrorMessage: Function1[MapValue, String]): UpdatingSystemCommandExecutionPlan = {
    null
  }

  /**
   * Code below adds enterprise commands
   *
   * @return
   */

  private def logicalToExecutable: PartialFunction[LogicalPlan, AdministrationCommandRuntimeContext => ExecutionPlan] = {

    case AssertNotBlocked(action) => (context) =>

      new PredicateExecutionPlan(
        (_, _) => true,

        onViolation = (_, sc) => new UnsupportedOperationException("Opp is invalid.") //.apply(context))

      )

    case ShowUsers(source, symbols, yields, returns) => (context) =>
      SystemCommandExecutionPlan("ShowUsers", normalExecutionEngine, securityAuthorizationHandler,
        s"""MATCH (u:User)
           | OPTIONAL MATCH (u)-[:HAS_ROLE]->(r:Role)
           | WITH u, r.name as roleNames ORDER BY roleNames
           | WITH u, collect(roleNames) as roles
           | WITH u.name as user, roles + 'PUBLIC' as roles, u.passwordChangeRequired AS passwordChangeRequired, u.suspended AS suspended
           |${AdministrationShowCommandUtils.generateReturnClause(symbols, yields, returns, Seq("user"))}
           |""".stripMargin,
        VirtualValues.EMPTY_MAP,

        source = Some(fullLogicalToExecutable.applyOrElse(source, throwCantCompile).apply(context))
      )





    


    case CreateDatabase(source, databaseName, options) => (context) =>

      val nameFields: NameFields = getNameFields("databaseName", databaseName, valueMapper = s => {
        val normalizedName: NormalizedDatabaseName = new NormalizedDatabaseName(s)

        try {
          DatabaseNameValidator.validateExternalDatabaseName(normalizedName)
        } catch {
          case ex: IllegalArgumentException =>
            throw new InvalidArgumentException(ex.getMessage)
        }

        normalizedName.name
      })

      val dbNameValue: Value = nameFields.nameValue

      val defaultDbName: String = config.get(GraphDatabaseSettings.default_database)

      val virtualKeys: Array[String] = Array("name", "status", "default", "uuid")

      val initialMembers = Array.empty 
      val creationTime = System.currentTimeMillis;
      val randomId = ThreadLocalRandom.current.nextLong
      val storeVersion = Standard.LATEST_STORE_VERSION

      val clusterProperties: String =
        s"""
           |  , // important if empty
           |   d.initial_members = $$initialMembers
           |   d.store_creation_time = $$creationTime
           |   d.store_random_id = $$randomId
           |   d.store_version = $$storeVersion
        """.stripMargin

      UpdatingSystemCommandExecutionPlan("CreateDatabase", normalExecutionEngine, securityAuthorizationHandler,
        s"""
           | CREATE (d:Database {name: $$name})
           | SET
           | d.status = $$status,
           | d.default = $$default,
           | d.created_at = datetime(),
           | d.uuid = $$uuid
           | RETURN d.name as name, d.status as status, d.uuid as uuid
        """.stripMargin,
        VirtualValues.map(virtualKeys,
          Array(dbNameValue, Values.stringValue(DatabaseStatus.Online.stringValue()), Values.booleanValue(name.equals(defaultDbName)), Values.stringValue(UUID.randomUUID().toString()))),
        QueryHandler
          .handleError {
            case (error: HasStatus, p) if error.status() == org.neo4j.kernel.api.exceptions.Status.Cluster.NotALeader =>
              new DatabaseAdministrationOnFollowerException(s"Error creating gdb ${name}: $followerError", error)

            case (error, p) => new IllegalStateException(s"GDB not created: ${name}", error)
          },
        Some(fullLogicalToExecutable.applyOrElse(source, throwCantCompile).apply(context)),
      )






    


    case EnsureValidNumberOfDatabases(source) => (context) =>

      UpdatingSystemCommandExecutionPlan("EnsureValidNumberOfDatabases", normalExecutionEngine, securityAuthorizationHandler,
        s"""
           | MATCH (d:Database)
           | RETURN count(d) as numberOfDatabases
        """.stripMargin,
        VirtualValues.EMPTY_MAP,
        QueryHandler
          .handleResult((_, numberOfDatabases, _) => {
            if (numberOfDatabases.asInstanceOf[LongValue].longValue() > maxDBLimit) {
              throw new DatabaseLimitReachedException("Can not create any more databases. Set limit in config for more.");
            }

            None
          }),
        Some(fullLogicalToExecutable.applyOrElse(source, throwCantCompile).apply(context)),
      )

  }
  
  
}
