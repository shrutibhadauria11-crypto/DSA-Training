/**
 * Problem: Array Traversal
 *
 * Description:
 * Traverse and print all elements of an integer array.
 * Demonstrates standard for-loop (indexed) and enhanced for-each loop traversal.
 *
 * Time Complexity: O(n) where n is the number of elements in the array
 * Space Complexity: O(1) auxiliary space
 */
public class ArrayTraversal {

    /**
     * Prints array elements using traditional index-based iteration.
     *
     * @param arr the array to traverse
     */
    public static void printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        System.out.print("Array elements (indexed traversal): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println();
    }

    /**
     * Prints array elements using an enhanced for-each loop.
     *
     * @param arr the array to traverse
     */
    public static void printArrayForEach(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        System.out.print("Array elements (for-each traversal): ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        System.out.println("Traversing array of size: " + arr.length);
        printArray(arr);
        printArrayForEach(arr);
    }
}
