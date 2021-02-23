$here = Split-Path -Parent $MyInvocation.MyCommand.Path
$sut = (Split-Path -Leaf $MyInvocation.MyCommand.Path).Replace(".Tests.", ".")
$common = Join-Path (Split-Path -Parent $here) 'Common.ps1'
. $common

Import-Module "$src\ONgDB-Management.psm1"

InModuleScope ONgDB-Management {
  Describe "Get-ONgDBStatus" {

    $mockServerObject = global:New-MockONgDBInstall
    Mock Set-ONgDBEnv { }
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
      Mock Get-Service -Verifiable { throw "Missing Service"}

      $result = Get-ONgDBStatus -ONgDBServer $mockServerObject
      It "result is 3" {
        $result | Should Be 3
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }

    Context "Service not installed but not running" {
      Mock Get-Service -Verifiable { @{ Status = 'Stopped' }}

      $result = Get-ONgDBStatus -ONgDBServer $mockServerObject
      It "result is 3" {
        $result | Should Be 3
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }

    Context "Service is running" {
      Mock Get-Service -Verifiable { @{ Status = 'Running' }}

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