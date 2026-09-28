import java.util.Scanner;

/**
 * Problem: Check whether a given integer is Prime or Not Prime.
 *
 * Description:
 * A prime number is a natural number greater than 1 that has no positive
 * divisors other than 1 and itself.
 *
 * Time Complexity: O(sqrt(n))
 * Space Complexity: O(1)
 */
public class CheckPrime {

    /**
     * Checks if a number is prime using the O(sqrt(n)) trial division method.
     *
     * @param n the number to test
     * @return true if prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        // Test factors of form 6k +/- 1 up to sqrt(n)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            sc.close();
            return;
        }

        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }

        sc.close();
    }
}
