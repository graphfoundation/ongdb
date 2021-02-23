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
Invokes a command which manipulates a ONgDB Server e.g Start, Stop, Install and Uninstall

.DESCRIPTION
Invokes a command which manipulates a ONgDB Server e.g Start, Stop, Install and Uninstall.

Invoke this function with a blank or missing command to list available commands

.PARAMETER Command
A string of the command to run.  Pass a blank string for the help text

.EXAMPLE
Invoke-ONgDB

Outputs the available commands

.EXAMPLE
Invoke-ONgDB status -Verbose

Gets the status of the ONgDB Windows Service and outputs verbose information to the console.

.OUTPUTS
System.Int32
0 = Success
non-zero = an error occured

.NOTES
Only supported on version 1.x ONgDB Community and Enterprise Edition databases

#>
Function Invoke-ONgDB
{
  [cmdletBinding(SupportsShouldProcess=$false,ConfirmImpact='Low')]
  param (
    [Parameter(Mandatory=$false,ValueFromPipeline=$false,Position=0)]
    [string]$Command = ''
  )

  Begin
  {
  }

  Process
  {
    try
    {
      $HelpText = "Usage: ongdb { console | start | stop | restart | status | install-service | uninstall-service | update-service } < -Verbose >"

      # Determine the ONgDB Home Directory.  Uses the ONGDB_HOME enironment variable or a parent directory of this script
      $ONgDBHome = Get-ONgDBEnv 'ONGDB_HOME'
      if ( ($ONgDBHome -eq $null) -or (-not (Test-Path -Path $ONgDBHome)) ) {
        $ONgDBHome = Split-Path -Path (Split-Path -Path $PSScriptRoot -Parent) -Parent
      }
      if ($ONgDBHome -eq $null) { throw "Could not determine the ONgDB home Directory.  Set the ONGDB_HOME environment variable and retry" }
      Write-Verbose "ONgDB Root is '$ONgDBHome'"

      $thisServer = Get-ONgDBServer -ONgDBHome $ONgDBHome -ErrorAction Stop
      if ($thisServer -eq $null) { throw "Unable to determine the ONgDB Server installation information" }
      Write-Verbose "ONgDB Server Type is '$($thisServer.ServerType)'"
      Write-Verbose "ONgDB Version is '$($thisServer.ServerVersion)'"
      Write-Verbose "ONgDB Database Mode is '$($thisServer.DatabaseMode)'"

      # Check if we have administrative rights; If the current user's token contains the Administrators Group SID (S-1-5-32-544)
      if (-not [bool](([System.Security.Principal.WindowsIdentity]::GetCurrent()).groups -match "S-1-5-32-544")) {
        Write-Warning "This command does not appear to be running with administrative rights.  Some commands may fail e.g. Start/Stop"
      }

      switch ($Command.Trim().ToLower())
      {
        "help" {
          Write-Host $HelpText
          Return 0
        }
        "console" {
          Write-Verbose "Console command specified"
          Return [int](Start-ONgDBServer -Console -ONgDBServer $thisServer -ErrorAction Stop)
        }
        "start" {
          Write-Verbose "Start command specified"
          Return [int](Start-ONgDBServer -Service -ONgDBServer $thisServer -ErrorAction Stop)
        }
        "stop" {
          Write-Verbose "Stop command specified"
          Return [int](Stop-ONgDBServer -ONgDBServer $thisServer -ErrorAction Stop)
        }
        "restart" {
          Write-Verbose "Restart command specified"

          $result = (Stop-ONgDBServer -ONgDBServer $thisServer -ErrorAction Stop)
          if ($result -ne 0) { Return $result}
          Return (Start-ONgDBServer -Service -ONgDBServer $thisServer -ErrorAction Stop)
        }
        "status" {
          Write-Verbose "Status command specified"
          Return [int](Get-ONgDBStatus -ONgDBServer $thisServer -ErrorAction Stop)
        }
        "install-service" {
          Write-Verbose "Install command specified"
          Return [int](Install-ONgDBServer -ONgDBServer $thisServer -ErrorAction Stop)
        }
        "uninstall-service" {
          Write-Verbose "Uninstall command specified"
          Return [int](Uninstall-ONgDBServer -ONgDBServer $thisServer -ErrorAction Stop)
        }
        "update-service" {
          Write-Verbose "Update command specified"
          Return [int](Update-ONgDBServer -ONgDBServer $thisServer -ErrorAction Stop)
        }
        default {
          if ($Command -ne '') { Write-StdErr "Unknown command $Command" }
          Write-StdErr $HelpText
          Return 1
        }
      }
      # Should not get here!
      Return 2
    }
    catch {
      Write-Error $_
      Return 1
    }
  }
  
  End
  {
  }
}
