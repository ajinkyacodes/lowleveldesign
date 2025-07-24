package LLD1.Lecture4.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private static List<Book> bookInventory = new ArrayList<>();
    private static List<User> registeredUsers = new ArrayList<>();

    public static void addBook(Book book) {
        bookInventory.add(book);
    }

    public static void registerUser(User user) {
        registeredUsers.add(user);
    }

    public static void displayAllBooks() {
        for(Book book: bookInventory) {
            book.displayBookDetails();
        }
    }

    public static void displayRegisteredUsers() {
        for(User user: registeredUsers) {
            user.displayDashboard();
        }
    }

    public static List<Book> searchBooks(String criteria) {
        List<Book> result = new ArrayList<>();
        for(Book book : bookInventory) {
            if(book.toString().contains(criteria)) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> searchBooks(String criteria, String type) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookInventory) {
            if (book.toString().contains(criteria) && book.getClass().getSimpleName().equalsIgnoreCase(type)) {
                result.add(book);
            }
        }
        return result;
    }
}
