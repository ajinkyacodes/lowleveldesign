package LLD2_Constructors.DefaultContructors;

public class Student {
    private String name;
    private int id;
    private double psp;

    public Student(String name, int id) {
        System.out.println(this);
        this.name = name;
    }

    public Student() {

    }

    public Student(int id, String name) {

    }
}
