package LLD1.Lecture2.Constructors.ParameterisedConstructor;

public class Person {
    // TODO: Declare private data members age and name
    private int age;
    private String name;

    // TODO: Create a constructor that takes age and name as parameters
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // TODO: Implement getter methods for age and name
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // TODO: Test your implementation by creating a Person object
        Person person = new Person(20, "Rahul");
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
