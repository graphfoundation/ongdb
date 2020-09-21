package org.neo4j.kernel.api.impl.fulltext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FulltextQueryConfig
{
    private final List<SortParameter> sorts;

    private final Integer pageSize;
    private final Integer page;

    public FulltextQueryConfig( List<SortParameter> sorts, Integer pageSize, Integer page )
    {
        this.sorts = sorts;
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
            List<HashMap<String,Object>> sortsList = (List<HashMap<String,Object>>) config.getOrDefault( "sorts", "[]" );
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

    public static FulltextQueryConfig sortConfig( String sortProperty, String sortDirection )
    {
        Map<String,Object> configMap = new HashMap<String,Object>()
        {{
            put( "sortProperty", sortProperty );
            put( "sortDirection", sortDirection );
        }};

        return parseConfig( configMap );
    }

    public boolean isSortQuery()
    {
        return !sorts.isEmpty();
//        return sortProperty != null && !sortProperty.isEmpty();
    }

    public boolean isPaged()
    {
        return this.pageSize != null && pageSize != Integer.MAX_VALUE;
    }

    public List<SortParameter> getSorts()
    {
        return sorts;
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
        private static String SORT_PROPERTY = "sortProperty";
        private static String SORT_DIRECTION = "sortDirection";
        private final String sortProperty;
        private final String sortDirection;

        public SortParameter( String sortProperty )
        {
            this.sortProperty = sortProperty;
            this.sortDirection = FulltextSortDirection.ASC.name();
        }

        public SortParameter( String sortProperty, String sortDirection )
        {
            this.sortProperty = sortProperty;
            this.sortDirection = sortDirection;
        }

        private static SortParameter fromMap( Map<String,Object> map )
        {
            if ( !map.containsKey( SORT_PROPERTY ) )
            {
                throw new RuntimeException( "No '" + SORT_PROPERTY + "' property specified." );
            }
            return new SortParameter( (String) map.get( SORT_PROPERTY ), (String) map.getOrDefault( SORT_DIRECTION, FulltextSortDirection.ASC.name() ) );
        }

        public String getSortProperty()
        {
            return sortProperty;
        }

        public String getSortDirection()
        {
            return sortDirection;
        }
    }
}
