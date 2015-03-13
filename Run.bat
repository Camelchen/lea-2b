ECHO zip
msiexec /i I:\tmp\7z938.msi /quiet /qb

ECHO Notepad++
"%ProgramFiles%\Notepad++\uninstall.exe" /S
I:\tmp\npp.6.7.4.Installer.exe /S

ECHO pinyin
I:\tmp\GooglePinyinInstaller.exe /S

<<<<<<< HEAD
ECHO svn
msiexec /i I:\tmp\TortoiseSVN-1.8.10.26129-win32-svn-1.8.11.msi /quiet /qb
=======
>>>>>>> Init

ECHO protal
I:\tmp\openURL.js

ECHO jdk
I:\tmp\jdk-8u31-windows-i586.exe /s
