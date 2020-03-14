import java.math.BigDecimal;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n+2];
        for (int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();
        // Write your code here
        Arrays.sort(s, 0, n,
            (s1, s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1)) != 0
                            ? new BigDecimal(s2).compareTo(new BigDecimal(s1))
                            : 1);
        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
