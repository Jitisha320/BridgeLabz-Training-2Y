class Invoice {
    String id;
    Invoice(String id) {
        this.id = id;
    }

    void print() {
        System.out.println("Invoice ID: " + id);
    }
}

public class InvoiceGenerator {
    static void createInvoice(String id) {
        Invoice invoice = new Invoice(id);
        invoice.print(); 
    }

    public static void main(String[] args) {
        String[] txnIDs = {"TXN001", "TXN002", "TXN003"};

        System.out.println("Generated Invoices:");

        for (String id : txnIDs) {
            createInvoice(id);
        }
    }
}