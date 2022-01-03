# TecVal


## Eliminar comillas

Este script requiere 2 argumentos:
|FilePath| FileName |
|--|--|
|Ubicacion del archivo .txt  |  Nombre del archivo .txt|
|C:\\user\\Documents\\ | test-register.txt|

Ejemplo:
FilePath + FileName = **C:\\user\\Documents\\** **test-register.txt**
_________

## Para ejecutar: 

Windows
- Combinar Windows+R para abrir la ventana “Run”. Ingresar **“cmd**” y click en “OK” para abrir una consola de comandos.

Ejemplo:

> cd C:\Users\User\Downloads\TecVal-master\src\tecval
> 
> javac SeekAndDeleteChar.java
> 
> cd ..
> 
> java tecval.SeekAndDeleteChar C:\Users\User\Downloads\ file-name-register.txt
---------
Linux
- Abrir una terminal, Ctrl+Alt+T

Ejemplo:

> cd /home/user/project/RemoveChars/src/tecval
> 
> javac SeekAndDeleteChar.java
> 
> cd ..
> 
> java tecval.SeekAndDeleteChar /home/user/downloads file-name-register.txt
_________

## Archivo de salida
Este script genera un archivo .txt en una ubicacion especifica, la cual podra ser aclarada en la siguiente linea: 

Para Windows:

    FileWriter writer = new FileWriter("C:\\Desktop\\outPutFile.txt");

Para linux:

    FileWriter writer = new FileWriter("/home/desktop/outPutFile.txt");
