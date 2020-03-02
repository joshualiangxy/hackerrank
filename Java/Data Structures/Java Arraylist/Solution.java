import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();
        ArrayList<ArrayList<Integer>> xs = new ArrayList<>();
        for (int i = 0; i < numLines; i++) {
            int numPoints = sc.nextInt();
            ArrayList<Integer> ys = new ArrayList<>();
            for (int j = 0; j < numPoints; j++) {
                ys.add(sc.nextInt());
            }
            xs.add(ys);
        }
        int numQueries = sc.nextInt();
        for (int i = 0; i < numQueries; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (x < xs.size()) {
                ArrayList<Integer> ys = xs.get(x);
                if (y < ys.size())
                    System.out.println(ys.get(y));
                else
                    System.out.println("ERROR!");
            } else {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
