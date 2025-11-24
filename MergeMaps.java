import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        Map<String, Integer> result = new HashMap<>(map1);

        for (var e : map2.entrySet()) {
            result.put(e.getKey(), result.getOrDefault(e.getKey(), 0) + e.getValue());
        }

        System.out.println(result);
    }
}