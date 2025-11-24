import java.util.*;

public class ReverseQueue {
    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) return;
        int temp = q.remove();
        reverse(q);
        q.add(temp);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30);

        reverse(q);
        System.out.println(q); // [30, 20, 10]
    }
}