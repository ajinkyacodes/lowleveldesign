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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            System.out.println("Lending operation is successful.");
            return true;
        }
        System.out.println("Lending operation FAILED.");
        return false;
    }

    public void returnBook(User user) {
        isAvailable = true;
    }

    public boolean isAvailable() {
        if(isAvailable == true) {
            System.out.println("Book is available for lending.");
        } else {
            System.out.println("Book is not available.");
        }
        return isAvailable;
    }

    public abstract void displayBookDetails();
}
