    import java.util.Scanner;
     
    public class Solider{
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
     
            int k = sc.nextInt();
            int n = sc.nextInt();
            int w = sc.nextInt();
     
            int totalMoney = 0;
            int i = 1;
     
            while (i <= w) {
                totalMoney += i * k;
                i++;
            }
     
            if (totalMoney > n) {
                System.out.println(totalMoney - n);
            } else {
                System.out.println(0);
            }
        }
    }

