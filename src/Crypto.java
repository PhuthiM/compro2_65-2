
import java.util.Scanner;

public class Crypto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] block = new int[n];
        for (int i = 0; i < n; i++) {
            block[i] = sc.nextInt();
        }
        int start = sc.nextInt();
        int key = sc.nextInt();
        int v1 = block[start];
        int v2 = block[start + 1];
        int v3 = block[start + 2];
        int v4 = block[start + 3];
        boolean check1 = false;
        boolean chechk2 = false;
        if (v1 + key <= 51743 || v2 - key > 7832) {
            System.out.println("pass");
            check1 = true;
        } else {
            System.out.println("fail");
        }
        if (v3 - key < 2394 || v4 + key > 9213) {
            System.out.println("pass");
            chechk2 = true;
        } else {
            System.out.println("fail");
        }
        if (check1 && chechk2) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
