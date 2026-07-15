/*
 * Copyright (c) "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.backup.impl;

import org.junit.Test;

import java.util.Collection;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;
import static org.neo4j.backup.impl.BackupSupportingClassesFactoryProvider.getProvidersByPriority;

public class BackupSupportingClassesFactoryProviderTest
{
    @Test
    public void canLoadDefaultSupportingClassesFactory()
    {
        assertEquals( 1, findInstancesOf( BackupSupportingClassesFactoryProvider.class,
                allAvailableSupportingClassesFactories() ).size() );
        assertEquals( 1, findInstancesOf( OpenEnterpriseBackupSupportingClassesFactoryProvider.class, allAvailableSupportingClassesFactories() ).size() );
        assertEquals( 3, allAvailableSupportingClassesFactories().size() );
    }

    @Test
    public void testDefaultModuleIsPrioritisedOverDummyModule()
    {
        assertEquals( OpenEnterpriseBackupSupportingClassesFactoryProvider.class,
                getProvidersByPriority().findFirst().get().getClass() );
    }

    public static Collection<BackupSupportingClassesFactoryProvider> allAvailableSupportingClassesFactories()
    {
        return getProvidersByPriority().collect( toList() );
    }

    public static <DESIRED extends BackupSupportingClassesFactoryProvider> Collection<DESIRED> findInstancesOf(
            Class<DESIRED> desiredClass, Collection<? extends BackupSupportingClassesFactoryProvider> collection )
    {
        return collection
                .stream()
                .filter( isOfClass( desiredClass ) )
                .map( i -> (DESIRED) i )
                .collect( toList() );
    }

    private static Predicate<BackupSupportingClassesFactoryProvider> isOfClass(
            Class<? extends BackupSupportingClassesFactoryProvider> desiredClass )
    {
        return factory -> desiredClass.equals( factory.getClass() );
    }
}
