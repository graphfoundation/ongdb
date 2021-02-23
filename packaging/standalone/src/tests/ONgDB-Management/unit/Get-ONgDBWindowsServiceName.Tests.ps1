$here = Split-Path -Parent $MyInvocation.MyCommand.Path
$sut = (Split-Path -Leaf $MyInvocation.MyCommand.Path).Replace(".Tests.", ".")
$common = Join-Path (Split-Path -Parent $here) 'Common.ps1'
. $common

Import-Module "$src\ONgDB-Management.psm1"

InModuleScope ONgDB-Management {
  Describe "Get-ONgDBWindowsServiceName" {

    Mock Get-ONgDBEnv { $global:mockONgDBHome } -ParameterFilter { $Name -eq 'ONGDB_HOME' }
    Mock Set-ONgDBEnv { }

    Context "Missing service name in configuration files" {
      $serverObject = global:New-MockONgDBInstall -WindowsService ''

      It "throws error for missing service name in configuration file" {
        { Get-ONgDBWindowsServiceName -ONgDBServer $serverObject -ErrorAction Stop } | Should Throw
      }
    }

    Context "Service name in configuration files" {
      $serverObject = global:New-MockONgDBInstall

      It "returns Service name in configuration file" {
        Get-ONgDBWindowsServiceName -ONgDBServer $serverObject | Should be $global:mockServiceName
      }
    }
  }
}