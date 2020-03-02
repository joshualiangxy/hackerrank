import java.util.*;
class Solution{
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('}', '{');
        brackets.put(']', '[');
        brackets.put(')', '(');
        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (brackets.containsKey(c)) {
                    if (!s.empty() && s.peek().equals(brackets.get(c)))
                        s.pop();
                    else {
                        System.out.println("false");
                        break;
                    }
                } else
                    s.push(c);
                if (i == input.length() - 1) {
                    if (s.empty())
                        System.out.println("true");
                    else
                        System.out.println("false");
                    s = new Stack<>();
                }
            }
        }
        
    }
}
