/**
 * See https://raw.githubusercontent.com/neo4j/neo4j/3.3/enterprise/server-enterprise/src/test/java/org/neo4j/server/enterprise/OpenEnterpriseEntryPointTest.java
 */

package org.neo4j.server.enterprise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.neo4j.commandline.Util.neo4jVersion;

public class EnterpriseEntryPointTest
{
    private PrintStream realSystemOut;
    private PrintStream fakeSystemOut;

    @Before
    public void setup()
    {
        realSystemOut = System.out;
        fakeSystemOut = mock( PrintStream.class );
        System.setOut( fakeSystemOut );
    }

    @After
    public void teardown()
    {
        System.setOut( realSystemOut );
    }

    @Test
    public void mainPrintsVersion()
    {
        // when
        EnterpriseEntryPoint.main( new String[]{"--version"} );

        // then
        verify( fakeSystemOut ).println( "neo4j " + neo4jVersion() );
        verifyNoMoreInteractions( fakeSystemOut );
    }
}
