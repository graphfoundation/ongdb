#
# Copyright (c) "Graph Foundation,"
# Graph Foundation, Inc. [https://graphfoundation.org]
#
# This file is part of ONgDB.
#
# ONgDB is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program.  If not, see <http://www.gnu.org/licenses/>.
#

#
# Copyright (c) "Neo4j"
# Neo4j Sweden AB [http://neo4j.com]
#
# This file is part of Neo4j.
#
# Neo4j is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program.  If not, see <http://www.gnu.org/licenses/>.
#

#encoding: utf-8

Feature: PatternExpressionAcceptance

  Scenario: Returning list comprehension
    Given an empty graph
    And having executed:
      """
      CREATE (a:A)
      CREATE (a)-[:T]->(:B),
             (a)-[:T]->(:C)
      """
    When executing query:
      """
      MATCH (n)
      RETURN [x IN (n)-->() | head(nodes(x))] AS p
      """
    Then the result should be, in any order:
      | p            |
      | [(:A), (:A)] |
      | []           |
      | []           |
    And no side effects

  Scenario: Using list comprehension in a WITH
    Given an empty graph
    And having executed:
      """
      CREATE (a:A)
      CREATE (a)-[:T]->(:B),
             (a)-[:T]->(:C)
      """
    When executing query:
      """
      MATCH (n:A)
      WITH [x IN (n)-->() | head(nodes(x))] AS p, count(n) AS c
      RETURN p, c
      """
    Then the result should be, in any order:
      | p            | c |
      | [(:A), (:A)] | 1 |
    And no side effects

  Scenario: Using list comprehension in a WHERE
    Given an empty graph
    And having executed:
      """
      CREATE (a:A)
      CREATE (a)-[:T]->(:B),
             (a)-[:T]->(:C)
      """
    When executing query:
      """
      MATCH (n)
      WHERE n IN [x IN (n)-->() | head(nodes(x))]
      RETURN n
      """
    Then the result should be, in any order:
      | n    |
      | (:A) |
    And no side effects

  Scenario: Using a pattern expression and a CASE expression in a WHERE
    Given an empty graph
    And having executed:
      """
      CREATE (a:A)
      CREATE (a)-[:T]->(:C),
             (a)-[:T]->(:C),
             (:B)-[:T]->(:D),
             ()-[:T]->()
      """
    When executing query:
      """
      MATCH (n)
      WHERE (n)-->() AND (CASE
                            WHEN n:A THEN size((n)-->(:C))
                            WHEN n:B THEN size((n)-->(:D))
                            ELSE 42
                          END) > 1
      RETURN n
      """
    Then the result should be, in any order:
      | n    |
      | (:A) |
      | ()   |
    And no side effects

  Scenario: Pattern expressions and ORDER BY
    Given an empty graph
    And having executed:
      """
      CREATE (a {time: 10}), (b {time: 20})
      CREATE (a)-[:T]->(b)
      """
    When executing query:
      """
      MATCH (liker)
      RETURN (liker)--() AS isNew
        ORDER BY liker.time
      """
    Then the result should be, in order:
      | isNew                               |
      | [<({time: 10})-[:T]->({time: 20})>] |
      | [<({time: 20})<-[:T]-({time: 10})>] |
    And no side effects

  Scenario: Returning a pattern expression
    Given an empty graph
    And having executed:
      """
      CREATE (a:A)
      CREATE (a)-[:T]->(:B),
             (a)-[:T]->(:C)
      """
    When executing query:
      """
      MATCH (n)
      RETURN (n)-->() AS p
      """
    Then the result should be, in any order:
      | p                                      |
      | [<(:A)-[:T]->(:C)>, <(:A)-[:T]->(:B)>] |
      | []                                     |
      | []                                     |
    And no side effects

  Scenario: Returning a pattern expression with label predicate
    Given an empty graph
    And having executed:
      """
      CREATE (a:A), (b:B), (c:C), (d:D)
      CREATE (a)-[:T]->(b),
             (a)-[:T]->(c),
             (a)-[:T]->(d)
      """
    When executing query:
      """
      MATCH (n:A)
      RETURN (n)-->(:B)
      """
    Then the result should be, in any order:
      | (n)-->(:B)          |
      | [<(:A)-[:T]->(:B)>] |
    And no side effects

  Scenario: Returning a pattern expression with bound nodes
    Given an empty graph
    And having executed:
      """
      CREATE (a:A), (b:B)
      CREATE (a)-[:T]->(b)
      """
    When executing query:
      """
      MATCH (a:A), (b:B)
      RETURN (a)-[*]->(b) AS path
      """
    Then the result should be, in any order:
      | path                |
      | [<(:A)-[:T]->(:B)>] |
    And no side effects

  Scenario: Using a pattern expression in a WITH
    Given an empty graph
    And having executed:
      """
      CREATE (a:A)
      CREATE (a)-[:T]->(:B),
             (a)-[:T]->(:C)
      """
    When executing query:
      """
      MATCH (n)-->(b)
      WITH (n)-->() AS p, count(b) AS c
      RETURN p, c
      """
    Then the result should be, in any order:
      | p                                      | c |
      | [<(:A)-[:T]->(:C)>, <(:A)-[:T]->(:B)>] | 2 |
    And no side effects

  Scenario: Using a variable-length pattern expression in a WITH
    Given an empty graph
    And having executed:
      """
      CREATE (:A)-[:T]->(:B)
      """
    When executing query:
      """
      MATCH (a:A), (b:B)
      WITH (a)-[*]->(b) AS path, count(a) AS c
      RETURN path, c
      """
    Then the result should be, in any order:
      | path                | c |
      | [<(:A)-[:T]->(:B)>] | 1 |
    And no side effects

  Scenario: Using pattern expression in RETURN
    Given an empty graph
    And having executed:
      """
      CREATE (a:A), (:A), (:A)
      CREATE (a)-[:HAS]->()
      """
    When executing query:
      """
      MATCH (n:A)
      RETURN (n)-[:HAS]->() AS p
      """
    Then the result should be, in any order:
      | p                   |
      | [<(:A)-[:HAS]->()>] |
      | []                  |
      | []                  |
    And no side effects

  Scenario: Aggregating on pattern expression
    Given an empty graph
    And having executed:
      """
      CREATE (a:A), (:A), (:A)
      CREATE (a)-[:HAS]->()
      """
    When executing query:
      """
      MATCH (n:A)
      RETURN count((n)-[:HAS]->()) AS c
      """
    Then the result should be, in any order:
      | c |
      | 3 |
    And no side effects

  Scenario: Using `size()` on outgoing pattern expression
    Given an empty graph
    And having executed:
      """
      CREATE (n1:X {n: 1}), (n2:X {n: 2})
      CREATE (n1)-[:T]->(),
             (n1)-[:T]->(),
             (n1)-[:T]->(),
             ()-[:T]->(n2),
             ()-[:T]->(n2),
             ()-[:T]->(n2)
      """
    When executing query:
      """
      MATCH (n:X)
      WHERE size((n)-->()) > 2
      RETURN n
      """
    Then the result should be, in any order:
      | n           |
      | (:X {n: 1}) |
    And no side effects

  Scenario: Using `size()` on incoming pattern expression
    Given an empty graph
    And having executed:
      """
      CREATE (n1:X {n: 1}), (n2:X {n: 2})
      CREATE (n1)-[:T]->(),
             (n1)-[:T]->(),
             (n1)-[:T]->(),
             ()-[:T]->(n2),
             ()-[:T]->(n2),
             ()-[:T]->(n2)
      """
    When executing query:
      """
      MATCH (n:X)
      WHERE size((n)<--()) > 2
      RETURN n
      """
    Then the result should be, in any order:
      | n           |
      | (:X {n: 2}) |
    And no side effects

  Scenario: Using `size()` on undirected pattern expression
    Given an empty graph
    And having executed:
      """
      CREATE (n1:X {n: 1}), (n2:X {n: 2})
      CREATE (n1)-[:T]->(),
             (n1)-[:T]->(),
             (n1)-[:T]->(),
             ()-[:T]->(n2),
             ()-[:T]->(n2),
             ()-[:T]->(n2)
      """
    When executing query:
      """
      MATCH (n:X)
      WHERE size((n)--()) > 2
      RETURN n
      """
    Then the result should be, in any order:
      | n           |
      | (:X {n: 1}) |
      | (:X {n: 2}) |
    And no side effects

  Scenario: Using `size()` on pattern expression with complex relationship predicate
    Given an empty graph
    And having executed:
      """
      CREATE (n1:X {n: 1}), (n2:X {n: 2})
      CREATE (n1)-[:T]->(),
             (n1)-[:T]->(),
             (n1)-[:T]->(),
             ()-[:T]->(n2),
             ()-[:T]->(n2),
             ()-[:T]->(n2)
      """
    When executing query:
      """
      MATCH (n)
      WHERE size((n)-[:X|Y]-()) > 2
      RETURN n
      """
    Then the result should be, in any order:
      | n |
    And no side effects

  Scenario: Returning pattern expression in `exists()`
    Given an empty graph
    And having executed:
      """
      CREATE (a:X {prop: 42}), (:X {prop: 43})
      CREATE (a)-[:T]->()
      """
    When executing query:
      """
      MATCH (n:X)
      RETURN n, exists((n)--()) AS b
      """
    Then the result should be, in any order:
      | n               | b     |
      | (:X {prop: 42}) | true  |
      | (:X {prop: 43}) | false |
    And no side effects

  Scenario: Pattern expression inside list comprehension
    Given an empty graph
    And having executed:
      """
      CREATE (n1:X {n: 1}), (m1:Y), (i1:Y), (i2:Y)
      CREATE (n1)-[:T]->(m1),
             (m1)-[:T]->(i1),
             (m1)-[:T]->(i2)
      CREATE (n2:X {n: 2}), (m2), (i3:L), (i4:Y)
      CREATE (n2)-[:T]->(m2),
             (m2)-[:T]->(i3),
             (m2)-[:T]->(i4)
      """
    When executing query:
      """
      MATCH p = (n:X)-->(b)
      RETURN n, [x IN nodes(p) | size((x)-->(:Y))] AS list
      """
    Then the result should be, in any order:
      | n           | list   |
      | (:X {n: 1}) | [1, 2] |
      | (:X {n: 2}) | [0, 1] |
    And no side effects

  Scenario: Failing when introducing new node variable in pattern expression
    Given any graph
    When executing query:
      """
      MATCH (n)
      RETURN (n)-[:T]->(b)
      """
    Then a SyntaxError should be raised at compile time: UndefinedVariable

  Scenario: Failing when introducing new relationship variable in pattern expression
    Given any graph
    When executing query:
      """
      MATCH (n)
      RETURN (n)-[r:T]->()
      """
    Then a SyntaxError should be raised at compile time: UndefinedVariable

  Scenario: Get node degree via size of pattern expression
    Given an empty graph
    And having executed:
      """
      CREATE (x:X),
        (x)-[:T]->(),
        (x)-[:T]->(),
        (x)-[:T]->()
      """
    When executing query:
      """
      MATCH (a:X)
      RETURN size((a)-->()) AS size
      """
    Then the result should be, in any order:
      | size |
      | 3    |
    And no side effects

  Scenario: Get node degree via size of pattern expression that specifies a relationship type
    Given an empty graph
    And having executed:
      """
      CREATE (x:X),
        (x)-[:T]->(),
        (x)-[:T]->(),
        (x)-[:T]->(),
        (x)-[:OTHER]->()
      """
    When executing query:
      """
      MATCH (a:X)
      RETURN size((a)-[:T]->()) AS size
      """
    Then the result should be, in any order:
      | size |
      | 3    |
    And no side effects

  Scenario: Get node degree via size of pattern expression that specifies multiple relationship types
    Given an empty graph
    And having executed:
      """
      CREATE (x:X),
        (x)-[:T]->(),
        (x)-[:T]->(),
        (x)-[:T]->(),
        (x)-[:OTHER]->()
      """
    When executing query:
      """
      MATCH (a:X)
      RETURN size((a)-[:T|OTHER]->()) AS size
      """
    Then the result should be, in any order:
      | size |
      | 4    |
    And no side effects

  Scenario: Nested pattern comprehensions
    Given an empty graph
    And having executed:
      """
      CREATE (:Artist {name:"Metallica"})-[:HAS_ALBUM]->(r:Album {name:"Reload"})-[:RECORDED_AT]->(s:Studio {name:"The Plant Studios in Sausalito"})
      """
    When executing query:
      """
      MATCH (a:Artist)
      RETURN
      [ (a)-[r_h1:HAS_ALBUM]->(l1:Album) |
        [ r_h1, l1,
          [ (l1)<-[r_h2:HAS_ALBUM]-(l2:Artist) | [ r_h2, l2 ] ],
          [ (l1)<-[r_g2:GUEST_ALBUM]-(l2:Artist) | [ r_g2, l2 ] ],
          [ (l1)-[r_r2:RECORDED_AT]->(s2:Studio) | [ r_r2, s2 ] ]
        ]
      ] as result
      """
    Then the result should be, in any order:
      | result |
      | [[[:HAS_ALBUM {}], (:Album {name: 'Reload'}), [[[:HAS_ALBUM {}], (:Artist {name: 'Metallica'})]], [], [[[:RECORDED_AT {}], (:Studio {name: 'The Plant Studios in Sausalito'})]]]] |
    And no side effects

  Scenario: Nested pattern comprehensions 2
    Given an empty graph
    And having executed:
      """
      CREATE (a:Artist {name:"Metallica"})-[:HAS_ALBUM]->(r:Album {name:"Reload"})-[:RECORDED_AT]->(s:Studio {name:"The Plant Studios in Sausalito"})
      CREATE (a)-[:GUEST_ALBUM]->(b:Album {name:"Guest album"})
      """
    When executing query:
      """
      MATCH (a:Artist)
      RETURN
      [
        [ (a)-[r_h1:HAS_ALBUM]->(l1:Album) |
          [ r_h1, l1,
            [
              [ (l1)<-[r_h2:HAS_ALBUM]-(l2:Artist) | [ r_h2, l2 ] ],
              [ (l1)<-[r_g2:GUEST_ALBUM]-(l2:Artist) | [ r_g2, l2 ] ],
              [ (l1)-[r_r2:RECORDED_AT]->(s2:Studio) | [ r_r2, s2 ] ]
            ]
          ]
        ],
        [ (a)-[r_g1:GUEST_ALBUM]->(l1:Album) |
          [ r_g1, l1, [
            [ (l1)<-[r_h2:HAS_ALBUM]-(l2:Artist) | [ r_h2, l2 ] ],
            [ (l1)<-[r_g2:GUEST_ALBUM]-(l2:Artist) | [ r_g2, l2 ] ],
            [ (l1)-[r_r2:RECORDED_AT]->(s2:Studio) | [ r_r2, s2 ] ]]
          ]
        ]
      ] as result
      """
    Then the result should be, in any order:
      | result |
      | [[[[:HAS_ALBUM {}], (:Album {name: 'Reload'}), [[[[:HAS_ALBUM {}], (:Artist {name: 'Metallica'})]], [], [[[:RECORDED_AT {}], (:Studio {name: 'The Plant Studios in Sausalito'})]]]]], [[[:GUEST_ALBUM {}], (:Album {name: 'Guest album'}), [[], [[[:GUEST_ALBUM {}], (:Artist {name: 'Metallica'})]], []]]]] |
    And no side effects

  Scenario: Nested pattern comprehensions 3
    Given an empty graph
    And having executed:
      """
      CREATE (:Artist {name:"Metallica"})-[:HAS_ALBUM]->(r:Album {name:"Reload"})-[:RECORDED_AT]->(s:Studio {name:"The Plant Studios in Sausalito"})
      """
    When executing query:
      """
      MATCH (a:Artist)
      WITH
      [ (a)-[r_h1:HAS_ALBUM]->(l1:Album) |
        [ r_h1, l1,
          [ (l1)<-[r_h2:HAS_ALBUM]-(l2:Artist) | [ r_h2, l2 ] ],
          [ (l1)<-[r_g2:GUEST_ALBUM]-(l2:Artist) | [ r_g2, l2 ] ],
          [ (l1)-[r_r2:RECORDED_AT]->(s2:Studio) | [ r_r2, s2 ] ]
        ]
      ] as result
      MATCH (s:Studio)
      RETURN result, s
      """
    Then the result should be, in any order:
      | result | s |
      | [[[:HAS_ALBUM {}], (:Album {name: 'Reload'}), [[[:HAS_ALBUM {}], (:Artist {name: 'Metallica'})]], [], [[[:RECORDED_AT {}], (:Studio {name: 'The Plant Studios in Sausalito'})]]]] | (:Studio {name: 'The Plant Studios in Sausalito'}) |
    And no side effects

  Scenario: Nested pattern comprehensions 4
    Given an empty graph
    And having executed:
      """
      CREATE (:Artist {name:"Metallica"})-[:HAS_ALBUM]->(r:Album {name:"Reload"})-[:RECORDED_AT]->(s:Studio {name:"The Plant Studios in Sausalito"})
      """
    When executing query:
      """
      MATCH ()-[r0:HAS_ALBUM]->()
      WITH r0, STARTNODE(r0) AS n, ENDNODE(r0) AS m
      RETURN r0, n, [ [ (n)-[r_p1:HAS_ALBUM]-(i1:Album) | [ r_p1, i1, [ [ (i1)-[r_p2:HAS_ALBUM]-(i2:Album) | [ r_p2, i2 ] ] ] ] ] ] as pattern1,
        m, [ [ (m)-[r_p1:HAS_ALBUM]-(i1:`Artist`) | [ r_p1, i1, [ [ (i1)-[r_p2:HAS_ALBUM]-(i2:Artist) | [ r_p2, i2 ] ] ] ] ] ] as pattern2
      """
    Then the result should be, in any order:
      | r0              | n | pattern1 | m | pattern2 |
      | [:HAS_ALBUM {}] | (:Artist {name: 'Metallica'}) | [[[[:HAS_ALBUM {}], (:Album {name: 'Reload'}), [[]]]]] | (:Album {name: 'Reload'}) | [[[[:HAS_ALBUM {}], (:Artist {name: 'Metallica'}), [[]]]]] |
    And no side effects

  Scenario: Nested pattern comprehension with food
    Given an empty graph
    And having executed:
    """
    CREATE (:Chicken)-[:rel]->(:Carrot)-[:rel]->(:Ham)
    """
    When executing query:
    """
    MATCH (chicken :Chicken)
    WITH [ (chicken)--(i1) | [ (i1)--(i2) | i2 ] ] as p
    UNWIND p AS innerp
    UNWIND innerp as elem
    RETURN elem
    """
    Then the result should be, in any order:
    | elem       |
    | (:Chicken) |
    | (:Ham)     |
    And no side effects

  Scenario: Handling a null value in inner predicate
    Given an empty graph
    And having executed:
    """
    CREATE (tom: Person {name: 'Tom Hanks'}),
           (matt: Person {name: 'Matt Damon'}),
           (movie: Movie {title: 'Saving Private Ryan'}),
           (tom)-[:ACTED_IN]->(movie),
           (matt)-[:ACTED_IN]->(movie)
    """
    When executing query:
    """
    MATCH (tom:Person)-[:ACTED_IN]->(movie:Movie)
    WHERE tom.name = 'Tom Hanks'
    WITH tom, movie, null as customValue
    RETURN [(movie)<-[:ACTED_IN]-(coActor:Person) WHERE coActor.name <> coalesce(tom.name, '') OR customValue IS NOT null | coActor.name ] as coActors
    """
    Then the result should be, in any order:
      | coActors       |
      | ['Matt Damon'] |
    And no side effects
