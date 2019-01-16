/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * Modifications Copyright (c) 2018-2019 "GraphFoundation" [https://graphfoundation.org]
 *
 * The included source code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html)
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 */

package org.neo4j.backup.impl;


import org.junit.Test;

import java.util.Collection;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;
import static org.neo4j.backup.impl.OpenEnterpriseBackupSupportingClassesFactoryProvider.getProvidersByPriority;

// See: https://github.com/neo4j/neo4j/blob/3.4/enterprise/backup/src/test/java/org/neo4j/backup/impl/BackupSupportingClassesFactoryProviderTest.java
public class OpenEnterpriseBackupSupportingClassesFactoryProviderTest
{
    public static Collection<BackupSupportingClassesFactoryProvider> allAvailableSupportingClassesFactories()
    {
        return getProvidersByPriority().collect( toList() );
    }

    public static <DESIRED extends BackupSupportingClassesFactoryProvider> Collection<DESIRED> findInstancesOf( Class<DESIRED> desiredClass,
            Collection<? extends BackupSupportingClassesFactoryProvider> collection )
    {
        return collection.stream().filter( isOfClass( desiredClass ) ).map( i -> (DESIRED) i ).collect( toList() );
    }

    private static Predicate<BackupSupportingClassesFactoryProvider> isOfClass( Class<? extends BackupSupportingClassesFactoryProvider> desiredClass )
    {
        return factory -> desiredClass.equals( factory.getClass() );
    }

    @Test
    public void canLoadDefaultSupportingClassesFactory()
    {

        assertEquals( 1, findInstancesOf( OpenEnterpriseBackupSupportingClassesFactoryProvider.class, allAvailableSupportingClassesFactories() ).size() );
        assertEquals( 3, allAvailableSupportingClassesFactories().size() );
    }

    @Test
    public void testDefaultModuleIsPrioritisedOverDummyModule()
    {
        assertEquals( OpenEnterpriseBackupSupportingClassesFactoryProvider.class, getProvidersByPriority().findFirst().get().getClass() );
    }
}
