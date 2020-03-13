import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        if (s.length() < k) {
            return "";
        }

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = k + 1; i <= s.length(); i++) {
            String next = s.substring(i - k, i);

            if (next.compareTo(smallest) < 0)
                smallest = next;
            if (next.compareTo(largest) > 0)
                largest = next;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
