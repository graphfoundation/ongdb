/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypher.internal.evaluator;

import org.neo4j.cypher.internal.expressions.Expression;
import org.neo4j.cypher.internal.runtime.CypherRow;
import org.neo4j.values.AnyValue;
import org.neo4j.values.ValueMapper;
import org.neo4j.values.virtual.MapValue;
import org.neo4j.values.virtual.VirtualNodeValue;
import org.neo4j.values.virtual.VirtualPathValue;
import org.neo4j.values.virtual.VirtualRelationshipValue;

class SimpleExpressionEvaluator implements ExpressionEvaluator
{
    private final InternalExpressionEvaluator evaluator = new SimpleInternalExpressionEvaluator();

    @Override
    public <T> T evaluate( String expression, Class<T> type ) throws EvaluationException
    {
        if ( expression == null )
        {
            throw new EvaluationException( "Cannot evaluate null as an expression " );
        }
        if ( type == null )
        {
            throw new EvaluationException( "Cannot evaluate to type null" );
        }

        return cast( map( evaluator.evaluate( expression ) ), type );
    }

    @Override
    public AnyValue evaluate( Expression expression, MapValue params ) throws EvaluationException
    {
        if ( expression == null )
        {
            throw new EvaluationException( "Cannot evaluate null as an expression " );
        }
        return evaluator.evaluate( expression, params, CypherRow.empty() );
    }

    private static <T> T cast( Object value, Class<T> type ) throws EvaluationException
    {
        try
        {
            return type.cast( value );
        }
        catch ( ClassCastException e )
        {
            throw new EvaluationException( String.format( "Expected expression of be of type `%s` but it was `%s`",
                    type.getCanonicalName(),
                    value.getClass().getCanonicalName() ), e );
        }
    }

    private static Object map( AnyValue value ) throws EvaluationException
    {
        try
        {
            return value.map( MAPPER );
        }
        catch ( EvaluationRuntimeException e )
        {
            throw new EvaluationException( e.getMessage(), e );
        }
    }

    private static final ValueMapper<Object> MAPPER = new ValueMapper.JavaMapper()
    {
        @Override
        public Object mapPath( VirtualPathValue value )
        {
            throw new EvaluationRuntimeException( "Unable to evaluate paths" );
        }

        @Override
        public Object mapNode( VirtualNodeValue value )
        {
            throw new EvaluationRuntimeException( "Unable to evaluate nodes" );
        }

        @Override
        public Object mapRelationship( VirtualRelationshipValue value )
        {
            throw new EvaluationRuntimeException( "Unable to evaluate relationships" );
        }
    };
}
