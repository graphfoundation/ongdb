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
  Describe "Get-ONgDBSetting" {

    Context "Invalid or missing specified ongdb installation" {
      $serverObject = global:New-InvalidONgDBInstall

      $result = Get-ONgDBSetting -ONgDBServer $serverObject

      It "return null if invalid directory" {
        $result | Should BeNullOrEmpty
      }
    }

    Context "Missing configuration file is ignored" {
      $serverObject = global:New-MockONgDBInstall

      "setting=value" | Out-File -FilePath "$($serverObject.Home)\conf\ongdb.conf"
      # Remove the ongdb-wrapper
      $wrapperFile = "$($serverObject.Home)\conf\ongdb-wrapper.conf"
      if (Test-Path -Path $wrapperFile) { Remove-Item -Path $wrapperFile | Out-Null }

      $result = Get-ONgDBSetting -ONgDBServer $serverObject

      It "ignore the missing file" {
        $result.Name | Should Be "setting"
        $result.value | Should Be "value"
      }
    }

    Context "Simple configuration settings" {
      $serverObject = global:New-MockONgDBInstall

      "setting1=value1" | Out-File -FilePath "$($serverObject.Home)\conf\ongdb.conf"
      "setting2=value2" | Out-File -FilePath "$($serverObject.Home)\conf\ongdb-wrapper.conf"

      $result = Get-ONgDBSetting -ONgDBServer $serverObject

      It "one setting per file" {
        $result.Count | Should Be 2
      }

      # Parse the results and make sure the expected results are there
      $unknownSetting = $false
      $ongdbProperties = $false
      $ongdbServerProperties = $false
      $ongdbWrapper = $false
      $result | ForEach-Object -Process {
        $setting = $_
        switch ($setting.Name) {
          'setting1' { $ongdbServerProperties = ($setting.ConfigurationFile -eq 'ongdb.conf') -and ($setting.IsDefault -eq $false) -and ($setting.value -eq 'value1') }
          'setting2' { $ongdbWrapper = ($setting.ConfigurationFile -eq 'ongdb-wrapper.conf') -and ($setting.IsDefault -eq $false) -and ($setting.value -eq 'value2') }
          default { $unknownSetting = $true }
        }
      }

      It "returns settings for file ongdb.conf" {
        $ongdbServerProperties | Should Be $true
      }
      It "returns settings for file ongdb-wrapper.conf" {
        $ongdbWrapper | Should Be $true
      }

      It "returns no unknown settings" {
        $unknownSetting | Should Be $false
      }
    }

    Context "Configuration settings with multiple values" {
      $serverObject = global:New-MockONgDBInstall

      "setting1=value1`n`rsetting2=value2`n`rsetting2=value3`n`rsetting2=value4" | Out-File -FilePath "$($serverObject.Home)\conf\ongdb.conf"
      "" | Out-File -FilePath "$($serverObject.Home)\conf\ongdb-wrapper.conf"

      $result = Get-ONgDBSetting -ONgDBServer $serverObject

      # Parse the results and make sure the expected results are there
      $singleSetting = $null
      $multiSetting = $null
      $result | ForEach-Object -Process {
        $setting = $_
        switch ($setting.Name) {
          'setting1' { $singleSetting = $setting }
          'setting2' { $multiSetting = $setting }
        }
      }

      It "returns single settings" {
        ($singleSetting -ne $null) | Should Be $true
      }
      It "returns a string for single settings" {
        $singleSetting.value.GetType().ToString() | Should Be "System.String"
      }

      It "returns multiple settings" {
        ($multiSetting -ne $null) | Should Be $true
      }
      It "returns an object array for multiple settings" {
        $multiSetting.value.GetType().ToString() | Should Be "System.Object[]"
      }
      It "returns an object array for multiple settings with the correct size" {
        $multiSetting.value.Count | Should Be 3
      }
    }
  }
}
