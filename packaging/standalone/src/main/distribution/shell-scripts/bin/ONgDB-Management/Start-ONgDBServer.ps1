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
Starts a Neo4j Server instance

.DESCRIPTION
Starts a Neo4j Server instance either as a java console application or Windows Service

.PARAMETER ONgDBServer
An object representing a valid Neo4j Server object

.EXAMPLE
Start-ONgDBServer -ONgDBServer $ServerObject

Start the Neo4j Windows Windows Service for the ONgDB installation at $ServerObject

.OUTPUTS
System.Int32
0 = Service was started and is running
non-zero = an error occured

.NOTES
This function is private to the powershell module

#>
Function Start-ONgDBServer
{
  [cmdletBinding(SupportsShouldProcess=$false,ConfirmImpact='Low',DefaultParameterSetName='WindowsService')]
  param (
    [Parameter(Mandatory=$true,ValueFromPipeline=$false)]
    [PSCustomObject]$ONgDBServer

    ,[Parameter(Mandatory=$true,ParameterSetName='Console')]
    [switch]$Console

    ,[Parameter(Mandatory=$true,ParameterSetName='WindowsService')]
    [switch]$Service   
  )
  
  Begin
  {
  }

  Process
  {
    # Running Neo4j as a console app
    if ($PsCmdlet.ParameterSetName -eq 'Console')
    {      
      $JavaCMD = Get-Java -ONgDBServer $ONgDBServer -ForServer -ErrorAction Stop
      if ($JavaCMD -eq $null)
      {
        Write-Error 'Unable to locate Java'
        return 255
      }

      Write-Verbose "Starting ONgDB as a console with command line $($JavaCMD.java) $($JavaCMD.args)"
      $result = (Start-Process -FilePath $JavaCMD.java -ArgumentList $JavaCMD.args -Wait -NoNewWindow -PassThru -WorkingDirectory $ONgDBServer.Home)
      Write-Verbose "Returned exit code $($result.ExitCode)"

      Write-Output $result.ExitCode
    }
    
    # Running Neo4j as a windows service
    if ($PsCmdlet.ParameterSetName -eq 'WindowsService')
    {
      $ServiceName = Get-ONgDBWindowsServiceName -ONgDBServer $ONgDBServer -ErrorAction Stop

      Write-Verbose "Starting the service.  This can take some time..."
      $result = Start-Service -Name $ServiceName -PassThru -ErrorAction Stop
      
      if ($result.Status -eq 'Running') {
        Write-Host "Neo4j windows service started"
        return 0
      }
      else {
        Write-Host "Neo4j windows was started but is not running"
        return 2
      }
    }
  }
  
  End
  {
  }
}
