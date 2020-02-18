package org.neo4j.kernel.api.impl.fulltext;

public enum FulltextSortType
{
    LONG,
    DOUBLE,
    STRING;

    public static FulltextSortType valueOfIgnoreCase( String name )
    {
        for ( FulltextSortType each : FulltextSortType.class.getEnumConstants() )
        {
            if ( each.name().compareToIgnoreCase( name ) == 0 )
            {
                return each;
            }
        }
        return null;
    }
}
