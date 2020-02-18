/*
 * Copyright (c) 2002-2020 Graph Foundation, Inc.[https://graphfoundation.org]
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
package org.neo4j.kernel.impl.core;

/**
 * This is a {@link RuntimeException} since there is no sensible way to handle this exception.
 * It signals that the database is inconsistent, or trying to perform an inconsistent operations,
 * and when thrown it should bubble up in order to stop the database.
 */
public class UnknownSortTypeException extends RuntimeException
{
    public UnknownSortTypeException( String sortPropertyName, int sortId, int sortType )
    {
        super( String.format( "The sort property \"%s\" with id \"%s\" has invalid sortType \"%s\".",
                              sortPropertyName, sortId, sortType ) );
    }
}
