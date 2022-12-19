
import java.util.Scanner;

public class SupremeMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            arr[i] = sc.nextInt();
        }
        int supMax = Integer.MIN_VALUE; // ค่า SupremeMax
        int intervalMax = Integer.MIN_VALUE; // ค่าสูงสุดในช่วง
        int interStart = 1; // อินเด็กซ์เริ่มของช่วงปัจจุบันที่กำลังสำรวจ
        int bestStart = -1; // อินเด็กซ์เริ่มต้นของช่วงที่ค่าสูงที่สุด
        int bestEnd = -1; // อินเด็กซ์สุดท้ายของช่วงที่ค่าสูงที่สุด
        boolean zero = false;
        // เริ่มการสำรวจและเก็บข้อมูลในแต่ละช่วง (เป็นลูปยาวสักหน่อย)

        for (int i = 1; i <= n; i++) {

            if (arr[i] != 0) {
                if (arr[i] > intervalMax) {
                    intervalMax = arr[i];
                }
                zero=false;
            } else if (arr[i] == 0 && !zero) {
                System.out.print(intervalMax + " ");
                // System.out.println(interStart + ":" + (i - 1));
                if (intervalMax > supMax) {
                    supMax = intervalMax;
                    bestStart = interStart;
                    bestEnd = i - 1;
                }
                intervalMax = 0;
                interStart = i + 1;
                zero = true;
            }
        }
        System.out.println("");
        // พิมพ์ค่า SupremeMax และช่วงอาเรย์ที่มี SupremeMax
        System.out.println(supMax);
        // System.out.println(bestStart+" "+bestEnd);
        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
