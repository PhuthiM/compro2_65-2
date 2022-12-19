

import java.util.Scanner;

public class Lease1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
        int year = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(array[i] + year - 1 + " ");
        }
    }
}
