import java.util.*;

public class SalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salary = new HashMap<>();

        salary.put("Alice", 55000.0);
        salary.put("Bob", 60000.0);
        salary.put("Carol", 45000.0);
        salary.put("Dave", 75000.0);
        salary.put("Eve", 75000.0);
        salary.put("Frank", 50000.0);

        // Raise for Bob (10%)
        if (salary.containsKey("Bob")) {
            salary.put("Bob", salary.get("Bob") * 1.10);
        }

        // Average salary
        double avg = 0;
        for (double s : salary.values()) avg += s;
        avg /= salary.size();
        System.out.println("Average Salary: " + avg);

        // Highest salary
        double max = Collections.max(salary.values());
        System.out.println("Highest Paid:");
        for (var e : salary.entrySet()) {
            if (e.getValue() == max) System.out.println(e.getKey());
        }
    }
}