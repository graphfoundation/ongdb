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
Retrieves the name of the Windows Service from the configuration information

.DESCRIPTION
Retrieves the name of the Windows Service from the configuration information

.PARAMETER ONgDBServer
An object representing a valid ONgDB Server object

.EXAMPLE
Get-ONgDBWindowsServiceName -ONgDBServer $ServerObject

Retrieves the name of the Windows Service for the ONgDB Database at $ServerObject

.OUTPUTS
System.String
The name of the Windows Service or $null if it could not be determined

.NOTES
This function is private to the powershell module

#>
function Get-ONgDBWindowsServiceName
{
  [CmdletBinding(SupportsShouldProcess = $false,ConfirmImpact = 'Low')]
  param(
    [Parameter(Mandatory = $true,ValueFromPipeline = $true)]
    [pscustomobject]$ONgDBServer
  )

  begin
  {
  }

  process {
    $ServiceName = ''
    # Try ongdb.conf first, but then fallback to ongdb-wrapper.conf for backwards compatibility reasons
    $setting = (Get-ONgDBSetting -ConfigurationFile 'ongdb.conf' -Name 'dbms.windows_service_name' -ONgDBServer $ONgDBServer)
    if ($setting -ne $null) {
      $ServiceName = $setting.value
    } else {
      $setting = (Get-ONgDBSetting -ConfigurationFile 'ongdb-wrapper.conf' -Name 'dbms.windows_service_name' -ONgDBServer $ONgDBServer)
      if ($setting -ne $null) { $ServiceName = $setting.value }
    }

    if ($ServiceName -eq '')
    {
      throw 'Could not find the Windows Service Name for ONgDB (dbms.windows_service_name in ongdb.conf)'
      return $null
    }
    else
    {
      Write-Verbose "ONgDB Windows Service Name is $ServiceName"
      Write-Output $ServiceName.Trim()
    }
  }

  end
  {
  }
}
