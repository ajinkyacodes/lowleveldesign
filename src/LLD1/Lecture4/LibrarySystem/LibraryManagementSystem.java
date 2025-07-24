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


}
