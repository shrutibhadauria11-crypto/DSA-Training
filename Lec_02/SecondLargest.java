/**
 * Problem: Find the Second Largest Element in an Array.
 *
 * Description:
 * Given an integer array, find the second largest distinct element in a single pass.
 * If all elements are equal or the array has fewer than 2 distinct elements,
 * report that no second largest element exists.
 *
 * Example:
 * Input: [10, 20, 30, 40]
 * Output: Largest = 40, Second Largest = 30
 *
 * Input: [40, 40, 20, 10]
 * Output: Largest = 40, Second Largest = 20
 *
 * Time Complexity: O(n) single pass
 * Space Complexity: O(1) auxiliary space
 */
public class SecondLargest {

    /**
     * Finds the second largest distinct element in the array.
     *
     * @param arr the input array
     * @return the second largest distinct element
     * @throws IllegalArgumentException if no second largest element exists
     */
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No distinct second largest element found (all elements might be identical).");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        try {
            int secondLargest = findSecondLargest(arr);
            System.out.println("Second Largest Element = " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Additional demonstration with duplicate max and descending order
        int[] arr2 = {40, 40, 30, 20, 10};
        System.out.print("\nArray 2 (with duplicates): ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
        try {
            int secondLargest2 = findSecondLargest(arr2);
            System.out.println("Second Largest Element = " + secondLargest2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
