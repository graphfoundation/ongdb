/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
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
package org.neo4j.backup.impl;

import org.junit.Test;

import java.util.Collection;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;
import static org.neo4j.backup.impl.BackupSupportingClassesFactoryProvider.getProvidersByPriority;

public class BackupSupportingClassesFactoryProviderTest
{
    public static Collection<BackupSupportingClassesFactoryProvider> allAvailableSupportingClassesFactories()
    {
        return getProvidersByPriority().collect( toList() );
    }

    /**
     * T
     *
     * @param desiredClass
     * @param collection
     * @param <DESIRED>
     * @return
     */
    public static <DESIRED extends BackupSupportingClassesFactoryProvider> Collection<DESIRED> findInstancesOf( Class<DESIRED> desiredClass,
                                                                                                                Collection<? extends BackupSupportingClassesFactoryProvider> collection )
    {
        return collection.stream().filter( isOfClass( desiredClass ) ).map( i -> (DESIRED) i ).collect( toList() );
    }

    /**
     * Note: The method name here may be confusing.  It does not check if a class extended another class - only if the class name is an exact match.
     *
     * @param desiredClass
     * @return
     */
    private static Predicate<BackupSupportingClassesFactoryProvider> isOfClass( Class<? extends BackupSupportingClassesFactoryProvider> desiredClass )
    {
        return factory -> desiredClass.equals( factory.getClass() );
    }

    @Test
    public void canLoadDefaultSupportingClassesFactory()
    {

        assertEquals( 1, findInstancesOf( BackupSupportingClassesFactoryProvider.class,
                                          allAvailableSupportingClassesFactories() ).size() );

        assertEquals( 1, findInstancesOf( OpenEnterpriseBackupSupportingClassesFactoryProvider.class, allAvailableSupportingClassesFactories() ).size() );

        // Note that the allAvailableSupportingClassesFactories() also loads the org.neo4j.helpers.Service[].
        assertEquals( 3, allAvailableSupportingClassesFactories().size() );
    }

    @Test
    public void testDefaultModuleIsPrioritisedOverDummyModule()
    {
        assertEquals( OpenEnterpriseBackupSupportingClassesFactoryProvider.class,
                      getProvidersByPriority().findFirst().get().getClass() );
    }
}
