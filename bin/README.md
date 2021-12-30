
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

Press Windows+R to open “Run” box. Type **“cmd**” and then click “OK” to open a regular Command Prompt.
> java -classpath /location/TecVal/RemoveChars/bin tecval.SeekAndDeleteChar /home/rvargas/Documentos/ prueba.txt
_________

## Output file

This script generates a .txt file in a especific location, wich can be specified in the next line: 

    FileWriter writer = new FileWriter("/outPutLocation/outPutFile.txt");

