@REM
@REM Copyright 2010-2018 Boxfuse GmbH
@REM
@REM Licensed under the Apache License, Version 2.0 (the "License");
@REM you may not use this file except in compliance with the License.
@REM You may obtain a copy of the License at
@REM
@REM         http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing, software
@REM distributed under the License is distributed on an "AS IS" BASIS,
@REM WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@REM See the License for the specific language governing permissions and
@REM limitations under the License.
@REM

@Echo off

setlocal

@REM Set the current directory to the installation directory
call :getCurrentBatch INSTALLDIR
set INSTALLDIR=%INSTALLDIR:~0,-10%

if exist "%INSTALLDIR%\jre\bin\java.exe" (
 set JAVA_CMD="%INSTALLDIR%\jre\bin\java.exe"
) else (
 @REM Use JAVA_HOME if it is set
 if "%JAVA_HOME%"=="" (
  set JAVA_CMD=java
 ) else (
  set JAVA_CMD="%JAVA_HOME%\bin\java.exe"
 )
)

SET CP=
IF DEFINED CLASSPATH ( SET CP=%CLASSPATH%;)

if "%JAVA_ARGS%"=="" (
  set JAVA_ARGS=
)

%JAVA_CMD% %JAVA_ARGS% -cp "%CP%%INSTALLDIR%\lib\*;%INSTALLDIR%\drivers\*" org.flywaydb.commandline.Main %*

@REM Exit using the same code returned from Java
EXIT /B %ERRORLEVEL%

:getCurrentBatch variableName
    set "%~1=%~f0"
    goto :eof