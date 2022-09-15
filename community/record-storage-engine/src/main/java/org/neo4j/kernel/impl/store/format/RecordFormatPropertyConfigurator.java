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
package org.neo4j.kernel.impl.store.format;

import org.neo4j.configuration.Config;
import org.neo4j.graphdb.config.Setting;

import static org.neo4j.configuration.GraphDatabaseInternalSettings.array_block_size;
import static org.neo4j.configuration.GraphDatabaseInternalSettings.label_block_size;
import static org.neo4j.configuration.GraphDatabaseInternalSettings.string_block_size;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_BLOCK_SIZE;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_LABEL_BLOCK_SIZE;
import static org.neo4j.configuration.GraphDatabaseSettings.MINIMAL_BLOCK_SIZE;

/**
 * There are couple of configuration options that should be adapted for each particular implementation of record format.
 * In case if user already set value of those properties we will keep them, otherwise format specific value will be
 * evaluated and configuration will be adapted.
 */
public final class RecordFormatPropertyConfigurator
{
    private RecordFormatPropertyConfigurator()
    {
        // util class
    }

    private static void configureIntegerSetting( Config config, Setting<Integer> setting, int fullBlockSize, int headerSize )
    {
        int defaultValue = setting.defaultValue();
        int propertyValue = config.get( setting );
        if ( propertyValue == defaultValue )
        {
            int updatedBlockSize = fullBlockSize - headerSize;
            if ( updatedBlockSize != propertyValue )
            {
                if ( updatedBlockSize < MINIMAL_BLOCK_SIZE )
                {
                    throw new IllegalArgumentException( "Block size should be bigger then " + MINIMAL_BLOCK_SIZE );
                }
                config.set( setting, updatedBlockSize );
            }
        }
    }

    public static void configureRecordFormat( RecordFormats recordFormats, Config config )
    {
        int headerSize = recordFormats.dynamic().getRecordHeaderSize();

        configureIntegerSetting( config, string_block_size, DEFAULT_BLOCK_SIZE, headerSize );
        configureIntegerSetting( config, array_block_size, DEFAULT_BLOCK_SIZE, headerSize );
        configureIntegerSetting( config, label_block_size, DEFAULT_LABEL_BLOCK_SIZE, headerSize );
    }
}
