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
package org.neo4j.tooling.procedure;

import com.google.testing.compile.CompilationRule;
import com.google.testing.compile.CompileTester.UnsuccessfulCompilationClause;
import org.junit.Rule;
import org.junit.Test;

import javax.annotation.processing.Processor;
import javax.tools.JavaFileObject;

import org.neo4j.tooling.procedure.testutils.JavaFileObjectUtils;

import static com.google.common.truth.Truth.assert_;
import static com.google.testing.compile.JavaSourceSubjectFactory.javaSource;
import static com.google.testing.compile.JavaSourcesSubjectFactory.javaSources;
import static java.util.Arrays.asList;

public class ProcedureProcessorTest extends ExtensionTestBase
{

    @Rule
    public CompilationRule compilation = new CompilationRule();

    private Processor processor = new ProcedureProcessor();

    @Test
    public void fails_if_parameters_are_not_properly_annotated()
    {
        JavaFileObject sproc =
                JavaFileObjectUtils.INSTANCE.procedureSource( "invalid/missing_name/MissingNameSproc.java" );

        UnsuccessfulCompilationClause compilation =
                assert_().about( javaSource() ).that( sproc ).processedWith( processor() ).failsToCompile()
                        .withErrorCount( 2 );

        compilation.withErrorContaining( "@org.neo4j.procedure.Name usage error: missing on parameter <parameter>" )
                .in( sproc ).onLine( 54 );

        compilation.withErrorContaining( "@org.neo4j.procedure.Name usage error: missing on parameter <otherParam>" )
                .in( sproc ).onLine( 54 );
    }

    @Test
    public void fails_if_return_type_is_not_stream()
    {
        JavaFileObject sproc =
                JavaFileObjectUtils.INSTANCE.procedureSource( "invalid/bad_return_type/BadReturnTypeSproc.java" );

        assert_().about( javaSource() ).that( sproc ).processedWith( processor() ).failsToCompile().withErrorCount( 1 )
                .withErrorContaining( "Return type of BadReturnTypeSproc#niceSproc must be java.util.stream.Stream" )
                .in( sproc ).onLine( 53 );
    }

    @Test
    public void fails_if_record_type_has_nonpublic_fields()
    {
        JavaFileObject record =
                JavaFileObjectUtils.INSTANCE.procedureSource( "invalid/bad_record_type/BadRecord.java" );

        UnsuccessfulCompilationClause compilation = assert_().about( javaSources() ).that( asList(
                JavaFileObjectUtils.INSTANCE.procedureSource( "invalid/bad_record_type/BadRecordTypeSproc.java" ),
                record ) ).processedWith( processor() ).failsToCompile().withErrorCount( 2 );

        compilation.withErrorContaining( "Record definition error: field BadRecord#label must be public" ).in( record )
                .onLine( 45 );

        compilation.withErrorContaining( "Record definition error: field BadRecord#age must be public" ).in( record )
                .onLine( 46 );
    }

    @Test
    public void fails_if_procedure_primitive_input_type_is_not_supported()
    {
        JavaFileObject sproc = JavaFileObjectUtils.INSTANCE
                .procedureSource( "invalid/bad_proc_input_type/BadPrimitiveInputSproc.java" );

        assert_().about( javaSource() ).that( sproc ).processedWith( processor() ).failsToCompile().withErrorCount( 1 )
                .withErrorContaining(
                        "Unsupported parameter type <short> of procedure|function BadPrimitiveInputSproc#doSomething" )
                .in( sproc ).onLine( 51 );
    }

    @Test
    public void fails_if_procedure_generic_input_type_is_not_supported()
    {
        JavaFileObject sproc =
                JavaFileObjectUtils.INSTANCE.procedureSource( "invalid/bad_proc_input_type/BadGenericInputSproc.java" );

        UnsuccessfulCompilationClause compilation =
                assert_().about( javaSource() ).that( sproc ).processedWith( processor() ).failsToCompile()
                        .withErrorCount( 4 );

        compilation.withErrorContaining( "Unsupported parameter type " +
                "<java.util.List<java.util.List<java.util.Map<java.lang.String,java.lang.Thread>>>>" +
                " of procedure|function BadGenericInputSproc#doSomething" ).in( sproc ).onLine( 55 );

        compilation.withErrorContaining( "Unsupported parameter type " +
                "<java.util.Map<java.lang.String,java.util.List<java.util.concurrent.ExecutorService>>>" +
                " of procedure|function BadGenericInputSproc#doSomething2" ).in( sproc ).onLine( 61 );

        compilation.withErrorContaining(
                "Unsupported parameter type <java.util.Map> of procedure|function BadGenericInputSproc#doSomething3" )
                .in( sproc ).onLine( 67 );

        compilation.withErrorContaining(
                "Unsupported parameter type <java.lang.String[]> of procedure|function BadGenericInputSproc#doSomething4" )
                   .in( sproc ).onLine( 73 );
    }

