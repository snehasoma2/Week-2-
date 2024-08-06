import java.util.LinkedHashSet;
 class BookCollection {
    private LinkedHashSet<String> books;

    public BookCollection() {
        books = new LinkedHashSet<>();
    }

    public boolean addBook(String bookTitle) {
        return books.add(bookTitle);
    }

    public boolean removeBook(String bookTitle) {
        return books.remove(bookTitle);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The book collection is empty.");
        } else {
            System.out.println("Book Collection:");
            for (String book : books) {
                System.out.println("- " + book);
            }
        }
    }
}


public class BookCollectionTest {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        // Add books
        collection.addBook("To Kill a Mockingbird");
        collection.addBook("1984");
        collection.addBook("The Great Gatsby");

        // Display books
        collection.displayBooks();

        // Remove a book
        collection.removeBook("1984");

        // Display books again
        collection.displayBooks();
    }
}
