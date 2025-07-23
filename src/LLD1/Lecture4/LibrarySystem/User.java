package LLD1.Lecture4.LibrarySystem;

import java.util.UUID;

public abstract class User {
    private final String userId;
    private String name;
    private String contactInfo;

    private static int idCounter = 0;

    public User() {
        this.userId = generateUniqueId();
    }

    private String generateUniqueId() {
        return String.valueOf(idCounter++);
    }

    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // copy constructor
    public User(User other) {
        this.userId = other.userId;
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }

    // Getter and Setter

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}
