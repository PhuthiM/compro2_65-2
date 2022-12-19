
import java.util.Scanner;

public class ArrayJump1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
        int jump = 1;
        for (int i = 0; i < 5; i++) {
            if (jump > n) {
                System.out.println("out of bounds");
                break;
            } else {
                System.out.println(jump + " " + array[jump]);
                jump += array[jump];
            }
        }
    }
}
