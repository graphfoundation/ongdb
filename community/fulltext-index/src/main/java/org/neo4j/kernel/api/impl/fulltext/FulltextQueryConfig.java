package org.neo4j.kernel.api.impl.fulltext;

import java.util.HashMap;
import java.util.Map;

public class FulltextQueryConfig
{
    private final String sortProperty;
    private final String sortDirection;

    private final Integer pageSize;
    private final Integer page;

    private FulltextQueryConfig( String sortProperty, String sortDirection, Integer pageSize, Integer page )
    {
        this.sortProperty = sortProperty;
        this.sortDirection = sortDirection;
        this.pageSize = pageSize;
        this.page = page;
    }

    public static FulltextQueryConfig defaultConfig()
    {
        return new FulltextQueryConfig( "", "ASC", Integer.MAX_VALUE, 0 );
    }

    public static FulltextQueryConfig parseConfig( Map<String,Object> config )
    {
        try
        {
            String sortProperty = (String) config.getOrDefault( "sortProperty", "" );
            String sortDirection = (String) config.getOrDefault( "sortDirection", "ASC" );

            Integer maxIntValue = Integer.MAX_VALUE;
            Long pageSizeLong = (Long) config.getOrDefault( "pageSize", maxIntValue.longValue() );
            Long pageLong = (Long) config.getOrDefault( "page", 0L );

            Integer pageSize = pageSizeLong.intValue();
            Integer page = pageLong.intValue();

            return new FulltextQueryConfig( sortProperty, sortDirection, pageSize, page );
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
        return sortProperty != null && !sortProperty.isEmpty();
    }

    public boolean isPaged()
    {
        return this.pageSize != null && pageSize != Integer.MAX_VALUE;
    }

    public String getSortProperty()
    {
        return sortProperty;
    }

    public String getSortDirection()
    {
        return sortDirection;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public Integer getPage()
    {
        return page;
    }
}
