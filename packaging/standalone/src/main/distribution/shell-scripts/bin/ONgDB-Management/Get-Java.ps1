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
Retrieves information about Java on the local machine to start ONgDB programs

.DESCRIPTION
Retrieves information about Java on the local machine to start ONgDB services and utilities, tailored to the type of ONgDB edition

.PARAMETER ONgDBServer
An object representing a valid ONgDB Server object

.PARAMETER ForServer
Retrieve the Java command line to start a ONgDB Server

.PARAMETER ForUtility
Retrieve the Java command line to start a ONgDB utility such as ONgDB Shell.

.PARAMETER StartingClass
The name of the starting class when invoking Java

.EXAMPLE
Get-Java -ONgDBServer $serverObject -ForServer

Retrieves the Java command line to start the ONgDB server for the instance in $serverObject.

.OUTPUTS
System.Collections.Hashtable

.NOTES
This function is private to the powershell module

#>
function Get-Java
{
  [CmdletBinding(SupportsShouldProcess = $false,ConfirmImpact = 'Low',DefaultParameterSetName = 'Default')]
  param(
    [Parameter(Mandatory = $true,ValueFromPipeline = $false,ParameterSetName = 'UtilityInvoke')]
    [Parameter(Mandatory = $true,ValueFromPipeline = $false,ParameterSetName = 'ServerInvoke')]
    [pscustomobject]$ONgDBServer

    ,[Parameter(Mandatory = $true,ValueFromPipeline = $false,ParameterSetName = 'ServerInvoke')]
    [switch]$ForServer

    ,[Parameter(Mandatory = $true,ValueFromPipeline = $false,ParameterSetName = 'UtilityInvoke')]
    [switch]$ForUtility

    ,[Parameter(Mandatory = $true,ValueFromPipeline = $false,ParameterSetName = 'UtilityInvoke')]
    [string]$StartingClass
  )

  begin
  {
  }

  process
  {
    $javaPath = ''
    $javaCMD = ''

    $EnvJavaHome = Get-ONgDBEnv 'JAVA_HOME'
    $EnvClassPrefix = Get-ONgDBEnv 'CLASSPATH_PREFIX'

    # Is JAVA specified in an environment variable
    if (($javaPath -eq '') -and ($EnvJavaHome -ne $null))
    {
      $javaPath = $EnvJavaHome
      # Modify the java path if a JRE install is detected
      if (Test-Path -Path "$javaPath\jre\bin\java.exe") { $javaPath = "$javaPath\jre" }
    }

    # Attempt to find Java in registry
    $regKey = 'Registry::HKLM\SOFTWARE\JavaSoft\Java Runtime Environment'
    if (($javaPath -eq '') -and (Test-Path -Path $regKey))
    {
      $regJavaVersion = ''
      try
      {
        $regJavaVersion = [string](Get-ItemProperty -Path $regKey -ErrorAction 'Stop').CurrentVersion
        if ($regJavaVersion -ne '')
        {
          $javaPath = [string](Get-ItemProperty -Path "$regKey\$regJavaVersion" -ErrorAction 'Stop').JavaHome
        }
      }
      catch
      {
        #Ignore any errors
        $javaPath = ''
      }
    }

    # Attempt to find Java in registry (32bit Java on 64bit OS)
    $regKey = 'Registry::HKLM\SOFTWARE\Wow6432Node\JavaSoft\Java Runtime Environment'
    if (($javaPath -eq '') -and (Test-Path -Path $regKey))
    {
      $regJavaVersion = ''
      try
      {
        $regJavaVersion = [string](Get-ItemProperty -Path $regKey -ErrorAction 'Stop').CurrentVersion
        if ($regJavaVersion -ne '')
        {
          $javaPath = [string](Get-ItemProperty -Path "$regKey\$regJavaVersion" -ErrorAction 'Stop').JavaHome
        }
      }
      catch
      {
        #Ignore any errors
        $javaPath = ''
      }
    }

    # Attempt to find Java in the search path
    if ($javaPath -eq '')
    {
      $javaExe = (Get-Command 'java.exe' -ErrorAction SilentlyContinue)
      if ($javaExe -ne $null)
      {
        $javaCMD = $javaExe.Path
        $javaPath = Split-Path -Path $javaCMD -Parent
      }
    }

    if ($javaPath -eq '') { Write-Error "Unable to determine the path to java.exe"; return $null }
    if ($javaCMD -eq '') { $javaCMD = "$javaPath\bin\java.exe" }
    if (-not (Test-Path -Path $javaCMD)) { Write-Error "Could not find java at $javaCMD"; return $null }

    Write-Verbose "Java detected at '$javaCMD'"

    $javaVersion = Get-JavaVersion -Path $javaCMD
    if (-not $javaVersion.isValid) { Write-Error "This instance of Java is not supported"; return $null }

    # Shell arguments for the ONgDBServer and Arbiter classes
    $ShellArgs = @()
    if ($PsCmdlet.ParameterSetName -eq 'ServerInvoke')
    {
      $serverMainClass = 'org.neo4j.server.enterprise.EnterpriseEntryPoint'
      if ($ONgDBServer.ServerType -eq 'Community') { $serverMainClass = 'org.neo4j.server.CommunityEntryPoint' }
      if ($ONgDBServer.DatabaseMode.ToUpper() -eq 'ARBITER') { $serverMainClass = 'org.neo4j.server.enterprise.ArbiterEntryPoint' }

      if ($serverMainClass -eq '') { Write-Error "Unable to determine the Server Main Class from the server information"; return $null }

      # Build the Java command line
      $ClassPath = "$($ONgDBServer.Home)/lib/*;$($ONgDBServer.Home)/plugins/*"
      $ShellArgs = @("-cp `"$($ClassPath)`"" `
          ,'-server' `
          ,'-Dlog4j.configuration=file:conf/log4j.properties' `
          ,'-Dneo4j.ext.udc.source=zip-powershell' `
          ,'-Dorg.neo4j.cluster.logdirectory=data/log' `
        )

      # Parse Java config settings - Heap initial size
      $option = (Get-ONgDBSetting -Name 'dbms.memory.heap.initial_size' -ONgDBServer $ONgDBServer)
      if ($option -ne $null) {
        $mem = "$($option.Value)"
        if ($mem -notmatch '[\d]+[gGmMkK]') {
          $mem += "m"
          Write-Warning @"
WARNING: dbms.memory.heap.initial_size will require a unit suffix in a
         future version of ONgDB. Please add a unit suffix to your
         configuration. Example:

         dbms.memory.heap.initial_size=512m
                                          ^
"@
        }
        $ShellArgs += "-Xms$mem"
      }

      # Parse Java config settings - Heap max size
      $option = (Get-ONgDBSetting -Name 'dbms.memory.heap.max_size' -ONgDBServer $ONgDBServer)
      if ($option -ne $null) {
        $mem = "$($option.Value)"
        if ($mem -notmatch '[\d]+[gGmMkK]') {
          $mem += "m"
          Write-Warning @"
WARNING: dbms.memory.heap.max_size will require a unit suffix in a
         future version of ONgDB. Please add a unit suffix to your
         configuration. Example:

         dbms.memory.heap.max_size=512m
                                      ^
"@
        }
        $ShellArgs += "-Xmx$mem"
      }

      # Parse Java config settings - Explicit
      $option = (Get-ONgDBSetting -Name 'dbms.jvm.additional' -ONgDBServer $ONgDBServer)
      if ($option -ne $null) { $ShellArgs += $option.value }

      # Parse Java config settings - GC
      $option = (Get-ONgDBSetting -Name 'dbms.logs.gc.enabled' -ONgDBServer $ONgDBServer)
      if (($option -ne $null) -and ($option.value.ToLower() -eq 'true')) {
        if ($javaVersion.isJava8) {
          # JAVA 8 GC logs configuration
          $ShellArgs += "-Xloggc:`"$($ONgDBServer.LogDir)/gc.log`""

          $option = (Get-ONgDBSetting -Name 'dbms.logs.gc.options' -ONgDBServer $ONgDBServer)
          if ($option -eq $null) {
            $ShellArgs += @('-XX:+PrintGCDetails',
            '-XX:+PrintGCDateStamps',
            '-XX:+PrintGCApplicationStoppedTime',
            '-XX:+PrintPromotionFailure',
            '-XX:+PrintTenuringDistribution',
            '-XX:+UseGCLogFileRotation')
          } else {
            # The GC options _should_ be space delimited
            $ShellArgs += ($option.value -split ' ')
          }

          $option = (Get-ONgDBSetting -Name 'dbms.logs.gc.rotation.size' -ONgDBServer $ONgDBServer)
          if ($option -ne $null) {
            $ShellArgs += "-XX:GCLogFileSize=$( $option.value )"
          } else {
            $ShellArgs += "-XX:GCLogFileSize=20m"
          }

          $option = (Get-ONgDBSetting -Name 'dbms.logs.gc.rotation.keep_number' -ONgDBServer $ONgDBServer)
          if ($option -ne $null) {
            $ShellArgs += "-XX:NumberOfGCLogFiles=$( $option.value )"
          } else {
            $ShellArgs += "-XX:NumberOfGCLogFiles=5"
          }
        } else {
          # JAVA 9 and newer GC logs configuration
          $option = (Get-ONgDBSetting -Name 'dbms.logs.gc.options' -ONgDBServer $ONgDBServer)
          if ($option -ne $null) {
            $gcOptions = $option.value
          } else {
            $gcOptions = '-Xlog:gc*,safepoint,age*=trace'
          }
          # GC file name should be escaped on Windows because of ':' usage as part of absolute name
          $gcFile = "\`"" + "$($ONgDBServer.LogDir)/gc.log" + "\`""
          $gcOptions += ":file=$( $gcFile )::"

          $option = (Get-ONgDBSetting -Name 'dbms.logs.gc.rotation.keep_number' -ONgDBServer $ONgDBServer)
          if ($option -ne $null) {
            $gcOptions += "filecount=$( $option.value )"
          } else {
            $gcOptions += "filecount=5"
          }

          $option = (Get-ONgDBSetting -Name 'dbms.logs.gc.rotation.size' -ONgDBServer $ONgDBServer)
          if ($option -ne $null) {
            $gcOptions += ",filesize=$( $option.value )"
          } else {
            $gcOptions += ",filesize=20m"
          }
          $ShellArgs += $gcOptions
        }
      }
      $ShellArgs += @("-Dfile.encoding=UTF-8",
      $serverMainClass,
      "--config-dir=`"$($ONgDBServer.ConfDir)`"",
      "--home-dir=`"$($ONgDBServer.Home)`"")
    }

    # Shell arguments for the utility classes e.g. Import, Shell
    if ($PsCmdlet.ParameterSetName -eq 'UtilityInvoke')
    {
      # Generate the commandline args
      $ClassPath = "$($ONgDBServer.Home)/lib/*;$($ONgDBServer.Home)/bin/*"
      # Augment with tools.jar if found
      if (Test-Path -Path "$EnvJavaHome\lib\tools.jar") { $ClassPath += ";$EnvJavaHome\lib\tools.jar" }

      $ShellArgs = @()
      $ShellArgs += @("-XX:+UseParallelGC",
      "-classpath `"$($EnvClassPrefix);$ClassPath`"",
      "-Dbasedir=`"$($ONgDBServer.Home)`"",`
           '-Dfile.encoding=UTF-8')

      # Determine user configured heap size.
      $HeapSize = Get-ONgDBEnv 'HEAP_SIZE'
      if ($HeapSize -ne $null) {
        $ShellArgs += "-Xmx$HeapSize"
        $ShellArgs += "-Xms$HeapSize"
      }

      # Add the starting class
      $ShellArgs += @($StartingClass)
    }

    Write-Output @{ 'java' = $javaCMD; 'args' = $ShellArgs }
  }

  end
  {
  }
}
