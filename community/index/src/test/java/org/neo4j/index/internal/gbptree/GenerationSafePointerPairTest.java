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
package org.neo4j.index.internal.gbptree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import org.neo4j.io.pagecache.ByteArrayPageCursor;
import org.neo4j.io.pagecache.PageCursor;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.neo4j.index.internal.gbptree.GenerationSafePointerPair.FLAG_READ;
import static org.neo4j.index.internal.gbptree.GenerationSafePointerPair.FLAG_WRITE;
import static org.neo4j.index.internal.gbptree.GenerationSafePointerPair.GENERATION_COMPARISON_MASK;
import static org.neo4j.index.internal.gbptree.GenerationSafePointerPair.READ_OR_WRITE_MASK;
import static org.neo4j.index.internal.gbptree.GenerationSafePointerPair.SHIFT_STATE_A;
import static org.neo4j.index.internal.gbptree.GenerationSafePointerPair.SHIFT_STATE_B;
import static org.neo4j.index.internal.gbptree.GenerationSafePointerPair.failureDescription;
import static org.neo4j.index.internal.gbptree.GenerationSafePointerPair.isRead;
import static org.neo4j.index.internal.gbptree.GenerationSafePointerPair.pointerStateFromResult;
import static org.neo4j.index.internal.gbptree.GenerationSafePointerPair.pointerStateName;

class GenerationSafePointerPairTest
{
    private static final int PAGE_SIZE = 128;
    private static final int OLD_STABLE_GENERATION = 1;
    private static final int STABLE_GENERATION = 2;
    private static final int OLD_CRASH_GENERATION = 3;
    private static final int CRASH_GENERATION = 4;
    private static final int UNSTABLE_GENERATION = 5;
    private static final long EMPTY_POINTER = 0L;

    private static final long POINTER_A = 5;
    private static final long POINTER_B = 6;
    private static final long WRITTEN_POINTER = 10;

    private static final int EXPECTED_GENERATION_DISREGARD = -2;
    private static final int EXPECTED_GENERATION_B_BIG = -1;
    private static final int EXPECTED_GENERATION_EQUAL = 0;
    private static final int EXPECTED_GENERATION_A_BIG = 1;

    private static final boolean SLOT_A = true;
    private static final boolean SLOT_B = false;
    private static final int GSPP_OFFSET = 5;
    private static final int SLOT_A_OFFSET = GSPP_OFFSET;
    private static final int SLOT_B_OFFSET = SLOT_A_OFFSET + GenerationSafePointer.SIZE;

