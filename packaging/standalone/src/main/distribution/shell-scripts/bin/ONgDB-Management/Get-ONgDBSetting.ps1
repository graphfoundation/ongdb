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
TODO UPDATE HELPTEXT
Retrieves properties about a ONgDB installation

.DESCRIPTION
Retrieves properties about a ONgDB installation

.PARAMETER ONgDBServer
An object representing a valid Neo4j Server object

.PARAMETER ConfigurationFile
The name of the configuration file or files to parse.  If not specified the default set of all configuration files are used.  Do not use the full path, just the filename, the path is relative to '[ONgDBHome]\conf'

.PARAMETER Name
The name of the property to retrieve.  If not specified, all properties are returned.

.EXAMPLE
Get-ONgDBSetting -ONgDBServer $ServerObject | Format-Table

Retrieves all settings for the ONgDB installation at $ServerObject

.EXAMPLE
Get-ONgDBSetting -ONgDBServer $ServerObject -Name 'dbms.active_database'

Retrieves all settings with the name 'dbms.active_database' from the ONgDB installation at $ServerObject

.EXAMPLE
Get-ONgDBSetting -ONgDBServer $ServerObject -Name 'dbms.active_database' -ConfigurationFile 'ongdb.conf'

Retrieves all settings with the name 'dbms.active_database' from the ONgDB installation at $ServerObject in 'ongdb.conf'

.OUTPUTS
System.Management.Automation.PSCustomObject
This is a Neo4j Setting Object
Properties;
'Name' : Name of the property
'Value' : Value of the property.  Multivalue properties are string arrays (string[])
'ConfigurationFile' : Name of the configuration file where the setting is defined
'IsDefault' : Whether this setting is a default value (Reserved for future use)
'ONgDBHome' : Path to the ONgDB installation

.LINK
Get-ONgDBServer

.NOTES
This function is private to the powershell module

#>
Function Get-ONgDBSetting
{
  [cmdletBinding(SupportsShouldProcess=$false,ConfirmImpact='Low')]
  param (
    [Parameter(Mandatory=$true,ValueFromPipeline=$true)]
    [PSCustomObject]$ONgDBServer

    ,[Parameter(Mandatory=$false)]
    [string[]]$ConfigurationFile = $null

    ,[Parameter(Mandatory=$false)]
    [string]$Name = ''
  )
  
  Begin
  {
  }

  Process
  {
    # Get the Neo4j Server information
    if ($ONgDBServer -eq $null) { return }

    # Set the default list of configuration files    
    if ($ConfigurationFile -eq $null)
    {
      $ConfigurationFile = ('ongdb.conf','ongdb-wrapper.conf')
    }
   
    $ConfigurationFile | ForEach-Object -Process `
    {
      $filename = $_
      $filePath = Join-Path -Path $ONgDBServer.ConfDir -ChildPath $filename
      if (Test-Path -Path $filePath)
      {
        $keyPairsFromFile = Get-KeyValuePairsFromConfFile -filename $filePath        
      }
      else
      {
        $keyPairsFromFile = $null
      }
      
      if ($keyPairsFromFile -ne $null)
      {
        $keyPairsFromFile.GetEnumerator() | Where-Object { ($Name -eq '') -or ($_.Name -eq $Name) } | ForEach-Object -Process `
        {
          $properties = @{
            'Name' = $_.Name;
            'Value' = $_.Value;
            'ConfigurationFile' = $filename;
            'IsDefault' = $false;
            'ONgDBHome' = $ONgDBServer.Home;
          }

          Write-Output (New-Object -TypeName PSCustomObject -Property $properties)
        }
      }
    }
  }
  
  End
  {
  }
}
