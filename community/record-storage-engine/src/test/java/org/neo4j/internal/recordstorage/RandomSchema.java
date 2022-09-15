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
 * Copyright (c) "Neo4j"
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
package org.neo4j.internal.recordstorage;

import java.util.Arrays;
import java.util.SplittableRandom;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.neo4j.common.EntityType;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.IndexProviderDescriptor;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.internal.schema.LabelSchemaDescriptor;
import org.neo4j.internal.schema.RelationTypeSchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.internal.schema.SchemaRule;
import org.neo4j.internal.schema.constraints.ConstraintDescriptorFactory;
import org.neo4j.internal.schema.constraints.IndexBackedConstraintDescriptor;
import org.neo4j.kernel.impl.store.format.standard.StandardFormatSettings;
import org.neo4j.values.storable.RandomValues;
import org.neo4j.values.storable.TextValue;
import org.neo4j.values.storable.ValueGroup;
import org.neo4j.values.storable.ValueType;

@SuppressWarnings( "WeakerAccess" ) // Keep accessibility high in case someone wants to extend this class in the future.
public class RandomSchema implements Supplier<SchemaRule>
{
    private final SplittableRandom rng;
    private final int maxPropId;
    private final int maxRelTypeId;
    private final int maxLabelId;
    private final int defaultLabelIdsArrayMaxLength;
    private final int defaultRelationshipTypeIdsArrayMaxLength;
    private final int defaultPropertyKeyIdsArrayMaxLength;
    private final RandomValues values;
    private final ValueType[] textTypes;

    public RandomSchema()
    {
        this( new SplittableRandom() );
    }

    public RandomSchema( SplittableRandom rng )
    {
        this.rng = rng;
        maxPropId = maxPropertyId();
        maxRelTypeId = maxRelationshipTypeId();
        maxLabelId = maxLabelId();
        defaultLabelIdsArrayMaxLength = defaultLabelIdsArrayMaxLength();
        defaultRelationshipTypeIdsArrayMaxLength = defaultRelationshipTypeIdsArrayMaxLength();
        defaultPropertyKeyIdsArrayMaxLength = defaultPropertyKeyIdsArrayMaxLength();
        values = RandomValues.create( rng, valuesConfiguration() );
        textTypes = RandomValues.typesOfGroup( ValueGroup.TEXT );
    }

    protected int maxPropertyId()
    {
        return (1 << StandardFormatSettings.PROPERTY_TOKEN_MAXIMUM_ID_BITS) - 1;
    }

    protected int maxRelationshipTypeId()
    {
        return (1 << StandardFormatSettings.RELATIONSHIP_TYPE_TOKEN_MAXIMUM_ID_BITS) - 1;
    }

    protected int maxLabelId()
    {
        return Integer.MAX_VALUE;
    }

    protected int defaultLabelIdsArrayMaxLength()
    {
        return 200;
    }

    protected int defaultRelationshipTypeIdsArrayMaxLength()
    {
        return 200;
    }

    protected int defaultPropertyKeyIdsArrayMaxLength()
    {
        return 300;
    }

    protected RandomValues.Default valuesConfiguration()
    {
        return new RandomValues.Default()
        {
            @Override
            public int stringMaxLength()
            {
                return 200;
            }

            @Override
            public int minCodePoint()
            {
                return super.minCodePoint() + 1; // Avoid null-bytes in our strings.
            }
        };
    }

    public Stream<SchemaRule> schemaRules()
    {
        return Stream.generate( this );
    }

    @Override
    public SchemaRule get()
    {
        return nextSchemaRule();
    }

    public SchemaRule nextSchemaRule()
    {
        if ( rng.nextBoolean() )
        {
            return nextIndex();
        }
        else
        {
            return nextConstraint();
        }
    }