    private static List<Arguments> params()
    {
        return List.of(
            //        ┌─────────────────┬─────────────────┬─────────────────-------──┬───────------────────────────┐
            //        │ State A         │ State B         │ Read outcome             │ Write outcome               │
            //        └─────────────────┴─────────────────┴──────────────────-------─┴────────────────────------───┘
            arguments( State.EMPTY,      State.EMPTY,      Fail.GENERATION_DISREGARD, Success.A ),
            arguments( State.EMPTY,      State.UNSTABLE,   Success.B,                 Success.B ),
            arguments( State.EMPTY,      State.STABLE,     Success.B,                 Success.A ),
            arguments( State.EMPTY,      State.CRASH,      Fail.GENERATION_DISREGARD, Fail.GENERATION_DISREGARD ),
            arguments( State.EMPTY,      State.BROKEN,     Fail.GENERATION_DISREGARD, Fail.GENERATION_DISREGARD ),
            arguments( State.UNSTABLE,   State.EMPTY,      Success.A,                 Success.A ),
            arguments( State.UNSTABLE,   State.UNSTABLE,   Fail.GENERATION_EQUAL,     Fail.GENERATION_EQUAL ),
            arguments( State.UNSTABLE,   State.STABLE,     Success.A,                  Success.A ),
            arguments( State.UNSTABLE,   State.CRASH,      Fail.GENERATION_A_BIG,     Fail.GENERATION_A_BIG ),
            arguments( State.UNSTABLE,   State.BROKEN,     Fail.GENERATION_DISREGARD, Fail.GENERATION_DISREGARD ),
            arguments( State.STABLE,     State.EMPTY,      Success.A,                 Success.B ),
            arguments( State.STABLE,     State.UNSTABLE,   Success.B,                 Success.B ),
            arguments( State.STABLE,     State.OLD_STABLE, Success.A,                 Success.B ),
            arguments( State.OLD_STABLE, State.STABLE,     Success.B,                 Success.A ),
            arguments( State.STABLE,     State.STABLE,     Fail.GENERATION_EQUAL,     Fail.GENERATION_EQUAL ),
            arguments( State.STABLE,     State.CRASH,      Success.A,                 Success.B ),
            arguments( State.STABLE,     State.BROKEN,     Success.A,                 Success.B ),
            arguments( State.CRASH,      State.EMPTY,      Fail.GENERATION_DISREGARD, Fail.GENERATION_DISREGARD ),
            arguments( State.CRASH,      State.UNSTABLE,   Fail.GENERATION_B_BIG,     Fail.GENERATION_B_BIG ),
            arguments( State.CRASH,      State.STABLE,     Success.B,                 Success.A ),
            arguments( State.CRASH,      State.OLD_CRASH,  Fail.GENERATION_A_BIG,     Fail.GENERATION_A_BIG ),
            arguments( State.OLD_CRASH,  State.CRASH,      Fail.GENERATION_B_BIG,     Fail.GENERATION_B_BIG ),
            arguments( State.CRASH,      State.CRASH,      Fail.GENERATION_EQUAL,     Fail.GENERATION_EQUAL ),
            arguments( State.CRASH,      State.BROKEN,     Fail.GENERATION_DISREGARD, Fail.GENERATION_DISREGARD ),
            arguments( State.BROKEN,     State.EMPTY,      Fail.GENERATION_DISREGARD, Fail.GENERATION_DISREGARD ),
            arguments( State.BROKEN,     State.UNSTABLE,   Fail.GENERATION_DISREGARD, Fail.GENERATION_DISREGARD ),
            arguments( State.BROKEN,     State.STABLE,     Success.B,          Success.A ),
            arguments( State.BROKEN,     State.CRASH,      Fail.GENERATION_DISREGARD, Fail.GENERATION_DISREGARD ),
            arguments( State.BROKEN,     State.BROKEN,     Fail.GENERATION_DISREGARD, Fail.GENERATION_DISREGARD )
        );
    }

    private final PageCursor cursor = ByteArrayPageCursor.wrap( new byte[PAGE_SIZE] );

    @ParameterizedTest
    @MethodSource( "params" )
    void shouldRead( State stateA, State stateB, Slot expectedReadOutcome, Slot expectedWriteOutcome )
    {
        // GIVEN
        cursor.setOffset( SLOT_A_OFFSET );
        long preStatePointerA = stateA.materialize( cursor, POINTER_A );
        cursor.setOffset( SLOT_B_OFFSET );
        long preStatePointerB = stateB.materialize( cursor, POINTER_B );

        // WHEN
        cursor.setOffset( GSPP_OFFSET );
        GenerationKeeper generationKeeper = new GenerationKeeper();
        long result = GenerationSafePointerPair.read( cursor, STABLE_GENERATION, UNSTABLE_GENERATION, generationKeeper );

        // THEN
        expectedReadOutcome.verifyRead( cursor, result, stateA, stateB, preStatePointerA, preStatePointerB, generationKeeper.generation );
    }

    @ParameterizedTest
    @MethodSource( "params" )
    void shouldWrite( State stateA, State stateB, Slot expectedReadOutcome, Slot expectedWriteOutcome )
    {
        // GIVEN
        cursor.setOffset( SLOT_A_OFFSET );
        long preStatePointerA = stateA.materialize( cursor, POINTER_A );
        cursor.setOffset( SLOT_B_OFFSET );
        long preStatePointerB = stateB.materialize( cursor, POINTER_B );

        // WHEN
        cursor.setOffset( GSPP_OFFSET );
        long written = GenerationSafePointerPair.write( cursor, WRITTEN_POINTER, STABLE_GENERATION, UNSTABLE_GENERATION );

        // THEN
        expectedWriteOutcome.verifyWrite( cursor, written, stateA, stateB, preStatePointerA, preStatePointerB );
    }

