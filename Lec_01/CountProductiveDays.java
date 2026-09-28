import java.util.Scanner;

/**
 * Problem: Count Productive Days
 *
 * Description:
 * Given 'n' days of working/study hours or scores, a day is considered
 * productive if the value is at least 10 and is an even number (a >= 10 && a % 2 == 0).
 * Count the total number of such productive days.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class CountProductiveDays {

    /**
     * Checks if a day's metric qualifies as productive.
     *
     * @param score the score/hours for the day
     * @return true if productive, false otherwise
     */
    public static boolean isProductive(int score) {
        return score >= 10 && score % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of days (n): ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input!");
            sc.close();
            return;
        }

        int n = sc.nextInt();
        int productiveCount = 0;

        System.out.println("Enter the scores/hours for each of the " + n + " days:");
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            if (isProductive(score)) {
                productiveCount++;
            }
        }

        System.out.println("Total Productive Days: " + productiveCount);
        sc.close();
    }
}
