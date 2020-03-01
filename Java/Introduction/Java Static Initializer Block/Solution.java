import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

// Write your code here

private static int B;
private static int H;
private static boolean flag;
private static Scanner sc = new Scanner();;

static {
    B = sc.nextInt();
    H = sc.nextInt();
    flag = B >= 0 && H >= 0;
}



public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

