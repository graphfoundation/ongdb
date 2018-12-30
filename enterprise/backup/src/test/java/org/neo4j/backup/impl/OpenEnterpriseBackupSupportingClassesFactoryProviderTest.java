package org.neo4j.backup.impl;

/*
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Modifications Copyright (c) 2018 "GraphFoundation" [https://graphfoundation.org]
 *
 * See: https://github.com/neo4j/neo4j/blob/3.4/enterprise/backup/src/test/java/org/neo4j/backup/impl/BackupSupportingClassesFactoryProviderTest.java
 */

import org.junit.Test;

import java.util.Collection;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;
import static org.neo4j.backup.impl.OpenEnterpriseBackupSupportingClassesFactoryProvider.getProvidersByPriority;

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
