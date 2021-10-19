# MS-DOS Tree Command

## Description
This project serves to implement the [tree](https://en.wikipedia.org/wiki/Tree_(command)) command that originated on the MS-DOS system. \

## Objective
This project highlights my skills with recursion in the implementation of a simplified MS-DOS tree command.\
This is demonstrated when I used recursion to display all files within a given directory and its sub \
subdirectories.

## Compiling and Execution
### Execute the program via Maven
   1) Configure lines 17 and 18 in the  pom.xml to work with your machines version of java
   2) Navigate to `tree` directory
   3) Compile using the phase `mvn compile`
   4) Execute progam using `mvn exec:java -Dexec.mainClass="tree.Tree"`and add arguments using \
    `-Dexec.args` option (e.g., `-Dexec.args="src target"`).

### Execute the program traditionally
   1) Compile the driver code using `javac -d target/classes src/main/java/tree/Tree.java`
   2) Execute progtam using `java -cp target/classes tree.Tree` with arguments consisting of \
      names of files (e.g. `java -cp target/classes tree.Tree src target`).