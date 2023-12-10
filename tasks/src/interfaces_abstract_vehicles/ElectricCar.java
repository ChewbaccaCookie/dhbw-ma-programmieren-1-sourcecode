package interfaces_abstract_vehicles;

public class ElectricCar extends Car {
    protected String batteryCapacity;

    private boolean charged = false;

    public ElectricCar(String manufacturer, String model, int year, int numDoors, String batteryCapacity) {
        super(manufacturer, model, year, numDoors, "Electrical");
        this.batteryCapacity = batteryCapacity;
    }

    public void refuel() {
        this.charged = true;
        System.out.println("Successfully charged");
    }
}
