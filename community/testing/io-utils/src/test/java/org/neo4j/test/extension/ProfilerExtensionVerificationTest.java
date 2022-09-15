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
package org.neo4j.test.extension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.parallel.ResourceLock;

import java.util.Optional;
import java.util.concurrent.TimeoutException;

import org.neo4j.resources.Profiler;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.extension.ConditionEvaluationResult.disabled;
import static org.neo4j.function.Predicates.await;

@TestDirectoryExtension
@ExtendWith( ProfilerExtension.class )
@ExtendWith( ProfilerExtensionVerificationTest.ConfigurationParameterCondition.class )
@ResourceLock( ExecutionSharedContext.SHARED_RESOURCE )
class ProfilerExtensionVerificationTest
{
    static final String TEST_DIR = "test dir";

    @Inject
    private TestDirectory testDirectory;

    @Inject
    private Profiler profiler;

    @Test
    void testThatPasses() throws Exception
    {
        ExecutionSharedContext.clear();
        ExecutionSharedContext.setValue( TEST_DIR, testDirectory.absolutePath() );
        someVeryExpensiveComputation();
    }

    @Test
    void testThatFails() throws Exception
    {
        ExecutionSharedContext.clear();
        ExecutionSharedContext.setValue( TEST_DIR, testDirectory.absolutePath() );
        someVeryExpensiveComputation();
        fail( "This is exactly like that 'worst movie death scene ever' from the Turkish film Kareteci Kiz." );
    }

    private void someVeryExpensiveComputation() throws TimeoutException
    {
        profiler.profile();
        await( () -> profiler.countSamples() > 0 );
    }

    static class ConfigurationParameterCondition implements ExecutionCondition
    {
        static final String TEST_TOGGLE = "testToggle";

        @Override
        public ConditionEvaluationResult evaluateExecutionCondition( ExtensionContext context )
        {
            Optional<String> option = context.getConfigurationParameter( TEST_TOGGLE );
            return option.map( ConditionEvaluationResult::enabled ).orElseGet( () -> disabled( "configuration parameter not present" ) );
        }
    }
}
