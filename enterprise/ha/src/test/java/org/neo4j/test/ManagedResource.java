/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.test;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import org.neo4j.test.rule.TestDirectory;

public abstract class ManagedResource<R> implements TestRule
{
    private R resource;

    public final R getResource()
    {
        R result = this.resource;
        if ( result == null )
        {
            throw new IllegalStateException( "Resource is not started." );
        }
        return result;
    }

    protected abstract R createResource( TestDirectory dir );

    protected abstract void disposeResource( R resource );

    @Override
    public final Statement apply( final Statement base, Description description )
    {
        final TestDirectory dir = TestDirectory.testDirectory( description.getTestClass() );
        return dir.apply( new Statement()
        {
            @Override
            public void evaluate() throws Throwable
            {
                resource = createResource( dir );
                try
                {
                    base.evaluate();
                }
                finally
                {
                    R waste = resource;
                    resource = null;
                    disposeResource( waste );
                }
            }
        }, description );
    }
}
