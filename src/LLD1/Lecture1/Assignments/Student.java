package LLD1.Lecture1.Assignments;

public class Student {
    // write the code of student class here
    int age;
    String name;

    void display(){
        System.out.println("My name is " + name + ". I am " + age + " years old");
    }

    void sayHello(String name){
        System.out.println(this.name + " says hello to " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.age = 10;
        s.name = "Amit";

        s.display();
        s.sayHello("Rahul");
    }
}
