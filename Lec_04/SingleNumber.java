import java.util.Scanner;

public class SingleNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans = ans ^ nums[i];
        }

        System.out.println("Single number: " + ans);

        sc.close();
    }
}
