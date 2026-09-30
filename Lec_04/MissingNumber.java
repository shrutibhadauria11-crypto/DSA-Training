import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = n * (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            sum = sum - nums[i];
        }

        System.out.println("Missing number: " + sum);

        sc.close();
    }
}