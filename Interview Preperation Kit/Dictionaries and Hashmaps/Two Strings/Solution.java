import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < Math.max(s1.length(), s2.length()); i++) {
            if (i >= s1.length())
                set2.add(s2.charAt(i));
            else if (i >= s2.length())
                set1.add(s1.charAt(i));
            else {
                set1.add(s1.charAt(i));
                set2.add(s2.charAt(i));
            }
        }

        for (int i = 0; i < alphabet.length(); i++) {
            char c = alphabet.charAt(i);
            if (set1.contains(c) && set2.contains(c))
                return "YES";
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
