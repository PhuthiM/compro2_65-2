
import java.util.Scanner;

public class OddEvenZero2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] % 2 != 0 || arr[i] == 0) {
                if (max < arr[i]) {
                    max = arr[i];
                    System.out.print(max + " ");
                } else if (arr[i] == 0) {
                    max = 0;
                    System.out.print(max + " ");
                }
            }
        }
        System.out.println("");
        max = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] % 2 == 0 || arr[i] == 0) {
                if (max < arr[i]) {
                    max = arr[i];
                    System.out.print(max + " ");
                } else if (arr[i] == 0) {
                    max = 0;
                    System.out.print(max + " ");
                }
            }
        }
    }
}
