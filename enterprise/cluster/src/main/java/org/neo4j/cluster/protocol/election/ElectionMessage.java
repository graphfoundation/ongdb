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
package org.neo4j.cluster.protocol.election;

import java.io.Serializable;

import org.neo4j.cluster.InstanceId;
import org.neo4j.cluster.com.message.MessageType;

/**
 * Messages used to implement the {@link ElectionState}
 */
public enum ElectionMessage
    implements MessageType
{
    created,join,leave,
    demote, performRoleElections, vote, electionTimeout, voted;

    public static class VotedData
        implements Serializable
    {
        private static final long serialVersionUID = 6115474263667086327L;

        private String role;
        private InstanceId instanceId;
        private ElectionCredentials voteCredentials;

        public VotedData( String role, InstanceId instanceId, ElectionCredentials electionCredentials )
        {
            this.role = role;
            this.instanceId = instanceId;
            this.voteCredentials = electionCredentials;
        }

        public String getRole()
        {
            return role;
        }

        public InstanceId getInstanceId()
        {
            return instanceId;
        }

        public ElectionCredentials getElectionCredentials()
        {
            return voteCredentials;
        }

        @Override
        public String toString()
        {
            return getClass().getSimpleName() + "[role:" + role + ", instance:" + instanceId + ", credentials:" +
                    voteCredentials + ", " + getImplementationSpecificDetails() + "]";
        }

        protected String getImplementationSpecificDetails()
        {
            return "";
        }
    }

    public static class VersionedVotedData extends VotedData
    {
        private static final long serialVersionUID = -3795472557085578559L;

        private long version;

        public VersionedVotedData( String role, InstanceId instanceId, ElectionCredentials electionCredentials, long version )
        {
            super( role, instanceId, electionCredentials );
            this.version = version;
        }

        public long getVersion()
        {
            return version;
        }

        @Override
        protected String getImplementationSpecificDetails()
        {
            return "version: " + version;
        }
    }
}
