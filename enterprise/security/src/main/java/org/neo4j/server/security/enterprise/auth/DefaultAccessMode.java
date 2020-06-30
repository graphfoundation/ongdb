/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.server.security.enterprise.auth;

import org.eclipse.collections.api.map.primitive.IntObjectMap;
import org.eclipse.collections.api.map.primitive.MutableIntObjectMap;
import org.eclipse.collections.api.set.primitive.IntSet;
import org.eclipse.collections.api.set.primitive.MutableIntSet;
import org.eclipse.collections.impl.factory.primitive.IntObjectMaps;
import org.eclipse.collections.impl.factory.primitive.IntSets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

import org.neo4j.graphdb.security.AuthorizationViolationException;
import org.neo4j.internal.kernel.api.LabelSet;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource.DatabaseScope;
import org.neo4j.internal.kernel.api.security.LoginContext.IdLookup;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.kernel.enterprise.api.security.EnterpriseAdminAccessMode;

class DefaultAccessMode implements AccessMode
{
    private final boolean allowsAccess;
    private final boolean allowsReads;
    private final boolean allowsWrites;
    private final boolean allowsTokenCreates;
    private final boolean allowsSchemaWrites;
    private final boolean passwordChangeRequired;
    private final Set<String> roles;
    private final boolean allowsTraverseAllLabels;
    private final boolean allowsTraverseAllRelTypes;
    private final IntSet whitelistTraverseLabels;
    private final IntSet whitelistTraverseRelTypes;
    private final boolean disallowsTraverseAllLabels;
    private final boolean disallowsTraverseAllRelTypes;
    private final IntSet blacklistTraverseLabels;
    private final IntSet blacklistTraverseRelTypes;
    private final boolean allowsReadAllPropertiesAllLabels;
    private final boolean allowsReadAllPropertiesAllRelTypes;
    private final IntSet whitelistedLabelsForAllProperties;
    private final IntSet whitelistedRelTypesForAllProperties;
    private final IntSet whitelistedNodePropertiesForAllLabels;
    private final IntSet whitelistedNodePropertiesForSomeLabel;
    private final IntSet whitelistedRelationshipPropertiesForAllTypes;
    private final IntSet whitelistedRelationshipPropertiesForSomeType;
    private final IntObjectMap<IntSet> whitelistedLabelsForProperty;
    private final IntObjectMap<IntSet> whitelistedRelTypesForProperty;
    private final boolean disallowsReadAllPropertiesAllLabels;
    private final boolean disallowsReadAllPropertiesAllRelTypes;
    private final IntSet blacklistedNodeProperties;
    private final IntSet blacklistedRelationshipProperties;
    private final IntSet blacklistedLabelsForAllProperties;
    private final IntSet blacklistedRelTypesForAllProperties;
    private final IntObjectMap<IntSet> blacklistedLabelsForProperty;
    private final IntObjectMap<IntSet> blacklistedRelTypesForProperty;
    private final EnterpriseAdminAccessMode enterpriseAdminAccessMode;
    private final DatabaseScope database;

