
import java.util.Scanner;

public class HowLong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= 3; i++) {
            int sum = 0;
            int x = sc.nextInt();
            for (int j = x; j <= n; j++) {
                if (arr[j] == 0) {
                    System.out.println(sum);
                    break;
                } else if (arr[j] == 1) {
                    sum++;
                }
                if (j == n) {
                    System.out.println(sum);
                }
            }
        }
    }
}
