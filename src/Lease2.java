

import java.util.Scanner;

public class Lease2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
        int year = sc.nextInt();
        int y = sc.nextInt();
       
        for (int j = 1; j <= y; j++) {
            int wantyear = sc.nextInt();
            boolean check = true;
            for (int i = 1; i <= n; i++) {
                int a = year + array[i] - 1;
                if (wantyear > a) {
                    System.out.print(i + " ");
                    check = false;
                }
            }
            if (check==true) {
                System.out.print("full");
            }
            System.out.println("");
        }

    }
}
