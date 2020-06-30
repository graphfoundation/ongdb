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
package org.neo4j.kernel.impl.enterprise.configuration;

import java.util.List;

import org.neo4j.configuration.Description;
import org.neo4j.configuration.SettingConstraints;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.graphdb.config.Setting;

/**
 * Enterprise edition specific settings
 */
public class EnterpriseEditionSettings implements SettingsDeclaration
{

    public static final String ENTERPRISE_SECURITY_MODULE_ID = "enterprise-security-module";

    @Description( "The maximum number of databases." )
    public static final Setting<Long> maxNumberOfDatabases =
            SettingImpl.newBuilder( "dbms.max_databases", SettingValueParsers.LONG, 100L )
                       .addConstraint( SettingConstraints.min( 2L ) ).build();
    ;

    @Description( "A list of setting name patterns (comma separated) that are allowed to be dynamically changed. The list may contain both full setting names, and partial names with the wildcard '*'. If this setting is left empty all dynamic settings updates will be blocked." )
    public static final Setting<List<String>> dynamic_setting_whitelist =
            SettingImpl.newBuilder( "dbms.dynamic.setting.whitelist",
                                    SettingValueParsers.listOf( SettingValueParsers.STRING ), List.of( "*" ) ).build();

    @Description( "Configure the operating mode of the db -- 'SINGLE' for stand-alone operation, 'CORE' for operating as a core member of a Causal Cluster, or 'READ_REPLICA' for operating as a read replica member of a Causal Cluster." )
    public static final Setting<EnterpriseEditionSettings.Mode> mode =
            SettingImpl
                    .newBuilder( "dbms.mode", SettingValueParsers.ofEnum( EnterpriseEditionSettings.Mode.class ),
                                 EnterpriseEditionSettings.Mode.SINGLE ).build();

    public enum Mode
    {
        SINGLE,
        CORE,
        READ_REPLICA
    }
}
