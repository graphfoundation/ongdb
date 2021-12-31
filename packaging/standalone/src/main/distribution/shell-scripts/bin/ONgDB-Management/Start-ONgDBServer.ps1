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
Starts a ONgDB Server instance

.DESCRIPTION
Starts a ONgDB Server instance either as a java console application or Windows Service

.PARAMETER ONgDBServer
An object representing a valid ONgDB Server object

.EXAMPLE
Start-ONgDBServer -ONgDBServer $ServerObject

Start the ONgDB Windows Windows Service for the ONgDB installation at $ServerObject

.OUTPUTS
System.Int32
0 = Service was started and is running
non-zero = an error occured

.NOTES
This function is private to the powershell module

#>
function Start-ONgDBServer
{
  [CmdletBinding(SupportsShouldProcess = $false,ConfirmImpact = 'Low',DefaultParameterSetName = 'WindowsService')]
  param(
    [Parameter(Mandatory = $true,ValueFromPipeline = $false)]
    [pscustomobject]$ONgDBServer

    ,[Parameter(Mandatory = $true,ParameterSetName = 'Console')]
    [switch]$Console

    ,[Parameter(Mandatory = $true,ParameterSetName = 'WindowsService')]
    [switch]$Service
  )

  begin
  {
  }

  process
  {
    # Running ONgDB as a console app
    if ($PsCmdlet.ParameterSetName -eq 'Console')
    {
      $JavaCMD = Get-Java -ONgDBServer $ONgDBServer -ForServer -ErrorAction Stop
      if ($JavaCMD -eq $null)
      {
        Write-Error 'Unable to locate Java'
        return 255
      }

      Write-Verbose "Starting ONgDB as a console with command line $($JavaCMD.java) $($JavaCMD.args)"
      $result = (Start-Process -FilePath $JavaCMD.java -ArgumentList $JavaCMD.args -Wait -NoNewWindow -Passthru -WorkingDirectory $ONgDBServer.Home)
      Write-Verbose "Returned exit code $($result.ExitCode)"

      Write-Output $result.exitCode
    }

    # Running ONgDB as a windows service
    if ($PsCmdlet.ParameterSetName -eq 'WindowsService')
    {
      $ServiceName = Get-ONgDBWindowsServiceName -ONgDBServer $ONgDBServer -ErrorAction Stop
      $Found = Get-Service -Name $ServiceName -ComputerName '.' -ErrorAction 'SilentlyContinue'
      if ($Found)
      {
        $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $ONgDBServer -ForServerStart
        if ($prunsrv -eq $null) { throw "Could not determine the command line for PRUNSRV" }

        Write-Verbose "Starting ONgDB as a service"
        $result = Invoke-ExternalCommand -Command $prunsrv.cmd -CommandArgs $prunsrv.args

        # Process the output
        if ($result.exitCode -eq 0) {
          Write-Host "ONgDB service started"
        } else {
          Write-Host "ONgDB service did not start"
          # Write out STDERR if it did not start
          Write-Host $result.capturedOutput
        }

        Write-Output $result.exitCode
      }
      else
      {
        Write-Host "Service start failed - service '$ServiceName' not found"
        Write-Output 1
      }
    }
  }

  end
  {
  }
}
