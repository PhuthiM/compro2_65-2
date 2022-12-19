
import java.util.Scanner;

public class SlotRsv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n + 1];
        int[] arr2 = new int[n + 1];
        int k = sc.nextInt();
        int p = sc.nextInt();
        for (int i = 1; i <= p; i++) {
            int x = sc.nextInt();
            if (arr1[x] < k) {
                System.out.println("1");
                arr1[x]++;
            } else {
                System.out.println("2");
                arr2[x]++;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
