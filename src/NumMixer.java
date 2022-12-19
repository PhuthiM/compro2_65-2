
import java.util.Scanner;

public class NumMixer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr2[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (k > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.print(arr1[i] + " " + arr2[n - i + 1] + " ");
            }
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(arr2[n - i + 1] + " " + arr1[i] + " ");
            }
        }
    }
}
