
import java.util.Scanner;

public class OutBound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            number[i] = sc.nextInt();
        }
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        boolean check = false;
        for (int i = 1; i <= n; i++) {
            if (number[i] < x1 || number[i] > x2) {
                System.out.print(number[i] + " ");
                check = true;
            }
        }
        if (!check) {
            System.out.println("no data");
        }
    }
}
