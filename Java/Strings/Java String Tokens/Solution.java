import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNext())
            System.out.println("0");
        else {
            String s = scan.nextLine();
            // Write your code here.
            scan.close();
            String regex = "[\\s!,?._'@]+";
            String[] strings = s.trim().split(regex);
            System.out.println(strings.length);
            for (String str : strings)
                System.out.println(str);
        }
    }
}

