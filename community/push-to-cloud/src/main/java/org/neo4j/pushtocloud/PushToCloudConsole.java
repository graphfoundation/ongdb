/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.pushtocloud;

interface PushToCloudConsole
{
    String readLine( String fmt, Object... args );

    char[] readPassword( String fmt, Object... args );

    boolean readDevMode( String devModeEnvVar );

    static PushToCloudConsole realConsole()
    {
        return new PushToCloudConsole()
        {
            @Override
            public String readLine( String fmt, Object... args )
            {
                return System.console().readLine( fmt, args );
            }

            @Override
            public char[] readPassword( String fmt, Object... args )
            {
                return System.console().readPassword( fmt, args );
            }

            @Override
            public boolean readDevMode( String devModeEnvVar )
            {
                return Boolean.parseBoolean(System.getenv(devModeEnvVar));
            }
        };
    }

    static PushToCloudConsole fakeConsole( String username, String password, boolean devMode )
    {
        return new PushToCloudConsole()
        {
            @Override
            public String readLine( String fmt, Object... args )
            {
                return username;
            }

            @Override
            public char[] readPassword( String fmt, Object... args )
            {
                return password.toCharArray();
            }

            @Override
            public boolean readDevMode( String devModeEnvVar )
            {
                return devMode;
            }
        };
    }
}

