interface DataExporter {
    void export(String data);
    default void exportToJSON(String data) {
        System.out.println("Exporting as JSON: " + data);
    }
}

class CSVExporter implements DataExporter {
    public void export(String data) {
        System.out.println("Exporting as CSV: " + data);
    }
}

public class DataExportFeature {
    public static void main(String[] args) {
        DataExporter csv = new CSVExporter();
        csv.export("Report Data");
        csv.exportToJSON("Report Data");
    }
}