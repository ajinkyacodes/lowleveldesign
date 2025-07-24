package LLD1.Lecture4.Assignments.VehicleRenting;

public class VehicleRenting {
    public static void main(String[] args) {
        Rentable car = new Car("Toyota Camry");
        Rentable bicycle = new Bicycle("Mountain Bike");

        car.rent();
        bicycle.rent();
        car.returnItem();
        bicycle.returnItem();
    }
}
