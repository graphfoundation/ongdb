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
package org.neo4j.kernel.impl.enterprise;

import org.neo4j.internal.kernel.api.PropertyCursor;

public class PropertyCursorUtil
{

    public static boolean exists( PropertyCursor propertyCursor, int propertyKey )
    {
        while ( propertyCursor.next() )
        {
            if ( propertyCursor.propertyKey() == propertyKey )
            {
                return true;
            }
        }
        return false;
    }

    public static boolean absent( PropertyCursor propertyCursor, int propertyKey )
    {
        return !exists( propertyCursor, propertyKey );
    }
}
