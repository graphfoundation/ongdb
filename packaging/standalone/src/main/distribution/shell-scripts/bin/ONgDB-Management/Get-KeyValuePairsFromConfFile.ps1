# Copyright (c) 2018-2022 "Graph Foundation,"
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
Parses a ONgDB configuration file into a hashtable

.DESCRIPTION
Parses a ONgDB configuration file into a hashtable.  Multivalue keys are output as string[] types.

.PARAMETER Filename
The full path to the file to read

.EXAMPLE
Get-KeyValuePairsFromConfFile -Filename 'C:\ONgDB\conf\ongdb.conf'

Reads the file 'C:\ONgDB\conf\ongdb.conf' and outputs a hashtable of key/value pairs

.OUTPUTS
System.Collections.Hashtable

.NOTES
This function is private to the powershell module

#>
function Get-KeyValuePairsFromConfFile
{
  [CmdletBinding(SupportsShouldProcess = $false,ConfirmImpact = 'Low')]
  param(
    [Parameter(Mandatory = $false,ValueFromPipeline = $false)]
    [string]$Filename = ''
  )

  process
  {
    if ($filename -eq '') { throw "Filename must be specified"; return }
    $properties = @{}
    Get-Content -Path $filename -Filter $Filter | ForEach-Object -Process `
       {
      $line = $_
      $misc = $line.IndexOf('#')
      if ($misc -ge 0) { $line = $line.SubString(0,$misc) }

      if ($matches -ne $null) { $matches.Clear() }
      if ($line -match '^([^=]+)=(.+)$')
      {
        $keyName = $matches[1].Trim()
        if ($properties.Contains($keyName))
        {
          # There is already a property with this name so it must be a collection of properties.  Turn the value into an array and add it
          if ($properties[$keyName] -is [string]) { $properties[$keyName] = [string[]]@($properties[$keyName]) }
          $properties[$keyName] = $properties[$keyName] + $matches[2].Trim()
        }
        else
        {
          $properties[$keyName] = $matches[2].Trim()
        }
      }
    }
    Write-Output $properties
  }
}
