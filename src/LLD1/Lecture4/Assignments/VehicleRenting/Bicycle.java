package LLD1.Lecture4.Assignments.VehicleRenting;

public class Bicycle implements Rentable {

    public String bicycleModel;
    public boolean isRented;

    public Bicycle(String bicycleModel) {
        this.bicycleModel = bicycleModel;
    }

    @Override
    public void rent() {
        isRented = true;
        System.out.println("cycle is now rented");
    }

    @Override
    public void returnItem() {
        isRented = false;
        System.out.println("cycle is now returned");
    }
}
