package LLD3_Inheritance;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println("DEBUG");

        A a1 = new B();

        // a1 is just an address variable
        // The actual object is of B type
        // And A being the parent of B, it can store its child object's address

        // B b1 = new A(); - Error

        /*
        Animal a = new Dog(); - this is correct
        Dog d = new Animal(); - this is not possible

        Ajinkya is Indian
        But all Indians are not Ajinkya.
         */
    }
}
