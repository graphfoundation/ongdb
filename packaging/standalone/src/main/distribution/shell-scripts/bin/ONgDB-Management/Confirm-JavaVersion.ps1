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
Confirms whether the specificed java executable is suitable for ONgDB and checks if Java is Java 8

.DESCRIPTION
Confirms whether the specificed java executable is suitable for ONgDB and checks if Java is Java 8

.PARAMETER Path
Full path to the Java executable, java.exe

.EXAMPLE
Get-JavaVersion -Path 'C:\Program Files\Java\jre1.8.0_71\bin\java.exe'

Retrieves the Java version for 'C:\Program Files\Java\jre1.8.0_71\bin\java.exe'.

.OUTPUTS
System.Collections.Hashtable
isValid
isJava8

.NOTES
This function is private to the powershell module

#>
function Get-JavaVersion
{
  [CmdletBinding(SupportsShouldProcess = $false,ConfirmImpact = 'Low')]
  param(
    [Parameter(Mandatory = $true,ValueFromPipeline = $false)]
    [string]$Path
  )

  begin {
  }

  process {
    $result = Invoke-ExternalCommand -Command $Path -CommandArgs @('-version')

    # Check the output
    if ($result.exitCode -ne 0) {
      Write-Warning "Unable to determine Java Version"
      Write-Host $result.capturedOutput
      return @{ 'isValid' = $true; 'isJava8' = $true }
    }

    if ($result.capturedOutput.Count -eq 0) {
      Write-Verbose "Java did not output version information"
      Write-Warning "Unable to determine Java Version"
      return @{ 'isValid' = $true; 'isJava8' = $true }
    }

    $javaHelpText = "* Please use Oracle(R) Java(TM) 8, OpenJDK(TM) or IBM J9 to run ONgDB Server.`n" +
            "* Please see https://graphfoundation.org/ongdb/docs/ for ONgDB installation instructions."

    # Read the contents of the redirected output
    $content = $result.capturedOutput -join "`n`r"

    # Use a simple regular expression to extract the java version
    Write-Verbose "Java version response: $content"
    if ($matches -ne $null) { $matches.Clear() }
    if ($content -match 'version \"(.+)\"') {
      $javaVersion = $matches[1]
      Write-Verbose "Java Version detected as $javaVersion"
    } else {
      Write-Verbose "Could not determine the Java Version"
      Write-Warning "Unable to determine Java Version"
      return @{ 'isValid' = $true; 'isJava8' = $true }
    }

    # Check for Java Version Compatibility
    # Anything less than Java 1.8 will block execution
    # Note - This text comparison will fail for '1.10.xxx' due to how string based comparisons of numbers works.
    if ($javaVersion -lt '1.8') {
      Write-Warning "ERROR! ONgDB cannot be started using java version $($javaVersion)"
      Write-Warning $javaHelpText
      return @{ 'isValid' = $false; 'isJava8' = $false }
    }
    # Anything less then 1.9 is some Java 1.8 version
    $isJava8 = $javaVersion -lt '1.9'

    # Check for Java Edition
    $regex = '(Java HotSpot\(TM\)|OpenJDK|IBM) (64-Bit Server|Server|Client|J9) VM'
    if (-not ($content -match $regex)) {
      Write-Warning "WARNING! You are using an unsupported Java runtime"
      Write-Warning $javaHelpText
    }

    Write-Output @{ 'isValid' = $true; 'isJava8' = $isJava8 }
  }

  end {
  }
}
