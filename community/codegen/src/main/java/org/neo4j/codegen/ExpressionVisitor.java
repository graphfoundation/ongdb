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
package org.neo4j.codegen;

public interface ExpressionVisitor
{
    void invoke( Expression target, MethodReference method, Expression[] arguments );

    void invoke( MethodReference method, Expression[] arguments );

    void load( LocalVariable variable );

    void arrayLoad( Expression array, Expression index );

    void arraySet( Expression array, Expression index, Expression value );

    void arrayLength( Expression array );

    void getField( Expression target, FieldReference field );

    void constant( Object value );

    void getStatic( FieldReference field );

    void loadThis( String sourceName );

    void newInstance( TypeReference type );

    void not( Expression expression );

    void ternary( Expression test, Expression onTrue, Expression onFalse );

    void equal( Expression lhs, Expression rhs );

    void notEqual( Expression lhs, Expression rhs );

    void isNull( Expression expression );

    void notNull( Expression expression );

    void or( Expression... expressions );

    void and( Expression... expressions );

    void add( Expression lhs, Expression rhs );

    void gt( Expression lhs, Expression rhs );

    void gte( Expression lhs, Expression rhs );

    void lt( Expression lhs, Expression rhs );

    void lte( Expression lhs, Expression rhs );

    void subtract( Expression lhs, Expression rhs );

    void multiply( Expression lhs, Expression rhs );

    void cast( TypeReference type, Expression expression );

    void instanceOf( TypeReference type, Expression expression );

    void newInitializedArray( TypeReference type, Expression... constants );

    void newArray( TypeReference type, int size );

    void longToDouble( Expression expression );

    void pop( Expression expression );

    void box( Expression expression );

    void unbox( Expression expression );

}
