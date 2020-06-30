/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
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
package org.neo4j.kernel.enterprise.builtinprocs;

import java.time.ZoneId;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.spatial.CRS;
import org.neo4j.graphdb.spatial.Coordinate;
import org.neo4j.graphdb.spatial.Point;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.kernel.api.query.ExecutingQuery;
import org.neo4j.kernel.api.query.QuerySnapshot;
import org.neo4j.kernel.enterprise.builtinprocs.dbms.QueryId;
import org.neo4j.kernel.impl.core.TransactionalEntityFactory;
import org.neo4j.kernel.impl.util.BaseToObjectValueWriter;
import org.neo4j.procedure.builtin.ProceduresTimeFormatHelper;
import org.neo4j.values.storable.CoordinateReferenceSystem;
import org.neo4j.values.virtual.MapValue;

public class QueryStatusResult
{

    public final String queryId;
    public final String username;
    public final Map<String,Object> metaData;
    public final String query;
    public final Map<String,Object> parameters;
    /**
     * @since Neo4j 3.2
     */
    public final String planner;
    /**
     * @since Neo4j 3.2
     */
    public final String runtime;
    /**
     * @since Neo4j 3.2
     */
    public final List<Map<String,String>> indexes;
    public final String startTime;
    /**
     * @since Neo4j 3.2
     */
    public final String protocol;
    /**
     * @since Neo4j 3.2
     */
    public final String clientAddress;
    /**
     * @since Neo4j 3.2
     */
    public final String requestUri;
    /**
     * @since Neo4j 3.2
     */
    public final String status;
    /**
     * @since Neo4j 3.2
     */
    public final Map<String,Object> resourceInformation;
    /**
     * @since Neo4j 3.2
     */
    public final long activeLockCount;
    /**
     * @since Neo4j 3.2
     */
    public final long elapsedTimeMillis; // TODO: this field should be of a Duration type (when Cypher supports that)
    /**
     * @since Neo4j 3.2, will be {@code null} if measuring CPU time is not supported.
     */
    public final Long cpuTimeMillis; // TODO: we want this field to be of a Duration type (when Cypher supports that)
    /**
     * @since Neo4j 3.2
     */
    public final long waitTimeMillis; // TODO: we want this field to be of a Duration type (when Cypher supports that)
    /**
     * @since Neo4j 3.2
     */
    public final Long idleTimeMillis; // TODO: we want this field to be of a Duration type (when Cypher supports that)
    /**
     * @since Neo4j 3.2, will be {@code null} if measuring allocation is not supported.
     */
    public final Long allocatedBytes;
    /**
     * @since Neo4j 3.2
     */
    public final long pageHits;
    /**
     * @since Neo4j 3.2
     */
    public final long pageFaults;
    /**
     * @since Neo4j 3.5
     */
    public final String connectionId;

    public final String database;

    QueryStatusResult( ExecutingQuery query, TransactionalEntityFactory manager, ZoneId zoneId,
                       String database ) throws InvalidArgumentsException
    {
        this( query.snapshot(), manager, zoneId, database );
    }

    private QueryStatusResult( QuerySnapshot query, TransactionalEntityFactory manager, ZoneId zoneId,
                               String database ) throws InvalidArgumentsException
    {
        this.queryId = (new QueryId( database, query.internalQueryId() )).toString();
        this.username = query.username();
        this.query = query.queryText();
        this.database = database;
        this.parameters = asRawMap( query.queryParameters(),
                                    new QueryStatusResult.ParameterWriter( manager ) );
        this.startTime = ProceduresTimeFormatHelper.formatTime( query.startTimestampMillis(), zoneId );
        this.elapsedTimeMillis = this.asMillis( query.elapsedTimeMicros() );
        ClientConnectionInfo clientConnection = query.clientConnection();
        this.protocol = clientConnection.protocol();
        this.clientAddress = clientConnection.clientAddress();
        this.requestUri = clientConnection.requestURI();
        this.metaData = query.transactionAnnotationData();
        this.cpuTimeMillis = this.asMillis( query.cpuTimeMicros() );
        this.status = query.status();
        this.resourceInformation = query.resourceInformation();
        this.activeLockCount = query.activeLockCount();
        this.waitTimeMillis = this.asMillis( query.waitTimeMicros() );
        this.idleTimeMillis = this.asMillis( query.idleTimeMicros() );
        this.planner = query.planner();
        this.runtime = query.runtime();
        this.indexes = query.indexes();
        this.allocatedBytes = (Long) query.allocatedBytes().orElse( null );
        this.pageHits = query.pageHits();
        this.pageFaults = query.pageFaults();
        this.connectionId = clientConnection.connectionId();
    }

    private static Map<String,Object> asRawMap( MapValue mapValue, ParameterWriter writer )
    {
        HashMap<String,Object> map = new HashMap();
        mapValue.foreach( ( s, value ) ->
                          {
                              value.writeTo( writer );
                              map.put( s, writer.value() );
                          } );
        return map;
    }

    private Long asMillis( Long micros )
    {
        return micros == null ? null : TimeUnit.MICROSECONDS.toMillis( micros );
    }

    private static class ParameterWriter extends BaseToObjectValueWriter<RuntimeException>
    {

        private final TransactionalEntityFactory entityFactory;

        private ParameterWriter( TransactionalEntityFactory entityFactory )
        {
            this.entityFactory = entityFactory;
        }

        protected Node newNodeEntityById( long id )
        {
            return this.entityFactory.newNodeEntity( id );
        }

        protected Relationship newRelationshipEntityById( long id )
        {
            return this.entityFactory.newRelationshipEntity( id );
        }

        protected Point newPoint( final CoordinateReferenceSystem crs, final double[] coordinate )
        {
            return new Point()
            {
                public String getGeometryType()
                {
                    return "Point";
                }

                public List<Coordinate> getCoordinates()
                {
                    return Collections.singletonList( new Coordinate( coordinate ) );
                }

                public CRS getCRS()
                {
                    return crs;
                }
            };
        }
    }
}
