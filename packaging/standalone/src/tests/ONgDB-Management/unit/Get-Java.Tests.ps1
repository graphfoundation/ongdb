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
  Describe "Get-Java" {

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

    # Java Detection Tests
    Context "Valid Java install in JAVA_HOME environment variable" {
      $result = Get-Java

      It "should return java location" {
        $result.java | Should Be "$javaHome\bin\java.exe"
      }

      It "should have empty shell arguments" {
        $result.args | Should BeNullOrEmpty
      }
    }

    Context "Legacy Java install in JAVA_HOME environment variable" {
      Mock Get-JavaVersion -Verifiable { @{ 'isValid' = $false; 'isJava8' = $false } }

      It "should throw if java is not supported" {
        { Get-Java -ErrorAction Stop } | Should Throw
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }

    Context "Invalid Java install in JAVA_HOME environment variable" {
      Mock Test-Path { $false } -ParameterFile { $Path -like "$javaHome\bin\java.exe" }

      It "should throw if java missing" {
        { Get-Java -ErrorAction Stop } | Should Throw
      }
    }

    Context "Valid Java install in Registry (32bit Java on 64bit OS)" {
      Mock Get-ONgDBEnv { $null } -ParameterFilter { $Name -eq 'JAVA_HOME' }
      Mock Test-Path -Verifiable { return $true } -ParameterFilter {
        ($Path -eq 'Registry::HKLM\SOFTWARE\Wow6432Node\JavaSoft\Java Runtime Environment')
      }
      Mock Get-ItemProperty -Verifiable { return @{ 'CurrentVersion' = '9.9' } } -ParameterFilter {
        ($Path -eq 'Registry::HKLM\SOFTWARE\Wow6432Node\JavaSoft\Java Runtime Environment')
      }
      Mock Get-ItemProperty -Verifiable { return @{ 'JavaHome' = $javaHome } } -ParameterFilter {
        ($Path -eq 'Registry::HKLM\SOFTWARE\Wow6432Node\JavaSoft\Java Runtime Environment\9.9')
      }

      $result = Get-Java

      It "should return java location from registry" {
        $result.java | Should Be "$javaHome\bin\java.exe"
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }

    Context "Valid Java install in Registry" {
      Mock Get-ONgDBEnv { $null } -ParameterFilter { $Name -eq 'JAVA_HOME' }
      Mock Test-Path -Verifiable { return $true } -ParameterFilter {
        ($Path -eq 'Registry::HKLM\SOFTWARE\JavaSoft\Java Runtime Environment')
      }
      Mock Get-ItemProperty -Verifiable { return @{ 'CurrentVersion' = '9.9' } } -ParameterFilter {
        ($Path -eq 'Registry::HKLM\SOFTWARE\JavaSoft\Java Runtime Environment')
      }
      Mock Get-ItemProperty -Verifiable { return @{ 'JavaHome' = $javaHome } } -ParameterFilter {
        ($Path -eq 'Registry::HKLM\SOFTWARE\JavaSoft\Java Runtime Environment\9.9')
      }

      $result = Get-Java

      It "should return java location from registry" {
        $result.java | Should Be "$javaHome\bin\java.exe"
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }

    Context "Invalid Java install in Registry" {
      Mock Test-Path { $false } -ParameterFile { $Path -like "$javaHome\bin\java.exe" }
      Mock Get-ONgDBEnv { $null } -ParameterFilter { $Name -eq 'JAVA_HOME' }
      Mock Test-Path -Verifiable { return $true } -ParameterFilter {
        ($Path -eq 'Registry::HKLM\SOFTWARE\JavaSoft\Java Runtime Environment')
      }
      Mock Get-ItemProperty -Verifiable { return @{ 'CurrentVersion' = '9.9' } } -ParameterFilter {
        ($Path -eq 'Registry::HKLM\SOFTWARE\JavaSoft\Java Runtime Environment')
      }
      Mock Get-ItemProperty -Verifiable { return @{ 'JavaHome' = $javaHome } } -ParameterFilter {
        ($Path -eq 'Registry::HKLM\SOFTWARE\JavaSoft\Java Runtime Environment\9.9')
      }

      It "should throw if java missing" {
        { Get-Java -ErrorAction Stop } | Should Throw
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }

    Context "Valid Java install in search path" {
      Mock Get-ONgDBEnv { $null } -ParameterFilter { $Name -eq 'JAVA_HOME' }

      Mock Get-Command -Verifiable { return @{ 'Path' = "$javaHome\bin\java.exe" } }

      $result = Get-Java

      It "should return java location from search path" {
        $result.java | Should Be "$javaHome\bin\java.exe"
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }

    Context "No Java install at all" {
      Mock Get-ONgDBEnv { $null } -ParameterFilter { $Name -eq 'JAVA_HOME' }
      Mock Get-Command { $null }

      It "should throw if java not detected" {
        { Get-Java -ErrorAction Stop } | Should Throw
      }
    }

    # ForServer tests
    Context "Server Invoke - Community v3.0" {
      $serverObject = global:New-MockONgDBInstall -ServerVersion '3.0' -ServerType 'Community'

      $result = Get-Java -ForServer -ONgDBServer $serverObject
      $resultArgs = ($result.args -join ' ')

      It "should have main class of org.neo4j.server.CommunityEntryPoint" {
        $resultArgs | Should Match ([regex]::Escape(' org.neo4j.server.CommunityEntryPoint'))
      }
    }

    Context "Server Invoke - Should set heap size" {
      $serverObject = global:New-MockONgDBInstall -ServerVersion '3.0' -ServerType 'Community' `
         -NeoConfSettings 'dbms.memory.heap.initial_size=123k','dbms.memory.heap.max_size=234g'

      $result = Get-Java -ForServer -ONgDBServer $serverObject
      $resultArgs = ($result.args -join ' ')

      It "should set initial heap size" {
        $resultArgs | Should Match ([regex]::Escape(' -Xms123k '))
      }

      It "should set max heap size" {
        $resultArgs | Should Match ([regex]::Escape(' -Xmx234g '))
      }
    }

    Context "Server Invoke - Should default heap size unit to megabytes" {
      $serverObject = global:New-MockONgDBInstall -ServerVersion '3.0' -ServerType 'Community' `
         -NeoConfSettings 'dbms.memory.heap.initial_size=123','dbms.memory.heap.max_size=234'

      $result = Get-Java -ForServer -ONgDBServer $serverObject
      $resultArgs = ($result.args -join ' ')

      It "should set initial heap size" {
        $resultArgs | Should Match ([regex]::Escape(' -Xms123m '))
      }

      It "should set max heap size" {
        $resultArgs | Should Match ([regex]::Escape(' -Xmx234m '))
      }
    }

    Context "Server Invoke - Enable Default GC Logs" {
      $serverObject = global:New-MockONgDBInstall -ServerVersion '3.0' -ServerType 'Community' `
         -NeoConfSettings 'dbms.logs.gc.enabled=true'

      $result = Get-Java -ForServer -ONgDBServer $serverObject
      $resultArgs = ($result.args -join ' ')

      It "should set GCLogfile" {
        $resultArgs | Should Match ([regex]::Escape(' -Xloggc:'))
      }

      It "should set GCLogfile under logs" {
        $resultArgs | Should Match ([regex]::Escape(" -Xloggc:`"$($serverObject.LogDir)"))
      }

      It "should set GCLogFileSize" {
        $resultArgs | Should Match ([regex]::Escape(' -XX:GCLogFileSize='))
      }

      It "should set NumberOfGCLogFiles" {
        $resultArgs | Should Match ([regex]::Escape(' -XX:NumberOfGCLogFiles='))
      }

      It "should set PrintGCDetails" {
        $resultArgs | Should Match ([regex]::Escape(' -XX:+PrintGCDetails'))
      }

      It "should set PrintGCDateStamps" {
        $resultArgs | Should Match ([regex]::Escape(' -XX:+PrintGCDateStamps'))
      }

      It "should set PrintGCApplicationStoppedTime" {
        $resultArgs | Should Match ([regex]::Escape(' -XX:+PrintGCApplicationStoppedTime'))
      }

      It "should set PrintPromotionFailure" {
        $resultArgs | Should Match ([regex]::Escape(' -XX:+PrintPromotionFailure'))
      }

      It "should set PrintTenuringDistribution" {
        $resultArgs | Should Match ([regex]::Escape(' -XX:+PrintTenuringDistribution'))
      }
    }

    Context "Server Invoke - Enable Specific GC Logs" {
      $serverObject = global:New-MockONgDBInstall -ServerVersion '3.0' -ServerType 'Community' `
         -NeoConfSettings 'dbms.logs.gc.enabled=true','dbms.logs.gc.options=key1=value1 key2=value2'

      $result = Get-Java -ForServer -ONgDBServer $serverObject
      $resultArgs = ($result.args -join ' ')

      It "should set GCLogfile" {
        $resultArgs | Should Match ([regex]::Escape(' -Xloggc:'))
      }

      It "should set GCLogFileSize" {
        $resultArgs | Should Match ([regex]::Escape(' -XX:GCLogFileSize='))
      }

      It "should set NumberOfGCLogFiles" {
        $resultArgs | Should Match ([regex]::Escape(' -XX:NumberOfGCLogFiles='))
      }

      It "should set specific options" {
        $resultArgs | Should Match ([regex]::Escape(' key1=value1'))
        $resultArgs | Should Match ([regex]::Escape(' key2=value2'))
      }
    }

    Context "Server Invoke - Enable Post Java 8 Default GC Logs" {
      Mock Get-JavaVersion { @{ 'isValid' = $true; 'isJava8' = $false } }

      $serverObject = global:New-MockONgDBInstall -ServerVersion '3.0' -ServerType 'Community' `
         -NeoConfSettings 'dbms.logs.gc.enabled=true'

      $result = Get-Java -ForServer -ONgDBServer $serverObject
      $resultArgs = ($result.args -join ' ')

      It "should set default options" {
        $resultArgs | Should Match ([regex]::Escape('-Xlog:gc*,safepoint,age*=trace'))
      }

      It "should set gc log file size" {
        $resultArgs | Should Match ([regex]::Escape('filesize='))
      }

      It "should set number of gc logs" {
        $resultArgs | Should Match ([regex]::Escape('filecount='))
      }

      It "should set file location" {
        $resultArgs | Should Match ([regex]::Escape('file='))
      }
    }

    Context "Server Invoke - Enable Post Java 8 Specific GC Logs" {
      Mock Get-JavaVersion { @{ 'isValid' = $true; 'isJava8' = $false } }

      $serverObject = global:New-MockONgDBInstall -ServerVersion '3.0' -ServerType 'Community' `
         -NeoConfSettings 'dbms.logs.gc.enabled=true','dbms.logs.gc.options=key1=value1 key2=value2'

      $result = Get-Java -ForServer -ONgDBServer $serverObject
      $resultArgs = ($result.args -join ' ')

      It "should set gc file" {
        $resultArgs | Should Match ([regex]::Escape('file='))
      }

      It "should set gc log file size" {
        $resultArgs | Should Match ([regex]::Escape('filesize='))
      }

      It "should set number of gc log files" {
        $resultArgs | Should Match ([regex]::Escape('filecount='))
      }

      It "should set specific options" {
        $resultArgs | Should Match ([regex]::Escape(' key1=value1'))
        $resultArgs | Should Match ([regex]::Escape(' key2=value2'))
      }
    }

    # Utility Invoke
    Context "Utility Invoke" {
      $serverObject = global:New-MockONgDBInstall -ServerVersion '99.99' -ServerType 'Community'

      $result = Get-Java -ForUtility -StartingClass 'someclass' -ONgDBServer $serverObject -ErrorAction Stop
      $resultArgs = ($result.args -join ' ')

      It "should have jars from bin" {
        $resultArgs | Should Match ([regex]::Escape("$($serverObject.Home)/bin/*"))
      }
      It "should have jars from lib" {
        $resultArgs | Should Match ([regex]::Escape("$($serverObject.Home)/lib/*"))
      }
      It "should have correct Starting Class" {
        $resultArgs | Should Match ([regex]::Escape(' someclass'))
      }
    }

    Context "Utility Invoke - Should set heap size from environment variable" {
      $serverObject = global:New-MockONgDBInstall -ServerVersion '99.99' -ServerType 'Community'
      Mock Get-ONgDBEnv { '666m' } -ParameterFilter { $Name -eq 'HEAP_SIZE' }

      $result = Get-Java -ForUtility -StartingClass 'someclass' -ONgDBServer $serverObject -ErrorAction Stop
      $resultArgs = ($result.args -join ' ')

      It "should have jars from bin" {
        $resultArgs | Should Match ([regex]::Escape("$($serverObject.Home)/bin/*"))
      }
      It "should have jars from lib" {
        $resultArgs | Should Match ([regex]::Escape("$($serverObject.Home)/lib/*"))
      }
      It "should have correct Starting Class" {
        $resultArgs | Should Match ([regex]::Escape(' someclass'))
      }
      It "should have correct initial heap" {
        $resultArgs | Should Match ([regex]::Escape('-Xms666m'))
      }
      It "should have correct maximum heap" {
        $resultArgs | Should Match ([regex]::Escape('-Xmx666m'))
      }
    }

    Context "Utility Invoke - Should provide parallel collector option" {
      $serverObject = global:New-MockONgDBInstall -ServerVersion '99.99' -ServerType 'Community'

      $result = Get-Java -ForUtility -StartingClass 'someclass' -ONgDBServer $serverObject -ErrorAction Stop
      $resultArgs = ($result.args -join ' ')

      It "should have parallel collector java option" {
        $resultArgs | Should Match ([regex]::Escape('-XX:+UseParallelGC'))
      }
    }

    Context "Server Invoke - Should handle paths with spaces" {
      $serverObject = global:New-MockONgDBInstall -ServerVersion '3.0' -ServerType 'Community' `
         -RootDir 'TestDrive:\ONgDB Home' `
         -NeoConfSettings 'dbms.logs.gc.enabled=true'

      $result = Get-Java -ForServer -ONgDBServer $serverObject
      $argList = $result.args

      It "should have literal quotes around config path" {
        $argList -contains "--config-dir=`"TestDrive:\ONgDB Home\conf`"" | Should Be True
      }
      It "should have literal quotes around home path" {
        $argList -contains "--home-dir=`"TestDrive:\ONgDB Home`"" | Should Be True
      }
      It "should have literal quotes around gclog path" {
        $argList -contains "-Xloggc:`"$($serverObject.LogDir)/gc.log`"" | Should Be True
      }
    }
  }
}
