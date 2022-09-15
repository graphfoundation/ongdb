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
package org.neo4j.internal.batchimport.store;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.internal.kernel.api.TokenWrite;
import org.neo4j.internal.kernel.api.exceptions.schema.IllegalTokenNameException;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.impl.store.DynamicStringStore;
import org.neo4j.kernel.impl.store.TokenStore;
import org.neo4j.kernel.impl.store.record.DynamicRecord;
import org.neo4j.kernel.impl.store.record.LabelTokenRecord;
import org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord;
import org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord;
import org.neo4j.kernel.impl.store.record.TokenRecord;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static java.lang.Math.max;
import static java.lang.Math.toIntExact;
import static org.neo4j.kernel.impl.store.PropertyStore.encodeString;

/**
 * Batching version of a {@link TokenStore} where tokens can be created and retrieved, but only persisted
 * to storage as part of {@link #flush(CursorContext, PageCursor, StoreCursors)}  flush}. Instances of this class are thread safe
 * to call {@link #getOrCreateId(String)} methods on.
 */
public abstract class BatchingTokenRepository<RECORD extends TokenRecord> implements ToIntFunction<Object>
{
    private final Map<String,TokenId> tokens = new HashMap<>();
    private final TokenStore<RECORD> store;
    private final IntFunction<RECORD> recordInstantiator;
    private int highId;
    private int highestCreatedId;

    BatchingTokenRepository( TokenStore<RECORD> store, IntFunction<RECORD> recordInstantiator )
    {
        this.store = store;
        this.recordInstantiator = recordInstantiator;
        this.highId = (int) store.getHighId();
        this.highestCreatedId = highId - 1;
    }

    /**
     * Returns the id for token with the specified {@code name}, potentially creating that token and
     * assigning a new id as part of this call.
     *
     * @param name token name.
     * @return the id (created or existing) for the token by this name.
     */
    public int getOrCreateId( String name )
    {
        return getOrCreateId( name, false );
    }

    /**
     * Returns the id for token with the specified {@code name}, potentially creating that token and assigning a new id as part of this call.
     *
     * @param name     token name.
     * @param internal flag to mark the token as internal
     * @return the id (created or existing) for the token by this name.
     */
    public int getOrCreateId( String name, boolean internal )
    {
        try
        {
            TokenWrite.checkValidTokenName( name );
        }
        catch ( IllegalTokenNameException e )
        {
            throw new IllegalArgumentException( e );
        }

        TokenId id = tokens.get( name );
        if ( id == null )
        {
            synchronized ( tokens )
            {
                id = tokens.computeIfAbsent( name, k -> new TokenId( highId++, internal ) );
            }
        }
        return id.value;
    }

    /**
     * Returns the id for token with the specified {@code key}, which can be a {@link String} if representing
     * a user-defined name or an {@link Integer} if representing an existing type from an external source,
     * which wants to preserve its name --> id tokens. Also see {@link #getOrCreateId(String)} for more details.
     *
     * @param key name or id of this token.
     * @return the id (created or existing) for the token key.
     */
    public int getOrCreateId( Object key )
    {
        if ( key instanceof String )
        {
            // A name was supplied, get or create a token id for it
            return getOrCreateId( (String) key );
        }
        else if ( key instanceof Integer )
        {
            // A raw token id was supplied, just use it
            return (Integer) key;
        }
        throw new IllegalArgumentException( "Expected either a String or Integer for property key, but was '" +
                key + "'" + ", " + key.getClass() );
    }

    @Override
    public int applyAsInt( Object key )
    {
        return getOrCreateId( key );
    }

    public long[] getOrCreateIds( String[] names )
    {
        return getOrCreateIds( names, names.length );
    }

