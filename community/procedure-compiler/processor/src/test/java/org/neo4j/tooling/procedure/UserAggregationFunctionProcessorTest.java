/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
package org.neo4j.tooling.procedure;

import com.google.testing.compile.CompilationRule;
import org.junit.Rule;
import org.junit.Test;

import javax.annotation.processing.Processor;
import javax.tools.JavaFileObject;

import org.neo4j.tooling.procedure.testutils.JavaFileObjectUtils;

import static com.google.common.truth.Truth.assert_;
import static com.google.testing.compile.JavaSourceSubjectFactory.javaSource;

public class UserAggregationFunctionProcessorTest extends ExtensionTestBase
{

    @Rule
    public CompilationRule compilation = new CompilationRule();

    private final Processor processor = new UserAggregationFunctionProcessor();

    @Test
    public void fails_if_aggregation_function_directly_exposes_parameters()
    {
        JavaFileObject function =
                JavaFileObjectUtils.INSTANCE.procedureSource( "invalid/aggregation/FunctionWithParameters.java" );

        assert_().about( javaSource() ).that( function ).processedWith( processor() ).failsToCompile()
                .withErrorCount( 1 )
                .withErrorContaining( "@UserAggregationFunction usage error: method should be public, non-static and without parameters." )
                .in( function ).onLine( 50 );
    }

    @Test
    public void fails_if_aggregation_function_exposes_non_aggregation_return_type()
    {
        JavaFileObject function =
                JavaFileObjectUtils.INSTANCE.procedureSource( "invalid/aggregation/FunctionWithWrongReturnType.java" );

        assert_().about( javaSource() ).that( function ).processedWith( processor() ).failsToCompile()
                .withErrorCount( 1 )
                .withErrorContaining( "Unsupported return type <void> of aggregation function." )
                .in( function ).onLine( 46 );
    }

    @Override
    Processor processor()
    {
        return processor;
    }
}
