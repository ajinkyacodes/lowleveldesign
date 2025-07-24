package LLD1.Lecture4.LibrarySystem;

public class NovelBook extends Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;

    public NovelBook(String isbn, String title, String author, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("NovelBook - Title: " + title + ", Genre: " + genre);
    }
}
