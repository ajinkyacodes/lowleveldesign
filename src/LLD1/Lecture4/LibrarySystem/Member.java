package LLD1.Lecture4.LibrarySystem;

public class Member extends User {

    private int borrowedBooksCount;
    private static final int MAXX_BORROW_LIMIT = 5;

    public Member(int borrowedBooksCount) {
        super();
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public Member(String name, String contactInfo, int borrowedBooksCount) {
        super(name, contactInfo);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public Member(User other, int borrowedBooksCount) {
        super(other);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        if(borrowedBooksCount < MAXX_BORROW_LIMIT) {
            return true;
        }
        return false;
    }
}
