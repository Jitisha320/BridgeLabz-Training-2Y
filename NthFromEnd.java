import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n = 2;

        Iterator<String> p1 = list.iterator();
        Iterator<String> p2 = list.iterator();

        for (int i = 0; i < n; i++) p2.next();

        while (p2.hasNext()) {
            p1.next();
            p2.next();
        }

        System.out.println("Nth from end: " + p1.next());
    }
}