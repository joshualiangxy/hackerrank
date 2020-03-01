import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game, int[] visited, int pos) {
        // Return true if you can win the game; otherwise, return false.
        if (pos > game.length - 1)
            return true;
        else if (pos < 0 || visited[pos] == 1 || game[pos] != 0)
            return false;
        int[] visit = visited.clone();
        visit[pos] = 1;
        return canWin(leap, game, visit, pos + leap) 
                || canWin(leap, game, visit, pos + 1) 
                || canWin(leap, game, visit, pos - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game, 
                    new int[game.length], 0)) ? "YES" : "NO");
        }
        scan.close();
    }
}
