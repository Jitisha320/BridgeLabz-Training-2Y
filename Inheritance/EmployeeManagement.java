public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 101, 80000, 10);
        Employee e2 = new Developer("Bob", 102, 60000, "Java");
        Employee e3 = new Intern("Charlie", 103, 20000, "MIT");

        System.out.println("=== Manager Details ===");
        e1.displayDetails();

        System.out.println("\n=== Developer Details ===");
        e2.displayDetails();

        System.out.println("\n=== Intern Details ===");
        e3.displayDetails();
    }
}
class Employee{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    
    void displayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employee{
    String Univ;
    Intern(String name,int id,double salary,String Univ){
        super(name,id,salary);
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("University: " + Univ);
    }
}