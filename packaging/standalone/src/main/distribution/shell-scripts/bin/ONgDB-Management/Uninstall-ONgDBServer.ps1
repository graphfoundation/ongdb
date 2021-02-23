# Copyright (c) 2018-2020 "Graph Foundation,"
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

# Copyright (c) 2002-2018 "Neo Technology,"
# Network Engine for Objects in Lund AB [http://neotechnology.com]
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
Function Uninstall-ONgDBServer
{
  [cmdletBinding(SupportsShouldProcess=$true,ConfirmImpact='Medium')]
  param (
    [Parameter(Mandatory=$true,ValueFromPipeline=$true)]
    [PSCustomObject]$ONgDBServer
  )
  
  Begin
  {
  }

  Process
  {
    $Name = Get-ONgDBWindowsServiceName -ONgDBServer $ONgDBServer -ErrorAction Stop

    $service = Get-Service -Name $Name -ComputerName '.' -ErrorAction 'SilentlyContinue'
    if ($service -eq $null) 
    {
      Write-Verbose "Windows Service $Name does not exist"
      Write-Host "ONgDB uninstalled"
      return 0
    }

    if ($service.State -ne 'Stopped') {
      Write-Host "Stopping the ONgDB service"
      Stop-Service -ServiceName $Name -ErrorAction 'Stop' | Out-Null
    }

    $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $ONgDBServer -ForServerUninstall
    if ($prunsrv -eq $null) { throw "Could not determine the command line for PRUNSRV" }

    Write-Verbose "Uninstalling ONgDB as a service with command line $($prunsrv.cmd) $($prunsrv.args)"
    $stdError = New-ONgDBTempFile -Prefix 'stderr'
    $result = (Start-Process -FilePath $prunsrv.cmd -ArgumentList $prunsrv.args -Wait -NoNewWindow -PassThru -WorkingDirectory $ONgDBServer.Home -RedirectStandardError $stdError)
    Write-Verbose "Returned exit code $($result.ExitCode)"

    Write-Output $result.ExitCode

    # Process the output
    if ($result.ExitCode -eq 0) {
      Write-Host "ONgDB service uninstalled"
    } else {
      Write-Host "ONgDB service did not uninstall"
      # Write out STDERR if it did not uninstall
      Get-Content -Path $stdError -ErrorAction 'SilentlyContinue' | ForEach-Object -Process {
        Write-Host $_
      }
    }
  }
  
  End
  {
  }
}
