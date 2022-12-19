
import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ar[i] = sc.nextInt();
        }
        int[] labor = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            labor[i] = sc.nextInt();
        }
        int[] power = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            power[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {

            int sum = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            int start = y - (x / 2);
            int end = y + (x / 2);

            if (start <= 0 || end > n) {
                System.out.print("no ");
                if (start <= 0) {
                    start = 0;
                }
                if (end > n) {
                    end = n;
                }
                for (int j = start; j <= end; j++) {
                    sum += ar[j];
                }
                System.out.print(sum);
            } else {
                for (int j = start; j <= end; j++) {
                    sum += ar[j];
                }
                System.out.print(sum);
                boolean Checklabor = true;
                for (int j = start; j <= end; j++) {
                    if (labor[j] < 5) {
                        Checklabor = false;
                    }
                }
                if (Checklabor) {
                    System.out.print(" labor");
                }
                boolean CheckPower = false;
                for (int j = start; j <= end; j++) {
                    if (power[j] == 1) {
                        CheckPower = true;
                    }
                }
                if (CheckPower) {
                    System.out.print(" power");
                }
            }
            System.out.println("");
        }
    }
}
