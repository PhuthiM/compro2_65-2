
import java.util.Scanner;

public class HowLongest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int[] capacity = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 1) {
                int sum = 0;
                for (int j = i; j <= n; j++) {
                    if (arr[j] == 1) {
                        sum++;
                    } else if (arr[j] != 1) {
                        if (sum >= max) {
                            max = sum;
                            capacity[i] = max;
                        }
                        break;
                    }
                    if (j == n) {
                        if (sum >= max) {
                            max = sum;
                            capacity[i] = max;
                        }
                    }
                }
            }
        } 
        System.out.println(max);
        for (int i = 1; i <= n; i++) {
            if (capacity[i] == max) {
                System.out.print(i + " ");
            }
        }
    }
}