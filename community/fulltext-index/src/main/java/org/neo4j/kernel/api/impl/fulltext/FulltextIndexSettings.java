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
package org.neo4j.kernel.api.impl.fulltext;

import org.apache.lucene.analysis.Analyzer;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import org.neo4j.graphdb.index.fulltext.AnalyzerProvider;
import org.neo4j.internal.kernel.api.exceptions.PropertyKeyIdNotFoundKernelException;
import org.neo4j.internal.kernel.api.schema.SchemaDescriptor;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.kernel.impl.core.TokenHolder;
import org.neo4j.kernel.impl.core.TokenNotFoundException;
import org.neo4j.kernel.impl.core.UnknownSortTypeException;
import org.neo4j.storageengine.api.schema.StoreIndexDescriptor;

public class FulltextIndexSettings
{
    public static final String INDEX_CONFIG_ANALYZER = "analyzer";
    public static final String INDEX_CONFIG_EVENTUALLY_CONSISTENT = "eventually_consistent";
    private static final String INDEX_CONFIG_FILE = "fulltext-index.properties";
    private static final String INDEX_CONFIG_PROPERTY_NAMES = "propertyNames";

    static FulltextIndexDescriptor readOrInitialiseDescriptor( StoreIndexDescriptor descriptor, String defaultAnalyzerName,
            TokenHolder propertyKeyTokenHolder, File indexFolder, FileSystemAbstraction fileSystem )
    {
        Properties indexConfiguration = new Properties();

        int[] propIds = descriptor.schema().getPropertyIdsNoSorts();
        if ( descriptor.schema() instanceof FulltextSchemaDescriptor )
        {
            FulltextSchemaDescriptor schema = (FulltextSchemaDescriptor) descriptor.schema();
            indexConfiguration.putAll( schema.getIndexConfiguration() );
        }
        loadPersistedSettings( indexConfiguration, indexFolder, fileSystem );
        boolean eventuallyConsistent = Boolean.parseBoolean( indexConfiguration.getProperty( INDEX_CONFIG_EVENTUALLY_CONSISTENT ) );
        String analyzerName = indexConfiguration.getProperty( INDEX_CONFIG_ANALYZER, defaultAnalyzerName );
        Analyzer analyzer = createAnalyzer( analyzerName );

        List<String> names = new ArrayList<>();
        for ( int propertyKeyId : propIds )
        {
            try
            {
                names.add( propertyKeyTokenHolder.getTokenById( propertyKeyId ).name() );
            }
            catch ( TokenNotFoundException e )
            {
                throw new IllegalStateException( "Property key id not found.",
                        new PropertyKeyIdNotFoundKernelException( propertyKeyId, e ) );
            }
        }
        List<String> propertyNames = Collections.unmodifiableList( names );

        List<String> sortNames = new ArrayList<>();
        Map<String,String> sortTypes = new HashMap<>();
        for(int i = 0; i < descriptor.schema().getSortIds().length; i++ )
        {
            int sortId = descriptor.schema().getSortIds()[i];
            int sortType = descriptor.schema().getSortTypes()[i];
            try
            {
                String name = propertyKeyTokenHolder.getTokenById( sortId ).name();
                sortNames.add( name );

                String sortTypeName = FulltextSortType.intToType( sortType );

                if ( sortTypeName == null )
                {
                    throw new UnknownSortTypeException( name, sortId, sortType );
                }

                sortTypes.put( name, sortTypeName );
            }
            catch ( TokenNotFoundException e )
            {
                throw new IllegalStateException( "Property key id not found.", new PropertyKeyIdNotFoundKernelException( sortId, e ) );
            }
        }
        List<String> sortPropertyNames = Collections.unmodifiableList( sortNames );

        return new FulltextIndexDescriptor( descriptor, propertyNames, analyzer, analyzerName, eventuallyConsistent, sortPropertyNames, sortTypes );
    }

    private static void loadPersistedSettings( Properties settings, File indexFolder, FileSystemAbstraction fs )
    {
        File settingsFile = new File( indexFolder, INDEX_CONFIG_FILE );
        if ( fs.fileExists( settingsFile ) )
        {
            try ( Reader reader = fs.openAsReader( settingsFile, StandardCharsets.UTF_8 ) )
            {
                settings.load( reader );
            }
            catch ( IOException e )
            {
                throw new UncheckedIOException( "Failed to read persisted fulltext index properties: " + settingsFile, e );
            }
        }
    }

    private static Analyzer createAnalyzer( String analyzerName )
    {
        try
        {
            AnalyzerProvider provider = AnalyzerProvider.getProviderByName( analyzerName );
            return provider.createAnalyzer();
        }
        catch ( Exception e )
        {
            throw new RuntimeException( "Could not create fulltext analyzer: " + analyzerName, e );
        }
    }

    static void saveFulltextIndexSettings( FulltextIndexDescriptor descriptor, File indexFolder, FileSystemAbstraction fs )
            throws IOException
    {
        SchemaDescriptor schema = descriptor.schema();
        int[] propIds = Arrays.stream( schema.getPropertyIds() ).limit( schema.getPropertyIds().length - schema.getSortIds().length ).toArray();

        File indexConfigFile = new File( indexFolder, INDEX_CONFIG_FILE );
        Properties settings = new Properties();
        settings.setProperty( INDEX_CONFIG_EVENTUALLY_CONSISTENT, Boolean.toString( descriptor.isEventuallyConsistent() ) );
        settings.setProperty( INDEX_CONFIG_ANALYZER, descriptor.analyzerName() );
        settings.setProperty( INDEX_CONFIG_PROPERTY_NAMES, descriptor.propertyNames().stream().collect( Collectors.joining( ", ", "[", "]" ) ) );
        settings.setProperty( "_propertyIds", Arrays.toString( propIds ) );
        settings.setProperty( "_name", descriptor.name() );
        settings.setProperty( "_schema_entityType", schema.entityType().name() );
        settings.setProperty( "_schema_entityTokenIds", Arrays.toString( schema.getEntityTokenIds() ) );
        settings.setProperty( "_sortIds", Arrays.toString( schema.getSortIds() ) );
        settings.setProperty( "_sortTypes", Arrays.toString( schema.getSortTypes() ) );
        try ( StoreChannel channel = fs.create( indexConfigFile );
                Writer writer = fs.openAsWriter( indexConfigFile, StandardCharsets.UTF_8, false ) )
        {
            settings.store( writer, "Auto-generated file. Do not modify!" );
            writer.flush();
            channel.force( true );
        }
    }
}
