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
  Describe "Invoke-ONgDBAdmin" {

    Context "Nodes and Relationships as comma delimited list" {
      # Commands from the command line come through as System.Object[]
      # These commands can be simulated through crafting an appropriate array

      # ongdb-admin import --mode=database --fake "file1,file2"
      $testCommand = @('import','--setting=value','--fake',@('file1','file2'))

      Mock Invoke-ONgDBUtility { Write-Host $CommandArgs -ForegroundColor Magenta; return 2 }
      Mock Invoke-ONgDBUtility -Verifiable { return 0 } -ParameterFilter {
        $Command -eq 'admintool' `
           -and $CommandArgs[0] -eq 'import' `
           -and $CommandArgs[1] -eq '--setting=value' `
           -and $CommandArgs[2] -eq '--fake' `
           -and $CommandArgs[3] -eq 'file1,file2' `
         }

      $result = Invoke-ONgDBAdmin -CommandArgs $testCommand
      It "Should return exit code 0" {
        $result | Should Be 0
      }

      It "Should call verified mocks" {
        Assert-VerifiableMocks
      }
    }

    Context "Arguments containing spaces" {
      Mock Get-ONgDBEnv {}
      Mock Get-Java { @{'java' = 'java'; 'args' = @('java') } }
      Mock Get-ONgDBServer {
        New-Object -TypeName PSCustomObject  -Property @{}
      }
      Mock Start-Process { Write-Host $ArgumentList }

      It "Should pass quoted arguments to Start-Process" {
        # ongdb-admin cmd --arg1='path with spaces' --arg2 'some more spaces' --flag --arg=without-spaces
        $testCommand = @('cmd', '--arg1=path with spaces', '--arg2', 'some more spaces', '--flag', '--arg=without-spaces')

        # Redirect output from Write-Host to the success output stream to be able to capture its result.
        # https://stackoverflow.com/a/49102708
        [string]$result = Invoke-ONgDBUtility -Command 'admintool' -CommandArgs $testCommand 6>&1
        $result.TrimEnd() | Should Be 'java "cmd" "--arg1=path with spaces" "--arg2" "some more spaces" "--flag" "--arg=without-spaces"'
      }

      It "Should not quote already quoted arguments" {
        # ongdb-admin cmd --arg1='"path with spaces"' "'--arg2'" 'some more spaces' --flag --arg=without-spaces
        $testCommand = @('cmd', '"--arg1=path with spaces"', "'--arg2'", 'some more spaces', '--flag', '--arg=without-spaces')

        [string]$result = Invoke-ONgDBUtility -Command 'admintool' -CommandArgs $testCommand 6>&1
        $result.TrimEnd() | Should Be 'java "cmd" "--arg1=path with spaces" ''--arg2'' "some more spaces" "--flag" "--arg=without-spaces"'
      }
    }
  }
}
