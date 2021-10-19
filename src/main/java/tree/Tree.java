package tree;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * This class is responsible for implmenting a simplified version of the MS-DOS tree command
 * which is responsible for printing out all of the files present within a specified directory
 * in a tree-like manner.
 */

public class Tree {

    /**
     * Ouputs files within a subdirecty in a hiearchial fashion.
     * @param file the file object to list all sub directories
     * @param level the level of the root file in the print tree
     */
    public static void printTree(File file, int level) {
        if (file.exists() == false) {
            System.out.println("find: " + file.getName() +  " : No such file or directory");
            return;
        } // if

        // Base case: files is not a directory
        if (file.isDirectory() == false) {
            System.out.println(level + " " + file.getName());
            return;
        } // if

        // Recursive case
        System.out.println(level + " " +  file.getName());
        Arrays.stream(file.listFiles()).forEach(e -> printTree(e, level + 1));
    } // printTree

    /**
     * The entry point into the program.
     */
    public static void main(String[] args)  {
        // Use the current directory if no args are specified
        if (args.length == 0) {
            args = new String[] {"."};
        } // if

        // Debugging: Check if args work correctly
        String argInput = Arrays.stream(args).collect(Collectors.joining(", ", "[", "]"));
        System.out.println("args: " + argInput);

        // Display the subdirectories of all arguments specified
        Arrays.stream(args).map(e -> new File(e))
            .forEach(e -> printTree(e, 0));
    } // main
} // Tree
