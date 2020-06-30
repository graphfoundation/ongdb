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
package org.neo4j.cypher.internal.runtime.compiled.expressions;

import org.neo4j.cypher.internal.runtime.DbAccess;
import org.neo4j.cypher.internal.runtime.ExecutionContext;
import org.neo4j.cypher.internal.runtime.KernelAPISupport;
import org.neo4j.exceptions.CypherTypeException;
import org.neo4j.exceptions.ParameterWrongTypeException;
import org.neo4j.internal.kernel.api.IndexQuery;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.BooleanValue;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.ValueGroup;
import org.neo4j.values.storable.Values;
import org.neo4j.values.virtual.VirtualNodeValue;

/**
 * Contains helper methods used from compiled expressions
 */
@SuppressWarnings( "unused" )
public final class CompiledHelpers
{
    private static final ValueGroup[] RANGE_SEEKABLE_VALUE_GROUPS = KernelAPISupport.RANGE_SEEKABLE_VALUE_GROUPS();

    /**
     *
     */
    private CompiledHelpers()
    {
        throw new UnsupportedOperationException( "Please do not initiate." );
    }

    /**
     * @param value
     * @return
     */
    public static Value assertBooleanOrNoValue( AnyValue value )
    {
        if ( value != Values.NO_VALUE && !(value instanceof BooleanValue) )
        {
            throw new CypherTypeException( String.format( "Don't know how to treat a predicate: %s", value.toString() ), null );
        }
        else
        {
            return (Value) value;
        }
    }

    /**
     * @param context
     * @param dbAccess
     * @param offset
     * @return
     */
    public static AnyValue nodeOrNoValue( ExecutionContext context, DbAccess dbAccess, int offset )
    {
        long nodeId = context.getLongAt( offset );
        return (nodeId == -1L ? Values.NO_VALUE : dbAccess.nodeById( nodeId ));
    }

    public static AnyValue nodeOrNoValue( DbAccess dbAccess, long nodeId )
    {
        return (nodeId == -1L ? Values.NO_VALUE : dbAccess.nodeById( nodeId ));
    }

    /**
     * @param context
     * @param dbAccess
     * @param offset
     * @return
     */
    public static AnyValue relationshipOrNoValue( ExecutionContext context, DbAccess dbAccess, int offset )
    {
        long relationshipId = context.getLongAt( offset );
        return (relationshipId == -1L ? Values.NO_VALUE : dbAccess.relationshipById( relationshipId ));
    }

    /**
     * @param query
     * @return
     */
    public static boolean possibleRangePredicate( IndexQuery query )
    {
        ValueGroup valueGroup = query.valueGroup();

        for ( ValueGroup rangeSeekableValueGroup : RANGE_SEEKABLE_VALUE_GROUPS )
        {
            if ( valueGroup == rangeSeekableValueGroup )
            {
                return true;
            }
        }

        return false;
    }

    /**
     * @param value
     * @return
     */
    public static long nodeFromAnyValue( AnyValue value )
    {
        if ( value instanceof VirtualNodeValue )
        {
            return ((VirtualNodeValue) value).id();
        }
        else
        {
            throw new ParameterWrongTypeException( String.format( "Expected to find a node but found %s instead", value ) );
        }
    }

    /**
     * @param value
     * @return
     */
    public static long nodeIdOrNullFromAnyValue( AnyValue value )
    {
        return value instanceof VirtualNodeValue ? ((VirtualNodeValue) value).id() : -1L;
    }
}
