
import java.util.Scanner;

public class NumReduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for (int i = 1; i <= q; i++) {
            int pos = sc.nextInt();
            int k = sc.nextInt();
            int start = pos - 2;
            int last = pos + 2;
            if (start <= 0) {
                start = 1;
            }
            if (last > n) {
                last = n;
            }
            for (int j = start; j <= last; j++) {
                if (arr[j] >= 0) {
                    arr[j] -= k;
                    if (arr[j] <= 0) {
                        arr[j] = 0;
                    }
                }
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("");
        }
    }
}
