
import java.util.Scanner;

public class Auction2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr1[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] check = new int[n + 1];
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                int x = sc.nextInt();
                if (arr1[j] < x && check[j] < 3) {
                    arr1[j] = x;
                    check[j] = 0;
                } else {
                    check[j]++;
                }
                System.out.print(arr1[j] + " ");
            }
            System.out.println("");
        }
    }

}