    private DefaultAccessMode( boolean allowsAccess, boolean allowsReads, boolean allowsWrites, boolean allowsTokenCreates, boolean allowsSchemaWrites,
                               boolean passwordChangeRequired, Set<String> roles, boolean allowsTraverseAllLabels, boolean allowsTraverseAllRelTypes,
                               IntSet whitelistTraverseLabels, IntSet whitelistTraverseRelTypes, boolean disallowsTraverseAllLabels,
                               boolean disallowsTraverseAllRelTypes,
                               IntSet blacklistTraverseLabels, IntSet blacklistTraverseRelTypes, boolean allowsReadAllPropertiesAllLabels,
                               boolean allowsReadAllPropertiesAllRelTypes, IntSet whitelistedLabelsForAllProperties, IntSet whitelistedRelTypesForAllProperties,
                               IntSet whitelistedNodePropertiesForAllLabels, IntSet whitelistedRelationshipPropertiesForAllTypes,
                               IntObjectMap<IntSet> whitelistedLabelsForProperty, IntObjectMap<IntSet> whitelistedRelTypesForProperty,
                               boolean disallowsReadAllPropertiesAllLabels,
                               boolean disallowsReadAllPropertiesAllRelTypes, IntSet blacklistedLabelsForAllProperties,
                               IntSet blacklistedRelTypesForAllProperties,
                               IntSet blacklistedNodeProperties, IntSet blacklistedRelationshipProperties, IntObjectMap<IntSet> blacklistedLabelsForProperty,
                               IntObjectMap<IntSet> blacklistedRelTypesForProperty, EnterpriseAdminAccessMode enterpriseAdminAccessMode, String database )
    {
        this.allowsAccess = allowsAccess;
        this.allowsReads = allowsReads;
        this.allowsWrites = allowsWrites;
        this.allowsTokenCreates = allowsTokenCreates;
        this.allowsSchemaWrites = allowsSchemaWrites;
        this.passwordChangeRequired = passwordChangeRequired;
        this.roles = roles;
        this.allowsTraverseAllLabels = allowsTraverseAllLabels;
        this.allowsTraverseAllRelTypes = allowsTraverseAllRelTypes;
        this.whitelistTraverseLabels = whitelistTraverseLabels;
        this.whitelistTraverseRelTypes = whitelistTraverseRelTypes;
        this.disallowsTraverseAllLabels = disallowsTraverseAllLabels;
        this.disallowsTraverseAllRelTypes = disallowsTraverseAllRelTypes;
        this.blacklistTraverseLabels = blacklistTraverseLabels;
        this.blacklistTraverseRelTypes = blacklistTraverseRelTypes;
        this.allowsReadAllPropertiesAllLabels = allowsReadAllPropertiesAllLabels;
        this.allowsReadAllPropertiesAllRelTypes = allowsReadAllPropertiesAllRelTypes;
        this.whitelistedLabelsForAllProperties = whitelistedLabelsForAllProperties;
        this.whitelistedRelTypesForAllProperties = whitelistedRelTypesForAllProperties;
        this.whitelistedNodePropertiesForAllLabels = whitelistedNodePropertiesForAllLabels;
        this.whitelistedRelationshipPropertiesForAllTypes = whitelistedRelationshipPropertiesForAllTypes;
        this.whitelistedLabelsForProperty = whitelistedLabelsForProperty;
        this.whitelistedRelTypesForProperty = whitelistedRelTypesForProperty;
        this.disallowsReadAllPropertiesAllLabels = disallowsReadAllPropertiesAllLabels;
        this.disallowsReadAllPropertiesAllRelTypes = disallowsReadAllPropertiesAllRelTypes;
        this.blacklistedLabelsForAllProperties = blacklistedLabelsForAllProperties;
        this.blacklistedRelTypesForAllProperties = blacklistedRelTypesForAllProperties;
        this.blacklistedNodeProperties = blacklistedNodeProperties;
        this.blacklistedRelationshipProperties = blacklistedRelationshipProperties;
        this.blacklistedLabelsForProperty = blacklistedLabelsForProperty;
        this.blacklistedRelTypesForProperty = blacklistedRelTypesForProperty;
        this.enterpriseAdminAccessMode = enterpriseAdminAccessMode;
        this.database = new DatabaseScope( database );
        this.whitelistedNodePropertiesForSomeLabel = whitelistedLabelsForProperty.keySet().select( ( key ) ->
                                                                                                   {
                                                                                                       return !whitelistedLabelsForProperty
                                                                                                               .get( key ).isEmpty();
                                                                                                   } );
        this.whitelistedRelationshipPropertiesForSomeType = whitelistedRelTypesForProperty.keySet().select( ( key ) ->
                                                                                                            {
                                                                                                                return !whitelistedRelTypesForProperty
                                                                                                                        .get( key ).isEmpty();
                                                                                                            } );
    }

