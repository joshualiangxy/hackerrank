import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        HashMap<Integer, Integer> sub = new HashMap<Integer, Integer>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addFirst(num);
            if (sub.containsKey(num))
                sub.put(num, sub.get(num) + 1);
            else
                sub.put(num, 1);
            if (i >= m) {
                int removed = deque.removeLast();
                if (sub.get(removed) > 1)
                    sub.put(removed, sub.get(removed) - 1);
                else
                    sub.remove(removed);
            }
            if (sub.size() > max)
                max = sub.size();
            
        }
        System.out.println(max);
    }
}



