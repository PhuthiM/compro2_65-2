
import java.util.Scanner;

public class LandPurchase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean check = false;
        for (int i = 1; i <= k; i++) {
            
        int sum = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            int start = y - (x / 2);
            int end = y + (x / 2);
            if (start <= 0 || end > n) {
                check = true;
            } else {
                for (int j = start; j <= end; j++) {
                    sum += ar[j];
                    check = false;
                }
            }
            if (check) {
                System.out.println("no");
            } else {
                System.out.println(sum);
            }
        }
    }
}
