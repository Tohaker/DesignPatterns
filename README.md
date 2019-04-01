# Design Patterns in Java

This repository contains the examples created whilst watching the 
[Design Patterns in Java: Creational](https://app.pluralsight.com/library/courses/design-patterns-java-creational/table-of-contents)
course on Pluralsight. 

Import the Gradle dependencies first, to make sure all necessary libraries are installed. 
Each package in the [java](java) folder contains detailed instructions on how the pattern is used.

## Run an example

You can run any Demo file within this project with the following gradle command:
```$xslt
gradlew clean build -PmainClass=com.pluralsight.singleton.DbSingletonDemo run
```
Where the `-PmainClass` argument should be replaced by the location of Demo file. This will not work if you give Gradle
a file without a `main` method.