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
package org.neo4j.internal.nativeimpl;

public class AbsentNativeAccess implements NativeAccess
{
    @Override
    public boolean isAvailable()
    {
        return false;
    }

    @Override
    public NativeCallResult tryEvictFromCache( int fd )
    {
        return NativeCallResult.SUCCESS;
    }

    @Override
    public NativeCallResult tryAdviseSequentialAccess( int fd )
    {
        return NativeCallResult.SUCCESS;
    }

    @Override
    public NativeCallResult tryAdviseToKeepInCache( int fd )
    {
        return NativeCallResult.SUCCESS;
    }

    @Override
    public NativeCallResult tryPreallocateSpace( int fd, long bytes )
    {
        return NativeCallResult.SUCCESS;
    }

    @Override
    public ErrorTranslator errorTranslator()
    {
        return MissingErrorTranslator.INSTANCE;
    }

    @Override
    public String describe()
    {
        return "Native access is not available for current platform.";
    }

    private static class MissingErrorTranslator implements ErrorTranslator
    {
        static final ErrorTranslator INSTANCE = new MissingErrorTranslator();

        private MissingErrorTranslator()
        {
        }

        @Override
        public boolean isOutOfDiskSpace( NativeCallResult callResult )
        {
            return false;
        }
    }
}
