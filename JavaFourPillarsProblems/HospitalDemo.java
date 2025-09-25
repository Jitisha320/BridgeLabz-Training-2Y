abstract class Patient {
    // Encapsulated fields
    private String patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters (encapsulation)
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    // Abstract method
    public abstract double calculateBill();
}

// Interface for medical records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Subclass: InPatient
class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private StringBuilder medicalHistory; // Encapsulated sensitive data

    public InPatient(String patientId, String name, int age, double roomCharge) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.medicalHistory = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        double serviceCharge = 2000; // Example service charge
        return roomCharge + serviceCharge;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.append(record).append("\n");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":\n" + medicalHistory);
    }
}

// Subclass: OutPatient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private StringBuilder medicalHistory; // Encapsulated sensitive data

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        double testCharges = 500; // Example lab charges
        return consultationFee + testCharges;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.append(record).append("\n");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":\n" + medicalHistory);
    }
}

// Main class to demonstrate polymorphism
public class HospitalDemo {
    public static void main(String[] args) {
        Patient[] patients = new Patient[3];

        patients[0] = new InPatient("IP001", "Alice", 30, 5000);
        patients[1] = new OutPatient("OP001", "Bob", 25, 800);
        patients[2] = new InPatient("IP002", "Charlie", 40, 7000);

        // Adding medical records
        if (patients[0] instanceof MedicalRecord mr1) mr1.addRecord("Diagnosed with flu");
        if (patients[1] instanceof MedicalRecord mr2) mr2.addRecord("Routine checkup");
        if (patients[2] instanceof MedicalRecord mr3) mr3.addRecord("Post-surgery care");

        // Polymorphic processing
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Total Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord mr) mr.viewRecords();
            System.out.println("-------------------------");
        }
    }
}