    private static void assertFailure( long result, long readOrWrite, int generationComparison, byte pointerStateA, byte pointerStateB )
    {
        assertFalse( GenerationSafePointerPair.isSuccess( result ) );

        // Raw failure bits
        assertEquals( readOrWrite, result & READ_OR_WRITE_MASK );
        if ( generationComparison != EXPECTED_GENERATION_DISREGARD )
        {
            assertEquals( generationComparisonBits( generationComparison ), result & GENERATION_COMPARISON_MASK );
        }
        assertEquals( pointerStateA, pointerStateFromResult( result, SHIFT_STATE_A ) );
        assertEquals( pointerStateB, pointerStateFromResult( result, SHIFT_STATE_B ) );

        // Failure description
        int nodeId = 0;
        String pointerType = "unknown";
        String gspStringA = "gspStringA";
        String gspStringB = "gspStringB";
        String failureDescription =
                failureDescription( result, nodeId, pointerType, STABLE_GENERATION, UNSTABLE_GENERATION, gspStringA, gspStringB, GSPP_OFFSET );
        assertThat( failureDescription ).contains( isRead( result ) ? "READ" : "WRITE" );
        if ( generationComparison != EXPECTED_GENERATION_DISREGARD )
        {
            assertThat( failureDescription ).contains( generationComparisonName( generationComparison ) );
        }
        assertThat( failureDescription ).contains( pointerStateName( pointerStateA ) );
        assertThat( failureDescription ).contains( pointerStateName( pointerStateB ) );
        assertThat( failureDescription ).contains( "Pointer[type=" + pointerType + ", offset=" + GSPP_OFFSET + ", nodeId=" + nodeId + "]" );
        assertThat( failureDescription ).contains( gspStringA );
        assertThat( failureDescription ).contains( gspStringB );
        assertThat( failureDescription ).contains( "stableGeneration=" + STABLE_GENERATION + ", unstableGeneration=" + UNSTABLE_GENERATION );
    }

    private static String generationComparisonName( int generationComparison )
    {
        switch ( generationComparison )
        {
        case EXPECTED_GENERATION_B_BIG:
            return GenerationSafePointerPair.GENERATION_COMPARISON_NAME_B_BIG;
        case EXPECTED_GENERATION_EQUAL:
            return GenerationSafePointerPair.GENERATION_COMPARISON_NAME_EQUAL;
        case EXPECTED_GENERATION_A_BIG:
            return GenerationSafePointerPair.GENERATION_COMPARISON_NAME_A_BIG;
        default:
            throw new UnsupportedOperationException( String.valueOf( generationComparison ) );
        }
    }

    private static long generationComparisonBits( int generationComparison )
    {
        switch ( generationComparison )
        {
        case EXPECTED_GENERATION_B_BIG:
            return GenerationSafePointerPair.FLAG_GENERATION_B_BIG;
        case EXPECTED_GENERATION_EQUAL:
            return GenerationSafePointerPair.FLAG_GENERATION_EQUAL;
        case EXPECTED_GENERATION_A_BIG:
            return GenerationSafePointerPair.FLAG_GENERATION_A_BIG;
        default:
            throw new UnsupportedOperationException( String.valueOf( generationComparison ) );
        }
    }

    private static long readSlotA( PageCursor cursor )
    {
        cursor.setOffset( SLOT_A_OFFSET );
        return readSlot( cursor );
    }

    private static long readSlotB( PageCursor cursor )
    {
        cursor.setOffset( SLOT_B_OFFSET );
        return readSlot( cursor );
    }

    private static long readSlot( PageCursor cursor )
    {
        long generation = GenerationSafePointer.readGeneration( cursor );
        long pointer = GenerationSafePointer.readPointer( cursor );
        short checksum = GenerationSafePointer.readChecksum( cursor );
        assertEquals( GenerationSafePointer.checksumOf( generation, pointer ), checksum );
        return pointer;
    }

