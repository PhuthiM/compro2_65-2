
import java.util.Scanner;

public class competition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] team1 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            team1[i] = sc.nextInt();
        }
        int[] team2 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            team2[i] = sc.nextInt();
        }
        int win1 = 0;
        int win2 = 0;
        for (int i = 1; i <= n; i++) {
            if (team1[i] > team2[i]) {
                win1 += 2;
            } else if (team1[i] == team2[i]) {
                win1 += 1;
                win2++;
            } else {
                win2 += 2;
            }
        }
        if (win1 > win2) {
            System.out.println("Team 1 wins");
            System.out.println("Score " + win1 + " to " + win2);
        } else if (win1 < win2) {
            System.out.println("Team 2 wins");
            System.out.println("Score " + win2 + " to " + win1);
        } else {
            System.out.println("Draw game");
            System.out.println("Score " + win2 + " to " + win1);
        }
    }
}
