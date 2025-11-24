import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {

        Map<String, Double> grades = new HashMap<>();

        // 1. Add students
        grades.put("Amit", 85.0);
        grades.put("Riya", 92.5);
        grades.put("Karan", 78.0);
        grades.put("Neha", 88.0);

        // 2. Update grade
        grades.put("Karan", 90.0);   // Karan re-took test

        // 3. Remove student
        grades.remove("Amit");       // Amit dropped out

        // 4. Print sorted alphabetically by name
        System.out.println("Student Grades:");
        grades.entrySet().stream()
              .sorted(Map.Entry.comparingByKey())
              .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
