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
There is some fun stuff here still to be completed: Writting unit tests, Designing heuristics, Choosing and adapting well-known AI algorithms, Implementing gameplay, and so on. Of course, applying Scala to such a project is always a plus... Do you want to contribute ? Send me an email to ______
## Setting up your development environment
Currently the project is configured to be run with SBT virtual environment using Scala 2.12 and JDK 11 (TODO: Migrate to a openJDK platform)
### Steps
1. Clone the repository
``` bash
git clone https://github.com/fl3sc0b/whitechapelai.git 
```
2. Install SBT (https://www.scala-sbt.org/download.html)
3. Install JDK 11 (https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
4. Install IntelliJ IDEA Community Edition (https://www.jetbrains.com/idea)
