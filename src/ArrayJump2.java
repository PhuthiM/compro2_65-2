
import java.util.Scanner;

public class ArrayJump2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int jump = k;
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        for (;;) {
            if (jump > n) {
                System.out.println("out of bounds");
                break;
            } else {
                System.out.println(jump + " " + arr[jump]);
                jump += arr[jump];
            }
        }
    }
}
