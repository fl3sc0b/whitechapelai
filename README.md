# whitechapelai
An AI-engine to play the board game _"Letters from Whitechapel"_ in the role of Jack. Written 100% in the Scala language. Collaborations are accepted !!
## Project description
whitechapelai is an artificial intelligence engine to play the board game _"Letters from Whitechapel"_ (written by Gabriele Mari and Gianluca Santoprietro) in the role of Jack. _"Letters from Whitechapel"_ is an asymettrical game that includes hidden movement and important strategic and tactical components while keeps a set of minimalist rules. Designing a computer player able to defeat the human players represents a true challenge for a developer!
Also, part of this project is about experimentation with the Scala language. An immediate choice for writting an AI-engine well might been Python or more generalist languages like C# or Java, but in this case I'm interested in seeing how the excellent expressiveness features of Scala may fit here.
## About _"Letters from Whitechapel"_
You can get more information about this master piece of board gaming in its official website: https://www.giochiunitiinternational.com/project/letters-from-whitechapel/

Order your copy today! Totally recommended!
## Current status
I'm looking for contributors to speed up the development a bit (see section below). Still, some progress has been made:
- Model for the board :heavy_check_mark:
- Jack to choose his hideout analytically :heavy_check_mark:
- Package set up for unit testing with Scalatest :heavy_check_mark:
- Package set up for metadocumentation with Scaladoc :heavy_check_mark:
- Wiki :construction:
- First part: Hell :construction:
## To contribute
There is some fun stuff here still to be completed: Writting unit tests, Designing heuristics, Choosing and adapting well-known AI algorithms, Implementing gameplay, and so on. Of course, applying Scala to such a project is always a plus... Do you want to contribute ? Send me an email to the email address below:

![my-email-address](https://user-images.githubusercontent.com/38964606/119236225-8c376200-bb36-11eb-8120-4d2eff7878df.png)

## Setting up your development environment
Currently the project is configured to be run with SBT virtual environment using Scala 2.12 and JDK 11 (TODO: Migrate to a openJDK platform)
### Steps
1. Clone the repository
``` bash
git clone https://github.com/fl3sc0b/whitechapelai.git 
```
2. Install SBT (https://www.scala-sbt.org/download.html).
3. Install JDK 11 (https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
4. Install IntelliJ IDEA Community Edition (https://www.jetbrains.com/idea).
5. Install Scala SDK and extensions for IntelliJ (Configure/Plugins).
6. Create new project. Select Scala and sbt project type.
7. In Location, select the path which contains the whitechapelai repo. Check that JDK and Scala versions are 11 and 2.12.11 respectively.
8. Wait while Sbt loads and sets up the environment.
9. Create a Run/Debug configuration for the main project. Select "Add Configuration" in the top bar, click on + to add a new one, and select "sbt Task".
10. Write "Run Whitechapelai" in the Name textbox. In the "Tasks" textbox, write "run" and click on "OK".
11. Click on "Run selected configuration" (the green play button in the top bar) and see if sbt is able to compile the project and run the main class.
12. Create a Run/Debug configuration for unit testing. Select "Edit Configurations" in the top bar, click on + to add a new one, and select "ScalaTest".
13. Write "Run Whitechapelai Test Suite" in the Name textbox. Select "All in package" for "Test kind" and "In whole project" for "Search the tests" comboboxes. Check that "whitechapelai" is marked as "Use classpath of module" combobox. Rembember to select JRE version 11 and press OK.
14. Select "Run Whitechapelai Test Suite" profile and click on "Run selected configuration" (the green play button in the top bar) and check if the entire set of tests provided pass successfully.
 
