package LLD1.Lecture4.AbstractClasses;

public class Dog extends Animal {

    // constructor
    public Dog(String name) {
        super(name); // calls the parent constructor
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }
}
