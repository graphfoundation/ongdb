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
Uninstall a ONgDB Server Windows Service

.DESCRIPTION
Uninstall a ONgDB Server Windows Service

.PARAMETER ONgDBServer
An object representing a valid ONgDB Server object

.EXAMPLE
Uninstall-ONgDBServer -ONgDBServer $ServerObject

Uninstall the ONgDB Windows Windows Service for the ONgDB installation at $ServerObject

.OUTPUTS
System.Int32
0 = Service is uninstalled or did not exist
non-zero = an error occured

.NOTES
This function is private to the powershell module

#>
function Uninstall-ONgDBServer
{
  [CmdletBinding(SupportsShouldProcess = $true,ConfirmImpact = 'Medium')]
  param(
    [Parameter(Mandatory = $true,ValueFromPipeline = $true)]
    [pscustomobject]$ONgDBServer
  )

  begin
  {
  }

  process
  {
    $ServiceName = Get-ONgDBWindowsServiceName -ONgDBServer $ONgDBServer -ErrorAction Stop
    $Found = Get-Service -Name $ServiceName -ComputerName '.' -ErrorAction 'SilentlyContinue'
    if ($Found)
    {
      $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $ONgDBServer -ForServerUninstall
      if ($prunsrv -eq $null) { throw "Could not determine the command line for PRUNSRV" }

      Write-Verbose "Uninstalling ONgDB service"
      $result = Invoke-ExternalCommand -Command $prunsrv.cmd -CommandArgs $prunsrv.args

      # Process the output
      if ($result.exitCode -eq 0) {
        Write-Host "ONgDB service uninstalled"
      } else {
        Write-Host "ONgDB service did not uninstall"
        # Write out STDERR if it did not uninstall
        Write-Host $result.capturedOutput
      }

      Write-Output $result.exitCode
    } else {
      Write-Verbose "Windows Service $ServiceName does not exist"
      Write-Host "ONgDB uninstalled"
      return 0
    }
  }

  end
  {
  }
}
