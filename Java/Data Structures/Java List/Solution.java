import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> xs = new ArrayList<>();
        int numE = sc.nextInt();
        for (int i = 0; i < numE; i++)
            xs.add(sc.nextInt());
        int numQueries = sc.nextInt();
        for (int i = 0; i < numQueries; i++) {
            String query = sc.next().trim();
            if (query.equals("Insert")) {
                xs.add(sc.nextInt(), sc.nextInt());
            } else
                xs.remove(sc.nextInt());
        }
        for (int i : xs)
            System.out.printf("%d ", i);
    }
}
