import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();

        courses.put("CS101", 45);
        courses.put("CS102", 4);
        courses.put("CS103", 60);
        courses.put("CS104", 2);
        courses.put("CS105", 30);

        // Add student
        courses.put("CS101", courses.get("CS101") + 1);

        // Drop student
        courses.put("CS102", Math.max(0, courses.get("CS102") - 1));

        // Near full (>=50)
        System.out.println("Near Full:");
        for (var e : courses.entrySet()) {
            if (e.getValue() >= 50) System.out.println(e.getKey());
        }

        // Under-subscribed (<5)
        System.out.println("Under-Subscribed:");
        for (var e : courses.entrySet()) {
            if (e.getValue() < 5) System.out.println(e.getKey());
        }
    }
}