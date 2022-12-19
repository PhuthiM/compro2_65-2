
import java.util.Scanner;

public class TrainTicker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int p = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            boolean check = true;
            for (int j = x; j < y; j++) {
                if (arr[j] + z > p) {
                    check = false;
                }
            }
            if (!check) {
                System.out.println("N");
            } else {
                for (int j = x; j < y; j++) {
                    arr[j] += z;
                }
                System.out.println("Y");
            }
        }
    }
}
