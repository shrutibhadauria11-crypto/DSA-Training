/**
 * Problem: Print all composite numbers from 1 to 100.
 *
 * Description:
 * A composite number is a positive integer greater than 1 that has at least
 * one divisor other than 1 and itself (i.e., not a prime number).
 * Note: 1 is neither prime nor composite.
 *
 * Time Complexity: O(N * sqrt(N))
 * Space Complexity: O(1)
 */
public class PrintCompositeNumbers {

    /**
     * Checks if a number is composite.
     *
     * @param n the number to check
     * @return true if composite, false otherwise
     */
    public static boolean isComposite(int n) {
        if (n <= 3) {
            return false; // 1 is neither; 2 and 3 are prime
        }

        // A number is composite if it has any divisor between 2 and sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Composite numbers between 1 and 100:");
        for (int n = 1; n <= 100; n++) {
            if (isComposite(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
