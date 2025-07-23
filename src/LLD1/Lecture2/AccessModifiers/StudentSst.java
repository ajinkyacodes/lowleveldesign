package LLD1.Lecture2.AccessModifiers;

public class StudentSst {
    public int rollNo;
    String course; // default
    protected int batchId;
    private String name;

    public static void main(String[] args) {
        StudentSst rohit = new StudentSst();
        rohit.rollNo = 1; // public
        rohit.batchId = 2; // protected
        rohit.course = "Academy DSA"; // default
        rohit.name = "aaa";
    }
}
