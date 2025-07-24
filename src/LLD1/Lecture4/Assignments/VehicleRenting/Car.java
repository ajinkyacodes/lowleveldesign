package LLD1.Lecture4.Assignments.VehicleRenting;

public class Car implements Rentable {

    public String carModel;
    public boolean isRented;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public void rent() {
        isRented = true;
    }

    @Override
    public void returnItem() {
        isRented = false;
        System.out.println("car is now returned");
    }
}
