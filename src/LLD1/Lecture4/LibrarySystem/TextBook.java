package LLD1.Lecture4.LibrarySystem;

public class TextBook extends Book {
    private String isbn;
    private String title;
    private String author;
    private String subject;
    private int edition;

    public TextBook(String isbn, String title, String author, String subject, int edition) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("TextBook - Title: " + title + ", Subject: " + subject + ", Edition: " + edition);
    }
}
