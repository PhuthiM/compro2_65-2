
import java.util.Scanner;

public class Number_Occurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n+1];
        for (int i = 1; i <= n; i++) {
            number[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean check=false;
        for (int i = 1; i <= n; i++) {
            if (number[i] == target) {
                System.out.print(i+" ");
                check=true;
            }
        }if(!check){
            System.out.println("0");
        }
    }
}
