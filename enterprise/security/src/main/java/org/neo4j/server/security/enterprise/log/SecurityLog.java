/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.server.security.enterprise.log;

import java.io.File;
import java.io.IOException;
import java.time.ZoneId;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.internal.helpers.Strings;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.FormattedLog;
import org.neo4j.logging.FormattedLog.Builder;
import org.neo4j.logging.Log;
import org.neo4j.logging.Logger;
import org.neo4j.logging.RotatingFileOutputStreamSupplier;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.server.security.enterprise.configuration.SecuritySettings;

public class SecurityLog extends LifecycleAdapter implements Log
{
    private final Log inner;
    private RotatingFileOutputStreamSupplier rotatingSupplier;

    public SecurityLog( Config config, FileSystemAbstraction fileSystem, Executor executor ) throws IOException
    {
        ZoneId logTimeZoneId = config.get( GraphDatabaseSettings.db_timezone ).getZoneId();
        File logFile = config.get( SecuritySettings.security_log_filename ).toFile();
        Builder builder = FormattedLog.withZoneId( logTimeZoneId );
        this.rotatingSupplier =
                new RotatingFileOutputStreamSupplier( fileSystem, logFile, config.get( SecuritySettings.store_security_log_rotation_threshold ),
                                                      config.get( SecuritySettings.store_security_log_rotation_delay ).toMillis(),
                                                      config.get( SecuritySettings.store_security_log_max_archives ), executor );
        FormattedLog formattedLog = builder.toOutputStream( this.rotatingSupplier );
        formattedLog.setLevel( config.get( SecuritySettings.security_log_level ) );
        this.inner = formattedLog;
    }

    /* Only used for tests */
    public SecurityLog( Log log )
    {
        this.inner = log;
    }

    private static String withSubject( AuthSubject subject, String msg )
    {
        return "[" + Strings.escape( subject.username() ) + "]: " + msg;
    }

    public static SecurityLog create( Config config, FileSystemAbstraction fileSystem, JobScheduler jobScheduler ) throws IOException
    {
        return new SecurityLog( config, fileSystem, jobScheduler.executor( Group.LOG_ROTATION ) );
    }

    @Override
    public boolean isDebugEnabled()
    {
        return this.inner.isDebugEnabled();
    }

    @Override
    public Logger debugLogger()
    {
        return this.inner.debugLogger();
    }

    @Override
    public void debug( String message )
    {
        this.inner.debug( message );
    }

    @Override
    public void debug( String message, Throwable throwable )
    {
        this.inner.debug( message, throwable );
    }

    @Override
    public void debug( String format, Object... arguments )
    {
        this.inner.debug( format, arguments );
    }

    public void debug( AuthSubject subject, String format, Object... arguments )
    {
        this.inner.debug( withSubject( subject, format ), arguments );
    }

    public Logger infoLogger()
    {
        return this.inner.infoLogger();
    }

    public void info( String message )
    {
        this.inner.info( message );
    }

    public void info( String message, Throwable throwable )
    {
        this.inner.info( message, throwable );
    }

    public void info( String format, Object... arguments )
    {
        this.inner.info( format, arguments );
    }

    public void info( AuthSubject subject, String format, Object... arguments )
    {
        this.inner.info( withSubject( subject, format ), arguments );
    }

    public void info( AuthSubject subject, String format )
    {
        this.inner.info( withSubject( subject, format ) );
    }

    public Logger warnLogger()
    {
        return this.inner.warnLogger();
    }

    public void warn( String message )
    {
        this.inner.warn( message );
    }

    public void warn( String message, Throwable throwable )
    {
        this.inner.warn( message, throwable );
    }

    public void warn( String format, Object... arguments )
    {
        this.inner.warn( format, arguments );
    }

    public void warn( AuthSubject subject, String format, Object... arguments )
    {
        this.inner.warn( withSubject( subject, format ), arguments );
    }

    public Logger errorLogger()
    {
        return this.inner.errorLogger();
    }

    public void error( String message )
    {
        this.inner.error( message );
    }

    public void error( String message, Throwable throwable )
    {
        this.inner.error( message, throwable );
    }

    public void error( String format, Object... arguments )
    {
        this.inner.error( format, arguments );
    }

    public void error( AuthSubject subject, String format, Object... arguments )
    {
        this.inner.error( withSubject( subject, format ), arguments );
    }

    public void bulk( Consumer<Log> consumer )
    {
        this.inner.bulk( consumer );
    }

    public void shutdown() throws Exception
    {
        if ( this.rotatingSupplier != null )
        {
            this.rotatingSupplier.close();
            this.rotatingSupplier = null;
        }
    }
}
