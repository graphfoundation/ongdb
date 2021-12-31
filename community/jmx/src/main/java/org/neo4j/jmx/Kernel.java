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
 * Copyright (c) 2002-2020 "Neo4j,"
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
package org.neo4j.jmx;

import java.util.Date;

import javax.management.ObjectName;

@ManagementInterface( name = Kernel.NAME )
@Description( "Information about the ONgDB kernel" )
public interface Kernel
{
    String NAME = "Kernel";

    @Description( "An ObjectName that can be used as a query for getting all management "
                  + "beans for this ONgDB instance." )
    ObjectName getMBeanQuery();

    @Description( "The name of the mounted database" )
    String getDatabaseName();

    @Description( "The version of ONgDB" )
    String getKernelVersion();

    @Description( "The time from which this ONgDB instance was in operational mode." )
    Date getKernelStartTime();

    @Description( "The time when this ONgDB graph store was created." )
    Date getStoreCreationDate();

    @Description( "An identifier that, together with store creation time, uniquely identifies this ONgDB graph store." )
    String getStoreId();

    @Description( "The current version of the ONgDB store logical log." )
    long getStoreLogVersion();

    @Description( "Whether this is a read only instance" )
    boolean isReadOnly();
}
