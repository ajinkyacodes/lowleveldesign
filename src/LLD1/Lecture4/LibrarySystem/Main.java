package LLD1.Lecture4.LibrarySystem;

public class Main {
    /*

    Project Overview : Build a library system where

    1. The library can have Books, magazines and Journals.
    2. Some types of items can be loaned and some are only for reading at library.
    3. Users (Members: Students, Professors) can borrow and return different types of Library items.
    4. Books have categories. (Fiction, Non-fiction, Academic)
    5. A loan management system keeps track of issued books.
    6. Implement features like late fees and borrowing limits.

    Question Link: https://docs.google.com/document/d/1JabMvOkceIo_suLrYtNgH7UZPG4JruTdnFaivPpefFU/edit?tab=t.0#heading=h.dbbiksnfg9re

     */

    public static void main(String[] args) {
//        User user = new User();
//        User user1 = new User("Ajinkya", "123456789");
//        User user2 = new User(user1);
//        System.out.println("DEBUG");

//        Member member = new Member(10);
//
//        member.displayDashboard();
//        member.canBorrowBooks();

//        Librarian librarian = new Librarian("123");
//        librarian.displayDashboard();
//        System.out.println("DEBUG");


        Book TextBook = new Book("ISBN123", "Applied Mathematics", "RS Agrawal", true) {
            @Override
            public void displayBookDetails() {
                System.out.println(this.getIsbn());
                System.out.println(this.getTitle());
                System.out.println(this.getAuthor());
            }
        };

        Book NovelBook = new Book("ISBN124", "Harry Potter", "JK Rowling", true) {
            @Override
            public void displayBookDetails() {
                System.out.println(this.getIsbn());
                System.out.println(this.getTitle());
                System.out.println(this.getAuthor());
            }
        };

        User user = new User("Ajinkya", "5451211222") {
            @Override
            public void displayDashboard() {
                System.out.println("User Dashboard");
            }

            @Override
            public boolean canBorrowBooks() {
                return true;
            }
        };

        Member member = new Member("Madan Patil", "4512125456", 3);

        Librarian librarian = new Librarian("Rahul Yadav", "5845454545", "EMP120");


//        LibraryManagementSystem lms = new LibraryManagementSystem();
//
//        lms.addBook(TextBook);
//        lms.addBook(NovelBook);

//        lms.registerUser(member);
//        lms.registerUser(librarian);
//
//        lms.displayAllBooks();
//        lms.displayRegisteredUsers();

        //Testing Book Return
//        TextBook.lend(member);
//        TextBook.lend(librarian);
//        TextBook.returnBook(member);
//        TextBook.lend(librarian);
//        TextBook.isAvailable();

//        List<Book> result = lms.searchBooks("Harry Potter");
//        for(Book res: result) {
//            System.out.println(res);
//        }

        NovelBook novelBook = new NovelBook("ISBN456", "Harry Potter", "JK Rowling", "Fiction");
        novelBook.displayBookDetails();

        TextBook textBook = new TextBook("ISBN458", "Applied Maths", "RS Agrawal", "Maths", 5);
        textBook.displayBookDetails();
    }
}
