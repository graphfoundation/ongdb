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

$DebugPreference = "SilentlyContinue"

$here = Split-Path -Parent $MyInvocation.MyCommand.Definition
$src = Resolve-Path -Path "$($here)\..\..\main\distribution\shell-scripts\bin\ONgDB-Management"

# Helper functions must be created in the global scope due to the InModuleScope command
$global:mockServiceName = 'ongdb'
$global:mockONgDBHome = 'TestDrive:\ONgDB'

function global:New-MockJavaHome () {
  $javaHome = "TestDrive:\JavaHome"

  New-Item $javaHome -ItemType Directory | Out-Null
  New-Item "$javaHome\bin" -ItemType Directory | Out-Null
  New-Item "$javaHome\bin\server" -ItemType Directory | Out-Null

  "This is a mock java.exe" | Out-File "$javaHome\bin\java.exe"
  "This is a mock java.exe" | Out-File "$javaHome\bin\server\jvm.dll"

  $global:mockJavaExe = "$javaHome\bin\java.exe"

  return $javaHome
}

function global:New-InvalidONgDBInstall ($ServerType = 'Enterprise',$ServerVersion = '99.99',$DatabaseMode = '') {
  $serverObject = (New-Object -TypeName PSCustomObject -Property @{
    'Home' = 'TestDrive:\some-dir-that-doesnt-exist';
    'ConfDir' = 'TestDrive:\some-dir-that-doesnt-exist\conf';
    'LogDir' = 'TestDrive:\some-dir-that-doesnt-exist\logs';
    'ServerVersion' = $ServerVersion;
    'ServerType' = $ServerType;
    'DatabaseMode' = $DatabaseMode;
  })
  return $serverObject
}

function global:New-MockONgDBInstall (
        $IncludeFiles = $true,
        $RootDir = $global:mockONgDBHome,
        $ServerType = 'Community',
        $ServerVersion = '0.0',
        $DatabaseMode = '',
        $WindowsService = $global:mockServiceName,
        $NeoConfSettings = @()
) {
  # Creates a skeleton directory and file structure of a ONgDB Installation
  New-Item $RootDir -ItemType Directory | Out-Null
  New-Item "$RootDir\lib" -ItemType Directory | Out-Null
  New-Item "$RootDir\bin" -ItemType Directory | Out-Null
  New-Item "$RootDir\bin\tools" -ItemType Directory | Out-Null
  New-Item "$RootDir\conf" -ItemType Directory | Out-Null

  if ($IncludeFiles) {
    'TempFile' | Out-File -FilePath "$RootDir\lib\ongdb-server-$($ServerVersion).jar"
    if ($ServerType -eq 'Enterprise') { 'TempFile' | Out-File -FilePath "$RootDir\lib\ongdb-server-enterprise-$($ServerVersion).jar" }

    # Additional Jars
    'TempFile' | Out-File -FilePath "$RootDir\lib\lib1.jar"
    'TempFile' | Out-File -FilePath "$RootDir\bin\bin1.jar"

    # Procrun service files
    'TempFile' | Out-File -FilePath "$RootDir\bin\tools\prunsrv-amd64.exe"
    'TempFile' | Out-File -FilePath "$RootDir\bin\tools\prunsrv-i386.exe"

    # Create fake ongdb.conf
    $ongdbConf = $NeoConfSettings -join "`n`r"
    if ($DatabaseMode -ne '') {
      $ongdbConf += "`n`rdbms.mode=$DatabaseMode"
    }
    if ([string]$WindowsService -ne '') {
      $ongdbConf += "`n`rdbms.windows_service_name=$WindowsService"
    }
    $ongdbConf | Out-File -FilePath "$RootDir\conf\ongdb.conf"
  }

  $serverObject = (New-Object -TypeName PSCustomObject -Property @{
    'Home' = $RootDir;
    'ConfDir' = "$RootDir\conf";
    'LogDir' = (Join-Path -Path $RootDir -ChildPath 'logs');
    'ServerVersion' = $ServerVersion;
    'ServerType' = $ServerType;
    'DatabaseMode' = $DatabaseMode;
  })
  return $serverObject
}
