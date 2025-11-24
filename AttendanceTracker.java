import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        
        // 1. Initialize map with students and 0 attendance
        Map<String, Integer> attendance = new HashMap<>();
        List<String> students = Arrays.asList("Amit", "Riya", "Sohan", "Neha", "Karan");
        
        for (String s : students) {
            attendance.put(s, 0);
        }
        
        // Random attendance simulation for 15 days
        Random rand = new Random();
        
        System.out.println("---- Daily Attendance ----");
        
        for (int day = 1; day <= 15; day++) {
            System.out.print("Day " + day + ": Present - ");
            
            // Random number of students present each day
            int presentCount = rand.nextInt(students.size()) + 1;
            
            Collections.shuffle(students);  // Random order
            List<String> presentStudents = students.subList(0, presentCount);
            
            // Print present students
            System.out.println(presentStudents);
            
            // Increment attendance count
            for (String name : presentStudents) {
                attendance.put(name, attendance.get(name) + 1);
            }
        }
        
        // 3. Print under-attending students (less than 10 days)
        System.out.println("\n---- Students with <10 Days Attendance ----");
        
        for (String name : attendance.keySet()) {
            if (attendance.get(name) < 10) {
                System.out.println(name + " : " + attendance.get(name) + " days");
            }
        }
    }
}
