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
package org.neo4j.kernel.api.impl.fulltext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FulltextQueryConfig
{
    private final List<SortParameter> sortBy;

    private final Integer skip;
    private final Integer limit;

    public FulltextQueryConfig( List<SortParameter> sortBy, Integer skip, Integer limit )
    {
        this.sortBy = sortBy;
        this.skip = skip;
        this.limit = limit;
    }

    public static FulltextQueryConfig defaultConfig()
    {
        return new FulltextQueryConfig( new ArrayList<>(), 0, Integer.MAX_VALUE );
    }

    public static FulltextQueryConfig parseConfig( Map<String,Object> config )
    {
        try
        {
            List<HashMap<String,Object>> sortsList = (List<HashMap<String,Object>>) config.getOrDefault( "sortBy", new ArrayList<>() );
            List<SortParameter> sorts = new ArrayList<>();

            // Determine SortParameter
            for ( HashMap<String,Object> s : sortsList )
            {
                sorts.add( SortParameter.fromMap( s ) );
            }

            Integer maxIntValue = Integer.MAX_VALUE;
            Long skipLong = (Long) config.getOrDefault( "skip", 0L );
            Long limitLong = (Long) config.getOrDefault( "limit", maxIntValue.longValue() );

            Integer skip = skipLong.intValue();
            Integer limit = limitLong.intValue();

            return new FulltextQueryConfig( sorts, skip, limit );
        }
        catch ( Exception e )
        {
            throw new RuntimeException( "Unable to parse procedure configuration.", e );
        }
    }

    public static FulltextQueryConfig singleSort( String sortProperty, String sortDirection )
    {
        Map<String,Object> configMap = new HashMap<>();
        if ( sortProperty != null && !sortProperty.isEmpty() )
        {
            configMap = singleSortMap( sortProperty, sortDirection );
        }

        return parseConfig( configMap );
    }

    public static Map<String,Object> singleSortMap( String sortProperty, String sortDirection )
    {
        if ( sortProperty == null || sortProperty.isEmpty() )
        {
            return new HashMap<>();
        }
        else
        {
            return new HashMap<String,Object>()
            {{
                put( "sortBy", Collections.singletonList( new HashMap()
                {
                    {
                        {
                            put( "property", sortProperty );
                            put( "direction", sortDirection );
                        }
                    }
                } ) );
            }};
        }
    }

    public boolean isSortQuery()
    {
        return sortBy != null && !sortBy.isEmpty();
    }

    public boolean isPaged()
    {
        return (this.skip != 0) || (this.limit != Integer.MAX_VALUE);
    }

    public List<SortParameter> getSortBy()
    {
        return sortBy;
    }

    public Integer getSkip()
    {
        return skip;
    }

    public Integer getLimit()
    {
        return limit;
    }

    public static class SortParameter
    {
        private static String SORT_PROPERTY = "property";
        private static String SORT_DIRECTION = "direction";
        private final String property;
        private final String direction;

        public SortParameter( String property )
        {
            this.property = property;
            this.direction = FulltextSortDirection.ASC.name();
        }

        public SortParameter( String property, String direction )
        {
            this.property = property;
            this.direction = direction;
        }

        private static SortParameter fromMap( Map<String,Object> map )
        {
            if ( !map.containsKey( SORT_PROPERTY ) )
            {
                throw new RuntimeException( "No '" + SORT_PROPERTY + "' property specified." );
            }
            return new SortParameter( (String) map.get( SORT_PROPERTY ), (String) map.getOrDefault( SORT_DIRECTION, FulltextSortDirection.ASC.name() ) );
        }

        public String getProperty()
        {
            return property;
        }

        public String getDirection()
        {
            return direction;
        }
    }
}
