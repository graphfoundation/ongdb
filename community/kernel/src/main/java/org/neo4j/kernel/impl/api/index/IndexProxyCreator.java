/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2020 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.kernel.impl.api.index;

import java.io.IOException;

import org.neo4j.common.TokenNameLookup;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.memory.ByteBufferFactory;
import org.neo4j.kernel.api.index.IndexAccessor;
import org.neo4j.kernel.api.index.IndexDropper;
import org.neo4j.kernel.api.index.IndexPopulator;
import org.neo4j.kernel.api.index.IndexProvider;
import org.neo4j.kernel.impl.api.index.stats.IndexStatisticsStore;
import org.neo4j.logging.LogProvider;

import static java.lang.String.format;

/**
 * Helper class of {@link IndexingService}. Used mainly as factory of index proxies.
 */
class IndexProxyCreator
{
    private final IndexSamplingConfig samplingConfig;
    private final IndexStatisticsStore indexStatisticsStore;
    private final IndexProviderMap providerMap;
    private final TokenNameLookup tokenNameLookup;
    private final LogProvider logProvider;

    IndexProxyCreator( IndexSamplingConfig samplingConfig,
            IndexStatisticsStore indexStatisticsStore,
            IndexProviderMap providerMap,
            TokenNameLookup tokenNameLookup,
            LogProvider logProvider )
    {
        this.samplingConfig = samplingConfig;
        this.indexStatisticsStore = indexStatisticsStore;
        this.providerMap = providerMap;
        this.tokenNameLookup = tokenNameLookup;
        this.logProvider = logProvider;
    }

    IndexProxy createPopulatingIndexProxy( IndexDescriptor index, boolean flipToTentative, IndexingService.Monitor monitor,
            IndexPopulationJob populationJob )
    {
        final FlippableIndexProxy flipper = new FlippableIndexProxy();

        final String indexUserDescription = indexUserDescription( index );
        IndexPopulator populator = populatorFromProvider( index, samplingConfig, populationJob.bufferFactory() );

        FailedIndexProxyFactory failureDelegateFactory = new FailedPopulatingIndexProxyFactory( index,
                populator,
                indexUserDescription,
                indexStatisticsStore,
                logProvider );

        MultipleIndexPopulator.IndexPopulation indexPopulation = populationJob
                .addPopulator( populator, index, indexUserDescription, flipper, failureDelegateFactory );
        PopulatingIndexProxy populatingIndex = new PopulatingIndexProxy( index, populationJob, indexPopulation );

        flipper.flipTo( populatingIndex );

        // Prepare for flipping to online mode
        flipper.setFlipTarget( () ->
        {
            monitor.populationCompleteOn( index );
            IndexAccessor accessor = onlineAccessorFromProvider( index, samplingConfig );
            OnlineIndexProxy onlineProxy = new OnlineIndexProxy( index, accessor, indexStatisticsStore, true );
            if ( flipToTentative )
            {
                return new TentativeConstraintIndexProxy( flipper, onlineProxy );
            }
            return onlineProxy;
        } );

        return new ContractCheckingIndexProxy( flipper, false );
    }

    IndexProxy createRecoveringIndexProxy( IndexDescriptor descriptor )
    {
        IndexProxy proxy = new RecoveringIndexProxy( descriptor );
        return new ContractCheckingIndexProxy( proxy, true );
    }

    IndexProxy createOnlineIndexProxy( IndexDescriptor descriptor )
    {
        try
        {
            IndexAccessor onlineAccessor = onlineAccessorFromProvider( descriptor, samplingConfig );
            IndexProxy proxy;
            proxy = new OnlineIndexProxy( descriptor, onlineAccessor, indexStatisticsStore, false );
            proxy = new ContractCheckingIndexProxy( proxy, true );
            return proxy;
        }
        catch ( IOException e )
        {
            logProvider.getLog( getClass() ).error( "Failed to open index: " + descriptor.getId() +
                                                    " (" + descriptor.userDescription( tokenNameLookup ) +
                                                    "), requesting re-population.", e );
            return createRecoveringIndexProxy( descriptor );
        }
    }

    IndexProxy createFailedIndexProxy( IndexDescriptor descriptor, IndexPopulationFailure populationFailure )
    {
        // Note about the buffer factory instantiation here. Question is why an index populator is instantiated for a failed index proxy to begin with.
        // The byte buffer factory should not be used here anyway so the buffer size doesn't actually matter.
        IndexDropper indexDropper = dropperFromProvider( descriptor );
        String indexUserDescription = indexUserDescription( descriptor );
        IndexProxy proxy;
        proxy = new FailedIndexProxy( descriptor,
                indexUserDescription,
                indexDropper,
                populationFailure,
                indexStatisticsStore,
                logProvider );
        proxy = new ContractCheckingIndexProxy( proxy, true );
        return proxy;
    }

    private String indexUserDescription( IndexDescriptor descriptor )
    {
        return format( "%s [provider: %s]",
                descriptor.schema().userDescription( tokenNameLookup ), descriptor.getIndexProvider().toString() );
    }

    private IndexPopulator populatorFromProvider( IndexDescriptor index, IndexSamplingConfig samplingConfig, ByteBufferFactory bufferFactory )
    {
        IndexProvider provider = providerMap.lookup( index.getIndexProvider() );
        return provider.getPopulator( index, samplingConfig, bufferFactory );
    }

    private IndexDropper dropperFromProvider( IndexDescriptor index )
    {
        IndexProvider provider = providerMap.lookup( index.getIndexProvider() );
        return provider.getDropper( index );
    }

    private IndexAccessor onlineAccessorFromProvider( IndexDescriptor index, IndexSamplingConfig samplingConfig ) throws IOException
    {
        IndexProvider provider = providerMap.lookup( index.getIndexProvider() );
        return provider.getOnlineAccessor( index, samplingConfig );
    }
}
