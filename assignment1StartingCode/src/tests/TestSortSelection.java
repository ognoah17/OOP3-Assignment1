package tests;

import managers.SortManager;

/**
 * Test class for sorting shapes using Selection Sort.
 * 
 * @author NJobse
 */
public class TestSortSelection {
    public static void main(String[] args) {
        System.out.println("\nRunning Tests: Selection Sort (Using Comparable and Comparator)");
        // Test sorting by height using Comparable (compareTo method in Shape)
        System.out.println("\nSorting by Height:");
        runTest(new String[] {
                "-fres/shapes1.txt", // Load shapes from file
                "-Th", // Compare by height (natural order)
                "-Ss" // Sort using selection sort
        });
        // Test sorting by base area using Comparator
        System.out.println("\nSorting by Base Area:");
        runTest(new String[] {
                "-fres/shapes1.txt",
                "-Ta", // Compare by base area
                "-Ss" // Sort using selection sort
        });
        // Test sorting by volume using Comparator
        System.out.println("\nSorting by Volume:");
        runTest(new String[] {
                "-fres/shapes1.txt",
                "-Tv", // Compare by volume
                "-Ss" // Sort using selection sort
        });
    }

    /**
     * Runs a sorting test by initializing SortManager with the specified arguments.
     *
     * @param arguments Command-line arguments defining file input, comparison type,
     *                  and sorting method.
     */
    private static void runTest(String[] arguments) {
        new SortManager(arguments);
    }
}
