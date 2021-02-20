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
Retrieves properties about a ONgDB installation

.DESCRIPTION
Retrieves properties about a ONgDB installation and outputs a Neo4j Server object.

.PARAMETER ONgDBHome
The full path to the ONgDB installation.

.EXAMPLE
Get-ONgDBServer -ONgDBHome 'C:\ONgDB'

Retrieves information about the ONgDB installation at C:\ONgDB

.EXAMPLE
'C:\ONgDB' | Get-ONgDBServer

Retrieves information about the ONgDB installation at C:\ONgDB

.EXAMPLE
Get-ONgDBServer

Retrieves information about the ONgDB installation as determined by Get-ONgDBHome

.OUTPUTS
System.Management.Automation.PSCustomObject
This is a ONgDB Server Object

.LINK
Get-ONgDBHome

.NOTES
This function is private to the powershell module

#>
Function Get-ONgDBServer
{
  [cmdletBinding(SupportsShouldProcess=$false,ConfirmImpact='Low')]
  param (
    [Parameter(Mandatory=$false,ValueFromPipeline=$true)]
    [alias('Home')]
    [AllowEmptyString()]
    [string]$ONgDBHome = ''
  )

  Begin
  {
  }

  Process
  {
    # Get and check the ONgDB Home directory
    if ( ($ONgDBHome -eq '') -or ($ONgDBHome -eq $null) )
    {
      Write-Error "Could not detect the ONgDB Home directory"
      return
    }

    if (-not (Test-Path -Path $ONgDBHome))
    {
      Write-Error "$ONgDBHome does not exist"
      return
    }

    # Convert the path specified into an absolute path
    $Neo4jDir = Get-Item $ONgDBHome
    $ONgDBHome = $Neo4jDir.FullName.TrimEnd('\')

    $ConfDir = Get-ONgDBEnv 'ONGDB_CONF'
    if ($ConfDir -eq $null)
    {
      $ConfDir = (Join-Path -Path $ONgDBHome -ChildPath 'conf')
    }

    # Get the information about the server
    $serverProperties = @{
      'Home' = $ONgDBHome;
      'ConfDir' = $ConfDir;
      'LogDir' = (Join-Path -Path $ONgDBHome -ChildPath 'logs');
      'ServerVersion' = '';
      'ServerType' = 'Community';
      'DatabaseMode' = '';
    }

    # Check if the lib dir exists
    $libPath = (Join-Path -Path $ONgDBHome -ChildPath 'lib')
    if (-not (Test-Path -Path $libPath))
    {
      Write-Error "$ONgDBHome is not a valid ONgDB installation.  Missing $libPath"
      return
    }

    # Scan the lib dir...
    Get-ChildItem (Join-Path -Path $ONgDBHome -ChildPath 'lib') | Where-Object { $_.Name -like 'ongdb-server-*.jar' } | ForEach-Object -Process `
    {
      # if ongdb-server-enterprise-<version>.jar exists then this is the enterprise version
      if ($_.Name -like 'ongdb-server-enterprise-*.jar') { $serverProperties.ServerType = 'Enterprise' }

      # Get the server version from the name of the ongdb-server-<version>.jar file
      if ($matches -ne $null) { $matches.Clear() }
      if ($_.Name -match '^ongdb-server-(\d.+)\.jar$') { $serverProperties.ServerVersion = $matches[1] }
    }
    $serverObject = New-Object -TypeName PSCustomObject -Property $serverProperties

    # Validate the object
    if ([string]$serverObject.ServerVersion -eq '') {
      Write-Error "Unable to determine the version of the installation at $ONgDBHome"
      return
    }

    # Get additional settings...
    $setting = (Get-ONgDBSetting -ConfigurationFile 'ongdb.conf' -Name 'dbms.mode' -ONgDBServer $serverObject)
    if ($setting -ne $null) { $serverObject.DatabaseMode = $setting.Value }

    # Set process level environment variables
    #  These should mirror the same paths in ongdb-shared.sh
    (@{'ONGDB_DATA'    = @{'config_var' = 'dbms.directories.data';    'default' = (Join-Path $ONgDBHome 'data')}
       'ONGDB_LIB'     = @{'config_var' = 'dbms.directories.lib';     'default' = (Join-Path $ONgDBHome 'lib')}
       'ONGDB_LOGS'    = @{'config_var' = 'dbms.directories.logs';    'default' = (Join-Path $ONgDBHome 'logs')}
       'ONGDB_PLUGINS' = @{'config_var' = 'dbms.directories.plugins'; 'default' = (Join-Path $ONgDBHome 'plugins')}
       'ONGDB_RUN'     = @{'config_var' = 'dbms.directories.run';     'default' = (Join-Path $ONgDBHome 'run')}
    }).GetEnumerator() | % {
      $setting = (Get-ONgDBSetting -ConfigurationFile 'ongdb.conf' -Name $_.Value.config_var -ONgDBServer $serverObject)
      $value = $_.Value.default
      if ($setting -ne $null) { $value = $setting.Value }
      if ($value -ne $null) {
        if (![System.IO.Path]::IsPathRooted($value)) {
          $value = (Join-Path -Path $ONgDBHome -ChildPath $value)
        }
      }
      Set-ONgDBEnv $_.Name $value
    }

    # Set log dir on server object
    $serverObject.LogDir = (Get-ONgDBEnv 'ONGDB_LOGS')

    #  ONGDB_CONF and ONGDB_HOME are used by the ONgDB Admin Tool
    if ( (Get-ONgDBEnv 'ONGDB_CONF') -eq $null) { Set-ONgDBEnv "ONGDB_CONF" $ConfDir }
    if ( (Get-ONgDBEnv 'ONGDB_HOME') -eq $null) { Set-ONgDBEnv "ONGDB_HOME" $ONgDBHome }

    # Any deprecation warnings
    $WrapperPath = Join-Path -Path $ConfDir -ChildPath 'ongdb-wrapper.conf'
    If (Test-Path -Path $WrapperPath) { Write-Warning "$WrapperPath is deprecated and support for it will be removed in a future version of ONgDB; please move all your settings to ongdb.conf" }

    Write-Output $serverObject
  }

  End
  {
  }
}
