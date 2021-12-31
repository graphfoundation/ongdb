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
package org.neo4j.kernel.info;

import java.util.stream.Stream;
import org.neo4j.logging.Log;

public class JvmChecker
{
    public static final String INCOMPATIBLE_JVM_WARNING = "You are using an unsupported Java runtime. Please" +
            " use Oracle(R) Java(TM) Runtime Environment 8, OpenJDK(TM) 8 or IBM J9.";
    public static final String INCOMPATIBLE_JVM_VERSION_WARNING = "You are using an unsupported version of " +
            "the Java runtime. Please use Oracle(R) Java(TM) Runtime Environment 8, OpenJDK(TM) 8 or IBM J9.";
    public static final String NO_SERIALIZATION_FILTER_WARNING = "The version of the Java runtime you are using " +
            " does not include some important security features. Please use a JRE of version 8u121 or higher.";

    private final Log log;
    private final JvmMetadataRepository jvmMetadataRepository;

    public JvmChecker( Log log, JvmMetadataRepository jvmMetadataRepository )
    {
        this.log = log;
        this.jvmMetadataRepository = jvmMetadataRepository;
    }

    public void checkJvmCompatibilityAndIssueWarning()
    {
        String javaVmName = jvmMetadataRepository.getJavaVmName();
        String javaVersion = jvmMetadataRepository.getJavaVersion();

        if ( !javaVmName.matches( "(Java HotSpot\\(TM\\)|OpenJDK|IBM) (64-Bit Server|Server|Client|J9) VM" ) )
        {
            log.warn( INCOMPATIBLE_JVM_WARNING );
        }
        else if ( !javaVersion.matches( "^1\\.[8].*" ) )
        {
            log.warn( INCOMPATIBLE_JVM_VERSION_WARNING );
        }

        if ( !serializationFilterIsAvailable() )
        {
            log.warn( NO_SERIALIZATION_FILTER_WARNING );
        }
    }

    public boolean serializationFilterIsAvailable()
    {
        //As part of JEP290 ObjectInputFilter was backported to JDK 8 in version 121, but under a different package.
        Stream<String> classNames = Stream.of( "sun.misc.ObjectInputFilter", "java.io.ObjectInputFilter" );
        return classNames.anyMatch( className ->
        {
            try
            {
                Class.forName( className );
            }
            catch ( ClassNotFoundException e )
            {
                return false;
            }
            return true;
        } );

    }
}
