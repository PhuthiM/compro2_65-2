

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
            Arrays.sort(a);
            num.add(a[i]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(num.get(i));

        }

    }
}
