package LLD1.Lecture4.LibrarySystem;

public interface Lendable {
    boolean lend(User user);

    void returnBook(User user);

    boolean isAvailable();
}
