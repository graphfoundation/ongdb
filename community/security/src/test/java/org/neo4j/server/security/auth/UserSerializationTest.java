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
package org.neo4j.server.security.auth;

import org.junit.jupiter.api.Test;

import java.util.List;

import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.cypher.internal.security.SystemGraphCredential;
import org.neo4j.kernel.impl.security.User;
import org.neo4j.string.UTF8;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class UserSerializationTest
{
    @Test
    void shouldSerializeAndDeserialize() throws Exception
    {
        // Given
        UserSerialization serialization = new UserSerialization();
        List<User> users = legacyUsers();

        // When
        byte[] serialized = serialization.serialize( users );

        // Then
        assertThat( serialization.deserializeRecords( serialized ) ).isEqualTo( users );
    }

    @Test
    void shouldSerializeAndDeserializeSystemGraphCredentialPassword() throws Exception
    {
        // Given
        UserSerialization serialization = new UserSerialization();
        List<User> users = users();

        // When
        byte[] serialized = serialization.serialize( users );

        // Then
        List<User> actual = serialization.deserializeRecords( serialized );
        assertThat( actual.size() ).isEqualTo( users.size() );
        for ( int i = 0; i < actual.size(); i++ )
        {
            // they should be in the same order so this is okay
            User actualUser = actual.get( i );
            User givenUser = users.get( i );
            assertThat( actualUser.name() ).isEqualTo( givenUser.name() );
            assertThat( actualUser.credentials().serialize() ).isEqualTo( givenUser.credentials().serialize() );
        }
    }

    @Test
    void shouldMaskAndUnmaskSerializedSystemGraphCredential() throws Exception
    {
        // Given
        List<User> users = users();

        for ( User user : users )
        {
            String serialized = user.credentials().serialize();

            // When
            String masked = SystemGraphCredential.maskSerialized(serialized);

            // Then
            assertThat( serialized ).isEqualTo( SystemGraphCredential.serialize( masked.getBytes() ) );
        }
    }

    @Test
    void shouldMaskAndUnmaskSerializedCredentialsMissingIterations() throws Exception
    {
        // Given
        List<User> users = legacyUsers();

        for ( User user : users )
        {
            String serialized = user.credentials().serialize();
            // Newer versions of the LegacyCredentials add the iteration count, but there might still exist old serializations in the graph
            // that are missing this field, so we remove that field in this test to simulate that.
            String serializedWithoutIterations = serialized.substring( 0, serialized.lastIndexOf( "," ) );

            // When
            String masked = SystemGraphCredential.maskSerialized(serializedWithoutIterations);

            // Then (now all serialized credentials will include iteration count)
            assertThat( serialized ).isEqualTo( SystemGraphCredential.serialize( masked.getBytes() ) );
        }
    }

    /**
     * This is a future-proofing test. If you come here because you've made changes to the serialization format,
     * this is your reminder to make sure to build this is in a backwards compatible way.
     */
    @Test
    void shouldReadV1SerializationFormat() throws Exception
    {
        // Given
        UserSerialization serialization = new UserSerialization();
        byte[] salt1 = { (byte) 0xa5, (byte) 0x43 };
        byte[] hash1 = { (byte) 0xfe, (byte) 0x00, (byte) 0x56, (byte) 0xc3, (byte) 0x7e };
        byte[] salt2 = { (byte) 0x34, (byte) 0xa4 };
        byte[] hash2 = { (byte) 0x0e, (byte) 0x1f, (byte) 0xff, (byte) 0xc2, (byte) 0x3e };

        // When
        List<User> deserialized = serialization.deserializeRecords( UTF8.encode( "Mike:SHA-256,FE0056C37E,A543:\n" +
                "Steve:SHA-256,FE0056C37E,A543:nice_guy,password_change_required\n" +
                "Bob:SHA-256,0E1FFFC23E,34A4:password_change_required\n" ) );

        // Then
        assertThat( deserialized ).isEqualTo( asList( new User.Builder( "Mike", new LegacyCredential( salt1, hash1 ) ).build(),
                new User.Builder( "Steve", new LegacyCredential( salt1, hash1 ) )
                        .withRequiredPasswordChange( true ).withFlag( "nice_guy" ).build(),
                new User.Builder( "Bob", new LegacyCredential( salt2, hash2 ) ).withRequiredPasswordChange( true ).build() ) );
    }

    private List<User> legacyUsers()
    {
        return asList(
                new User.Builder( "Mike", LegacyCredential.forPassword( "1234321" ) ).withFlag( "not_as_nice" ).build(),
                new User.Builder( "Steve", LegacyCredential.forPassword( "1234321" ) ).build(),
                new User.Builder( "steve.stevesson@WINDOMAIN", LegacyCredential.forPassword( "1234321" ) ).build(),
                new User.Builder( "Bob", LegacyCredential.forPassword( "0987654" ) ).build() );
    }

    private List<User> users()
    {
        SecureHasher hasher = new SecureHasher();
        return asList(
                new User.Builder( "Mike", SystemGraphCredential.createCredentialForPassword( UTF8.encode( "1234321" ), hasher ) ).withId( "id1" ).build(),
                new User.Builder( "Steve", SystemGraphCredential.createCredentialForPassword( UTF8.encode( "1234321" ), hasher ) ).withId( "id2" ).build(),
                new User.Builder( "steve.stevesson@WINDOMAIN",
                        SystemGraphCredential.createCredentialForPassword( UTF8.encode( "1234321" ), hasher ) ).withId( "id3" ).build(),
                new User.Builder( "Bob", SystemGraphCredential.createCredentialForPassword( UTF8.encode( "0987654" ), hasher ) ).build() );
    }
}
