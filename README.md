# Welcome to Sorting Algorithms

## What is this?

This is a project to implement common sorting algorithms using Java.

The source files contain a Driver class that is used to run the currently implemented algorithms to test their functionality (automated via github actions). The source also contains hr.sortingalgorithms package. This package has SortingAlgorithm interface that every sorting algorithm class must implement.

To compile the project use the make command. This will produce a build folder that contains the .class files and the package directory structure. Additionally, a jar file will also be generated. To run your compiled program, simply use `java -jar build/SortingAlgorithms.jar`

## How to contribute?

Contributing is extremely easy! Fork the repository and create a new sorting algorithm class inside the package. Make sure to implement the required SortingAlgorithm interface. Once you are done writing down you algorithm, don't forget to update the driver program to check your algorithms functionality. If everything works well, send a pull request and wait :)
