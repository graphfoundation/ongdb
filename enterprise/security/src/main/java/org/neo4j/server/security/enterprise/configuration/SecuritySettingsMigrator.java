/*
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
package org.neo4j.server.security.enterprise.configuration;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;

import org.neo4j.configuration.SettingMigrator;
import org.neo4j.logging.Log;

/**
 * Create a SettingMigrator for SecuritySettings.
 */
public class SecuritySettingsMigrator implements SettingMigrator
{
    public static final String OLD_DBMS_AUTH_PROVIDER = "dbms.security.auth_provider";

    public void migrate( Map<String,String> values, Map<String,String> defaultValues, Log log )
    {
        String value = values.remove( OLD_DBMS_AUTH_PROVIDER );
        if ( StringUtils.isNotBlank( value ) )
        {
            log.warn(
                    "Use of deprecated setting {}. It is replaced by dbms.security.authentication_providers and dbms.security.authorization_providers",
                    OLD_DBMS_AUTH_PROVIDER );
            values.putIfAbsent( SecuritySettings.authentication_providers.name(), value );
            values.putIfAbsent( SecuritySettings.authorization_providers.name(), value );
        }
    }
}
