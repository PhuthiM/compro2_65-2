
import java.util.Scanner;

public class Partition2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int center = n / 2 + 1;
        int[] arr2 = new int[n + 1];
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] <= arr[center]) {
                sum++;
                arr2[sum] = arr[i];
            }
        }
        System.out.println("");
        center = sum / 2 + 1;
        for (int i = 1; i <= sum; i++) {
            if (arr2[i] <= arr2[center]) {
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println("");
        for (int i = 1; i <= sum; i++) {
            if (arr2[i] > arr2[center]) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
