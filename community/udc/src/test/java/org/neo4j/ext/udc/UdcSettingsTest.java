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
 * Copyright (c) 2002-2020 "Neo4j,"
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
package org.neo4j.ext.udc;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import org.neo4j.helpers.Configuration;
import org.neo4j.kernel.configuration.Config;

import static java.util.Collections.singletonMap;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.neo4j.ext.udc.UdcSettings.udc_enabled;
import static org.neo4j.helpers.Configuration.DEFAULT;

@RunWith( Parameterized.class )
public class UdcSettingsTest
{
    private static final String UDC_DISABLE = "dbms.udc.disable";
    private static final UdcSettings settingsClasses = new UdcSettings();
    @Rule
    public final Configuration configuration = new Configuration();

    @Parameterized.Parameters( name = "{0}" )
    public static Iterable<Object[]> variations()
    {
        return Arrays.asList(
                new Variations().trueAs( "true" ).falseAs( "false" ).unknownAs( "" ).parameters(),
                new Variations().trueAs( "True" ).falseAs( "False" ).unknownAs( "no" ).parameters(),
                new Variations().trueAs( "TRUE" ).falseAs( "FALSE" ).unknownAs( "yes" ).parameters(),
                new Variations().trueAs( "tRuE" ).falseAs( "fAlSe" ).unknownAs( "foo" ).parameters()
        );
    }

    private final String trueVariation;
    private final String falseVariation;
    private final String unknown;

    public UdcSettingsTest( Variations variations )
    {
        this.trueVariation = variations.trueVariation;
        this.falseVariation = variations.falseVariation;
        this.unknown = variations.unknown;
    }

    @Test
    public void shouldBeDisabledByDefault()
    {
        assertFalse( configuration.config( settingsClasses ).get( udc_enabled ) );
        assertFalse( Config.defaults().get( udc_enabled ) );
    }

    @Test
    public void shouldBeEnabledByConfigurationProperty()
    {
        assertTrue( configuration.with( udc_enabled, trueVariation )
                                  .withSystemProperty( udc_enabled.name(), DEFAULT )
                                  .withSystemProperty( UDC_DISABLE, DEFAULT )
                                  .config( settingsClasses ).get( udc_enabled ) );
        assertTrue( Config.defaults( singletonMap( udc_enabled.name(), "true" ) ).get( udc_enabled ) );
    }

    // disabled by default

