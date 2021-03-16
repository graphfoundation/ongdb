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
$sut = (Split-Path -Leaf $MyInvocation.MyCommand.Path).Replace(".Tests.",".")
$common = Join-Path (Split-Path -Parent $here) 'Common.ps1'
.$common

Import-Module "$src\ONgDB-Management.psm1"

InModuleScope ONgDB-Management {
  Describe "Get-ONgDBStatus" {

    $mockServerObject = global:New-MockONgDBInstall
    Mock Set-ONgDBEnv {}
    Mock Get-ONgDBEnv { $mockServerObject.Home } -ParameterFilter { $Name -eq 'ONGDB_HOME' }

    Context "Missing service name in configuration files" {
      Mock -Verifiable Get-ONgDBWindowsServiceName { throw "Missing service name" }

      It "throws error for missing service name in configuration file" {
        { Get-ONgDBStatus -ONgDBServer $mockServerObject -ErrorAction Stop } | Should Throw
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }

    Context "Service not installed" {
      Mock Get-Service -Verifiable { throw "Missing Service" }

      $result = Get-ONgDBStatus -ONgDBServer $mockServerObject
      It "result is 3" {
        $result | Should Be 3
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }

    Context "Service not installed but not running" {
      Mock Get-Service -Verifiable { @{ Status = 'Stopped' } }

      $result = Get-ONgDBStatus -ONgDBServer $mockServerObject
      It "result is 3" {
        $result | Should Be 3
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }

    Context "Service is running" {
      Mock Get-Service -Verifiable { @{ Status = 'Running' } }

      $result = Get-ONgDBStatus -ONgDBServer $mockServerObject
      It "result is 0" {
        $result | Should Be 0
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }
  }
}
