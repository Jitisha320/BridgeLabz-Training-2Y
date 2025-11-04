import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;
    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class DataBackup {
    public static void main(String[] args) {
        Student s = new Student(1, "Deepti");
        System.out.println("Student object ready for backup: " + s.name);
    }
}