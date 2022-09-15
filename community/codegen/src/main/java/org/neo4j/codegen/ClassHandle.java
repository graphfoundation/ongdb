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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class ClassHandle extends TypeReference
{
    private final TypeReference parent;
    final CodeGenerator generator;
    private final long compilationUnit;

    ClassHandle( String packageName, String name, TypeReference parent, CodeGenerator generator, long compilationUnit )
    {
        super( packageName, name, parent.arrayDepth(), false, null, Modifier.PUBLIC );
        this.parent = parent;
        this.generator = generator;
        this.compilationUnit = compilationUnit;
    }

    @Override
    public boolean equals( Object obj )
    {
        return obj == this;
    }

    @Override
    public int hashCode()
    {
        return simpleName().hashCode();
    }

    public Object newInstance()
            throws CompilationFailureException, IllegalAccessException, InstantiationException, NoSuchMethodException,
            InvocationTargetException
    {
        return loadClass().getConstructor().newInstance();
    }

    public Class<?> loadClass() throws CompilationFailureException
    {
        return generator.loadClass( fullName(), compilationUnit );
    }

    public Class<?> loadAnonymousClass() throws CompilationFailureException
    {
        return generator.loadAnonymousClass( fullName(), compilationUnit );
    }

    public TypeReference parent()
    {
        return parent;
    }

    public CodeGenerator generator()
    {
        return generator;
    }
}
