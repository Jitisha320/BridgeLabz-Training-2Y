import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {

        Map<String, String> books = new HashMap<>();

        // 1. Add books
        books.put("978-1111111111", "Java Basics");
        books.put("978-2222222222", "Data Structures");
        books.put("978-3333333333", "Computer Networks");
        books.put("978-4444444444", "Operating Systems");

        // 2. Search by ISBN
        searchISBN(books, "978-2222222222");
        searchISBN(books, "978-9999999999");  // not found

        // 3. Remove a book
        books.remove("978-3333333333");

        // 4. Print all sorted by ISBN
        System.out.println("\nAll Books (Sorted by ISBN):");
        books.entrySet().stream()
             .sorted(Map.Entry.comparingByKey())
             .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

        // Extended: search by title
        searchTitle(books, "Operating Systems");
        searchTitle(books, "Python Programming");
    }

    static void searchISBN(Map<String, String> books, String isbn) {
        System.out.println(books.getOrDefault(isbn, "Book not found"));
    }

    static void searchTitle(Map<String, String> books, String title) {
        boolean found = false;
        for (var entry : books.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(title)) {
                System.out.println("Found: " + entry.getKey() + " → " + entry.getValue());
                found = true;
            }
        }
        if (!found) System.out.println("Book not found");
    }
}
