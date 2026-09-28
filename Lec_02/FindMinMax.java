/**
 * Problem: Find the Minimum and Maximum Element in an Array.
 *
 * Description:
 * Given an array of integers, find the smallest (minimum) and largest (maximum)
 * elements in a single traversal.
 *
 * Example:
 * Input: [5, 3, 9, 4]
 * Output: Minimum = 3, Maximum = 9
 *
 * Time Complexity: O(n) where n is the length of the array
 * Space Complexity: O(1) auxiliary space
 */
public class FindMinMax {

    /**
     * Immutable container to hold the minimum and maximum values.
     */
    public static class MinMaxResult {
        public final int min;
        public final int max;

        public MinMaxResult(int min, int max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public String toString() {
            return "Minimum = " + min + ", Maximum = " + max;
        }
    }

    /
     */
    public static MinMaxResult findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new MinMaxResult(min, max);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 4};

        System.out.print("Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        try {
            MinMaxResult result = findMinMax(arr);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