    public IndexDescriptor nextIndex()
    {
        int choice = rng.nextInt( 4 );
        SchemaDescriptor schema;
        switch ( choice )
        {
        case 0:
            schema = nextNodeSchema();
            break;
        case 1:
            schema = nextNodeFulltextSchema();
            break;
        case 2:
            schema = nextRelationshipSchema();
            break;
        case 3:
            schema = nextRelationshipFulltextSchema();
            break;
        default:
            throw new RuntimeException( "Bad index choice: " + choice );
        }

        boolean isUnique = rng.nextBoolean() && !schema.isFulltextSchemaDescriptor();
        IndexPrototype prototype = isUnique ? IndexPrototype.uniqueForSchema( schema ) : IndexPrototype.forSchema( schema );

        IndexProviderDescriptor providerDescriptor = new IndexProviderDescriptor( nextName(), nextName() );
        prototype = prototype.withIndexProvider( providerDescriptor );

        prototype = prototype.withName( nextName() );
        if ( schema.isFulltextSchemaDescriptor() )
        {
            prototype = prototype.withIndexType( IndexType.FULLTEXT );
        }

        long ruleId = nextRuleIdForIndex();
        IndexDescriptor index = prototype.materialise( ruleId );

        if ( isUnique && rng.nextBoolean() )
        {
            index = index.withOwningConstraintId( existingConstraintId() );
        }

        return index;
    }

    public long nextRuleIdForIndex()
    {
        return nextRuleId();
    }

    public long existingConstraintId()
    {
        return nextRuleId();
    }

    public ConstraintDescriptor nextConstraint()
    {
        long ruleId = nextRuleIdForConstraint();
        int choice = rng.nextInt( 6 );
        switch ( choice )
        {
        case 0: return ConstraintDescriptorFactory.existsForSchema( nextRelationshipSchema() ).withId( ruleId ).withName( nextName() );
        case 1: return ConstraintDescriptorFactory.existsForSchema( nextNodeSchema() ).withId( ruleId ).withName( nextName() );
        case 2: return ConstraintDescriptorFactory.uniqueForSchema( nextNodeSchema() ).withId( ruleId ).withName( nextName() );
        case 3: return ConstraintDescriptorFactory.uniqueForSchema( nextNodeSchema() ).withId( ruleId ).withOwnedIndexId( existingIndexId() )
                .withName( nextName() );
        case 4: return ConstraintDescriptorFactory.nodeKeyForSchema( nextNodeSchema() ).withId( ruleId ).withName( nextName() );
        case 5: return ConstraintDescriptorFactory.nodeKeyForSchema( nextNodeSchema() ).withId( ruleId ).withOwnedIndexId( existingIndexId() )
                .withName( nextName() );
        default: throw new RuntimeException( "Bad constraint choice: " + choice );
        }
    }

    public long nextRuleIdForConstraint()
    {
        return nextRuleId();
    }

    public long existingIndexId()
    {
        return nextRuleId();
    }

    public LabelSchemaDescriptor nextNodeSchema()
    {
        return SchemaDescriptors.forLabel( nextLabelId(), nextPropertyKeyIdsArray() );
    }

    public RelationTypeSchemaDescriptor nextRelationshipSchema()
    {
        return SchemaDescriptors.forRelType( nextRelationshipTypeId(), nextPropertyKeyIdsArray() );
    }

    public SchemaDescriptor nextNodeFulltextSchema()
    {
        return SchemaDescriptors.fulltext( EntityType.NODE, nextLabelIdsArray(), nextPropertyKeyIdsArray() );
    }

    public SchemaDescriptor nextRelationshipFulltextSchema()
    {
        return SchemaDescriptors.fulltext( EntityType.RELATIONSHIP, nextRelationTypeIdsArray(), nextPropertyKeyIdsArray() );
    }

    public int nextRuleId()
    {
        return rng.nextInt( Integer.MAX_VALUE );
    }

    public String nextName()
    {
        String name;
        do
        {
            name = ((TextValue) values.nextValueOfTypes( textTypes )).stringValue().trim();
        }
        while ( name.isEmpty() || name.isBlank() || name.contains( "\0" ) || name.contains( "`" ) ); // Avoid generating empty names.
        return name;
    }

