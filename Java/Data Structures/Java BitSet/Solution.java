import java.io.*;
import java.util.*;

public class Solution {
    private static final String AND = "AND";
    private static final String OR = "OR";
    private static final String XOR = "XOR";
    private static final String FLIP = "FLIP";
    private static final String SET = "SET";

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int queries = sc.nextInt();
        BitSet[] sets = new BitSet[2];
        sets[0] = new BitSet(size);
        sets[1] = new BitSet(size);
        
        for (int i = 0; i < queries; i++) {
            String query = sc.next();
            switch (query) {
                case AND:
                    sets[sc.nextInt() - 1].and(sets[sc.nextInt() - 1]);
                    break;
                case OR:
                    sets[sc.nextInt() - 1].or(sets[sc.nextInt() - 1]);
                    break;
                case XOR:
                    sets[sc.nextInt() - 1].xor(sets[sc.nextInt() - 1]);
                    break;
                case FLIP:
                    sets[sc.nextInt() - 1].flip(sc.nextInt());
                    break;
                case SET:
                    sets[sc.nextInt() - 1].set(sc.nextInt());
                    break;
            }
            System.out.printf("%d %d\n", sets[0].cardinality(), sets[1].cardinality());
        }
    }
}
