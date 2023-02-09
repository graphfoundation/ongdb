/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.kernel.api.impl.fulltext.analyzer.providers;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.UAX29URLEmailAnalyzer;

import org.neo4j.annotations.service.ServiceProvider;
import org.neo4j.graphdb.schema.AnalyzerProvider;

@ServiceProvider
public class UrlOrEmail extends AnalyzerProvider
{
    public UrlOrEmail()
    {
        this( "url_or_email" );
    }

    private UrlOrEmail( String name )
    {
        super( name );
    }

    @Override
    public Analyzer createAnalyzer()
    {
        return new UAX29URLEmailAnalyzer();
    }

    @Override
    public String description()
    {
        return "Tokenizes into sequences of alpha-numeric, numeric, URL, email, southeast asian terms, " +
                "and into terms of individual ideographic and hiragana characters. " +
                "English stop words are filtered out.";
    }

    @ServiceProvider
    public static class UrlAnalyzer extends UrlOrEmail
    {
        public UrlAnalyzer()
        {
            super( "url" );
        }
    }

    @ServiceProvider
    public static class EmailAnalyzer extends UrlOrEmail
    {
        public EmailAnalyzer()
        {
            super( "email" );
        }
    }
}
