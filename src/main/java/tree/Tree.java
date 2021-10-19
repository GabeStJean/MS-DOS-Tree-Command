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
     */
    public static void printTree(File file) {

    } // printTree

    /**
     * The entry point into the program.
     */
    public static void main(String[] args)  {
        if (args.length == 0) {
            args = new String[] {"."};
        } // if

        // Debugging: Check if args work correctly
        String argInput = Arrays.stream(args).collect(Collectors.joining(", ", "[", "]"));
        System.out.println("args: " + argInput);
    } // main
} // Tree
