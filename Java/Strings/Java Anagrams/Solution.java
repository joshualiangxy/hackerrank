import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length())
            return false;
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char c = Character.toLowerCase(a.charAt(i));
            char d = Character.toLowerCase(b.charAt(i));
            if (mapA.containsKey(c))
                mapA.put(c, mapA.get(c) + 1);
            else
                mapA.put(c, 1);
            if (mapB.containsKey(d))
                mapB.put(d, mapB.get(d) + 1);
            else
                mapB.put(d, 1);
        }
        for (int i = 0; i < a.length(); i++) {
            char c = Character.toLowerCase(a.charAt(i));
            if (!mapB.containsKey(c) || mapA.get(c) != mapB.get(c)) {
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
