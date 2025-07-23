package LLD3.Polymorphism;

public class Main {
    public static void main(String[] args) {

        // Example of Method Overriding - Runtime LLD3.Polymorphism

        A a = new A();
        a.doSomething(); // Inside A

        a = new B();
        a.doSomething(); // Inside B
    }
}
