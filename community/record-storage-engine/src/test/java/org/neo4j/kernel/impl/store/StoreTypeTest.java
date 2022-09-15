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
package org.neo4j.kernel.impl.store;

import org.junit.jupiter.api.Test;

import org.neo4j.io.layout.CommonDatabaseFile;
import org.neo4j.io.layout.recordstorage.RecordDatabaseFile;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreTypeTest
{
    @Test
    void storeTypeOfValidStoreFile()
    {
        StoreType matchedType = StoreType.typeOf( RecordDatabaseFile.NODE_STORE ).orElseThrow( () -> new IllegalStateException( "Store type not found" ) );
        assertEquals( StoreType.NODE, matchedType );
    }

    @Test
    void storeTypeOfMetaDataStoreFile()
    {
        StoreType matchedType = StoreType.typeOf( CommonDatabaseFile.METADATA_STORE ).orElseThrow( () -> new IllegalStateException( "Store type not found" ) );
        assertEquals( StoreType.META_DATA, matchedType );
    }

    @Test
    void storeTypeofSomeInvalidFile()
    {
        assertThat( StoreType.typeOf( CommonDatabaseFile.LABEL_SCAN_STORE ) ).isEmpty();
    }
}
