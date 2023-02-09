/*
 * Copyright (c) "Graph Foundation,"
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

import org.neo4j.cypher.internal.security.FormatException;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.cypher.internal.security.SecureHasherConfigurations;
import org.neo4j.cypher.internal.security.SystemGraphCredential;
import org.neo4j.exceptions.InvalidArgumentException;
import org.neo4j.kernel.impl.security.Credential;
import org.neo4j.kernel.impl.security.User;
import org.neo4j.string.HexString;

import static java.lang.String.format;
import static org.neo4j.kernel.impl.security.Credential.CREDENTIAL_SEPARATOR;

/**
 * Serializes user authorization and authentication data to a format similar to unix passwd files.
 */
public class UserSerialization extends FileRepositorySerializer<User>
{
    private static final String userSeparator = ":";

    @Override
    protected String serialize( User user )
    {
        return String.join( userSeparator,
                user.name(),
                user.credentials().serialize(),
                String.join( ",", user.getFlags() )
            );
    }

    @Override
    protected User deserializeRecord( String line, int lineNumber ) throws FormatException
    {
        String[] parts = line.split( userSeparator, -1 );
        if ( parts.length != 3 )
        {
            throw new FormatException( format( "wrong number of line fields, expected 3, got %d [line %d]",
                    parts.length,
                    lineNumber
            ) );
        }

        User.Builder b = new User.Builder( parts[0], deserializeCredentials( parts[1], lineNumber ) );

        for ( String flag : parts[2].split( ",", -1 ) )
        {
            String trimmed = flag.trim();
            if ( !trimmed.isEmpty() )
            {
                b = b.withFlag( trimmed );
            }
        }

        return  b.build();
    }

    protected static String serialize( LegacyCredential cred )
    {
        return cred.serialize();
    }

    private static Credential deserializeCredentials( String part, int lineNumber ) throws FormatException
    {
        String[] split = part.split( CREDENTIAL_SEPARATOR, -1 );
        String algorithm = split[0];
        int iterations;
        String hasherVersion;

        if ( split.length == 4 )
        {
            iterations = Integer.parseInt( split[3] );
        }
        else if ( split.length == 3 )
        {
            iterations = LegacyCredential.ITERATIONS;
        }
        else
        {
            throw new FormatException( format( "wrong number of credential fields [line %d]", lineNumber ) );
        }

        try
        {
            hasherVersion = SecureHasherConfigurations.getVersionForConfiguration( algorithm, iterations );
        }
        catch ( InvalidArgumentException e )
        {
            throw new FormatException( format( "unknown digest \"%s\" [line %d]:", part, lineNumber ) );
        }

        if ( hasherVersion.equals( "0" ) )
        {
            byte[] decodedPassword = HexString.decodeHexString( split[1] );
            byte[] decodedSalt = HexString.decodeHexString( split[2] );
            return new LegacyCredential( decodedSalt, decodedPassword );
        }
        else
        {
            return SystemGraphCredential.deserialize( part, new SecureHasher( hasherVersion ) );
        }
    }
}
