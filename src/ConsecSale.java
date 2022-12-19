
import java.util.Scanner;

public class ConsecSale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr1 = new int[n + 1];
        int k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            int x = sc.nextInt();
            if (x >= p && x < p + n && arr1[x - p + 1] == 0) {
                arr1[x - p + 1]++;
            }
        }
        int sum = 0;
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (arr1[i] == 0) {
                sum++;
                int count = 0;
                for (int j = i; j <= n; j++) {
                    if (arr1[j] == 0) {
                        count++;
                    } else {
                        if (count > max) {
                            max = count;
                        }
                        break;
                    }
                }

            }

        }
        System.out.println(sum);
        System.out.println(max);
    }
}
