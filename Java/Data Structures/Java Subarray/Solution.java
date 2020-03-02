import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numPoints = sc.nextInt();
        int[] prefixSum = new int[numPoints];
        for (int i = 0; i < numPoints; i++) {
            if (i > 0) {
                prefixSum[i] = sc.nextInt() + prefixSum[i - 1];
            } else {
                prefixSum[i] = sc.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < prefixSum.length; i++) {
            for (int j = i; j < prefixSum.length; j++) {
                if (i == 0) {
                    if (prefixSum[j] < 0)
                        count++;
                } else if (prefixSum[j] - prefixSum[i - 1] < 0)
                    count++;
            }
        }

        sc.close();
        System.out.println(count);
    }
}
