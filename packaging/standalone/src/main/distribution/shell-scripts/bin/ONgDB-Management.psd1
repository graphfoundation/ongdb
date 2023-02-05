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

# Copyright (c) 2002-2018 "Neo4j,"
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

# Module manifest for module 'ONgDB-Management'
#


@{
    ModuleVersion = '1.0.0'

    GUID = '2a3e34b4-5564-488e-aaf6-f2cba3f7f05d'

    Author = 'Graph Foundation'

    CompanyName = 'Graph Foundation, Inc.'

    Copyright = 'https://graphfoundation.org/ongdb/'

    Description = 'Powershell module to manage an ONgDB instance on Windows'

    PowerShellVersion = '2.0'

    NestedModules = @('ONgDB-Management\ONgDB-Management.psm1')

    FunctionsToExport = @(
    'Invoke-ONgDB',
    'Invoke-ONgDBAdmin',
    'Invoke-ONgDBShell',
    'Invoke-ONgDBBackup',
    'Invoke-ONgDBImport',
    'Get-Args'
    )

    CmdletsToExport = ''

    VariablesToExport = ''

    AliasesToExport = ''
}
