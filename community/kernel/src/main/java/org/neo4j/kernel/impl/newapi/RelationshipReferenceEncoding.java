/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2020 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.kernel.impl.newapi;

import static org.neo4j.kernel.impl.newapi.Read.NO_ID;

/**
 * Relationship/relationship group references that are exposed from the kernel API surface into the client
 * will have some flags encoded into them, basically to provide some context which will be lost when exiting the kernel.
 * The flags will help recreated that context when these references are passed back into the kernel API, i.e. when client uses them later.
 * <p>
 * Among the reasons we need to encode references are:
 * <ul>
 *     <li>relationship group references exists as a thing that can be exposed outside the cursors, where context is lost</li>
 *     <li>relationship group references can actually be a relationship reference at times (at least in the record storage implementation)</li>
 * </ul>
 * Specifically for the record storage engine it is because there are dense and non-dense nodes. A dense node will have a
 * pointer into the relationship group store, while a non-dense node points directly to the relationship store. On
 * retrieving a relationship reference from a dense node, we therefore have to transparently encode in the reference
 * that it actually points to a group. When the kernel then serves a relationship cursor using the reference, we need
 * to silently detect that we have a group reference, parse the groups, and setup the cursor to serve relationship
 * via this mode instead.
 * <p>
 * Note that {@code -1} is used to encode {@link Read#NO_ID that a reference is invalid}. In terms of
 * encoding {@code -1} is considered to have all flags, so setting one will not change {@code -1}. This however also
 * means that calling code must check for {@code -1} references before checking flags existence.
 * <p>
 * Finally, an encoded reference cannot be used directly as an id to acquire the referenced object. Before using
 * the reference, the encoding must be cleared with {@link #clearEncoding(long)}. To guard against using an
 * encoded reference, all encoded references are marked so they appear negative.
 */
enum RelationshipReferenceEncoding
{
    /** No encoding */
    NONE( 0 ),

    /** @see #encodeDense(long) */
    DENSE( 1 ),

    /** @see #encodeSelection(long)  */
    SELECTION( 2 ),

    /** @see #encodeDenseSelection(long)   */
    DENSE_SELECTION( 3 ),

    /** @see #encodeNoOutgoing(int) */
    NO_OUTGOING_OF_TYPE( 4 ),

    /** @see #encodeNoIncoming(int) */
    NO_INCOMING_OF_TYPE( 5 ),

    /** @see #encodeNoLoops(int) */
    NO_LOOPS_OF_TYPE( 6 );

    private static final RelationshipReferenceEncoding[] ENCODINGS = RelationshipReferenceEncoding.values();
    static final long FLAG_MARKER = 0x8000_0000_0000_0000L;
    static final long FLAG_MASK = 0x7000_0000_0000_0000L;
    static final long FLAGS = 0xF000_0000_0000_0000L;

    final long id;
    final long bits;

    RelationshipReferenceEncoding( long id )
    {
        this.id = id;
        this.bits = id << 60;
    }

    static RelationshipReferenceEncoding parseEncoding( long reference )
    {
        if ( reference == NO_ID )
        {
            return NONE;
        }
        return ENCODINGS[encodingId( reference )];
    }

    private static int encodingId( long reference )
    {
        return (int)((reference & FLAG_MASK) >> 60);
    }

    /**
     * Encode the fact that an all-relationships references came from a dense node.
     */
    static long encodeDense( long reference )
    {
        return reference | DENSE.bits | FLAG_MARKER;
    }

    /**
     * Encode the fact that a relationship reference from a selected group came from a sparse node.
     */
    static long encodeSelection( long reference )
    {
        return reference | SELECTION.bits | FLAG_MARKER;
    }

    /**
     * Encode the fact that a relationship reference from a selected group came from a dense node.
     */
    static long encodeDenseSelection( long reference )
    {
        return reference | DENSE_SELECTION.bits | FLAG_MARKER;
    }

    /**
     * Encode that no outgoing relationships of the encoded type exist.
     */
    static long encodeNoOutgoing( int type )
    {
        return type | NO_OUTGOING_OF_TYPE.bits | FLAG_MARKER;
    }

    /**
     * Encode that no incoming relationships of the encoded type exist.
     */
    static long encodeNoIncoming( int type )
    {
        return type | NO_INCOMING_OF_TYPE.bits | FLAG_MARKER;
    }

    /**
     * Encode that no loop relationships of the encoded type exist.
     */
    static long encodeNoLoops( int type )
    {
        return type | NO_LOOPS_OF_TYPE.bits | FLAG_MARKER;
    }

    /**
     * Clear all encoding from a reference.
     *
     * @param reference The reference to clear.
     * @return The cleared reference.
     */
    static long clearEncoding( long reference )
    {
        assert reference != NO_ID;
        return reference & ~FLAGS;
    }
}