    enum State
    {
        EMPTY( GenerationSafePointerPair.EMPTY )
        {
            @Override
            long materialize( PageCursor cursor, long pointer )
            {   // Nothing to write
                return EMPTY_POINTER;
            }
        },
        BROKEN( GenerationSafePointerPair.BROKEN )
        {
            @Override
            long materialize( PageCursor cursor, long pointer )
            {
                // write an arbitrary GSP
                int offset = cursor.getOffset();
                GenerationSafePointer.write( cursor, 10, 20 );

                // then break its checksum
                cursor.setOffset( offset + GenerationSafePointer.SIZE - GenerationSafePointer.CHECKSUM_SIZE );
                short checksum = GenerationSafePointer.readChecksum( cursor );
                cursor.setOffset( offset + GenerationSafePointer.SIZE - GenerationSafePointer.CHECKSUM_SIZE );
                cursor.putShort( (short) ~checksum );
                return pointer;
            }

            @Override
            void verify( PageCursor cursor, long expectedPointer, boolean slotA )
            {
                cursor.setOffset( slotA ? SLOT_A_OFFSET : SLOT_B_OFFSET );

                long generation = GenerationSafePointer.readGeneration( cursor );
                long pointer = GenerationSafePointer.readPointer( cursor );
                short checksum = GenerationSafePointer.readChecksum( cursor );
                assertNotEquals( GenerationSafePointer.checksumOf( generation, pointer ), checksum );
            }
        },
        OLD_CRASH( GenerationSafePointerPair.CRASH )
        {
            @Override
            long materialize( PageCursor cursor, long pointer )
            {
                GenerationSafePointer.write( cursor, OLD_CRASH_GENERATION, pointer );
                return pointer;
            }
        },
        CRASH( GenerationSafePointerPair.CRASH )
        {
            @Override
            long materialize( PageCursor cursor, long pointer )
            {
                GenerationSafePointer.write( cursor, CRASH_GENERATION, pointer );
                return pointer;
            }
        },
        OLD_STABLE( GenerationSafePointerPair.STABLE )
        {
            @Override
            long materialize( PageCursor cursor, long pointer )
            {
                GenerationSafePointer.write( cursor, OLD_STABLE_GENERATION, pointer );
                return pointer;
            }
        },
        STABLE( GenerationSafePointerPair.STABLE )
        {
            @Override
            long materialize( PageCursor cursor, long pointer )
            {
                GenerationSafePointer.write( cursor, STABLE_GENERATION, pointer );
                return pointer;
            }
        },
        UNSTABLE( GenerationSafePointerPair.UNSTABLE )
        {
            @Override
            long materialize( PageCursor cursor, long pointer )
            {
                GenerationSafePointer.write( cursor, UNSTABLE_GENERATION, pointer );
                return pointer;
            }
        };

        /**
         * Actual {@link GenerationSafePointerPair} pointer state value.
         */
        private final byte byteValue;

        State( byte byteValue )
        {
            this.byteValue = byteValue;
        }

        /**
         * Writes this state onto cursor.
         *
         * @param cursor {@link PageCursor} to write pre-state to.
         * @param pointer pointer to write in GSP. Generation is decided by the pre-state.
         * @return written pointer.
         */
        abstract long materialize( PageCursor cursor, long pointer );

        /**
         * Verifies result after WHEN section in test.
         *
         * @param cursor {@link PageCursor} to read actual pointer from.
         * @param expectedPointer expected pointer, as received from {@link #materialize(PageCursor, long)}.
         * @param slotA whether or not this is for slot A, otherwise B.
         */
        void verify( PageCursor cursor, long expectedPointer, boolean slotA )
        {
            assertEquals( expectedPointer, slotA ? readSlotA( cursor ) : readSlotB( cursor ) );
        }

        public static long readGeneration( PageCursor cursor, boolean slotA )
        {
            cursor.setOffset( slotA ? SLOT_A_OFFSET : SLOT_B_OFFSET );
            return GenerationSafePointer.readGeneration( cursor );
        }
    }

    interface Slot
    {
        /**
         * @param cursor {@link PageCursor} to read actual result from.
         * @param result read-result from {@link GenerationSafePointerPair#read(PageCursor, long, long, GBPTreeGenerationTarget)}.
         * @param stateA state of pointer A when read.
         * @param stateB state of pointer B when read.
         * @param preStatePointerA pointer A as it looked like in pre-state.
         * @param preStatePointerB pointer B as it looked like in pre-state.
         * @param generation read generation.
         */
        void verifyRead( PageCursor cursor, long result, State stateA, State stateB, long preStatePointerA, long preStatePointerB, long generation );

