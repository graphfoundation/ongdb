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
package org.neo4j.metrics.output;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.jmx.JmxReporter;
import com.codahale.metrics.jmx.ObjectNameFactory;

import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.internal.helpers.HostnamePort;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.impl.enterprise.settings.metrics.MetricsSettings;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.Log;
import org.neo4j.scheduler.JobScheduler;

public class EventReporterBuilder
{
    private static final String METRICS_JMX_BEAN_SUFFIX = ".metrics";
    private final Config config;
    private final MetricRegistry registry;
    private final Log logger;
    private final ExtensionContext extensionContext;
    private final LifeSupport life;
    private final ConnectorPortRegister portRegister;
    private final FileSystemAbstraction fileSystem;
    private final JobScheduler scheduler;

    public EventReporterBuilder( Config config, MetricRegistry registry, Log logger, ExtensionContext extensionContext, LifeSupport life,
                                 FileSystemAbstraction fileSystem, JobScheduler scheduler, ConnectorPortRegister portRegister )
    {
        this.config = config;
        this.registry = registry;
        this.logger = logger;
        this.extensionContext = extensionContext;
        this.life = life;
        this.fileSystem = fileSystem;
        this.scheduler = scheduler;
        this.portRegister = portRegister;
    }

    /**
     * @return
     */
    public CompositeEventReporter build()
    {
        CompositeEventReporter reporter = new CompositeEventReporter();
        if ( !this.config.get( MetricsSettings.metricsEnabled ) )
        {
            return reporter;
        }
        else
        {
            if ( this.config.get( MetricsSettings.csvEnabled ) )
            {
                CsvOutput csvOutput = new CsvOutput( this.config, this.registry, this.logger, this.extensionContext, this.fileSystem, this.scheduler );
                reporter.add( csvOutput );
                this.life.add( csvOutput );
            }

            HostnamePort server;
            if ( this.config.get( MetricsSettings.graphiteEnabled ) )
            {
                server = this.config.get( MetricsSettings.graphiteServer );
                long period = (this.config.get( MetricsSettings.graphiteInterval )).toMillis();
                GraphiteOutput graphiteOutput = new GraphiteOutput( server, period, this.registry, this.logger );
                reporter.add( graphiteOutput );
                this.life.add( graphiteOutput );
            }

            if ( this.config.get( MetricsSettings.prometheusEnabled ) )
            {
                server = this.config.get( MetricsSettings.prometheusEndpoint );
                PrometheusOutput prometheusOutput = new PrometheusOutput( server, this.registry, this.logger, this.portRegister );
                reporter.add( prometheusOutput );
                this.life.add( prometheusOutput );
            }

            if ( this.config.get( MetricsSettings.jmxEnabled ) )
            {
                String domain = this.config.get( MetricsSettings.metricsPrefix ) + ".metrics";
                JmxReporter jmxReporter = JmxReporter.forRegistry( this.registry ).inDomain( domain ).createsObjectNamesWith(
                        new EventReporterBuilder.MetricsObjectNameFactory() ).build();
                this.life.add( new JmxOutput( jmxReporter ) );
            }

            return reporter;
        }
    }

    private static class MetricsObjectNameFactory implements ObjectNameFactory
    {
        private static final String NAME = "name";

        @Override
        public ObjectName createName( String type, String domain, String name )
        {
            try
            {
                ObjectName objectName = new ObjectName( domain, NAME, name );
                String validatedName = objectName.isPropertyValuePattern() ? ObjectName.quote( name ) : name;
                return new ObjectName( domain, NAME, validatedName );
            }
            catch ( MalformedObjectNameException e )
            {
                try
                {
                    return new ObjectName( domain, NAME, ObjectName.quote( name ) );
                }
                catch ( MalformedObjectNameException e2 )
                {
                    throw new RuntimeException( e2 );
                }
            }
        }
    }
}
