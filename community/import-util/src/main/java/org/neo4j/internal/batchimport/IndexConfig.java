/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.internal.batchimport;

import org.neo4j.common.EntityType;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class IndexConfig
{
    public static final IndexConfig DEFAULT = new IndexConfig();
    private boolean createLabelIndex;
    private boolean createRelationTypeIndex;
    private String labelIndexName = EMPTY;
    private String relationshipIndexName = EMPTY;

    public IndexConfig withLabelIndex()
    {
        this.createLabelIndex = true;
        return this;
    }

    public IndexConfig withRelationshipTypeIndex()
    {
        this.createRelationTypeIndex = true;
        return this;
    }

    public IndexConfig withLabelIndex( String name )
    {
        this.createLabelIndex = true;
        this.labelIndexName = name;
        return this;
    }

    public IndexConfig withRelationshipTypeIndex( String name )
    {
        this.createRelationTypeIndex = true;
        this.relationshipIndexName = name;
        return this;
    }

    public boolean createLabelIndex()
    {
        return createLabelIndex;
    }

    public boolean createRelationshipIndex()
    {
        return createRelationTypeIndex;
    }

    public String indexName( EntityType entityType )
    {
        return entityType == EntityType.NODE ? labelIndexName : relationshipIndexName;
    }

    public static IndexConfig create()
    {
        return new IndexConfig();
    }
}
