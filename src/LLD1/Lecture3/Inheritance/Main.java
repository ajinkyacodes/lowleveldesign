package LLD1.Lecture3.Inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println("DEBUG");

        // Does this create an object of A type or B type?
        A a1 = new B();
        a1.name = "Ajinkya";


        // We cannot access the attributes/behaviours of child class B
        // because the compiler only allows you to access the variables of the
        // data type of the object


        // a1 is just an address variable
        // The actual object is of B type
        // And A being the parent of B, it can store its child object's address

        // B b1 = new A(); - Error

        /*
        Animal a = new Dog(); - this is correct
        Dog d = new Animal(); - this is not possible

        In both we are creating an actual dog object
        List<Integer> list = new ArrayList<>();

        Ajinkya is Indian
        But all Indians are not Ajinkya.
         */
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayQueue = new LinkedList<>();

        System.out.println("DEBUG");
    }
}
