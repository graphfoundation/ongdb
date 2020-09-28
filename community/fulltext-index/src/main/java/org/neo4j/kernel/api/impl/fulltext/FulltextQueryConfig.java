package org.neo4j.kernel.api.impl.fulltext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FulltextQueryConfig
{
    private final List<SortParameter> sortBy;

    private final Integer pageSize;
    private final Integer page;

    public FulltextQueryConfig( List<SortParameter> sortBy, Integer pageSize, Integer page )
    {
        this.sortBy = sortBy;
        this.pageSize = pageSize;
        this.page = page;
    }

    public static FulltextQueryConfig defaultConfig()
    {
        return new FulltextQueryConfig( new ArrayList<>(), Integer.MAX_VALUE, 0 );
    }

    public static FulltextQueryConfig parseConfig( Map<String,Object> config )
    {
        try
        {
            List<HashMap<String,Object>> sortsList = (List<HashMap<String,Object>>) config.getOrDefault( "sortBy", "[]" );
            List<SortParameter> sorts = new ArrayList<>();

            // Determine SortParameter
            for ( HashMap<String,Object> s : sortsList )
            {
                sorts.add( SortParameter.fromMap( s ) );
            }

            Integer maxIntValue = Integer.MAX_VALUE;
            Long pageSizeLong = (Long) config.getOrDefault( "pageSize", maxIntValue.longValue() );
            Long pageLong = (Long) config.getOrDefault( "page", 0L );

            Integer pageSize = pageSizeLong.intValue();
            Integer page = pageLong.intValue();

            return new FulltextQueryConfig( sorts, pageSize, page );
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
        return this.pageSize != null && pageSize != Integer.MAX_VALUE;
    }

    public List<SortParameter> getSortBy()
    {
        return sortBy;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public Integer getPage()
    {
        return page;
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
