package org.neo4j.kernel.api.impl.fulltext;

public enum FulltextSortDirection
{
    ASC,
    DESC;

    public static FulltextSortDirection valueOfIgnoreCase( String name )
    {
        for ( FulltextSortDirection each : FulltextSortDirection.class.getEnumConstants() )
        {
            if ( each.name().compareToIgnoreCase( name ) == 0 )
            {
                return each;
            }
        }
        return null;
    }
}
