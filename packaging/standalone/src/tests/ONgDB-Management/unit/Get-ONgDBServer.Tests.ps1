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

$here = Split-Path -Parent $MyInvocation.MyCommand.Path
$sut = (Split-Path -Leaf $MyInvocation.MyCommand.Path).Replace(".Tests.",".")
$common = Join-Path (Split-Path -Parent $here) 'Common.ps1'
.$common

Import-Module "$src\ONgDB-Management.psm1"

InModuleScope ONgDB-Management {
  Describe "Get-ONgDBServer" {
    Mock Set-ONgDBEnv {}

    Context "Missing ONgDB installation" {
      Mock Get-ONgDBEnv { $javaHome } -ParameterFilter { $Name -eq 'ONGDB_HOME' }

      It "throws an error if no default home" {
        { Get-ONgDBServer -ErrorAction Stop } | Should Throw
      }
    }

    Context "Invalid ONgDB Server detection" {
      $mockServer = global:New-MockONgDBInstall -IncludeFiles:$false

      It "throws an error if the home is not complete" {
        { Get-ONgDBServer -ONgDBHome $mockServer.Home -ErrorAction Stop } | Should Throw
      }
    }

    Context "Pipes and aliases" {
      $mockServer = global:New-MockONgDBInstall
      It "processes piped paths" {
        $ongdbServer = ($mockServer.Home | Get-ONgDBServer)

        ($ongdbServer -ne $null) | Should Be $true
      }

      It "uses the Home alias" {
        $ongdbServer = (Get-ONgDBServer -Home $mockServer.Home)

        ($ongdbServer -ne $null) | Should Be $true
      }
    }

    Context "Valid Enterprise ONgDB installation" {
      $mockServer = global:New-MockONgDBInstall -ServerType 'Enterprise' -ServerVersion '99.99' -DatabaseMode 'Arbiter'

      $ongdbServer = Get-ONgDBServer -ONgDBHome $mockServer.Home -ErrorAction Stop

      It "detects an enterprise edition" {
        $ongdbServer.ServerType | Should Be "Enterprise"
      }
      It "detects correct version" {
        $ongdbServer.ServerVersion | Should Be "99.99"
      }
      It "detects correct database mode" {
        $ongdbServer.DatabaseMode | Should Be "Arbiter"
      }
    }

    Context "Valid Community ONgDB installation" {
      $mockServer = global:New-MockONgDBInstall -ServerType 'Community' -ServerVersion '99.99'

      $ongdbServer = Get-ONgDBServer -ONgDBHome $mockServer.Home -ErrorAction Stop

      It "detects a community edition" {
        $ongdbServer.ServerType | Should Be "Community"
      }
      It "detects correct version" {
        $ongdbServer.ServerVersion | Should Be "99.99"
      }
    }

    Context "Valid Community ONgDB installation with relative paths" {
      $mockServer = global:New-MockONgDBInstall -RootDir 'TestDrive:\ongdb' -ServerType 'Community' -ServerVersion '99.99'

      # Get the absolute path
      $ONgDBDir = (Get-Item $mockServer.Home).FullName.TrimEnd('\')

      It "detects correct home path using double dot" {
        $ongdbServer = Get-ONgDBServer -ONgDBHome "$($mockServer.Home)\lib\.." -ErrorAction Stop
        $ongdbServer.Home | Should Be $ONgDBDir
      }

      It "detects correct home path using single dot" {
        $ongdbServer = Get-ONgDBServer -ONgDBHome "$($mockServer.Home)\." -ErrorAction Stop
        $ongdbServer.Home | Should Be $ONgDBDir
      }

      It "detects correct home path ignoring trailing slash" {
        $ongdbServer = Get-ONgDBServer -ONgDBHome "$($mockServer.Home)\" -ErrorAction Stop
        $ongdbServer.Home | Should Be $ONgDBDir
      }
    }

    Context "No explicit location for config directory is provided" {
      global:New-MockONgDBInstall -RootDir 'TestDrive:\ongdb'
      $ONgDBDir = (Get-Item 'TestDrive:\ongdb').FullName.TrimEnd('\')

      It "Defaults config path to $ONgDBDir\conf" {
        $ongdbServer = Get-ONgDBServer -ONgDBHome 'TestDrive:\ongdb\' -ErrorAction Stop
        $ongdbServer.ConfDir | Should Be (Join-Path -Path $ONgDBDir -ChildPath 'conf')
      }
    }

    Context "ONGDB_CONF environment variable is set" {
      global:New-MockONgDBInstall -RootDir 'TestDrive:\ongdb'
      Mock Get-ONgDBEnv { 'TestDrive:\ongdb-conf' } -ParameterFilter { $Name -eq 'ONGDB_CONF' }

      It "Gets conf directory from environment variable" {
        $ongdbServer = Get-ONgDBServer -ONgDBHome 'TestDrive:\ongdb\' -ErrorAction Stop
        $ongdbServer.ConfDir | Should Be 'TestDrive:\ongdb-conf'
      }
    }

    Context "ONGDB_HOME environment variable is not set" {
      global:New-MockONgDBInstall -RootDir 'TestDrive:\ongdb'
      Mock Get-ONgDBEnv {} -ParameterFilter { $Name -eq 'ONGDB_HOME' }

      It "Creates ONGDB_HOME if not set" {
        $ongdbServer = Get-ONgDBServer -ONgDBHome 'TestDrive:\ongdb\' -ErrorAction Stop
        Assert-MockCalled Set-ONgDBEnv -Times 1 -ParameterFilter { $Name -eq 'ONGDB_HOME' }
      }
    }

    Context "ONGDB_HOME environment variable is already set" {
      global:New-MockONgDBInstall -RootDir 'TestDrive:\ongdb'
      Mock Get-ONgDBEnv { 'TestDrive:\bad-location' } -ParameterFilter { $Name -eq 'ONGDB_HOME' }

      It "Does not modify ONGDB_HOME if already set" {
        $ongdbServer = Get-ONgDBServer -ONgDBHome 'TestDrive:\ongdb\' -ErrorAction Stop
        Assert-MockCalled Set-ONgDBEnv -Times 0 -ParameterFilter { $Name -eq 'ONGDB_HOME' }
      }
    }

    Context "Deprecation warning if a ongdb-wrapper.conf file is found" {
      global:New-MockONgDBInstall -RootDir 'TestDrive:\ongdb'
      Mock Write-Warning

      '# Mock File' | Out-File 'TestDrive:\ongdb\conf\ongdb-wrapper.conf'

      It "Should raise a warning if conf\ongdb-wrapper.conf exists" {
        $ongdbServer = Get-ONgDBServer -ONgDBHome 'TestDrive:\ongdb\' -ErrorAction Stop
        Assert-MockCalled Write-Warning -Times 1
      }
    }

    Context "Log directory doesn't exist" {
      global:New-MockONgDBInstall -RootDir 'TestDrive:\ongdb'
      Mock Get-ONgDBEnv { 'TestDrive:\ongdb\logs' } -ParameterFilter { $Name -eq 'ONGDB_LOGS' }

      It "Should create it" {
        $ongdbServer = Get-ONgDBServer -ONgDBHome 'TestDrive:\ongdb\' -ErrorAction Stop
        Test-Path -PathType Container $ongdbServer.LogDir | Should Be $true
      }
    }
  }
}
