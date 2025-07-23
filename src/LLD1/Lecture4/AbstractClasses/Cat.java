package LLD1.Lecture4.AbstractClasses;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    // If you don't define abstract method then class becomes abstract
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}
