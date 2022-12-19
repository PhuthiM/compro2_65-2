
import java.util.Scanner;

public class Cumulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n + 1];
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            for (int j = x; j <= y; j++) {
                ar[j] += z;
            }
            for (int j = 1; j < n; j++) {
                System.out.print(ar[j] + " ");
            }
            System.out.println("");
        }
    }
}
