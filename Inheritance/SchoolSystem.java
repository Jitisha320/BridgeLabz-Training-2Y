class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Teacher of " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Student in Grade " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    String position;

    Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    void displayRole() {
        System.out.println("Staff Position: " + position);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", 40, "Math");
        Student s = new Student("Bob", 15, 10);
        Staff st = new Staff("Charlie", 35, "Librarian");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}