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
  Describe "Get-ONgDBPrunsrv" {

    # Setup mocking environment
    #  Mock Java environment
    $javaHome = global:New-MockJavaHome
    Mock Get-ONgDBEnv { $javaHome } -ParameterFilter { $Name -eq 'JAVA_HOME' }
    Mock Test-Path { $false } -ParameterFilter {
      $Path -like 'Registry::*\JavaSoft\Java Runtime Environment'
    }
    Mock Get-ItemProperty { $null } -ParameterFilter {
      $Path -like 'Registry::*\JavaSoft\Java Runtime Environment*'
    }
    Mock Get-JavaVersion { @{ 'isValid' = $true; 'isJava8' = $true } }
    # Mock ONgDB environment
    Mock Get-ONgDBEnv { $global:mockONgDBHome } -ParameterFilter { $Name -eq 'ONGDB_HOME' }
    Mock Set-ONgDBEnv {}

    Context "Invalid or missing specified ongdb installation" {
      $serverObject = global:New-InvalidONgDBInstall

      It "return throw if invalid or missing ongdb directory" {
        { Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForServerInstall -ErrorAction Stop } | Should Throw
      }
    }

    Context "Invalid or missing servicename in specified ongdb installation" {
      $serverObject = global:New-MockONgDBInstall -WindowsService ''

      It "return throw if invalid or missing service name" {
        { Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForServerInstall -ErrorAction Stop } | Should Throw
      }
    }

    Context "Select PRUNSRV based on OS architecture" {
      $serverObject = global:New-MockONgDBInstall
      $testCases = @(
      @{ 'AddressWidth' = 32; 'exe' = 'prunsrv-i386.exe' },
      @{ 'AddressWidth' = 64; 'exe' = 'prunsrv-amd64.exe' }
      ) | ForEach-Object -Process {
        $testCase = $_
        Mock Get-WmiObject { @{ 'AddressWidth' = $testCase.Addresswidth } }

        $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForServerInstall

        It "return $($testCase.exe) on $($testCase.AddressWidth)bit operating system" {
          $prunsrv.cmd | Should Match ([regex]::Escape($testCase.exe) + '$')
        }
      }
    }

    Context "PRUNSRV arguments" {
      $serverObject = global:New-MockONgDBInstall

      It "return //IS/xxx argument on service install" {
        $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForServerInstall

        $prunsrv.args -join ' ' | Should Match ([regex]::Escape("//IS//$($global:mockServiceName)"))
      }

      It "return //US/xxx argument on service update" {
        $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForServerUpdate

        $prunsrv.args -join ' ' | Should Match ([regex]::Escape("//US//$($global:mockServiceName)"))
      }

      It "return //DS/xxx argument on service uninstall" {
        $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForServerUninstall

        $prunsrv.args -join ' ' | Should Match ([regex]::Escape("//DS//$($global:mockServiceName)"))
      }

      It "return //ES/xxx argument on service start" {
        $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForServerStart

        $prunsrv.args -join ' ' | Should Match ([regex]::Escape("//ES//$($global:mockServiceName)"))
      }

      It "return //SS/xxx argument on service stop" {
        $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForServerStop

        $prunsrv.args -join ' ' | Should Match ([regex]::Escape("//SS//$($global:mockServiceName)"))
      }

      It "return //TS/xxx argument on service run console" {
        $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForConsole

        $prunsrv.args -join ' ' | Should Match ([regex]::Escape("//TS//$($global:mockServiceName)"))
      }
    }

    Context "PRUNSRV arguments are quoted" {
      $quotedStringRegex = New-Object -Type System.Text.RegularExpressions.Regex -ArgumentList "^"".*""$"
      $serverObject = global:New-MockONgDBInstall -RootDir "TestDrive:\ONgDB Install With Space"

      It "on service install" {
        $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForServerInstall

        $prunsrv.args | Should Match ($quotedStringRegex)
      }

      It "on service uninstall" {
        $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForServerUninstall

        $prunsrv.args | Should Match ($quotedStringRegex)
      }

      It "on console" {
        $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForConsole

        $prunsrv.args | Should Match ($quotedStringRegex)
      }
    }


    Context "Server Invoke - Community v3.0" {
      $serverObject = global:New-MockONgDBInstall -ServerVersion '3.0' -ServerType 'Community'

      $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForServerInstall

      It "should have main class of org.neo4j.server.CommunityEntryPoint" {
        ($prunsrv.args -join ' ') | Should Match ([regex]::Escape('=org.neo4j.server.CommunityEntryPoint'))
      }
    }

    Context "Server Invoke - Additional Java Parameters" {
      $serverObject = global:New-MockONgDBInstall -ServerVersion '3.0' -ServerType 'Community' `
         -NeoConfSettings @('dbms.logs.gc.enabled=true', 'dbms.jvm.additional=-DmyProperty1=a;b;c')

      $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForServerInstall
      $jvmArgs = ($prunsrv.args | Where-Object { $_ -match '^\"--JvmOptions=' })

      It "should specify UTF8 encoding" {
        $jvmArgs | Should Match ([regex]::Escape('-Dfile.encoding=UTF-8'))
      }

      # dbms.logs.gc.enabled=true is specified in the mock so -Xloggc:... should be present in the Prunsrv command
      It "should set GCLogfile in Prunsrv if specified in ongdb.conf" {
        $jvmArgs | Should Match ([regex]::Escape('-Xloggc:'))
      }

      It "should escape ; characters in additional java parameters" {
        $jvmArgs | Should Match ([regex]::Escape("-DmyProperty1=a';'b';'c"))
      }
    }

    Context "Server Invoke - JVM Memory Settings" {
      $mockJvmMs = 130
      $mockJvmMx = 140

      # Create a mock configuration with JVM settings set
      $serverObject = global:New-MockONgDBInstall -ServerVersion '3.0' -ServerType 'Community' `
         -NeoConfSettings "dbms.memory.heap.initial_size=$mockJvmMs","dbms.memory.heap.max_size=$mockJvmMx"

      $prunsrv = Get-ONgDBPrunsrv -ONgDBServer $serverObject -ForServerInstall
      $prunArgs = ($prunsrv.args -join ' ')

      # Reference
      # http://commons.apache.org/proper/commons-daemon/procrun.html

      It "should specify --JvmMs if dbms.memory.heap.initial_size is set" {
        $prunArgs | Should Match ([regex]::Escape("`"--JvmMs`" `"$mockJvmMs`""))
      }

      It "should specify --JvmMx if dbms.memory.heap.max_size is set" {
        $prunArgs | Should Match ([regex]::Escape("`"--JvmMx`" `"$mockJvmMx`""))
      }
    }

  }
}
