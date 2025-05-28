package constructors;

public class Student {
    String name;
    int age;
    String batch;
    float psp;

    // no parameters
    public Student() {
        // all vlaues get assigned to default
        name = "Default";
        age = 10;
    }

    // with parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayName() {
        System.out.println("Student name: "+name);
    }
}
