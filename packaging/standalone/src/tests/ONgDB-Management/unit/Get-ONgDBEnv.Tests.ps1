$here = Split-Path -Parent $MyInvocation.MyCommand.Path
$sut = (Split-Path -Leaf $MyInvocation.MyCommand.Path).Replace(".Tests.", ".")
$common = Join-Path (Split-Path -Parent $here) 'Common.ps1'
. $common

Import-Module "$src\ONgDB-Management.psm1"

InModuleScope ONgDB-Management {
  Describe "Get-ONgDBEnv" {

    It "should return null if env var does not exist" {
      Get-ONgDBEnv -Name 'somevariablenamethatdoesnotexist' | Should BeNullOrEmpty
    }

    $envPath = $Env:Path
    It "should return env var if name is lower case" {
      Get-ONgDBEnv -Name 'path' | Should Be $envPath
    }

    It "should return env var if name is uppercase case" {
      Get-ONgDBEnv -Name 'PATH' | Should Be $envPath
    }
  }
}
