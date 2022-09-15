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
package org.neo4j.storageengine.api;

import org.neo4j.storageengine.api.format.Capability;
import org.neo4j.storageengine.api.format.CapabilityType;

public class IndexCapabilities
{
    /**
     * Oh dear... so what does Lucene stuff do in the storage engine API??? Listen to this:
     * Historically versions of everything about the database including indexing was tied to the format of the store.
     * Now that indexing is more disconnected from storage this no longer makes sense, but these are still used for letting
     * store migration know when to migrate Lucene indexes as well. Also since indexes are disconnected from storage this means
     * that Lucene indexes can very well be used by any type of storage, which sort of justifies that this versioning
     * lives in the component that is common to them all.
     *
     * Until the index versioning somehow gets broken apart from store versioning or redesigned these will have to stay here.
     */
    public enum LuceneCapability implements Capability
    {
        /**
         * Lucene version 8.x
         */
        LUCENE_8,

        /**
         * Lucene version 5.x
         */
        LUCENE_5;

        @Override
        public boolean isType( CapabilityType type )
        {
            return type == CapabilityType.INDEX;
        }

        @Override
        public boolean isAdditive()
        {
            return false;
        }
    }

    /**
     * Indicate what set of index providers are present in a given version.
     * A non additive {@link IndexProviderCapability} means index providers
     * will be migrated.
     */
    public enum IndexProviderCapability implements Capability
    {
        /**
         * lucene+native-3.0, native-btree-1.0, fulltext-1.0
         */
        INDEX_PROVIDERS_40( false );

        private final boolean isAdditive;

        IndexProviderCapability( boolean isAdditive )
        {
            this.isAdditive = isAdditive;
        }

        @Override
        public boolean isType( CapabilityType type )
        {
            return type == CapabilityType.INDEX_PROVIDER;
        }

        @Override
        public boolean isAdditive()
        {
            return isAdditive;
        }
    }

    /**
     * Indicate how index configuration is persisted.
     */
    public enum ConfigCapability implements Capability
    {
        /**
         * Index config stored in schema store instead of in index file.
         */
        SCHEMA_STORE_CONFIG;

        @Override
        public boolean isType( CapabilityType type )
        {
            return type == CapabilityType.INDEX_CONFIG;
        }

        @Override
        public boolean isAdditive()
        {
            return false;
        }
    }
}
