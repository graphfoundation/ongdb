/*
 * Copyright (c) 2019 "GraphFoundation" [https://graphfoundation.org]
 *
 * The included source code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html)
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 */

package org.neo4j.backup.impl;

/**
 *
 */
public class OpenEnterpriseBackupSupportingClassesFactoryProvider extends BackupSupportingClassesFactoryProvider
{
    /**
     *
     */
    public OpenEnterpriseBackupSupportingClassesFactoryProvider()
    {
        super( "open-enterprise-backup-support-provider" );
    }

    /**
     * @param backupModule
     * @return
     */
    public BackupSupportingClassesFactory getFactory( BackupModule backupModule )
    {
        return new OpenEnterpriseBackupSupportingClassesFactory( backupModule );
    }

    /**
     * Make this a higher priority than the one we are extending
     * @return
     */
    protected int getPriority()
    {
        return super.getPriority() + 101;
    }
}

