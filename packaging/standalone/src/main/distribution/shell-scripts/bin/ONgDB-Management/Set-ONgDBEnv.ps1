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


<#
.SYNOPSIS
Sets a process-level environment variable value

.DESCRIPTION
Sets a process-level environment variable value.  This is a helper function which aids testing and mocking

.PARAMETER Name
Name of the environment variable

.PARAMETER Value
Value of the environment variable

.EXAMPLE
Set-ONgDBEnv 'ONgDBHome' 'C:\ongdb'

Sets the ONgDBHome environment variable to C:\ongdb

.OUTPUTS
System.String
Value of the environment variable

.NOTES
This function is private to the powershell module

#>
function Set-ONgDBEnv
{
  [CmdletBinding(SupportsShouldProcess = $false,ConfirmImpact = 'Low')]
  param(
    [Parameter(Mandatory = $true,ValueFromPipeline = $false,Position = 0)]
    [string]$Name

    ,[Parameter(Mandatory = $true,ValueFromPipeline = $false,Position = 1)]
    [string]$Value
  )

  begin
  {
  }

  process {
    Set-Item -Path Env:$Name -Value $Value
  }

  end
  {
  }
}
