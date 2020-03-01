import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                int result = a;
                for (int k = 0; k <= j; k++) {
                    result += Math.pow(2, k) * b;
                }
                System.out.print(result);
                if (j == n - 1) {
                    System.out.print("\n");
                } else {
                    System.out.print(" ");
                }
            }
        }
        in.close();
    }
}

