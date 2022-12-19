
import java.util.Scanner;

public class AlternateJump {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar1 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ar1[i] = sc.nextInt();
        }
        int[] ar2 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ar2[i] = sc.nextInt();
        }
        int currArray = 1; // เอาไว้เก็บว่าตอนนี้จะอ่านค่าจากอาเรย์ไหน
        int jump1 = 1; // ตำแหน่งปัจจุบันในอาเรย์แรก
        int jump2 = 1; // ตำแหน่งปัจจุบันในอาเรย์สอง
        int count1 = 0; // จำนวนการอ่านระยะกระโดดจากอาเรย์แรก
        int count2 = 0;
        while (jump1 <= n && jump2 <= n) { // ยังกระโดดไม่พ้นอาเรย์
            if (currArray == 1) {
                count1++;
                System.out.println("1 " + jump1 + " " + ar1[jump1]);
                if (ar1[jump1] % 2 == 0) {
                    currArray = 1;
                    jump1 += ar1[jump1];
                } else {
                    currArray = 2;
                    jump2 += ar1[jump1];
                }

            } else if (currArray == 2) {
                count2++;
                System.out.println("2 " + jump2 + " " + ar2[jump2]);
                if (ar2[jump2] % 2 == 0) {
                    currArray = 2;
                    jump2 += ar2[jump2];

                } else {
                    currArray = 1;
                    jump1 += ar2[jump2];
                }
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
