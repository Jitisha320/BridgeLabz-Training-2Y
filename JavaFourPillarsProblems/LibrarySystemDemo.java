abstract class LibraryItem {
    // Encapsulated fields
    private String itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters (encapsulation)
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + title + " | Author: " + author + " | ID: " + itemId);
    }

    // Abstract method
    public abstract int getLoanDuration(); // in days
}

// Interface for reservable items
interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

// Subclass: Book
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrowerName; // Encapsulated sensitive data

    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days for books
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            isAvailable = false;
            borrowerName = borrower;
            System.out.println(getTitle() + " reserved by " + borrower);
        } else {
            System.out.println(getTitle() + " is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    // Encapsulated getter for borrower info
    public String getBorrowerName() { return borrowerName; }
}

// Subclass: Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrowerName;

    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days for magazines
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            isAvailable = false;
            borrowerName = borrower;
            System.out.println(getTitle() + " reserved by " + borrower);
        } else {
            System.out.println(getTitle() + " is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    public String getBorrowerName() { return borrowerName; }
}

// Subclass: DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrowerName;

    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days for DVDs
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            isAvailable = false;
            borrowerName = borrower;
            System.out.println(getTitle() + " reserved by " + borrower);
        } else {
            System.out.println(getTitle() + " is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    public String getBorrowerName() { return borrowerName; }
}

// Main class to demonstrate polymorphism
public class LibrarySystemDemo {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];

        items[0] = new Book("B001", "Java Programming", "Author A");
        items[1] = new Magazine("M001", "Tech Today", "Author B");
        items[2] = new DVD("D001", "Inception", "Director C");

        // Iterate over items polymorphically
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable reservable) {
                System.out.println("Availability: " + reservable.checkAvailability());
                reservable.reserveItem("John Doe");
                System.out.println("Availability after reservation: " + reservable.checkAvailability());
            }

            System.out.println("---------------------------");
        }
    }
}