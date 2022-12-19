
import java.util.Scanner;

public class OddEvenZero1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            if (number[i] % 2 != 0 ||number[i] == 0)
            {
                System.out.print(number[i] + " ");
            }
        }
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            if (number[i] % 2 == 0) {
                System.out.print(number[i] + " ");
            }
        }
    }
}
