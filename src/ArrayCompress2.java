
import java.util.Scanner;

public class ArrayCompress2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int sum = 0;
        boolean check = false;
        for (int i = 1; i <= n; i++) {

            if (arr[i] == x || arr[i] == y || arr[i] == z) {
                if (!check) {
                    if (i == 1) {
                        System.out.print(arr[i] + " ");
                    } else {
                        System.out.print(sum + " " + arr[i] + " ");
                    }
                    check = true;
                    sum = 0;
                }

            } else if (i == n) {
                System.out.println(sum + arr[i]);
            } else {
                sum += arr[i];
                check = false;
            }
        }
    }
}
