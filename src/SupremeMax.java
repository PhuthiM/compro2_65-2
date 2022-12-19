
import java.util.Scanner;

public class SupremeMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] max1 = new int[n + 1];
        int count = 0;
        int max = 0;
        int startMax = 0;
        int lastMax = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] != 0) {
                startMax = i;
                for (int j = i; j <= n; j++) {
                    
                }
            }
        }

    }
}
