ECHO zip
msiexec /i M:\tmp\7z938.msi /quiet /qb

ECHO Notepad++
"%ProgramFiles%\Notepad++\uninstall.exe" /S
M:\tmp\npp.6.7.4.Installer.exe /S

ECHO pinyin
M:\tmp\GooglePinyinInstaller.exe /S

ECHO Beyond Compare
M:\tmp\BCompare-4.0.7.19761.exe /silent

ECHO protal
M:\tmp\openURL.js

ECHO jdk
M:\tmp\jdk-8u40-windows-i586.exe /s

ECHO Git
M:\tmp\Git\Git-1.9.5-preview20141217.exe /silent

msiexec /i M:\tmp\Git\GitExtensions-2.48.03-SetupComplete.msi /quiet /qb

M:\tmp\Git\heroku-toolbelt.exe /silent


ECHO Portable tools
XCOPY /s M:\Portable\*.* "C:\Documents and Settings\ContEd Student\Desktop\"