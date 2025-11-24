import java.util.*;

public class BinaryNumbers {
    public static void main(String[] args) {
        int n = 5;
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String curr = q.remove();
            System.out.println(curr);
            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
}
