import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String y = Integer.toString(x);
                while (y.length() < 3) {
                    y = '0' + y;
                }
                System.out.printf("%s", s1);
                for (int j = 0; j < 15 - s1.length(); j++) {
                    System.out.print(' ');
                }
                System.out.printf("%s\n", y);
            }
            System.out.println("================================");

    }
}