    @Test
    public void disabled_settingDefault_sysEnableDefault_sysDisableDefault()
    {
        assertDisabled( configuration.with( udc_enabled, DEFAULT )
                                    .withSystemProperty( udc_enabled.name(), DEFAULT )
                                    .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    // enabled by the setting = true

    @Test
    public void enabled_settingTrue_sysEnableDefault_sysDisableDefault()
    {
        assertEnabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), DEFAULT )
                                    .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    @Test
    public void enabled_settingTrue_sysEnableDefault_sysDisableFalse()
    {
        assertEnabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), DEFAULT )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void disabled_settingTrue_sysEnableDefault_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), DEFAULT )
                                    .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    @Test
    public void enabled_settingTrue_sysEnableTrue_sysDisableDefault()
    {
        assertEnabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    @Test
    public void enabled_settingTrue_sysEnableTrue_sysDisableFalse()
    {
        assertEnabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void disabled_settingTrue_sysEnableTrue_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    @Test
    public void disabled_settingTrue_sysEnableFalse_sysDisableDefault()
    {
        assertDisabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), falseVariation )
                                    .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    @Test
    public void disabled_settingTrue_sysEnableFalse_sysDisableFalse()
    {
        assertDisabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), falseVariation )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void disabled_settingTrue_sysEnableFalse_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), falseVariation )
                                    .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    // enabled by the enabled=true system property

    @Test
    public void enabled_settingDefault_sysEnableTrue_sysDisableDefault()
    {
        assertEnabled( configuration.with( udc_enabled, DEFAULT )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    @Test
    public void enabled_settingDefault_sysEnableTrue_sysDisableFalse()
    {
        assertEnabled( configuration.with( udc_enabled, DEFAULT )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void disabled_settingDefault_sysEnableTrue_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, DEFAULT )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    @Test
    public void disabled_settingFalse_sysEnableTrue_sysDisableDefault()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    @Test
    public void disabled_settingFalse_sysEnableTrue_sysDisableFalse()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void disabled_settingFalse_sysEnableTrue_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    @Test
    public void disabled_settingDefault_sysEnableDefault_sysDisableFalse()
    {
        assertDisabled( configuration.with( udc_enabled, DEFAULT )
                                    .withSystemProperty( udc_enabled.name(), DEFAULT )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void enabled_settingDefault_sysEnableFalse_sysDisableFalse()
    {
        assertEnabled( configuration.with( udc_enabled, DEFAULT )
                                    .withSystemProperty( udc_enabled.name(), falseVariation )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void disabled_settingFalse_sysEnableDefault_sysDisableFalse()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                    .withSystemProperty( udc_enabled.name(), DEFAULT )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void disabled_settingFalse_sysEnableFalse_sysDisableFalse()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                    .withSystemProperty( udc_enabled.name(), falseVariation )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    // disabled

    @Test
    public void disableOn_settingFalse_sysEnableFalse_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                     .withSystemProperty( udc_enabled.name(), falseVariation )
                                     .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    @Test
    public void disableOn_settingFalse_sysEnableDefault_sysDisableDefault()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                     .withSystemProperty( udc_enabled.name(), DEFAULT )
                                     .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    @Test
    public void disableOn_settingDefault_sysEnableFalse_sysDisableDefault()
    {
        assertDisabled( configuration.with( udc_enabled, DEFAULT )
                                     .withSystemProperty( udc_enabled.name(), falseVariation )
                                     .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    @Test
    public void disableOn_settingDefault_sysEnableDefault_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, DEFAULT )
                                     .withSystemProperty( udc_enabled.name(), DEFAULT )
                                     .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    @Test
    public void disableOn_settingFalse_sysEnableFalse_sysDisableDefault()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                     .withSystemProperty( udc_enabled.name(), falseVariation )
                                     .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    @Test
    public void disableOn_settingFalse_sysEnableDefault_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                     .withSystemProperty( udc_enabled.name(), DEFAULT )
                                     .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    @Test
    public void disableOn_settingDefault_sysEnableFalse_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, DEFAULT )
                                     .withSystemProperty( udc_enabled.name(), falseVariation )
                                     .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    // unknown values disables UDC

    @Test
    public void disabled_settingUnknown_sysEnableDefault_sysDisableDefault()
    {
        assertDisabled( configuration.with( udc_enabled, unknown )
                                    .withSystemProperty( udc_enabled.name(), DEFAULT )
                                    .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    @Test
    public void disabled_settingUnknown_sysEnableDefault_sysDisableFalse()
    {
        assertDisabled( configuration.with( udc_enabled, unknown )
                                    .withSystemProperty( udc_enabled.name(), DEFAULT )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void disabled_settingUnknown_sysEnableDefault_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, unknown )
                                    .withSystemProperty( udc_enabled.name(), DEFAULT )
                                    .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    @Test
    public void disabled_settingUnknown_sysEnableFalse_sysDisableDefault()
    {
        assertDisabled( configuration.with( udc_enabled, unknown )
                                    .withSystemProperty( udc_enabled.name(), falseVariation )
                                    .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    @Test
    public void disabled_settingUnknown_sysEnableFalse_sysDisableFalse()
    {
        assertDisabled( configuration.with( udc_enabled, unknown )
                                    .withSystemProperty( udc_enabled.name(), falseVariation )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void disabled_settingUnknown_sysEnableFalse_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, unknown )
                                    .withSystemProperty( udc_enabled.name(), falseVariation )
                                    .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    @Test
    public void disabled_settingUnknown_sysEnableTrue_sysDisableFalse()
    {
        assertDisabled( configuration.with( udc_enabled, unknown )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void disabled_settingUnknown_sysEnableTrue_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, unknown )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    @Test
    public void disabled_settingDefault_sysEnableUnknown_sysDisableDefault()
    {
        assertDisabled( configuration.with( udc_enabled, DEFAULT )
                                    .withSystemProperty( udc_enabled.name(), unknown )
                                    .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    @Test
    public void enabled_settingDefault_sysEnableUnknown_sysDisableFalse()
    {
        assertEnabled( configuration.with( udc_enabled, DEFAULT )
                                    .withSystemProperty( udc_enabled.name(), unknown )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void disabled_settingDefault_sysEnableUnknown_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, DEFAULT )
                                    .withSystemProperty( udc_enabled.name(), unknown )
                                    .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    @Test
    public void disabled_settingTrue_sysEnableUnknown_sysDisableDefault()
    {
        assertDisabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), unknown )
                                    .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    @Test
    public void disabled_settingTrue_sysEnableUnknown_sysDisableFalse()
    {
        assertDisabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), unknown )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void disabled_settingTrue_sysEnableUnknown_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), unknown )
                                    .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    @Test
    public void disabled_settingFalse_sysEnableUnknown_sysDisableDefault()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                    .withSystemProperty( udc_enabled.name(), unknown )
                                    .withSystemProperty( UDC_DISABLE, DEFAULT ) );
    }

    @Test
    public void disabled_settingFalse_sysEnableUnknown_sysDisableFalse()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                    .withSystemProperty( udc_enabled.name(), unknown )
                                    .withSystemProperty( UDC_DISABLE, falseVariation ) );
    }

    @Test
    public void disabled_settingFalse_sysEnableUnknown_sysDisableTrue()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                    .withSystemProperty( udc_enabled.name(), unknown )
                                    .withSystemProperty( UDC_DISABLE, trueVariation ) );
    }

    @Test
    public void disabled_settingDefault_sysEnableDefault_sysDisableUnknown()
    {
        assertDisabled( configuration.with( udc_enabled, DEFAULT )
                                    .withSystemProperty( udc_enabled.name(), DEFAULT )
                                    .withSystemProperty( UDC_DISABLE, unknown ) );
    }

    @Test
    public void disabled_settingDefault_sysEnableTrue_sysDisableUnknown()
    {
        assertDisabled( configuration.with( udc_enabled, DEFAULT )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, unknown ) );
    }

    @Test
    public void disabled_settingDefault_sysEnableFalse_sysDisableUnknown()
    {
        assertDisabled( configuration.with( udc_enabled, DEFAULT )
                                    .withSystemProperty( udc_enabled.name(), falseVariation )
                                    .withSystemProperty( UDC_DISABLE, unknown ) );
    }

    @Test
    public void disabled_settingTrue_sysEnableDefault_sysDisableUnknown()
    {
        assertDisabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), DEFAULT )
                                    .withSystemProperty( UDC_DISABLE, unknown ) );
    }

    @Test
    public void disabled_settingTrue_sysEnableTrue_sysDisableUnknown()
    {
        assertDisabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, unknown ) );
    }

    @Test
    public void disabled_settingTrue_sysEnableFalse_sysDisableUnknown()
    {
        assertDisabled( configuration.with( udc_enabled, trueVariation )
                                    .withSystemProperty( udc_enabled.name(), falseVariation )
                                    .withSystemProperty( UDC_DISABLE, unknown ) );
    }

    @Test
    public void disabled_settingFalse_sysEnableDefault_sysDisableUnknown()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                    .withSystemProperty( udc_enabled.name(), DEFAULT )
                                    .withSystemProperty( UDC_DISABLE, unknown ) );
    }

    @Test
    public void disabled_settingFalse_sysEnableTrue_sysDisableUnknown()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                    .withSystemProperty( udc_enabled.name(), trueVariation )
                                    .withSystemProperty( UDC_DISABLE, unknown ) );
    }

    @Test
    public void disabled_settingFalse_sysEnableFalse_sysDisableUnknown()
    {
        assertDisabled( configuration.with( udc_enabled, falseVariation )
                                    .withSystemProperty( udc_enabled.name(), falseVariation )
                                    .withSystemProperty( UDC_DISABLE, unknown ) );
    }

    // DSL

    private static void assertEnabled( Configuration configuration )
    {
        assertTrue( "should be enabled", configuration.config( settingsClasses ).get( udc_enabled ) );
    }

    private static void assertDisabled( Configuration configuration )
    {
        assertFalse( "should be disabled", configuration.config( settingsClasses ).get( udc_enabled ) );
    }

    static final class Variations
    {
        String trueVariation;
        String falseVariation;
        String unknown;

        Variations trueAs( String trueVariation )
        {
            this.trueVariation = trueVariation;
            return this;
        }

        Variations falseAs( String falseVariation )
        {
            this.falseVariation = falseVariation;
            return this;
        }

        Variations unknownAs( String unknown )
        {
            this.unknown = unknown;
            return this;
        }

        Object[] parameters()
        {
            if ( trueVariation == null || falseVariation == null || unknown == null )
            {
                throw new IllegalStateException( "Undefined variations." );
            }
            return new Object[]{this};
        }

        @Override
        public String toString()
        {
            return String.format( "trueAs(%s).falseAs(%s).unknownAs(%s)", trueVariation, falseVariation, unknown );
        }
    }
}