    @Test
    public void fails_if_procedure_primitive_record_field_type_is_not_supported()
    {
        JavaFileObject record = JavaFileObjectUtils.INSTANCE
                .procedureSource( "invalid/bad_record_field_type/BadRecordSimpleFieldType.java" );

        assert_().about( javaSources() ).that( asList( JavaFileObjectUtils.INSTANCE
                .procedureSource( "invalid/bad_record_field_type/BadRecordSimpleFieldTypeSproc.java" ), record ) )
                .processedWith( processor() ).failsToCompile().withErrorCount( 1 ).withErrorContaining(
                "Record definition error: type of field BadRecordSimpleFieldType#wrongType is not supported" )
                .in( record ).onLine( 48 );
    }

    @Test
    public void fails_if_procedure_generic_record_field_type_is_not_supported()
    {
        JavaFileObject record = JavaFileObjectUtils.INSTANCE
                .procedureSource( "invalid/bad_record_field_type/BadRecordGenericFieldType.java" );

        UnsuccessfulCompilationClause compilation = assert_().about( javaSources() ).that( asList(
                JavaFileObjectUtils.INSTANCE
                        .procedureSource( "invalid/bad_record_field_type/BadRecordGenericFieldTypeSproc.java" ),
                record ) ).processedWith( processor() ).failsToCompile().withErrorCount( 3 );

        compilation.withErrorContaining(
                "Record definition error: type of field BadRecordGenericFieldType#wrongType1 is not supported" )
                .in( record ).onLine( 51 );
        compilation.withErrorContaining(
                "Record definition error: type of field BadRecordGenericFieldType#wrongType2 is not supported" )
                .in( record ).onLine( 52 );
        compilation.withErrorContaining(
                "Record definition error: type of field BadRecordGenericFieldType#wrongType3 is not supported" )
                .in( record ).onLine( 53 );
    }

    @Test
    public void fails_if_duplicate_procedures_are_declared()
    {
        JavaFileObject firstDuplicate =
                JavaFileObjectUtils.INSTANCE.procedureSource( "invalid/duplicated/Sproc1.java" );
        JavaFileObject secondDuplicate =
                JavaFileObjectUtils.INSTANCE.procedureSource( "invalid/duplicated/Sproc2.java" );

        assert_().about( javaSources() ).that( asList( firstDuplicate, secondDuplicate ) ).processedWith( processor() )
                .failsToCompile().withErrorCount( 2 ).withErrorContaining(
                "Procedure|function name <org.neo4j.tooling.procedure.procedures.invalid.duplicated.foobar> is " +
                        "already defined 2 times. It should be defined only once!" );
    }

    @Test
    public void fails_if_procedure_class_has_no_public_no_arg_constructor()
    {
        JavaFileObject procedure = JavaFileObjectUtils.INSTANCE
                .procedureSource( "invalid/missing_constructor/MissingConstructorProcedure.java" );

        assert_().about( javaSource() ).that( procedure ).processedWith( processor() ).failsToCompile()
                .withErrorCount( 1 ).withErrorContaining(
                "Extension class org.neo4j.tooling.procedure.procedures.invalid.missing_constructor.MissingConstructorProcedure " +
                        "should contain a public no-arg constructor, none found." )
                .in( procedure ).onLine( 43 );
    }

    @Test
    public void succeeds_to_process_valid_stored_procedures()
    {
        assert_().about( javaSources() )
                .that( asList( JavaFileObjectUtils.INSTANCE.procedureSource( "valid/Procedures.java" ),
                        JavaFileObjectUtils.INSTANCE.procedureSource( "valid/Records.java" ) ) )
                .processedWith( processor() ).compilesWithoutError();

    }

    @Override
    Processor processor()
    {
        return processor;
    }
}
