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
package org.neo4j.codegen.bytecode;


import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.GOTO;

public class While implements Block
{
    private final MethodVisitor methodVisitor;
    private final Label repeat;
    private final Label done;
    private final String labelName;

    public While( MethodVisitor methodVisitor, Label repeat, Label done, String labelName )
    {
        this.methodVisitor = methodVisitor;
        this.repeat = repeat;
        this.done = done;
        this.labelName = labelName;
    }

    public void continueBlock()
    {
        methodVisitor.visitJumpInsn( GOTO, repeat );
    }

    public boolean breakBlock( String labelName )
    {
        if ( labelName.equals( this.labelName ) )
        {
            methodVisitor.visitJumpInsn( GOTO, done );
            return true;
        }
        return false;
    }

    @Override
    public void endBlock()
    {
        methodVisitor.visitJumpInsn( GOTO, repeat );
        methodVisitor.visitLabel( done );
    }
}
