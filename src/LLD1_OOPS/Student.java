package LLD1_OOPS;

public class Student {
    // attributes of the Student class
    String name;
    int id;
    String email;
    String course;

    // Behaviours of the student class
    void registerForCourse(String newCourse){
        this.course = newCourse;
        System.out.println(name + " has registered for the course: "+ course);
    }

    void submitAssignment(String assignmentTitle) {
        System.out.println(name + " has submitted the assignment: "+ assignmentTitle);
    }

    void displayDetails() {
        System.out.println("Student Details: ");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        // We can create real entities from the Student class
        Student prakhar  = new Student();
        prakhar.name = "Prakhar";
        prakhar.email = "prakhar@gmail.com";
        prakhar.id = 1;
        prakhar.course = "Backend LLD";
        prakhar.displayDetails();

        System.out.println();

        Student shilpa  = new Student();
        shilpa.name = "Shilpa";
        shilpa.email = "shilpa@gmail.com";
        shilpa.id = 1;
        shilpa.course = "Backend LLD July";
        shilpa.displayDetails();
        System.out.println();
        shilpa.registerForCourse("Java");
        shilpa.submitAssignment("LLD 1");
    }
}