    public int nextLabelId()
    {
        return rng.nextInt( maxLabelId );
    }

    public int nextRelationshipTypeId()
    {
        return rng.nextInt( maxRelTypeId );
    }

    public int[] nextLabelIdsArray()
    {
        return nextLabelIdsArray( defaultLabelIdsArrayMaxLength );
    }

    public int[] nextLabelIdsArray( int maxLength )
    {
        return rng.ints( rng.nextInt( 1, maxLength ), 1, maxLabelId ).toArray();
    }

    public int[] nextRelationTypeIdsArray()
    {
        return nextRelationTypeIdsArray( defaultRelationshipTypeIdsArrayMaxLength );
    }

    public int[] nextRelationTypeIdsArray( int maxLength )
    {
        return rng.ints( rng.nextInt( 1, maxLength ), 1, maxRelTypeId ).toArray();
    }

    public int[] nextPropertyKeyIdsArray()
    {
        return nextPropertyKeyIdsArray( defaultPropertyKeyIdsArrayMaxLength );
    }

    public int[] nextPropertyKeyIdsArray( int maxLength )
    {
        int propCount = rng.nextInt( 1, maxLength + 1 );
        return rng.ints( propCount, 1, maxPropId ).toArray();
    }

    public static boolean schemaDeepEquals( SchemaRule a, SchemaRule b )
    {
        if ( !a.equals( b ) )
        {
            return false;
        }
        if ( a.getId() != b.getId() )
        {
            return false;
        }
        if ( !a.getName().equals( b.getName() ) )
        {
            return false;
        }
        if ( a.getClass() != b.getClass() )
        {
            return false;
        }
        if ( a instanceof IndexDescriptor )
        {
            IndexDescriptor indexA = (IndexDescriptor) a;
            IndexDescriptor indexB = (IndexDescriptor) b;
            return indexA.getCapability().equals( indexB.getCapability() ) &&
                    indexA.isUnique() == indexB.isUnique() &&
                    indexA.getIndexProvider().equals( indexB.getIndexProvider() ) &&
                    indexA.getIndexType() == indexB.getIndexType() &&
                    indexA.getOwningConstraintId().equals( indexB.getOwningConstraintId() ) &&
                    schemaDeepEquals( indexA.schema(), indexB.schema() );
        }
        else
        {
            ConstraintDescriptor constraintA = (ConstraintDescriptor) a;
            ConstraintDescriptor constraintB = (ConstraintDescriptor) b;
            if ( constraintA.isIndexBackedConstraint() && constraintB.isIndexBackedConstraint() )
            {
                IndexBackedConstraintDescriptor ibcA = constraintA.asIndexBackedConstraint();
                IndexBackedConstraintDescriptor ibcB = constraintB.asIndexBackedConstraint();
                return ibcA.hasOwnedIndexId() == ibcB.hasOwnedIndexId() &&
                        (!ibcA.hasOwnedIndexId() || ibcA.ownedIndexId() == ibcB.ownedIndexId()) &&
                        ibcA.equals( ibcB ) &&
                        schemaDeepEquals( ibcA.schema(), ibcB.schema() );
            }
            else
            {
                return constraintA.isIndexBackedConstraint() == constraintB.isIndexBackedConstraint() &&
                        constraintA.equals( constraintB ) &&
                        schemaDeepEquals( constraintA.schema(), constraintB.schema() );
            }
        }
    }

    public static boolean schemaDeepEquals( SchemaDescriptor a, SchemaDescriptor b )
    {
        return a.entityType() == b.entityType() &&
                a.propertySchemaType() == b.propertySchemaType() &&
                Arrays.equals( a.getEntityTokenIds(), b.getEntityTokenIds() ) &&
                Arrays.equals( a.getPropertyIds(), b.getPropertyIds() );
    }
}
