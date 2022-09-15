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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

import static java.lang.System.lineSeparator;
import static java.util.Arrays.asList;

/**
 * Suppresses outputs such as System.out, System.err and java.util.logging for example when running a test.
 *
 * The suppressing occurs visitor-style and if there's an exception in the code executed when being muted
 * all the logging that was temporarily muted will be resent to the peers as if they weren't muted to begin with.
 */
public final class SuppressOutput
{
    private static final Suppressible java_util_logging = java_util_logging( new ByteArrayOutputStream(), null );

    public static SuppressOutput suppress( Suppressible... suppressibles )
    {
        return new SuppressOutput( suppressibles );
    }

    public static SuppressOutput suppressAll()
    {
        return suppress( System.out, System.err, java_util_logging );
    }

    public enum System implements Suppressible
    {
        out
        {
            @Override
            PrintStream replace( PrintStream replacement )
            {
                PrintStream old = java.lang.System.out;
                java.lang.System.setOut( replacement );
                return old;
            }
        },
        err
        {
            @Override
            PrintStream replace( PrintStream replacement )
            {
                PrintStream old = java.lang.System.err;
                java.lang.System.setErr( replacement );
                return old;
            }
        };

        @Override
        public Voice suppress()
        {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final PrintStream original = replace( new PrintStream( buffer ) );
            return new Voice( this, buffer, original )
            {
                @Override
                void restore( boolean failure ) throws IOException
                {
                    replace( original ).flush();
                    if ( failure )
                    {
                        original.write( buffer.toByteArray() );
                    }
                }
            };
        }

        abstract PrintStream replace( PrintStream replacement );
    }

    private static Suppressible java_util_logging( final ByteArrayOutputStream redirectTo, Level level )
    {
        final Handler replacement = redirectTo == null ? null : new StreamHandler( redirectTo, new SimpleFormatter() );
        if ( replacement != null && level != null )
        {
            replacement.setLevel( level );
        }
        return new Suppressible()
        {
            @Override
            public Voice suppress()
            {
                final Logger logger = LogManager.getLogManager().getLogger( "" );
                final Level level = logger.getLevel();
                final Handler[] handlers = logger.getHandlers();
                for ( Handler handler : handlers )
                {
                    logger.removeHandler( handler );
                }
                if ( replacement != null )
                {
                    logger.addHandler( replacement );
                    logger.setLevel( Level.ALL );
                }
                return new Voice( this, redirectTo )
                {
                    @Override
                    void restore( boolean failure )
                    {
                        for ( Handler handler : handlers )
                        {
                            logger.addHandler( handler );
                        }
                        logger.setLevel( level );
                        if ( replacement != null )
                        {
                            logger.removeHandler( replacement );
                        }
                    }
                };
            }
        };
    }

    public <T> T call( Callable<T> callable ) throws Exception
    {
        captureVoices();
        boolean failure = true;
        try
        {
            T result = callable.call();
            failure = false;
            return result;
        }
        finally
        {
            releaseVoices( voices, failure );
        }
    }

    private final Suppressible[] suppressibles;
    private Voice[] voices;

    private SuppressOutput( Suppressible[] suppressibles )
    {
        this.suppressibles = suppressibles;
    }

    public Voice[] getAllVoices()
    {
        return voices;
    }

    public Voice getOutputVoice()
    {
        return getVoice( System.out );
    }

    public Voice getErrorVoice()
    {
        return getVoice( System.err );
    }

    private Voice getVoice( Suppressible suppressible )
    {
        for ( Voice voice : voices )
        {
            if ( suppressible.equals( voice.getSuppressible() ) )
            {
                return voice;
            }
        }
        return null;
    }

    public interface Suppressible
    {
        Voice suppress();
    }

    public abstract static class Voice
    {
        private final Suppressible suppressible;
        private final ByteArrayOutputStream replacementBuffer;
        private final PrintStream original;

        public Voice( Suppressible suppressible, ByteArrayOutputStream replacementBuffer )
        {
            this( suppressible, replacementBuffer, null );
        }

        public Voice( Suppressible suppressible, ByteArrayOutputStream replacementBuffer, PrintStream original )
        {
            this.suppressible = suppressible;
            this.replacementBuffer = replacementBuffer;
            this.original = original;
        }

        Suppressible getSuppressible()
        {
            return suppressible;
        }

        public boolean containsMessage( String message )
        {
            return replacementBuffer.toString().contains( message );
        }

        /** Get each line written to this voice since it was suppressed */
        public List<String> lines()
        {
            return asList( toString().split( lineSeparator() ) );
        }

        @Override
        public String toString()
        {
            try
            {
                return replacementBuffer.toString( StandardCharsets.UTF_8.name() );
            }
            catch ( UnsupportedEncodingException e )
            {
                throw new RuntimeException( e );
            }
        }

        abstract void restore( boolean failure ) throws IOException;

        public Optional<PrintStream> originalStream()
        {
            return Optional.ofNullable( original );
        }
    }

    public void captureVoices()
    {
        Voice[] voices = new Voice[suppressibles.length];
        boolean ok = false;
        try
        {
            for ( int i = 0; i < voices.length; i++ )
            {
                voices[i] = suppressibles[i].suppress();
            }
            ok = true;
        }
        finally
        {
            if ( !ok )
            {
                releaseVoices( voices, false );
            }
        }
        this.voices = voices;
    }

    public void releaseVoices( boolean failure )
    {
        releaseVoices( voices, failure );
    }

    private static void releaseVoices( Voice[] voices, boolean failure )
    {
        List<Throwable> failures = null;
        try
        {
            failures = new ArrayList<>( voices.length );
        }
        catch ( Throwable oom )
        {
            // nothing we can do...
        }
        for ( Voice voice : voices )
        {
            if ( voice != null )
            {
                try
                {
                    voice.restore( failure );
                }
                catch ( Throwable exception )
                {
                    if ( failures != null )
                    {
                        failures.add( exception );
                    }
                }
            }
        }
        if ( failures != null && !failures.isEmpty() )
        {
            for ( Throwable exception : failures )
            {
                exception.printStackTrace();
            }
        }
    }
}
