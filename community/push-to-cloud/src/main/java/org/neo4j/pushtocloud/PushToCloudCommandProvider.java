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

import org.neo4j.annotations.service.ServiceProvider;
import org.neo4j.cli.Command;
import org.neo4j.cli.CommandProvider;
import org.neo4j.cli.ExecutionContext;

import static org.neo4j.cli.Command.CommandType.PUSH_TO_CLOUD;

@ServiceProvider
public class PushToCloudCommandProvider implements CommandProvider<PushToCloudCommand>
{
    @Override
    public PushToCloudCommand createCommand( ExecutionContext ctx )
    {
        return new PushToCloudCommand( ctx, new HttpCopier( ctx ),
                                       new RealDumpCreator( ctx ), PushToCloudConsole.realConsole() );
    }

    @Override
    public Command.CommandType commandType()
    {
        return PUSH_TO_CLOUD;
    }
}
