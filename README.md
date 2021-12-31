# TecVal


## Delete Quotes

This script needs 2 arguments:
|FilePath| FileName |
|--|--|
|Location of .txt register  |  Name of file register|
|C://user/Documents/|test-register.txt|

Example:
FilePath + FileName = **C://user/Documents/** **test-register.txt**
_________

## To execute: 

Windows
- Press Windows+R to open “Run” box. Type **“cmd**” and then click “OK” to open a regular Command Prompt.
- Go to project location, for example:

> cd C:\Users\User\Downloads\TecVal-master\src\tecval
> javac SeekAndDeleteChar.java
> cd ..
> java tecval.SeekAndDeleteChar C:\Users\User\Downloads\ file-name-register.txt

Linux
- Open a terminal window
- Go to project location: for example:

> cd /home/user/project/RemoveChars/src/tecval
> javac SeekAndDeleteChar.java
> cd ..
> java tecval.SeekAndDeleteChar /home/user/downloads file-name-register.txt
_________

## Output file

This script generates a .txt file in a especific location, wich can be specified in the next line: 

For Windows:

    FileWriter writer = new FileWriter("C:\\Desktop\\outPutFile.txt");

For linux:

    FileWriter writer = new FileWriter("/home/desktop/outPutFile.txt");
