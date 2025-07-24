package LLD1.Lecture4.LibrarySystem;

public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable = true;

    public Book() {}

    public Book(String isbn, String title, String author, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public Book(Book other) {
        this.isbn = other.isbn;
        this.title = other.title;
        this.author = other.author;
        this.isAvailable = other.isAvailable;
    }

    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnBook(User user) {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract void displayBookDetails();
}
