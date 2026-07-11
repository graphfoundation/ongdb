/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
package org.neo4j.ssl;

import org.bouncycastle.operator.OperatorCreationException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.GeneralSecurityException;
import java.util.UUID;

import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.configuration.ssl.SslPolicyConfig;
import org.neo4j.test.rule.TestDirectory;

/**
 * Builds named SSL policies with self-signed certificates for hostname-verification ITs.
 */
public class HostnameVerificationHelper
{
    public static final String POLICY_NAME = "fakePolicy";
    public static final SslPolicyConfig SSL_POLICY_CONFIG = new SslPolicyConfig( POLICY_NAME );
    private static final PkiUtils PKI_UTILS = new PkiUtils();

    public static Config aConfig( String hostname, TestDirectory testDirectory ) throws GeneralSecurityException, IOException, OperatorCreationException
    {
        String random = UUID.randomUUID().toString();
        File baseDirectory = testDirectory.directory( "base_directory_" + random );
        File validCertificatePath = new File( baseDirectory, "certificate.crt" );
        File validPrivateKeyPath = new File( baseDirectory, "private.pem" );
        File revoked = new File( baseDirectory, "revoked" );
        File trusted = new File( baseDirectory, "trusted" );
        trusted.mkdirs();
        revoked.mkdirs();
        PKI_UTILS.createSelfSignedCertificate( validCertificatePath, validPrivateKeyPath, hostname ); // Sets Subject Alternative Name(s) to hostname
        return Config.builder()
                .withSetting( SSL_POLICY_CONFIG.base_directory, baseDirectory.toString() )
                .withSetting( SSL_POLICY_CONFIG.trusted_dir, trusted.toString() )
                .withSetting( SSL_POLICY_CONFIG.revoked_dir, revoked.toString() )
                .withSetting( SSL_POLICY_CONFIG.private_key, validPrivateKeyPath.toString() )
                .withSetting( SSL_POLICY_CONFIG.public_certificate, validCertificatePath.toString() )

                .withSetting( SSL_POLICY_CONFIG.tls_versions, "TLSv1.2" )
                .withSetting( SSL_POLICY_CONFIG.ciphers, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA" )

                .withSetting( SSL_POLICY_CONFIG.client_auth, "none" )
                .withSetting( SSL_POLICY_CONFIG.allow_key_generation, "false" )

                // Even if we trust all, certs should be rejected if don't match Common Name (CA) or Subject Alternative Name
                .withSetting( SSL_POLICY_CONFIG.trust_all, "false" )
                .withSetting( SSL_POLICY_CONFIG.verify_hostname, "true" )
                .build();
    }

    public static void trust( Config target, Config subject ) throws IOException
    {
        SslPolicyConfig sslPolicyConfig = new SslPolicyConfig( POLICY_NAME );
        File trustedDirectory = target.get( sslPolicyConfig.trusted_dir );
        File certificate = subject.get( sslPolicyConfig.public_certificate );
        Path trustedCertFilePath = trustedDirectory.toPath().resolve( certificate.getName() );
        Files.copy( certificate.toPath(), trustedCertFilePath );
    }
}
