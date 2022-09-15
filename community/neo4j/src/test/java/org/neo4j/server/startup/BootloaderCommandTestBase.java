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
package org.neo4j.server.startup;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.junit.platform.testkit.engine.EngineTestKit;
import org.junit.platform.testkit.engine.Events;
import picocli.CommandLine;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.Function;

import org.neo4j.configuration.BootloaderSettings;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static java.nio.file.attribute.PosixFilePermission.OWNER_READ;
import static java.nio.file.attribute.PosixFilePermission.OWNER_WRITE;
import static org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.engine.descriptor.JupiterEngineDescriptor.ENGINE_ID;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectMethod;
import static org.junit.platform.testkit.engine.EventConditions.event;
import static org.junit.platform.testkit.engine.EventConditions.finishedSuccessfully;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.neo4j.server.startup.BootloaderOsAbstraction.UNKNOWN_PID;
import static org.neo4j.test.proc.ProcessUtil.start;

@TestDirectoryExtension
@ExtendWith( BootloaderCommandTestBase.FailureOutputProvider.class )
@DisabledForJreRange( min = JRE.JAVA_17 )
abstract class BootloaderCommandTestBase
{
    @Inject
    private TestDirectory testDirectory;

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    Path confFile;
    Path home;
    Config config;

    @BeforeEach
    void setUp() throws Exception
    {
        // Windows allows us to do any simple character except for '\', '/', '.', '?', and '*
        // ` - _ [ ] { } $% ! ; @ =
        // Windows also limits path length to 260
        home = IS_OS_WINDOWS ? testDirectory.directory( "%s `~#&-_$env${HOME} $(exit 1)$$[[+1]]@! x;" ) : testDirectory.homePath();
        confFile = home.resolve( Config.DEFAULT_CONFIG_DIR_NAME ).resolve( Config.DEFAULT_CONFIG_FILE_NAME );
        if ( IS_OS_WINDOWS )
        {
            //make the path on windows a little bit shorter as it can be problematic on CI by placing prunsrv in the home directory
            addConf( BootloaderSettings.windows_tools_directory, "" );
        }
        config = Config.newBuilder()
                .fromFileNoThrow( confFile )
                .set( GraphDatabaseSettings.neo4j_home, home )
                .build();
    }

    @AfterEach
    void tearDown()
    {
    }

    static class FailureOutputProvider implements TestWatcher
    {
        @Override
        public void testFailed( ExtensionContext context, Throwable cause )
        {
            Optional<Object> maybeInstance = context.getTestInstance();
            if ( maybeInstance.isPresent() && maybeInstance.get() instanceof BootloaderCommandTestBase )
            {
                BootloaderCommandTestBase instance = (BootloaderCommandTestBase) maybeInstance.get();
                String output = instance.out.toString();
                String error = instance.err.toString();
                if ( StringUtils.isNotEmpty( output ) )
                {
                    context.publishReportEntry( "Process output-stream", output );
                }
                if ( StringUtils.isNotEmpty( error ) )
                {
                    context.publishReportEntry( "Process error-stream", error );
                }
            }
        }
    }

    protected int execute( String... arg )
    {
        return execute( arg.length != 0 ? List.of( arg ) : List.of(), Map.of() );
    }

    protected int execute( List<String> args, Map<String, String> env )
    {
        return execute( args, env, Runtime.version() );
    }

    protected int execute( List<String> args, Map<String, String> env, Runtime.Version version )
    {
        HashMap<String,String> environment = new HashMap<>( env );
        environment.putIfAbsent( Bootloader.ENV_NEO4J_HOME, home.toString() );

        return createCommand( environment, version )
                .setResourceBundle( bundleFromMap( environment ) )
                .execute( args.toArray( new String[0] ) );
    }

    private CommandLine createCommand( Map<String,String> environment, Runtime.Version version )
    {
        Function<String,String> envLookup = key ->
        {
            if ( environment.containsKey( key ) )
            {
                return environment.get( key );
            }
            return System.getenv( key );
        };

        Function<String,String> propLookup = key ->
        {
            if ( environment.containsKey( key ) )
            {
                return environment.get( key );
            }
            return System.getProperty( key );
        };

        return createCommand( new PrintStream( out ), new PrintStream( err ), envLookup, propLookup, version );
    }

    protected abstract CommandLine createCommand( PrintStream out, PrintStream err, Function<String,String> envLookup, Function<String,String> propLookup,
            Runtime.Version version );

