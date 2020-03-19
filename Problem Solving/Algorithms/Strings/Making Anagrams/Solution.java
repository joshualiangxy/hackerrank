import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < Math.max(s1.length(), s2.length()); i++) {
            if (i >= s1.length()) {
                updateMap(i, map2, s2);
            } else if (i >= s2.length()) {
                updateMap(i, map1, s1);
            } else {
                updateMap(i, map1, s1);
                updateMap(i, map2, s2);
            }
        }

        int delete = 0;
        for (Character c : map1.keySet()) {
            if (map2.containsKey(c)) {
                if (map2.get(c) != map1.get(c)) {
                    delete += Math.abs(map2.get(c) - map1.get(c));
                    map1.put(c, Math.min(map1.get(c), map2.get(c)));
                    map2.put(c, Math.min(map1.get(c), map2.get(c)));
                }
            } else {
                delete += map1.get(c);
            }
        }

        for (Character c : map2.keySet()) {
            if (!map1.containsKey(c)) {
                delete += map2.get(c);
            }
        }

        return delete;
    }

    static void updateMap(int pos, Map<Character, Integer> map, String s) {
        char c = s.charAt(pos);
        if (map.containsKey(c))
            map.put(c, map.get(c) + 1);
        else
            map.put(c, 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
