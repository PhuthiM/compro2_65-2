
import java.util.Scanner;

public class CP_SU48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] morning = new int[n + 1];
        int[] afternoon = new int[n + 1];
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int p = sc.nextInt();
        for (int i = 1; i <= p; i++) {
            int id = sc.nextInt();
            int s = sc.nextInt();
            if (s == 1) {
                if (morning[id] < k1) {
                    System.out.println("1");
                    morning[id] += 1;
                } else if (afternoon[id] < k2) {
                    System.out.println("2");
                    afternoon[id] += 1;
                } else {
                    System.out.println("0");
                }
            } else if (s == 2) {
                if (afternoon[id] < k2) {
                    System.out.println("2");
                    afternoon[id] += 1;
                } else if (morning[id] < k1) {
                    System.out.println("1");
                    morning[id] += 1;
                } else {
                    System.out.println("0");
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(morning[i] + " ");
        }
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            System.out.print(afternoon[i] + " ");
        }
    }
}
