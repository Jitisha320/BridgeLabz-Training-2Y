import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> cc = new TreeMap<>();

        cc.put("India", "New Delhi");
        cc.put("Japan", "Tokyo");
        cc.put("USA", "Washington DC");
        cc.put("France", "Paris");
        cc.put("China", "Beijing");
        cc.put("Nepal", "Kathmandu");
        cc.put("Germany", "Berlin");
        cc.put("UK", "London");

        // Lookup
        String country = "Japan";
        System.out.println("Capital: " + cc.getOrDefault(country, "Unknown country"));

        // Print all sorted
        for (var e : cc.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}