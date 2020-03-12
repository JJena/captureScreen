# captureScreen

Simple java project to take screenshot of your entire desktop for X duration in Y path at Z frequency

***************************************************************************************
This project helps you to take screenshot of your desktop in stealth/normal mode
You just need JDK 1.8 or above to run the attached JAR file
If you need more features, please use the source code to further optimize this project.
***************************************************************************************

Steps to follow:

1 - Download the attached JAR file

2 - From command prompt, run the command in below format:
	
	- javaw -jar screenCapture.jar <pathToStore> <duration in seconds> <frequency in seconds>

	- javaw -jar screenCapture.jar "C:\\Temp\\" 3600 60 (This will take screenshot for 1 hour every 1 minute and store in C:\Temp. Remember to use the double slashes)

3-  You can close the command prompt once you have run the above command. 

4-  If you want to abort the process for any reason, just kill javaw.exe process from Task Manager->Details

5 - If you don't need the hidden mode, just replace "javaw" with "java" in the above command.

6 - If you screen is partially captured, change the screen size multiplier in the source code (see the code comments)

![Alt text](/screenCapture/Untitled.jpg?raw=true "Screenshot1")
![Alt text](/screenCapture/Untitled3.jpg?raw=true "Screenshot2")
![Alt text](/screenCapture/Untitled2.jpg?raw=true "Screenshot3")


Thanks and happy snipping
