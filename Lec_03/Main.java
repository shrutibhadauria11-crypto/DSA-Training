import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int temp = n;
            int place = 1;
            int count = 0;
 
            while (temp > 0) {
                int digit = temp % 10;
 
                if (digit != 0) {
                    count++;
                }
 
                temp /= 10;
            }
 
            System.out.println(count);
 
            temp = n;
            place = 1;
 
            while (temp > 0) {
                int digit = temp % 10;
 
                if (digit != 0) {
                    System.out.print(digit * place + " ");
                }
 
                temp /= 10;
                place *= 10;
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}