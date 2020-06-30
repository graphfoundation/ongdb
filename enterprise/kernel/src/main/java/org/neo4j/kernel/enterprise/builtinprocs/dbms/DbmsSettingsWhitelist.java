/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.kernel.enterprise.builtinprocs.dbms;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.neo4j.configuration.Config;
import org.neo4j.kernel.impl.enterprise.configuration.EnterpriseEditionSettings;

public class DbmsSettingsWhitelist
{

    private final List<Pattern> settingsWhitelist;

    public DbmsSettingsWhitelist( Config config )
    {
        this.settingsWhitelist = this
                .refreshWhiteList( config.get( EnterpriseEditionSettings.dynamic_setting_whitelist ) );
    }

    private List<Pattern> refreshWhiteList( List<String> whiteList )
    {
        return whiteList != null && !whiteList.isEmpty() ? whiteList.stream().map( ( s ) ->
                                                                                   {
                                                                                       return s.replace( "*", ".*" );
                                                                                   } ).map( Pattern::compile ).collect( Collectors.toList() )
                                                         : Collections.emptyList();
    }

    public boolean isWhiteListed( String settingName )
    {
        return this.settingsWhitelist != null && this.settingsWhitelist.stream().anyMatch( ( pattern ) ->
                                                                                           {
                                                                                               return pattern.matcher( settingName ).matches();
                                                                                           } );
    }
}
