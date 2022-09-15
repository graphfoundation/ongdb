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

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.neo4j.codegen.MethodDeclaration.TypeParameter.NO_PARAMETERS;
import static org.neo4j.codegen.MethodDeclaration.constructor;
import static org.neo4j.codegen.MethodDeclaration.method;
import static org.neo4j.codegen.MethodReference.methodReference;
import static org.neo4j.codegen.TypeReference.NO_TYPES;
import static org.neo4j.codegen.TypeReference.typeReference;

/**
 * A ClassGenerator enrichs a ClassWriter with field management, and returns CodeBlocks instead of MethodWriters.
 */
public class ClassGenerator implements AutoCloseable
{
    private final ClassHandle handle;
    private ClassWriter writer;
    private Map<String,FieldReference> fields;
    private boolean hasConstructor;

    ClassGenerator( ClassHandle handle, ClassWriter writer )
    {
        this.handle = handle;
        this.writer = writer;
    }

    @Override
    public void close()
    {
        if ( !hasConstructor )
        {
            generate( MethodTemplate.constructor().invokeSuper().build() );
        }
        writer.done();
        handle.generator.closeClass();
        writer = InvalidState.CLASS_DONE;
    }

    public ClassHandle handle()
    {
        return handle;
    }

    public FieldReference field( Class<?> type, String name )
    {
        return field( typeReference( type ), name );
    }

    public FieldReference field( TypeReference type, String name )
    {
        return emitField( Modifier.PUBLIC, type, name, null );
    }

    public FieldReference privateStaticFinalField( Class<?> type, String name, Expression value )
    {
        return privateStaticFinalField( typeReference( type ), name, value );
    }

    public FieldReference publicStaticField( TypeReference type, String name )
    {
        return emitField( Modifier.PUBLIC | Modifier.STATIC, type, name, null );
    }

    public FieldReference privateStaticField( Class<?> type, String name, Expression value )
    {
        return privateStaticField( typeReference( type ), name, value );
    }

    public FieldReference privateStaticField( TypeReference type, String name, Expression value )
    {
        return emitField( Modifier.PRIVATE | Modifier.STATIC, type, name, value );
    }

    public FieldReference privateStaticFinalField( TypeReference type, String name, Expression value )
    {
        return emitField( Modifier.PRIVATE | Modifier.STATIC | Modifier.FINAL, type, name, Objects.requireNonNull( value ) );
    }

    private FieldReference emitField( int modifiers, TypeReference type, String name, Expression value )
    {
        if ( fields == null )
        {
            fields = new HashMap<>();
        }
        else if ( fields.containsKey( name ) )
        {
            throw new IllegalArgumentException( handle + " already has a field '" + name + "'" );
        }
        FieldReference field = new FieldReference( modifiers, handle, type, name );
        fields.put( name, field );
        writer.field( field, value );
        return field;
    }

    public MethodReference generate( MethodTemplate template, Binding... bindings )
    {
        try ( CodeBlock generator = generate( template.declaration( handle ) ) )
        {
            template.generate( generator );
        }
        return methodReference( handle, template.returnType(), template.name(), template.modifiers(),  template.parameterTypes() );
    }

    public CodeBlock generateConstructor( Parameter... parameters )
    {
        return generate( constructor( handle, parameters,/*throws:*/NO_TYPES, Modifier.PUBLIC, NO_PARAMETERS ) );
    }

    public CodeBlock generateConstructor( int modifiers, Parameter... parameters )
    {
        return generate( constructor( handle, parameters,/*throws:*/NO_TYPES, modifiers, NO_PARAMETERS ) );
    }

    public CodeBlock generateMethod( Class<?> returnType, String name, Parameter... parameters )
    {
        return generateMethod( typeReference( returnType ), name, Modifier.PUBLIC, parameters );
    }

    public CodeBlock generateMethod( Class<?> returnType, String name, int modifiers, Parameter... parameters )
    {
        return generateMethod( typeReference( returnType ), name, modifiers, parameters );
    }

    public CodeBlock generateMethod( TypeReference returnType, String name, Parameter... parameters )
    {
        return generate( method( handle, returnType, name, parameters,/*throws:*/NO_TYPES, Modifier.PUBLIC, NO_PARAMETERS ) );
    }

    public CodeBlock generateMethod( TypeReference returnType, String name, int modifiers, Parameter... parameters )
    {
        return generate( method( handle, returnType, name, parameters,/*throws:*/NO_TYPES, modifiers, NO_PARAMETERS ) );
    }

    public CodeBlock generate( MethodDeclaration.Builder builder )
    {
        return generate( builder.build( handle ) );
    }

    private CodeBlock generate( MethodDeclaration declaration )
    {
        if ( declaration.isConstructor() )
        {
            hasConstructor = true;
        }
        return new CodeBlock( this, writer.method( declaration ), declaration.parameters() );
    }

    FieldReference getField( String name )
    {
        return fields == null ? null : fields.get( name );
    }
}
