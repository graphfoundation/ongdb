$here = Split-Path -Parent $MyInvocation.MyCommand.Path
$sut = (Split-Path -Leaf $MyInvocation.MyCommand.Path).Replace(".Tests.", ".")
$common = Join-Path (Split-Path -Parent $here) 'Common.ps1'
. $common

Import-Module "$src\ONgDB-Management.psm1"

InModuleScope ONgDB-Management {
  Describe "Install-ONgDBServer" {

    # Setup mocking environment
    #  Mock Java environment
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

      It "return throw if invalid or missing ONgDB directory" {
        { Install-ONgDBServer -ONgDBServer $serverObject  -ErrorAction Stop }  | Should Throw
      }
    }

    Context "Invalid or missing servicename in specified ONgDB installation" {
      $serverObject = global:New-MockONgDBInstall -WindowsService ''

      It "return throw if invalid or missing service name" {
        { Install-ONgDBServer -ONgDBServer $serverObject  -ErrorAction Stop }  | Should Throw
      }
    }

    Context "Windows service already exists" {
      Mock Get-Service -Verifiable { return 'Service Exists' }

      $serverObject = global:New-MockONgDBInstall

      $result = Install-ONgDBServer -ONgDBServer $serverObject

      It "returns 0 for service that already exists" {
        $result | Should Be 0
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }

    Context "Installs windows service with failure" {
      Mock Get-Service { return $null }
      Mock Start-Process -Verifiable { throw "Error installing" }

      $serverObject = global:New-MockONgDBInstall

      It "throws when error during installation" {
        { Install-ONgDBServer -ONgDBServer $serverObject } | Should Throw
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }

    Context "Installs windows service with success" {
      Mock Get-Service { return $null }
      Mock Start-Process -Verifiable { @{ 'ExitCode' = 0} }

      $serverObject = global:New-MockONgDBInstall

      $result = Install-ONgDBServer -ONgDBServer $serverObject

      It "returns 0 when succesfully installed" {
        $result | Should Be 0
      }

      It "calls verified mocks" {
        Assert-VerifiableMocks
      }
    }
  }
}
