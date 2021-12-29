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
package org.neo4j.backup.impl;

public class OpenEnterpriseBackupSupportingClassesFactoryProvider extends BackupSupportingClassesFactoryProvider
{
    public static final int PRIORITY_INCREASED_BY = 100;

    public OpenEnterpriseBackupSupportingClassesFactoryProvider()
    {
        super( "open-enterprise-backup-support-provider" );
    }

    public BackupSupportingClassesFactory getFactory( BackupModule backupModule )
    {
        return new OpenEnterpriseBackupSupportingClassesFactory( backupModule );
    }

    protected int getPriority()
    {
        return super.getPriority() + PRIORITY_INCREASED_BY;
    }
}

