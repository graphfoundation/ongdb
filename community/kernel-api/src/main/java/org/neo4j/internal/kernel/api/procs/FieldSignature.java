/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.internal.kernel.api.procs;

import java.util.Objects;
import java.util.Optional;

import org.neo4j.values.AnyValue;
import org.neo4j.values.ValueMapper;

import static java.util.Objects.requireNonNull;

/** Represents a type and a name for a field in a record, used to define input and output record signatures. */
public final class FieldSignature
{
    public static FieldSignature inputField( String name, Neo4jTypes.AnyType type )
    {
        return inputField( name, type, false );
    }

    public static FieldSignature inputField( String name, Neo4jTypes.AnyType type, DefaultParameterValue defaultValue )
    {
        return inputField( name, type, defaultValue, false );
    }

    public static FieldSignature inputField( String name, Neo4jTypes.AnyType type, boolean sensitive )
    {
        return new FieldSignature( name, type, null, false, sensitive );
    }

    public static FieldSignature inputField( String name, Neo4jTypes.AnyType type, DefaultParameterValue defaultValue, boolean sensitive )
    {
        return new FieldSignature( name, type, requireNonNull( defaultValue, "defaultValue" ), false, sensitive );
    }

    public static FieldSignature outputField( String name, Neo4jTypes.AnyType type )
    {
        return outputField( name, type, false );
    }

    public static FieldSignature outputField( String name, Neo4jTypes.AnyType type, boolean deprecated )
    {
        return new FieldSignature( name, type, null, deprecated, false );
    }

    private final String name;
    private final Neo4jTypes.AnyType type;
    private final DefaultParameterValue defaultValue;
    private final boolean deprecated;
    private final boolean sensitive;

    private FieldSignature( String name, Neo4jTypes.AnyType type, DefaultParameterValue defaultValue, boolean deprecated, boolean sensitive )
    {
        this.name = requireNonNull( name, "name" );
        this.type = requireNonNull( type, "type" );
        this.defaultValue = defaultValue;
        this.deprecated = deprecated;
        this.sensitive = sensitive;
        if ( defaultValue != null && !type.equals( defaultValue.neo4jType() ) )
        {
            throw new IllegalArgumentException( String.format(
                    "Default value does not have a valid type, field type was %s, but value type was %s.",
                    type, defaultValue.neo4jType().toString() ) );
        }
    }

    /** Fields that are not supported full stack (ie. by Cypher) need to be mapped from Cypher to internal types */
    public static Object map( Object input )
    {
        return input;
    }

    public static Object map( AnyValue input, ValueMapper<Object> mapper )
    {
        return input.map( mapper );
    }

    public String name()
    {
        return name;
    }

    public Neo4jTypes.AnyType neo4jType()
    {
        return type;
    }

    public Optional<DefaultParameterValue> defaultValue()
    {
        return Optional.ofNullable( defaultValue );
    }

    public boolean isDeprecated()
    {
        return deprecated;
    }

    public boolean isSensitive()
    {
        return sensitive;
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        result.append( name );
        if ( defaultValue != null )
        {
            result.append( " = " ).append( defaultValue.javaValue() );
        }
        return result.append( " :: " ).append( type ).toString();
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }
        FieldSignature that = (FieldSignature) o;
        return this.deprecated == that.deprecated &&
                sensitive == that.sensitive &&
                name.equals( that.name ) &&
                type.equals( that.type ) &&
                Objects.equals( this.defaultValue, that.defaultValue );
    }

    @Override
    public int hashCode()
    {
        int result = name.hashCode();
        return 31 * result + type.hashCode();
    }
}
