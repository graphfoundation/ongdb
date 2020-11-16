/*
 * Copyright (c) 2018-2020 "Graph Foundation"
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
package org.neo4j.kernel.impl.util;

public enum FulltextSortType
{
    LONG( 0 ),
    DOUBLE( 1 ),
    STRING( 2 );

    int neoStoreByte;

    FulltextSortType( final Integer neoStoreByte )
    {
        this.neoStoreByte = neoStoreByte;
    }

    public static FulltextSortType valueOfIgnoreCase( String name )
    {
        for ( FulltextSortType each : FulltextSortType.class.getEnumConstants() )
        {
            if ( each.name().compareToIgnoreCase( name ) == 0 )
            {
                return each;
            }
        }
        return null;
    }

    public static String intToType( int i )
    {
        switch ( i )
        {
        case 0:
            return LONG.name();
        case 1:
            return DOUBLE.name();
        case 2:
            return STRING.name();
        default:
            return null;
        }
    }

    public int getNeoStoreByte()
    {
        return neoStoreByte;
    }
}
