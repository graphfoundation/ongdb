$here = Split-Path -Parent $MyInvocation.MyCommand.Path
$sut = (Split-Path -Leaf $MyInvocation.MyCommand.Path).Replace(".Tests.", ".")
$common = Join-Path (Split-Path -Parent $here) 'Common.ps1'
. $common

Import-Module "$src\ONgDB-Management.psm1"

InModuleScope ONgDB-Management {
  Describe "Get-ONgDBSetting" {

    Context "Invalid or missing specified ONgDB installation" {
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
        $result.Value | Should Be "value"
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
      $neo4jProperties = $false
      $ongdbServerProperties = $false
      $ongdbWrapper = $false
      $result | ForEach-Object -Process {
        $setting = $_
        switch ($setting.Name) {
          'setting1' { $ongdbServerProperties = ($setting.ConfigurationFile -eq 'ongdb.conf') -and ($setting.IsDefault -eq $false) -and ($setting.Value -eq 'value1') }
          'setting2' { $ongdbWrapper =          ($setting.ConfigurationFile -eq 'ongdb-wrapper.conf') -and ($setting.IsDefault -eq $false) -and ($setting.Value -eq 'value2') }
          default { $unknownSetting = $true}
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
        $singleSetting.Value.GetType().ToString() | Should Be "System.String"
      }

      It "returns multiple settings" {
        ($multiSetting -ne $null) | Should Be $true
      }
      It "returns an object array for multiple settings" {
        $multiSetting.Value.GetType().ToString() | Should Be "System.Object[]"
      }
      It "returns an object array for multiple settings with the correct size" {
        $multiSetting.Value.Count | Should Be 3
      }
    }
  }
}
