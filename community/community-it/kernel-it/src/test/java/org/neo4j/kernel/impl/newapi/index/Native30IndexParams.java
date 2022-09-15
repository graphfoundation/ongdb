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
package org.neo4j.kernel.impl.newapi.index;

import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.kernel.impl.newapi.ReadTestSupport;

class Native30IndexParams implements IndexParams
{

    @Override
    public void enrichSettings( ReadTestSupport testSupport )
    {
        testSupport.addSetting( GraphDatabaseSettings.default_schema_provider, GraphDatabaseSettings.SchemaIndex.NATIVE30.providerName() );
    }

    @Override
    public String providerKey()
    {
        return "lucene+native";
    }

    @Override
    public String providerVersion()
    {
        return "3.0";
    }

    @Override
    public boolean indexProvidesStringValues()
    {
        return false;
    }

    @Override
    public boolean indexProvidesAllValues()
    {
        return false;
    }

    @Override
    public boolean indexProvidesNumericValues()
    {
        return true;
    }

    @Override
    public boolean indexProvidesArrayValues()
    {
        return true;
    }

    @Override
    public boolean indexProvidesBooleanValues()
    {
        return true;
    }

    @Override
    public boolean indexProvidesSpatialValues()
    {
        return true;
    }

    @Override
    public boolean indexProvidesTemporalValues()
    {
        return true;
    }
}
