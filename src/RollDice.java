
import java.util.Scanner;

public class RollDice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pts = new int[n];
        for (int i = 0; i < n; i++) {
            pts[i] = sc.nextInt();
        }
        int[] moves = new int[n];
        for (int i = 0; i < n; i++) {
            moves[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        int position = 0;
        int scorenow = 0;
        for (int i = 1; i <= p; i++) {
            int toy = sc.nextInt();
            position += toy;
            if (position >= n) {
                position -= n;
            }
            System.out.println(position);
            if (moves[position] != 0) {
                scorenow += pts[position];
            }

            //System.out.print(position + ": ");
            //System.out.print(scorenow + ":");
            position += moves[position];
            if (position < 0) {
                position = n + position;
            }
            if (position >= n) {
                position -= n;
            }
            scorenow += pts[position];
            //  System.out.print(position + " ");
            // System.out.println(scorenow);
        }
    }
}
/*15
0 2 1 -2 3 8 -5 4 3 2 1 0 -1 -2 -3
1 -4 0 1 0 -2 -4 5 0 3 -4 5 2 1 0
10
5
3
2
1
6
4
1
3
2
5*/
