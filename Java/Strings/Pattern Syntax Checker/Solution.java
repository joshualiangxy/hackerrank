import java.util.Scanner;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < testCases; i++) {
			String pattern = sc.nextLine();
          	//Write your code
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
		}
	}
}