        /**
         * @param cursor {@link PageCursor} to read actual result from.
         * @param result write-result from {@link GenerationSafePointerPair#write(PageCursor, long, long, long)}.
         * @param stateA state of pointer A when written.
         * @param stateB state of pointer B when written.
         * @param preStatePointerA pointer A as it looked like in pre-state.
         * @param preStatePointerB pointer B as it looked like in pre-state.
         */
        void verifyWrite( PageCursor cursor, long result, State stateA, State stateB,
                long preStatePointerA, long preStatePointerB );
    }

    enum Success implements Slot
    {
        A( POINTER_A, SLOT_A ),
        B( POINTER_B, SLOT_B );

        private final long expectedPointer;
        private final boolean expectedSlot;

        Success( long expectedPointer, boolean expectedSlot )
        {
            this.expectedPointer = expectedPointer;
            this.expectedSlot = expectedSlot;
        }

        @Override
        public void verifyRead( PageCursor cursor, long result, State stateA, State stateB, long preStatePointerA, long preStatePointerB, long generation )
        {
            assertSuccess( result );
            long pointer = GenerationSafePointerPair.pointer( result );
            assertEquals( expectedPointer, pointer );
            assertEquals( expectedSlot == SLOT_A, GenerationSafePointerPair.resultIsFromSlotA( result ) );
            stateA.verify( cursor, preStatePointerA, SLOT_A );
            stateB.verify( cursor, preStatePointerB, SLOT_B );
            assertEquals( State.readGeneration( cursor, expectedSlot ), generation );
        }

        @Override
        public void verifyWrite( PageCursor cursor, long result, State stateA, State stateB,
                long preStatePointerA, long preStatePointerB )
        {
            assertSuccess( result );
            boolean actuallyWrittenSlot =
                    (result & GenerationSafePointerPair.SLOT_MASK) == GenerationSafePointerPair.FLAG_SLOT_A ? SLOT_A : SLOT_B;
            assertEquals( expectedSlot, actuallyWrittenSlot );

            if ( expectedSlot == SLOT_A )
            {
                // Expect slot A to have been written, B staying the same
                assertEquals( WRITTEN_POINTER, readSlotA( cursor ) );
                assertEquals( preStatePointerB, readSlotB( cursor ) );
            }
            else
            {
                // Expect slot B to have been written, A staying the same
                assertEquals( preStatePointerA, readSlotA( cursor ) );
                assertEquals( WRITTEN_POINTER, readSlotB( cursor ) );
            }
        }

        private static void assertSuccess( long result )
        {
            assertTrue( GenerationSafePointerPair.isSuccess( result ) );
        }
    }

    enum Fail implements Slot
    {
        GENERATION_DISREGARD( EXPECTED_GENERATION_DISREGARD ),
        GENERATION_B_BIG( EXPECTED_GENERATION_B_BIG ),
        GENERATION_EQUAL( EXPECTED_GENERATION_EQUAL ),
        GENERATION_A_BIG( EXPECTED_GENERATION_A_BIG );

        private final int generationComparison;

        Fail( int generationComparison )
        {
            this.generationComparison = generationComparison;
        }

        @Override
        public void verifyRead( PageCursor cursor, long result, State stateA, State stateB, long preStatePointerA, long preStatePointerB, long generation )
        {
            assertFailure( result, FLAG_READ, generationComparison, stateA.byteValue, stateB.byteValue );
            stateA.verify( cursor, preStatePointerA, SLOT_A );
            stateB.verify( cursor, preStatePointerB, SLOT_B );
            assertEquals( GenerationSafePointer.EMPTY_GENERATION, generation );
        }

        @Override
        public void verifyWrite( PageCursor cursor, long result, State stateA, State stateB,
                long preStatePointerA, long preStatePointerB )
        {
            assertFailure( result, FLAG_WRITE, generationComparison, stateA.byteValue, stateB.byteValue );
            stateA.verify( cursor, preStatePointerA, SLOT_A );
            stateB.verify( cursor, preStatePointerB, SLOT_B );
        }
    }
}
