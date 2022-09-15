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
package org.neo4j.adversaries;

import java.lang.StackWalker.StackFrame;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

/**
 * An adversary that delegates failure injection only when invoked through certain methods.
 */
public class MethodGuardedAdversary extends StackTraceElementGuardedAdversary
{
    public MethodGuardedAdversary( Adversary delegate, Method... victimMethodSet )
    {
        super( delegate, new MethodsFramePredicate( victimMethodSet ) );
    }

    private static class MethodsFramePredicate implements Predicate<StackFrame>
    {
        private final Set<String> victimMethods;

        MethodsFramePredicate( Method... victimMethodSet )
        {
            victimMethods = Stream.of( victimMethodSet ).map( Method::getName ).collect( toSet() );
        }

        @Override
        public boolean test( StackFrame stackFrame )
        {
            return victimMethods.contains( stackFrame.getMethodName() );
        }
    }
}
