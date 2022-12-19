
import java.util.Scanner;

public class CondoSale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr1 = new int[n + 1];
        int k = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= k; i++) {
            int x = sc.nextInt();
            if (x >= p && x < p + n && arr1[x - p + 1] == 0) { 
                sum++;
                arr1[x - p + 1]++;
            }
        }
        System.out.println(sum);
        for (int i = 1; i <= n; i++) {
            if (arr1[i] != 0) {
                System.out.println(i + p - 1);
            }
        }
    }
}
