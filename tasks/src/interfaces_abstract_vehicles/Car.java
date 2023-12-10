package interfaces_abstract_vehicles;

public abstract class Car extends MotorVehicle {
    protected int numDoors;
    protected String fuelType;

    public Car(String manufacturer, String model, int year, int numDoors, String fuelType) {
        super(manufacturer, model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }
}
