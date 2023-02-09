/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.kernel.impl.index.schema;

import org.junit.jupiter.api.Test;

import org.neo4j.configuration.Config;
import org.neo4j.index.internal.gbptree.ValueMerger.MergeResult;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.impl.index.schema.config.IndexSpecificSpaceFillingCurveSettings;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.internal.helpers.ArrayUtil.array;

class ThrowingConflictDetectorTest
{
    private static final IndexSpecificSpaceFillingCurveSettings specificSettings = IndexSpecificSpaceFillingCurveSettings.fromConfig( Config.defaults() );
    private final ThrowingConflictDetector<BtreeKey> detector = new ThrowingConflictDetector<>( true );

    @Test
    void shouldReportConflictOnSameValueAndDifferentEntityIds()
    {
        // given
        Value value = Values.of( 123 );
        long entityId1 = 10;
        long entityId2 = 20;

        // when
        MergeResult mergeResult = detector.merge(
                key( entityId1, value ),
                key( entityId2, value ),
                NullValue.INSTANCE,
                NullValue.INSTANCE );

        // then
        assertSame( MergeResult.UNCHANGED, mergeResult );
        var e = assertThrows( IndexEntryConflictException.class, () -> detector.checkConflict( array( value ) ) );
        assertEquals( entityId1, e.getExistingNodeId() );
        assertEquals( entityId2, e.getAddedNodeId() );
        assertEquals( value, e.getSinglePropertyValue() );
    }

    @Test
    void shouldNotReportConflictOnSameValueSameEntityId() throws IndexEntryConflictException
    {
        // given
        Value value = Values.of( 123 );
        long entityId = 10;

        // when
        MergeResult mergeResult = detector.merge(
                key( entityId, value ),
                key( entityId, value ),
                NullValue.INSTANCE,
                NullValue.INSTANCE );

        // then
        assertSame( MergeResult.UNCHANGED, mergeResult );
        detector.checkConflict( array() ); // <-- should not throw conflict exception
    }

    private static BtreeKey key( long entityId, Value value )
    {
        BtreeKey key = new BtreeKey( specificSettings );
        key.initialize( entityId );
        key.initFromValue( 0, value, NativeIndexKey.Inclusion.NEUTRAL );
        return key;
    }
}
