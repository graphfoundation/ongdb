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
package org.neo4j.kernel.impl.store.format.aligned;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import org.neo4j.kernel.impl.store.format.RecordFormat;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.format.standard.Standard;

import static org.assertj.core.api.Assertions.assertThat;

class PageAlignedTest
{
    @Test
    void shouldNotSeeAlignedAndStandardAsEqualFormats()
    {
        // given
        RecordFormats aligned = PageAligned.LATEST_RECORD_FORMATS;
        RecordFormats standard = Standard.LATEST_RECORD_FORMATS;

        // when/then
        assertNotEquals( aligned, standard, RecordFormats::node );
        assertNotEquals( aligned, standard, RecordFormats::dynamic );
        assertNotEquals( aligned, standard, RecordFormats::labelToken );
        assertNotEquals( aligned, standard, RecordFormats::property );
        assertNotEquals( aligned, standard, RecordFormats::propertyKeyToken );
        assertNotEquals( aligned, standard, RecordFormats::relationship );
        assertNotEquals( aligned, standard, RecordFormats::relationshipGroup );
        assertNotEquals( aligned, standard, RecordFormats::relationshipTypeToken );
        assertNotEquals( aligned, standard, RecordFormats::schema );
        // don't check meta data format because it had never even filled one page and it has been made page-aligned by default anyway
    }

    private static void assertNotEquals( RecordFormats aligned, RecordFormats standard, Function<RecordFormats,RecordFormat<?>> format )
    {
        assertThat( format.apply( aligned ) ).isNotEqualTo( format.apply( standard ) );
    }
}