    /**
     * Returns or creates multiple tokens for given token names.
     *
     * @param names token names to lookup or create token ids for.
     * @param length length of the names array to consider, the array itself may be longer.
     * @return {@code long[]} containing the label ids.
     */
    public long[] getOrCreateIds( String[] names, int length )
    {
        long[] result = new long[length];
        int from;
        int to;
        for ( from = 0, to = 0; from < length; from++ )
        {
            int id = getOrCreateId( names[from] );
            if ( !contains( result, id, to ) )
            {
                result[to++] = id;
            }
        }
        if ( to < from )
        {
            result = Arrays.copyOf( result, to );
        }
        Arrays.sort( result );
        return result;
    }

    private static boolean contains( long[] array, long id, int arrayLength )
    {
        for ( int i = 0; i < arrayLength; i++ )
        {
            if ( array[i] == id )
            {
                return true;
            }
        }
        return false;
    }

    public int getHighId()
    {
        return highId;
    }

    public void flush( CursorContext cursorContext, PageCursor pageCursor, StoreCursors storeCursors )
    {
        int highest = highestCreatedId;
        for ( Map.Entry<TokenId,String> tokenToCreate : sortCreatedTokensById( tokens ) )
        {
            if ( tokenToCreate.getKey().value > highestCreatedId )
            {
                createToken( tokenToCreate.getValue(), tokenToCreate.getKey().value, tokenToCreate.getKey().internal, cursorContext, pageCursor, storeCursors );
                highest = Math.max( highest, tokenToCreate.getKey().value );
            }
        }

        // Store them
        int highestId = max( toIntExact( store.getHighestPossibleIdInUse( cursorContext ) ), highest );
        store.setHighestPossibleIdInUse( highestId );
        highestCreatedId = highestId;
    }

    private void createToken( String name, int tokenId, boolean internal, CursorContext cursorContext, PageCursor pageCursor, StoreCursors storeCursors )
    {
        RECORD record = recordInstantiator.apply( tokenId );
        record.setInUse( true );
        record.setCreated();
        record.setInternal( internal );
        Collection<DynamicRecord> nameRecords = store.allocateNameRecords( encodeString( name ), cursorContext, EmptyMemoryTracker.INSTANCE );
        record.setNameId( (int) Iterables.first( nameRecords ).getId() );
        record.addNameRecords( nameRecords );
        store.updateRecord( record, pageCursor, cursorContext, storeCursors );
        try ( var namedCursor = store.getWriteDynamicTokenCursor( storeCursors ) )
        {
            DynamicStringStore tokenNameStore = store.getNameStore();
            nameRecords.forEach( nameRecord -> tokenNameStore.updateRecord( nameRecord, namedCursor, cursorContext, storeCursors ) );
        }
    }

    private static Iterable<Map.Entry<TokenId,String>> sortCreatedTokensById( Map<String,TokenId> tokens )
    {
        Map<TokenId,String> sorted = new TreeMap<>();
        for ( Map.Entry<String,TokenId> entry : tokens.entrySet() )
        {
            sorted.put( entry.getValue(), entry.getKey() );
        }
        return sorted.entrySet();
    }

    public static class BatchingPropertyKeyTokenRepository
            extends BatchingTokenRepository<PropertyKeyTokenRecord>
    {
        BatchingPropertyKeyTokenRepository( TokenStore<PropertyKeyTokenRecord> store )
        {
            super( store, PropertyKeyTokenRecord::new );
        }
    }

    public static class BatchingLabelTokenRepository extends BatchingTokenRepository<LabelTokenRecord>
    {
        BatchingLabelTokenRepository( TokenStore<LabelTokenRecord> store )
        {
            super( store, LabelTokenRecord::new );
        }
    }

    public static class BatchingRelationshipTypeTokenRepository
            extends BatchingTokenRepository<RelationshipTypeTokenRecord>
    {
        BatchingRelationshipTypeTokenRepository( TokenStore<RelationshipTypeTokenRecord> store )
        {
            super( store, RelationshipTypeTokenRecord::new );
        }
    }

    private static class TokenId implements Comparable<TokenId>
    {
        private final Integer value;
        private final boolean internal;

        TokenId( int value, boolean internal )
        {
            this.value = value;
            this.internal = internal;
        }

        @Override
        public int compareTo( TokenId other )
        {
            return value.compareTo( other.value );
        }
    }
}
