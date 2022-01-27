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
package org.neo4j.codegen.bytecode;


import org.junit.jupiter.api.Test;

import org.neo4j.codegen.ClassGenerator;
import org.neo4j.codegen.ClassHandle;
import org.neo4j.codegen.CodeBlock;
import org.neo4j.codegen.CodeGenerator;
import org.neo4j.codegen.CompilationFailureException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.codegen.CodeGenerationTest.PACKAGE;
import static org.neo4j.codegen.CodeGenerator.generateCode;
import static org.neo4j.codegen.Parameter.param;
import static org.neo4j.codegen.bytecode.ByteCode.BYTECODE;
import static org.neo4j.codegen.bytecode.ByteCode.VERIFY_GENERATED_BYTECODE;

class ByteCodeVerifierTest
{
    @Test
    void shouldVerifyBytecode() throws Throwable
    {
        // given
        CodeGenerator generator = generateCode( BYTECODE, VERIFY_GENERATED_BYTECODE );

        ClassHandle handle;
        try ( ClassGenerator clazz = generator.generateClass( PACKAGE, "SimpleClass" );
              CodeBlock code = clazz.generateMethod( Integer.class, "box", param( int.class, "value" ) ) )
        {
            handle = clazz.handle();
            code.returns( code.load( "value" ) );
        }

        CompilationFailureException exception =
                assertThrows( CompilationFailureException.class, handle::loadClass );
        assertThat( exception.toString() ).contains( "box(I)" );
    }
}
