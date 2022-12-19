
import java.util.Scanner;

public class TrainCar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int p = sc.nextInt();
        int n = c + p;
        int[] arr = new int[n + 1];
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            int type_car = sc.nextInt();
            int id_car = sc.nextInt();
            int v = sc.nextInt();
            if (type_car == 1) {
                if (id_car <= c && arr[id_car] + v <= 50) {
                    arr[id_car] += v;
                }
            } else if (type_car == 2) {
                if (id_car > c && id_car <= n && arr[id_car] + v <= 60) {
                    arr[id_car] += v;
                }
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("");

        }
    }
}
