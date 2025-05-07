import java.util.ArrayList;
import java.util.List;

public class BookDataset {
    private static List<Book> books;

    static {
        books = new ArrayList<>();
        books.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 12.99, 5));
        books.add(new Book(2, "To Kill a Mockingbird", "Harper Lee", 9.99, 3));
        books.add(new Book(3, "1984", "George Orwell", 15.99, 2));
        books.add(new Book(4, "Pride and Prejudice", "Jane Austen", 10.99, 4));
        books.add(new Book(5, "The Catcher in the Rye", "J.D. Salinger", 11.99, 1));
    }

    public static List<Book> getSampleBooks() {
        return books;
    }

    public static void main(String[] args) {
        List<Book> books = getSampleBooks();

        for (Book book : books) {
            System.out.println("ID: " + book.getId() + ", " + book.getTitle() + " by " + book.getAuthor() + " - $" + book.getPrice() + " (" + book.getQuantityInStock() + " in stock)");
        }
    }
}