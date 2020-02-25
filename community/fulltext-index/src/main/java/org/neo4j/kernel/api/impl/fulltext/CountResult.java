package org.neo4j.kernel.api.impl.fulltext;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class CountResult
{
    public final long count;

    public CountResult( long count )
    {
        this.count = count;
    }

    public long getCount()
    {
        return count;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }

        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }

        CountResult that = (CountResult) o;

        return new EqualsBuilder()
                .append( count, that.count )
                .isEquals();
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder( 17, 37 )
                .append( count )
                .toHashCode();
    }
}