    protected void addConf( Setting<?> setting, String value )
    {
        try
        {
            if ( !Files.exists( confFile ) )
            {
                Files.createDirectories( confFile.getParent() );
                if ( IS_OS_WINDOWS )
                {
                    Files.createFile( confFile );
                    AclFileAttributeView attrs = Files.getFileAttributeView( confFile, AclFileAttributeView.class );
                    attrs.setAcl( List.of( AclEntry.newBuilder().setType( AclEntryType.ALLOW ).setPrincipal( attrs.getOwner() )
                            .setPermissions( AclEntryPermission.READ_DATA, AclEntryPermission.WRITE_DATA, AclEntryPermission.READ_ATTRIBUTES,
                                    AclEntryPermission.WRITE_ATTRIBUTES, AclEntryPermission.READ_NAMED_ATTRS, AclEntryPermission.WRITE_NAMED_ATTRS,
                                    AclEntryPermission.APPEND_DATA, AclEntryPermission.READ_ACL, AclEntryPermission.SYNCHRONIZE ).build() ) );
                }
                else
                {
                    Files.createFile( confFile, PosixFilePermissions.asFileAttribute( Set.of( OWNER_READ, OWNER_WRITE ) ) );
                }
            }
            FileUtils.writeToFile( confFile, String.format( "%s=%s%n", setting.name(), value ), true );
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    protected void clearOutAndErr()
    {
        out = new ByteArrayOutputStream();
        err = new ByteArrayOutputStream();
    }

    private static ResourceBundle bundleFromMap( Map<String,String> env )
    {
        Map<String,String> environment = new HashMap<>( env );
        return new ResourceBundle()
        {
            @Override
            protected Object handleGetObject( String key )
            {
                return environment.get( key );
            }

            @Override
            public Enumeration<String> getKeys()
            {
                return Collections.enumeration( environment.keySet() );
            }
        };
    }

    /**
     * Utility class to run code in a fork
     * The ProcessBuilder "inherit-IO" bypasses all our abilities to suppress/capture and prints to the "real" System.out/err
     * Using System.setOut( os ), like SuppressOutputExtension, does not stop that
     * Wrapping the fork in a fork is the only option to reliably capture that output while not introducing possible flakyness with concurrent tests
     */
    protected static class TestInFork
    {
        protected interface TestCode
        {
            void run() throws Exception;
        }

        protected interface Monitor
        {
            int afterStart( Process process );
        }

        private static final int SUCCESS_CODE = 66;
        private static boolean inFork;
        private final ByteArrayOutputStream out;
        private final ByteArrayOutputStream err;

        TestInFork( ByteArrayOutputStream out, ByteArrayOutputStream err )
        {
            this.out = out;
            this.err = err;
        }

        boolean run( TestCode test ) throws Exception
        {
            return run( test, Map.of() );
        }

        boolean run( TestCode test, Map<String, String> env ) throws Exception
        {
            return run( test, env, p -> SUCCESS_CODE );
        }

        boolean run( TestCode test, Map<String, String> env, Monitor monitor ) throws Exception
        {
            if ( inFork )
            {
                test.run();
                return false;
            }
            else
            {
                var frame = StackWalker.getInstance()
                        .walk( frames -> frames.skip( 1 ).filter( BootloaderCommandTestBase::isTestFrame )
                        .findFirst().orElseThrow() );
                assertNotNull( frame, "No test found" );

                var process = start( pb -> pb.environment().putAll( env ), TestInFork.class.getName(),
                        frame.getClassName(),
                        frame.getMethodName() );

                int expectedExit = monitor.afterStart( process );
                int exitCode = process.waitFor();
                byte[] outputBytes = process.getInputStream().readAllBytes();
                byte[] errorBytes = process.getErrorStream().readAllBytes();
                out.write( outputBytes );
                err.write( errorBytes );
                assertThat( exitCode ).as( "Out: %s %nErr: %s", new String( outputBytes ), new String( errorBytes ) ).isEqualTo( expectedExit );
            }
            return true;
        }

        public static void main( String[] args )
        {
            inFork = true;
            String className = args[0];
            String methodName = args[1];
            //Use Junit to execute test, ensures all extensions and initialization is setup correctly
            Events testEvents = EngineTestKit.engine( ENGINE_ID ).selectors( selectMethod( className, methodName ) ).execute().testEvents();

            testEvents.assertThatEvents().haveExactly( 1, event( finishedSuccessfully() ) );
            System.exit( SUCCESS_CODE );
        }
    }

    private static boolean isTestFrame( StackWalker.StackFrame frame )
    {
        try
        {
            Method actualMethod = Class.forName( frame.getClassName() ).getDeclaredMethod( frame.getMethodName() );
            return actualMethod.isAnnotationPresent( Test.class );
        }
        catch ( NoSuchMethodException | ClassNotFoundException e )
        {
            // not a test frame we are looking for so we ignoring any exceptions like that
        }
        return false;
    }

    /**
     * Utility classes to mock the process forking
     */
    protected static class ProcessHandler
    {
        private static final long PID_NOT_RUNNING = 0;

        private long runningPid;
        private long nextPid = 1;

        boolean serviceInstalled;

        long start()
        {
            if ( IS_OS_WINDOWS )
            {
                assertThat( isInstalled() ).isTrue();
            }
            assertThat( isRunning() ).isFalse();
            runningPid = nextPid++;
            return runningPid;
        }

        boolean stop()
        {
            assertThat( isRunning() ).isTrue();
            runningPid = PID_NOT_RUNNING;
            return true;
        }

        void install()
        {
            if ( IS_OS_WINDOWS )
            {
                assertThat( isInstalled() ).isFalse();
                serviceInstalled = true;
            }
        }

        void uninstall()
        {
            if ( IS_OS_WINDOWS )
            {
                assertThat( isInstalled() ).isTrue();
                assertThat( isRunning() ).isFalse();
                serviceInstalled = false;
            }
        }

        boolean isRunning()
        {
            return runningPid != PID_NOT_RUNNING;
        }

        boolean isInstalled()
        {
            return serviceInstalled;
        }

        Optional<ProcessHandle> handle()
        {
            return Optional.ofNullable( handle( runningPid ) );
        }

        ProcessHandle handle( long pid )
        {
            if ( isRunning() )
            {
                ProcessHandle ph = mock( ProcessHandle.class );
                doAnswer( inv -> pid ).when( ph ).pid();
                doAnswer( inv -> isRunning() ).when( ph ).isAlive();
                doAnswer( inv -> stop() ).when( ph ).destroy();
                doAnswer( inv -> stop() ).when( ph ).destroyForcibly();
                return ph;
            }
            return null;
        }
    }

    protected static class FakeProcessManager extends ProcessManager
    {
        private final BootloaderContext ctx;
        private final ProcessHandler handler;
        private final Class<?> entryPoint;
        private final Config config;

        FakeProcessManager( Config config, BootloaderContext ctx, ProcessHandler handler, Class<?> entryPoint )
        {
            super( ctx );
            this.ctx = ctx;
            this.handler = handler;
            this.entryPoint = entryPoint;
            this.config = config;
        }

        @Override
        long run( List<String> command, Behaviour behaviour ) throws BootFailureException
        {
            //Here we're just trying to mimic the minimum required responses one would expect when executing the actual command.
            //Responses depend on previously executed commands, held as state in the ProcessHandler
            //This method does not make much sense on its own, but is a result of the combined behavior of os-abstraction and command execution
            if ( commandMatches( command, "Get-Process" ) )
            {
                throw new BootProcessFailureException( 1 ); // To exit the manual wait loop in WindowsBootloaderOs
            }
            else if ( commandMatches( command, "//SS//" ) )
            {
                handler.stop();
            }
            else if ( commandMatches( command, "Get-Service" ) )
            {
                if ( handler.isInstalled() )
                {
                    String status = handler.isRunning() ? "Running" : "Stopped";
                    behaviour.outputConsumer.println( status + config.get( BootloaderSettings.windows_service_name ) );
                }
                else
                {
                    throw new BootProcessFailureException( 1 ); //To simulate command when service is not installed
                }
            }
            else if ( commandMatches( command, entryPoint.getName() ) )
            {
                ctx.out.println( String.join( System.lineSeparator(), command ) );
                boolean isWindowsInstallCommand = commandMatches( command, "//IS//" );
                handler.install();
                if ( !isWindowsInstallCommand )
                {
                    return handler.start(); //either `console` or unix `start`
                }
            }
            else if ( commandMatches( command, "//ES//" ) )
            {
                return handler.start();
            }
            else if ( commandMatches( command, "//DS//" ) )
            {
                handler.uninstall();
            }
            return UNKNOWN_PID;
        }

        @Override
        Long getPidFromFile()
        {
            ctx.config().get( BootloaderSettings.pid_file ); // Read from config to "simulate" real process manager
            return handler.isRunning() ? handler.runningPid : null;
        }

        @Override
        ProcessHandle getProcessHandle( long pid ) throws BootFailureException
        {
            return handler.handle( pid );
        }

        private static boolean commandMatches( List<String> command, String string )
        {
            return command.stream().anyMatch( cmd -> cmd.contains( string ) );
        }
    }
}
