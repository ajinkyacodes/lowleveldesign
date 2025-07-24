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

        Librarian librarian = new Librarian("123");
        librarian.displayDashboard();
        System.out.println("DEBUG");

    }
}