    @Override
    public boolean allowsWrites()
    {
        return this.allowsWrites;
    }

    @Override
    public boolean allowsTokenCreates( PrivilegeAction action )
    {
        return this.allowsTokenCreates && this.enterpriseAdminAccessMode.allows( new AdminActionOnResource( action, this.database ) );
    }

    @Override
    public boolean allowsSchemaWrites()
    {
        return this.allowsSchemaWrites;
    }

    @Override
    public boolean allowsSchemaWrites( PrivilegeAction action )
    {
        return this.allowsSchemaWrites && this.enterpriseAdminAccessMode.allows( new AdminActionOnResource( action, this.database ) );
    }

    @Override
    public boolean allowsTraverseAllLabels()
    {
        return this.allowsTraverseAllLabels && !this.disallowsTraverseAllLabels && this.blacklistTraverseLabels.isEmpty();
    }

    @Override
    public boolean allowsTraverseAllNodesWithLabel( long label )
    {
        if ( !this.disallowsTraverseAllLabels && !this.blacklistTraverseLabels.notEmpty() )
        {
            return this.allowsTraverseAllLabels || this.whitelistTraverseLabels.contains( (int) label );
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean disallowsTraverseLabel( long label )
    {
        return this.disallowsTraverseAllLabels || this.blacklistTraverseLabels.contains( (int) label );
    }

    @Override
    public boolean allowsTraverseNode( long... labels )
    {
        if ( this.allowsTraverseAllLabels() )
        {
            return true;
        }
        else if ( this.disallowsTraverseAllLabels || labels.length == 1 && labels[0] == -1L )
        {
            return false;
        }
        else
        {
            boolean allowedTraverseAnyLabel = false;
            for ( long labelAsLong : labels )
            {
                int label = (int) labelAsLong;
                if ( this.blacklistTraverseLabels.contains( label ) )
                {
                    return false;
                }

                if ( this.whitelistTraverseLabels.contains( label ) )
                {
                    allowedTraverseAnyLabel = true;
                }
            }

            return allowedTraverseAnyLabel || this.allowsTraverseAllLabels;
        }
    }

    @Override
    public boolean allowsTraverseAllRelTypes()
    {
        return this.allowsTraverseAllRelTypes && !this.disallowsTraverseAllRelTypes && this.blacklistTraverseRelTypes.isEmpty();
    }

    @Override
    public boolean allowsTraverseRelType( int relType )
    {
        if ( this.allowsTraverseAllRelTypes() )
        {
            return true;
        }
        else if ( relType != -1 && !this.disallowsTraverseAllRelTypes && !this.blacklistTraverseRelTypes.contains( relType ) )
        {
            return this.allowsTraverseAllRelTypes || this.whitelistTraverseRelTypes.contains( relType );
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean allowsReadPropertyAllLabels( int propertyKey )
    {
        return (this.allowsReadAllPropertiesAllLabels || this.whitelistedNodePropertiesForAllLabels.contains( propertyKey )) &&
               !this.disallowsReadPropertyForSomeLabel( propertyKey );
    }

    @Override
    public boolean disallowsReadPropertyForSomeLabel( int propertyKey )
    {
        return this.disallowsReadAllPropertiesAllLabels || this.blacklistedNodeProperties.contains( propertyKey ) ||
               !this.blacklistedLabelsForAllProperties.isEmpty() || this.blacklistedLabelsForProperty.get( propertyKey ) != null;
    }

    /**
     * Same as above but for all labels.
     *
     * @param propertyKey
     * @return
     */
    private boolean disallowsReadPropertyForAllLabels( int propertyKey )
    {
        return this.disallowsReadAllPropertiesAllLabels || this.blacklistedNodeProperties.contains( propertyKey );
    }

    @Override
    public boolean allowsReadNodeProperty( Supplier<LabelSet> labelSupplier, int propertyKey )
    {
        if ( this.allowsReadPropertyAllLabels( propertyKey ) )
        {
            return true;
        }
        else if ( this.disallowsReadPropertyForAllLabels( propertyKey ) )
        {
            return false;
        }
        else
        {
            LabelSet labelSet = labelSupplier.get();
            IntSet whiteListed = this.whitelistedLabelsForProperty.get( propertyKey );
            IntSet blackListed = this.blacklistedLabelsForProperty.get( propertyKey );
            boolean allowed = false;

            for ( long labelAsLong : labelSet.all() )
            {
                int label = (int) labelAsLong;
                if ( whiteListed != null && whiteListed.contains( label ) )
                {
                    allowed = true;
                }

                if ( blackListed != null && blackListed.contains( label ) )
                {
                    return false;
                }

                if ( this.whitelistedLabelsForAllProperties.contains( label ) )
                {
                    allowed = true;
                }

                if ( this.blacklistedLabelsForAllProperties.contains( label ) )
                {
                    return false;
                }
            }

            return allowed || this.allowsReadAllPropertiesAllLabels || this.whitelistedNodePropertiesForAllLabels.contains( propertyKey );
        }
    }

    @Override
    public boolean allowsReadPropertyAllRelTypes( int propertyKey )
    {
        return (this.allowsReadAllPropertiesAllRelTypes || this.whitelistedRelationshipPropertiesForAllTypes.contains( propertyKey )) &&
               !this.disallowsReadPropertyForSomeRelType( propertyKey );
    }

    /**
     * @param propertyKey
     * @return
     */
    private boolean disallowsReadPropertyForSomeRelType( int propertyKey )
    {
        return this.disallowsReadAllPropertiesAllRelTypes || this.blacklistedRelationshipProperties.contains( propertyKey ) ||
               !this.blacklistedRelTypesForAllProperties.isEmpty() || this.blacklistedRelTypesForProperty.get( propertyKey ) != null;
    }

    private boolean disallowsReadPropertyForAllRelTypes( int propertyKey )
    {
        return this.disallowsReadAllPropertiesAllRelTypes || this.blacklistedRelationshipProperties.contains( propertyKey );
    }

    @Override
    public boolean allowsReadRelationshipProperty( IntSupplier relType, int propertyKey )
    {
        if ( this.allowsReadPropertyAllRelTypes( propertyKey ) )
        {
            return true;
        }
        else if ( this.disallowsReadPropertyForAllRelTypes( propertyKey ) )
        {
            return false;
        }
        else
        {
            IntSet whitelisted = this.whitelistedRelTypesForProperty.get( propertyKey );
            IntSet blacklisted = this.blacklistedRelTypesForProperty.get( propertyKey );
            boolean allowed = whitelisted != null && whitelisted.contains( relType.getAsInt() ) ||
                              this.whitelistedRelTypesForAllProperties.contains( relType.getAsInt() ) || this.allowsReadAllPropertiesAllRelTypes ||
                              this.whitelistedRelationshipPropertiesForAllTypes.contains( propertyKey );
            boolean disallowedRelType = blacklisted != null && blacklisted.contains( relType.getAsInt() ) ||
                                        this.blacklistedRelTypesForAllProperties.contains( relType.getAsInt() );
            return allowed && !disallowedRelType;
        }
    }

    @Override
    public boolean allowsSeePropertyKeyToken( int propertyKey )
    {
        boolean disabledForNodes = this.disallowsReadAllPropertiesAllLabels || this.blacklistedNodeProperties.contains( propertyKey ) ||
                                   !this.allowPropertyReadOnSomeNode( propertyKey );
        boolean disabledForRels = this.disallowsReadAllPropertiesAllRelTypes || this.blacklistedRelationshipProperties.contains( propertyKey ) ||
                                  !this.allowsPropertyReadOnSomeRelType( propertyKey );
        return !disabledForNodes || !disabledForRels;
    }

    private boolean allowPropertyReadOnSomeNode( int propertyKey )
    {
        return this.allowsReadAllPropertiesAllLabels || this.whitelistedNodePropertiesForAllLabels.contains( propertyKey ) ||
               this.whitelistedNodePropertiesForSomeLabel.contains( propertyKey ) || this.whitelistedLabelsForAllProperties.notEmpty();
    }

    private boolean allowsPropertyReadOnSomeRelType( int propertyKey )
    {
        return this.allowsReadAllPropertiesAllRelTypes || this.whitelistedRelationshipPropertiesForAllTypes.contains( propertyKey ) ||
               this.whitelistedRelationshipPropertiesForSomeType.contains( propertyKey ) || this.whitelistedRelTypesForAllProperties.notEmpty();
    }

    @Override
    public boolean allowsProcedureWith( String[] roleNames )
    {
        for ( String roleName : roleNames )
        {
            if ( this.roles.contains( roleName ) )
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public AuthorizationViolationException onViolation( String msg )
    {
        return this.passwordChangeRequired ? Static.CREDENTIALS_EXPIRED.onViolation( "Permission denied." ) : new AuthorizationViolationException( msg );
    }

    @Override
    public String name()
    {
        Set<String> sortedRoles = new TreeSet( this.roles );
        return this.roles.isEmpty() ? "no roles" : "roles [" + String.join( ",", sortedRoles ) + "]";
    }

    boolean allowsAccess()
    {
        return this.allowsAccess;
    }

    @Override
    public Set<String> roles()
    {
        return this.roles;
    }

    EnterpriseAdminAccessMode getEnterpriseAdminAccessMode()
    {
        return this.enterpriseAdminAccessMode;
    }

    /**
     * Standard Builder Pattern we use elsewhere.
     */
    static class Builder
    {
        private final boolean isAuthenticated;
        private final boolean passwordChangeRequired;
        private final Set<String> roles;
        private final IdLookup resolver;
        private final String database;
        private final Map<SecurityResourcePrivilege.GrantOrDeny,Boolean> anyAccess = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,Boolean> anyRead = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,Boolean> anyWrite = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,Boolean> traverseAllLabels = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,Boolean> traverseAllRelTypes = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,MutableIntSet> traverseLabels = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,MutableIntSet> traverseRelTypes = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,Boolean> readAllPropertiesAllLabels = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,Boolean> readAllPropertiesAllRelTypes = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,MutableIntSet> nodeSegmentForAllProperties = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,MutableIntSet> relationshipSegmentForAllProperties = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,MutableIntSet> nodeProperties = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,MutableIntSet> relationshipProperties = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,MutableIntObjectMap<IntSet>> nodeSegmentForProperty = new HashMap<>();
        private final Map<SecurityResourcePrivilege.GrantOrDeny,MutableIntObjectMap<IntSet>> relationshipSegmentForProperty = new HashMap<>();
        private final DefaultEnterpriseAdminAccessMode.Builder adminModeBuilder = new DefaultEnterpriseAdminAccessMode.Builder();
        private boolean token;
        private boolean schema;

        Builder( boolean isAuthenticated, boolean passwordChangeRequired, Set<String> roles, IdLookup resolver, String database )
        {
            this.isAuthenticated = isAuthenticated;
            this.passwordChangeRequired = passwordChangeRequired;
            this.roles = roles;
            this.resolver = resolver;
            this.database = database;

            for ( SecurityResourcePrivilege.GrantOrDeny privilegeType : SecurityResourcePrivilege.GrantOrDeny.values() )
            {
                this.traverseLabels.put( privilegeType, IntSets.mutable.empty() );
                this.traverseRelTypes.put( privilegeType, IntSets.mutable.empty() );
                this.nodeSegmentForAllProperties.put( privilegeType, IntSets.mutable.empty() );
                this.relationshipSegmentForAllProperties.put( privilegeType, IntSets.mutable.empty() );
                this.nodeProperties.put( privilegeType, IntSets.mutable.empty() );
                this.relationshipProperties.put( privilegeType, IntSets.mutable.empty() );
                this.nodeSegmentForProperty.put( privilegeType, IntObjectMaps.mutable.empty() );
                this.relationshipSegmentForProperty.put( privilegeType, IntObjectMaps.mutable.empty() );
            }
        }

        DefaultAccessMode build()
        {
            return new DefaultAccessMode( this.isAuthenticated && this.anyAccess.getOrDefault( SecurityResourcePrivilege.GrantOrDeny.GRANT, false ) &&
                                          !this.anyAccess.getOrDefault( SecurityResourcePrivilege.GrantOrDeny.DENY, false ),
                                          this.isAuthenticated && this.anyRead.getOrDefault( SecurityResourcePrivilege.GrantOrDeny.GRANT, false ),
                                          this.isAuthenticated && this.anyWrite.getOrDefault( SecurityResourcePrivilege.GrantOrDeny.GRANT, false ) &&
                                          !this.anyWrite.getOrDefault( SecurityResourcePrivilege.GrantOrDeny.DENY, false ),
                                          this.isAuthenticated && this.token,
                                          this.isAuthenticated && this.schema, this.passwordChangeRequired, this.roles,
                                          this.traverseAllLabels.getOrDefault( SecurityResourcePrivilege.GrantOrDeny.GRANT, false ),
                                          this.traverseAllRelTypes.getOrDefault( SecurityResourcePrivilege.GrantOrDeny.GRANT, false ),
                                          this.traverseLabels.get( SecurityResourcePrivilege.GrantOrDeny.GRANT ),
                                          this.traverseRelTypes.get( SecurityResourcePrivilege.GrantOrDeny.GRANT ),
                                          this.traverseAllLabels.getOrDefault( SecurityResourcePrivilege.GrantOrDeny.DENY, false ),
                                          this.traverseAllRelTypes.getOrDefault( SecurityResourcePrivilege.GrantOrDeny.DENY, false ),
                                          this.traverseLabels.get( SecurityResourcePrivilege.GrantOrDeny.DENY ),
                                          this.traverseRelTypes.get( SecurityResourcePrivilege.GrantOrDeny.DENY ),
                                          this.readAllPropertiesAllLabels.getOrDefault( SecurityResourcePrivilege.GrantOrDeny.GRANT, false ),
                                          this.readAllPropertiesAllRelTypes.getOrDefault( SecurityResourcePrivilege.GrantOrDeny.GRANT, false ),
                                          this.nodeSegmentForAllProperties.get( SecurityResourcePrivilege.GrantOrDeny.GRANT ),
                                          this.relationshipSegmentForAllProperties.get( SecurityResourcePrivilege.GrantOrDeny.GRANT ),
                                          this.nodeProperties.get( SecurityResourcePrivilege.GrantOrDeny.GRANT ),
                                          this.relationshipProperties.get( SecurityResourcePrivilege.GrantOrDeny.GRANT ),
                                          this.nodeSegmentForProperty.get( SecurityResourcePrivilege.GrantOrDeny.GRANT ),
                                          this.relationshipSegmentForProperty.get( SecurityResourcePrivilege.GrantOrDeny.GRANT ),
                                          this.readAllPropertiesAllLabels.getOrDefault( SecurityResourcePrivilege.GrantOrDeny.DENY, false ),
                                          this.readAllPropertiesAllRelTypes.getOrDefault( SecurityResourcePrivilege.GrantOrDeny.DENY, false ),
                                          this.nodeSegmentForAllProperties.get( SecurityResourcePrivilege.GrantOrDeny.DENY ),
                                          this.relationshipSegmentForAllProperties.get( SecurityResourcePrivilege.GrantOrDeny.DENY ),
                                          this.nodeProperties.get( SecurityResourcePrivilege.GrantOrDeny.DENY ),
                                          this.relationshipProperties.get( SecurityResourcePrivilege.GrantOrDeny.DENY ),
                                          this.nodeSegmentForProperty.get( SecurityResourcePrivilege.GrantOrDeny.DENY ),
                                          this.relationshipSegmentForProperty.get( SecurityResourcePrivilege.GrantOrDeny.DENY ),
                                          this.adminModeBuilder.build(),
                                          this.database );
        }

        DefaultAccessMode.Builder withAccess()
        {
            this.anyAccess.put( SecurityResourcePrivilege.GrantOrDeny.GRANT, true );
            return this;
        }

        DefaultAccessMode.Builder addPrivilege( SecurityResourcePrivilege privilege )
        {
            SecurityResource securityResource = privilege.getSecurityResource();
            SecurityPart securityPart = privilege.getSecurityPart();
            SecurityResourcePrivilege.GrantOrDeny privilegeType = privilege.getPrivilegeType();
            PrivilegeAction action = privilege.getAction();
            switch ( action )
            {
            case ACCESS:
                this.anyAccess.put( privilegeType, true );
                break;
            case TRAVERSE:
                this.anyRead.put( privilegeType, true );
                if ( securityPart instanceof LabelSecurityPart )
                {
                    if ( securityPart.equals( LabelSecurityPart.ALL ) )
                    {
                        this.traverseAllLabels.put( privilegeType, true );
                    }
                    else
                    {
                        this.addLabel( this.traverseLabels.get( privilegeType ), (LabelSecurityPart) securityPart );
                    }
                }
                else
                {
                    if ( !(securityPart instanceof RelTypeSecurityPart) )
                    {
                        throw new IllegalStateException(
                                "Unsupported securityPart qualifier for traverse privilege: " + securityPart.getClass().getSimpleName() );
                    }

                    if ( securityPart.equals( RelTypeSecurityPart.ALL ) )
                    {
                        this.traverseAllRelTypes.put( privilegeType, true );
                    }
                    else
                    {
                        this.addRelType( this.traverseRelTypes.get( privilegeType ), (RelTypeSecurityPart) securityPart );
                    }
                }
                break;
            case READ:
                this.anyRead.put( privilegeType, true );
                switch ( securityResource.type() )
                {
                case GRAPH:
                    this.readAllPropertiesAllLabels.put( privilegeType, true );
                    this.readAllPropertiesAllRelTypes.put( privilegeType, true );
                    return this;
                case PROPERTY:
                    int propertyId = this.resolvePropertyId( securityResource.getArg1() );
                    if ( propertyId != -1 )
                    {
                        if ( securityPart instanceof LabelSecurityPart )
                        {
                            if ( securityPart.equals( LabelSecurityPart.ALL ) )
                            {
                                this.nodeProperties.get( privilegeType ).add( propertyId );
                            }
                            else
                            {
                                this.addLabel( this.nodeSegmentForProperty.get( privilegeType ), (LabelSecurityPart) securityPart,
                                               propertyId );
                            }

                            return this;
                        }
                        else
                        {
                            if ( !(securityPart instanceof RelTypeSecurityPart) )
                            {
                                throw new IllegalStateException(
                                        "Unsupported securityPart qualifier for read privilege: " + securityPart.getClass().getSimpleName() );
                            }

                            if ( securityPart.equals( RelTypeSecurityPart.ALL ) )
                            {
                                this.relationshipProperties.get( privilegeType ).add( propertyId );
                            }
                            else
                            {
                                this.addRelType( this.relationshipSegmentForProperty.get( privilegeType ),
                                                 (RelTypeSecurityPart) securityPart,
                                                 propertyId );
                            }

                            return this;
                        }
                    }

                    return this;
                case ALL_PROPERTIES:
                    if ( securityPart instanceof LabelSecurityPart )
                    {
                        if ( securityPart.equals( LabelSecurityPart.ALL ) )
                        {
                            this.readAllPropertiesAllLabels.put( privilegeType, true );
                        }
                        else
                        {
                            this.addLabel( this.nodeSegmentForAllProperties.get( privilegeType ), (LabelSecurityPart) securityPart );
                        }

                        return this;
                    }
                    else
                    {
                        if ( !(securityPart instanceof RelTypeSecurityPart) )
                        {
                            throw new IllegalStateException(
                                    "Unsupported securityPart qualifier for read privilege: " + securityPart.getClass().getSimpleName() );
                        }

                        if ( securityPart.equals( RelTypeSecurityPart.ALL ) )
                        {
                            this.readAllPropertiesAllRelTypes.put( privilegeType, true );
                        }
                        else
                        {
                            this.addRelType( this.relationshipSegmentForAllProperties.get( privilegeType ),
                                             (RelTypeSecurityPart) securityPart );
                        }

                        return this;
                    }
                default:
                    return this;
                }
            case WRITE:
                switch ( securityResource.type() )
                {
                case GRAPH:
                case PROPERTY:
                case ALL_PROPERTIES:
                    this.anyWrite.put( privilegeType, true );
                    return this;
                default:
                    return this;
                }
            default:
                if ( PrivilegeAction.TOKEN.satisfies( action ) )
                {
                    this.token = true;
                    this.addPrivilegeAction( privilege );
                }
                else if ( PrivilegeAction.SCHEMA.satisfies( action ) )
                {
                    this.schema = true;
                    this.addPrivilegeAction( privilege );
                }
                else if ( PrivilegeAction.ADMIN.satisfies( action ) )
                {
                    this.addPrivilegeAction( privilege );
                }
            }

            return this;
        }

        private void addPrivilegeAction( SecurityResourcePrivilege privilege )
        {
            DatabaseScope dbScope = privilege.isAllDatabases() ? DatabaseScope.ALL : new DatabaseScope( privilege.getDbName() );
            AdminActionOnResource adminAction = new AdminActionOnResource( privilege.getAction(), dbScope );
            if ( privilege.getPrivilegeType().isGrant() )
            {
                this.adminModeBuilder.allow( adminAction );
            }
            else
            {
                this.adminModeBuilder.deny( adminAction );
            }
        }

        private int resolveLabelId( String label )
        {
            assert !label.isEmpty();

            return this.resolver.getLabelId( label );
        }

        private int resolveRelTypeId( String relType )
        {
            assert !relType.isEmpty();

            return this.resolver.getRelTypeId( relType );
        }

        private int resolvePropertyId( String property )
        {
            assert !property.isEmpty();

            return this.resolver.getPropertyKeyId( property );
        }

        private void addLabel( MutableIntObjectMap<IntSet> map, LabelSecurityPart segment, int propertyId )
        {
            MutableIntSet setForProperty = (MutableIntSet) map.getIfAbsentPut( propertyId, IntSets.mutable.empty() );
            this.addLabel( setForProperty, segment );
        }

        private void addLabel( MutableIntSet whiteOrBlacklist, LabelSecurityPart segment )
        {
            int labelId = this.resolveLabelId( segment.getLabel() );
            if ( labelId != -1 )
            {
                whiteOrBlacklist.add( labelId );
            }
        }

        private void addRelType( MutableIntObjectMap<IntSet> map, RelTypeSecurityPart segment, int propertyId )
        {
            MutableIntSet setForProperty = (MutableIntSet) map.getIfAbsentPut( propertyId, IntSets.mutable.empty() );
            this.addRelType( setForProperty, segment );
        }

        private void addRelType( MutableIntSet whiteOrBlacklist, RelTypeSecurityPart segment )
        {
            int relTypeId = this.resolveRelTypeId( segment.getRelType() );
            if ( relTypeId != -1 )
            {
                whiteOrBlacklist.add( relTypeId );
            }
        }
    }
}
