package LLD1.Lecture4.Assignments.SortableListOfCars;

public class Car implements Comparable {
    public int Price;
    public int Speed;

    public Car() {}

    public Car(int price, int speed) {
        this.Price = price;
        this.Speed = speed;
    }

    @Override
    public int compareTo(Car other) {
        return this.Price - other.Price;
    }

    public static void main(String[] args) {
        Car car = new Car(200000, 80);
        Car anotherCar = new Car(150000, 50);

        System.out.println(car.compareTo(anotherCar));
    }
}
