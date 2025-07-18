package LLD2_Constructors.CopyConstructors.Student;

public class Student {
    private String name;
    private int age;
//    Student student = new Student(String name, int age);

    // Parameterised constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // default const
    public Student() {

    }

    // Copy const
    public Student(Student other) {
        this.age = other.age;
        this.name = other.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
