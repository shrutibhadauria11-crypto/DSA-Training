import java.util.Scanner;

/**
 * Problem: Reverse an integer using a while loop.
 *
 * Example:
 * Input: 5439
 * Output: 9345
 *
 * Time Complexity: O(log10(n))
 * Space Complexity: O(1)
 */
public class ReverseNumber {

    /**
     * Reverses the digits of an integer n.
     *
     * @param n the integer to reverse
     * @return reversed integer
     */
    public static int reverse(int n) {
        int sign = (n < 0) ? -1 : 1;
        n = Math.abs(n);
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            // Check for potential overflow before multiplying
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                throw new ArithmeticException("Integer overflow while reversing digits.");
            }
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return sign * reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer to reverse: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            sc.close();
            return;
        }

        int number = sc.nextInt();
        try {
            int result = reverse(number);
            System.out.println("Reversed number: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
