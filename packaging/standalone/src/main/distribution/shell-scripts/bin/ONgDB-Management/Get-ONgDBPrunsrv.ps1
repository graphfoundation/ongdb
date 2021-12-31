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

# Copyright (c) 2002-2018 "Neo4j,"
# Neo4j Sweden AB [http://neo4j.com]
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


<#
.SYNOPSIS
Retrieves information about PRunSrv on the local machine to start ONgDB programs

.DESCRIPTION
Retrieves information about PRunSrv (Apache Commons Daemon) on the local machine to start ONgDB services and utilities, tailored to the type of ONgDB edition

.PARAMETER ONgDBServer
An object representing a valid ONgDB Server object

.PARAMETER ForServerInstall
Retrieve the PrunSrv command line to install a ONgDB Server

.PARAMETER ForServerUninstall
Retrieve the PrunSrv command line to uninstall a ONgDB Server

.PARAMETER ForServerUpdate
Retrieve the PrunSrv command line to update a ONgDB Server

.PARAMETER ForConsole
Retrieve the PrunSrv command line to start a ONgDB Server in the console.

.OUTPUTS
System.Collections.Hashtable

.NOTES
This function is private to the powershell module

#>
function Get-ONgDBPrunsrv
{
  [CmdletBinding(SupportsShouldProcess = $false,ConfirmImpact = 'Low',DefaultParameterSetName = 'ConsoleInvoke')]
  param(
    [Parameter(Mandatory = $true,ValueFromPipeline = $false)]
    [pscustomobject]$ONgDBServer

    ,[Parameter(Mandatory = $true,ValueFromPipeline = $false,ParameterSetName = 'ServerInstallInvoke')]
    [switch]$ForServerInstall

    ,[Parameter(Mandatory = $true,ValueFromPipeline = $false,ParameterSetName = 'ServerUninstallInvoke')]
    [switch]$ForServerUninstall

    ,[Parameter(Mandatory = $true,ValueFromPipeline = $false,ParameterSetName = 'ServerUpdateInvoke')]
    [switch]$ForServerUpdate

    ,[Parameter(Mandatory = $true,ValueFromPipeline = $false,ParameterSetName = 'ServerStartInvoke')]
    [switch]$ForServerStart

    ,[Parameter(Mandatory = $true,ValueFromPipeline = $false,ParameterSetName = 'ServerStopInvoke')]
    [switch]$ForServerStop

    ,[Parameter(Mandatory = $true,ValueFromPipeline = $false,ParameterSetName = 'ConsoleInvoke')]
    [switch]$ForConsole
  )

  begin
  {
  }

  process
  {
    $JavaCMD = Get-Java -ONgDBServer $ONgDBServer -ForServer -ErrorAction Stop
    if ($JavaCMD -eq $null)
    {
      Write-Error 'Unable to locate Java'
      return 255
    }

    # JVMDLL is in %JAVA_HOME%\bin\server\jvm.dll
    $JvmDLL = Join-Path -Path (Join-Path -Path (Split-Path $JavaCMD.java -Parent) -ChildPath 'server') -ChildPath 'jvm.dll'
    if (-not (Test-Path -Path $JvmDLL)) { throw "Could not locate JVM.DLL at $JvmDLL" }

    # Get the Service Name
    $Name = Get-ONgDBWindowsServiceName -ONgDBServer $ONgDBServer -ErrorAction Stop

    # Find PRUNSRV for this architecture
    # This check will return the OS architecture even when running a 32bit app on 64bit OS
    switch ((Get-WmiObject -Class Win32_Processor | Select-Object -First 1).Addresswidth) {
      32 { $PrunSrvName = 'prunsrv-i386.exe' } # 4 Bytes = 32bit
      64 { $PrunSrvName = 'prunsrv-amd64.exe' } # 8 Bytes = 64bit
      default { throw "Unable to determine the architecture of this operating system (Integer is $([IntPtr]::Size))" }
    }
    $PrunsrvCMD = Join-Path (Join-Path -Path (Join-Path -Path $ONgDBServer.Home -ChildPath 'bin') -ChildPath 'tools') -ChildPath $PrunSrvName
    if (-not (Test-Path -Path $PrunsrvCMD)) { throw "Could not find PRUNSRV at $PrunsrvCMD" }

    # Build the PRUNSRV command line
    switch ($PsCmdlet.ParameterSetName) {
      "ServerInstallInvoke" {
        $PrunArgs += @("`"//IS//$($Name)`"")
      }
      "ServerUpdateInvoke" {
        $PrunArgs += @("`"//US//$($Name)`"")
      }
      { @("ServerInstallInvoke","ServerUpdateInvoke") -contains $_ } {

        $JvmOptions = @()

        Write-Verbose "Reading JVM settings from configuration"
        # Try ongdb.conf first, but then fallback to ongdb-wrapper.conf for backwards compatibility reasons
        $setting = (Get-ONgDBSetting -ConfigurationFile 'ongdb.conf' -Name 'dbms.jvm.additional' -ONgDBServer $ONgDBServer)
        if ($setting -eq $null) {
          $setting = (Get-ONgDBSetting -ConfigurationFile 'ongdb-wrapper.conf' -Name 'dbms.jvm.additional' -ONgDBServer $ONgDBServer)
        }

        if ($setting -ne $null) {
          # Procrun expects us to split each option with `;` if these characters are used inside the actual option values
          # that will cause problems in parsing. To overcome the problem, we need to escape those characters by placing
          # them inside single quotes.
          $settingsEscaped = @()
          foreach ($option in $setting.value) {
            $settingsEscaped += $option -replace "([;])",'''$1'''
          }

          $JvmOptions = [array](Merge-ONgDBJavaSettings -Source $JvmOptions -Add $settingsEscaped)
        }

        # Pass through appropriate args from Java invocation to Prunsrv
        # These options take priority over settings in the wrapper
        Write-Verbose "Reading JVM settings from console java invocation"
        $cmdSettings = ($JavaCMD.args | Where-Object { $_ -match '(^-D|^-X)' } | % { $_ -replace "([;])",'''$1''' })
        $JvmOptions = [array](Merge-ONgDBJavaSettings -Source $JvmOptions -Add $cmdSettings)

        $PrunArgs += @("`"--StartMode=jvm`"",
          "`"--StartMethod=start`"",
          "`"--StartPath=$($ONgDBServer.Home)`"",
          "`"--StartParams=--config-dir=$($ONgDBServer.ConfDir)`"",
          "`"++StartParams=--home-dir=$($ONgDBServer.Home)`"",
          "`"--StopMode=jvm`"",
          "`"--StopMethod=stop`"",
          "`"--StopPath=$($ONgDBServer.Home)`"",
          "`"--Description=ONgDB Graph Database - $($ONgDBServer.Home)`"",
          "`"--DisplayName=ONgDB Graph Database - $Name`"",
          "`"--Jvm=$($JvmDLL)`"",
          "`"--LogPath=$($ONgDBServer.LogDir)`"",
          "`"--StdOutput=$(Join-Path -Path $ONgDBServer.LogDir -ChildPath 'ongdb.log')`"",
          "`"--StdError=$(Join-Path -Path $ONgDBServer.LogDir -ChildPath 'service-error.log')`"",
          "`"--LogPrefix=ongdb-service`"",
          "`"--Classpath=lib/*;plugins/*`"",
          "`"--JvmOptions=$($JvmOptions -join ';')`"",
          "`"--Startup=auto`""
        )

        # Check if Java invocation includes Java memory sizing
        $JavaCMD.args | ForEach-Object -Process {
          if ($Matches -ne $null) { $Matches.Clear() }
          if ($_ -match '^-Xms([\d]+)m$') {
            $PrunArgs += "`"--JvmMs`""
            $PrunArgs += "`"$($matches[1])`""
            Write-Verbose "Use JVM Start Memory of $($matches[1]) MB"
          }
          if ($Matches -ne $null) { $Matches.Clear() }
          if ($_ -match '^-Xmx([\d]+)m$') {
            $PrunArgs += "`"--JvmMx`""
            $PrunArgs += "`"$($matches[1])`""

            Write-Verbose "Use JVM Max Memory of $($matches[1]) MB"
          }
        }

        $serverMainClass = 'org.neo4j.server.enterprise.EnterpriseEntryPoint'
        if ($ONgDBServer.ServerType -eq 'Community') { $serverMainClass = 'org.neo4j.server.CommunityEntryPoint' }
        if ($ONgDBServer.DatabaseMode.ToUpper() -eq 'ARBITER') { $serverMainClass = 'org.neo4j.server.enterprise.ArbiterEntryPoint' }
        $PrunArgs += @("`"--StopClass=$($serverMainClass)`"",
          "`"--StartClass=$($serverMainClass)`"")
      }
      "ServerUninstallInvoke" { $PrunArgs += @("`"//DS//$($Name)`"") }
      "ServerStartInvoke" { $PrunArgs += @("`"//ES//$($Name)`"") }
      "ServerStopInvoke" { $PrunArgs += @("`"//SS//$($Name)`"") }
      "ConsoleInvoke" { $PrunArgs += @("`"//TS//$($Name)`"") }
      default {
        throw "Unknown ParameterSetName $($PsCmdlet.ParameterSetName)"
        return $null
      }
    }

    Write-Output @{ 'cmd' = $PrunsrvCMD; 'args' = $PrunArgs }
  }

  end
  {
  }
}
