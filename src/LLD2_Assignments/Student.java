package LLD2_Assignments;

public class Student {
    // write the code of student class here
    int age;        // Data member to store age
    String name;    // Data member to store name

    // Default constructor: sets age to 0 and name to null
    Student() {
        this(0, null);  // Calls the fourth constructor with default values
    }

    // Constructor with int parameter: sets age to the passed parameter and name to null
    Student(int age) {
        this(age, null);  // Calls the fourth constructor with age and default name as null
    }

    // Constructor with String parameter: sets name to the passed parameter and age to 0
    Student(String name) {
        this(0, name);  // Calls the fourth constructor with default age 0 and passed name
    }

    // Constructor with two parameters: sets age and name to the passed parameters
    Student(int age, String name) {
        this.age = age;    // Initializes the age member variable
        this.name = name;  // Initializes the name member variable
    }
}
