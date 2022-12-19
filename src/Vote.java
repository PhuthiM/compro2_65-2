
import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 1];
        int max = 0;
        int index = 0;
        for (int i = 1; i <= k; i++) {
            int x = sc.nextInt();
            arr[x]++;
            if (max < arr[x]) {
                max = arr[x];
                index = x;
            }
        }
        System.out.println(index + "\n" + max);
    }
}
