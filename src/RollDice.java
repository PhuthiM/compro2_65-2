
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
        int position_old = 0;
        int position_now = 0;
        int score_old = 0;
        int score_now = 0;
        for (int i = 1; i <= p; i++) {
            int toy = sc.nextInt();

            position_old += toy;
            if (position_old >= n) {
                position_old -= n;
            }
            score_old += pts[position_old];

            // System.out.print(position_old + ":");
            // System.out.print(score_old + ":");
            position_now = position_old + moves[position_old];
            if (position_now < 0) {
                position_now += n;
            } else if (position_now >= n) {
                position_now -= n;
            }

            System.out.print(position_now + " ");
            if (position_old != position_now) {
                score_now = score_old + pts[position_now];
            } else {
                score_now = score_old;
            }
            System.out.println(score_now);
            position_old = position_now;
            score_old = score_now;
        }
    }
}

