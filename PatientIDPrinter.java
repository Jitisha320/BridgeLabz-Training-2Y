public class PatientIDPrinter {
    static void printID(String id) {
        System.out.println(id);
    }

    public static void main(String[] args) {
        String[] patientIDs = {"P101", "P102", "P103", "P104"};

        System.out.println("Patient IDs:");
        for (String id : patientIDs) {
            printID(id); 
        }
    }
}