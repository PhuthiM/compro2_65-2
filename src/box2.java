
import java.util.Scanner;

public class box2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] capacity = new int[n + 1];
        int[] box = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            capacity[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                int q = sc.nextInt();
                int b = sc.nextInt();
                if (capacity[b] >= q) {
                    box[b] += q;
                    capacity[b] -= q;
                    System.out.println(box[b]);
                } else {
                    System.out.println(-1);
                }
            } else if (x == 2) {
                int q = sc.nextInt();
                for (int j = 1; j <= n; j++) {
                    // System.out.println(j + " q:" + q);
                    if (box[j] >= q) {
                        box[j] -= q;
                        capacity[j] += q;
                        System.out.println(j + " " + box[j]);
                        break;
                    } else {
                        capacity[j] += box[j];
                        q -= box[j];
                        box[j] = 0;
                        if (j == n) {
                            System.out.println(j + " " + box[j]);
                        }
                    }
                }
            }
        }
    }
}
