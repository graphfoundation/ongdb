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
Retrieves the status for the ONgDB Windows Service

.DESCRIPTION
Retrieves the status for the ONgDB Windows Service

.PARAMETER ONgDBServer
An object representing a valid ONgDB Server object

.EXAMPLE
Get-ONgDBStatus -ONgDBServer $ServerObject

Retrieves the status of the Windows Service for the ONgDB database at $ServerObject

.OUTPUTS
System.Int32
0 = Service is running
3 = Service is not installed or is not running

.NOTES
This function is private to the powershell module

#>
function Get-ONgDBStatus
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
    $ServiceName = Get-ONgDBWindowsServiceName -ONgDBServer $ONgDBServer -ErrorAction Stop
    $ongdbService = $null
    try {
      $ongdbService = Get-Service -Name $ServiceName -ErrorAction Stop
    }
    catch {
      Write-Host "The ONgDB Windows Service '$ServiceName' is not installed"
      return 3
    }

    if ($ongdbService.Status -eq 'Running') {
      Write-Host "ONgDB is running"
      return 0
    }
    else {
      Write-Host "ONgDB is not running.  Current status is $($ongdbService.Status)"
      return 3
    }
  }

  end
  {
  }
}
