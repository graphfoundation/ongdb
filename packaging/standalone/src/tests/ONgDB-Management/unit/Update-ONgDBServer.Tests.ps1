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


$here = Split-Path -Parent $MyInvocation.MyCommand.Path
$sut = (Split-Path -Leaf $MyInvocation.MyCommand.Path).Replace(".Tests.", ".")
$common = Join-Path (Split-Path -Parent $here) 'Common.ps1'
. $common

Import-Module "$src\ONgDB-Management.psm1"

InModuleScope ONgDB-Management {
  Describe "Update-ONgDBServer" {

    # Setup mocking environment
    # Mock Java environment
    $javaHome = global:New-MockJavaHome
    Mock Get-ONgDBEnv { $javaHome } -ParameterFilter { $Name -eq 'JAVA_HOME' }
    Mock Set-ONgDBEnv { }
    Mock Test-Path { $false } -ParameterFilter {
      $Path -like 'Registry::*\JavaSoft\Java Runtime Environment'
    }
    Mock Get-ItemProperty { $null } -ParameterFilter {
      $Path -like 'Registry::*\JavaSoft\Java Runtime Environment*'
    }
    # Mock ONgDB environment
    Mock Get-ONgDBEnv { $global:mockONgDBHome } -ParameterFilter { $Name -eq 'ONGDB_HOME' }
    Mock Start-Process { throw "Should not call Start-Process mock" }

    Context "Invalid or missing specified ONgDB installation" {
      $serverObject = global:New-InvalidNeo4jInstall

      It "throws if invalid or missing ONgDB directory" {
        { Update-ONgDBServer -ONgDBServer $serverObject -ErrorAction Stop } | Should Throw
      }
    }

    Context "Non-existing service" {
      Mock Get-Service -Verifiable { return $null }
      $serverObject = global:New-MockONgDBInstall
      $result = Update-ONgDBServer -ONgDBServer $serverObject

      It "returns 1 for service that does not exist" {
        $result | Should Be 1
        Assert-VerifiableMocks
      }
    }

    Context "Update service failure" {
      Mock Get-Service -Verifiable { return "Fake service" }
      Mock Start-Process -Verifiable { throw "Error reconfiguring" }
      $serverObject = global:New-MockONgDBInstall

      It "throws when update encounters an error" {
        { Update-ONgDBServer -ONgDBServer $serverObject } | Should Throw
        Assert-VerifiableMocks
      }
    }

    Context "Update service success" {
      Mock Get-Service -Verifiable { return "Fake service" }
      Mock Start-Process -Verifiable { @{'ExitCode' = 0} }
      $serverObject = global:New-MockONgDBInstall
      $result = Update-ONgDBServer -ONgDBServer $serverObject

      It "returns 0 when successfully updated" {
        $result | Should Be 0
        Assert-VerifiableMocks
      }
    }

  }
}
