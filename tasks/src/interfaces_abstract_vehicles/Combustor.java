package interfaces_abstract_vehicles;

public class Combustor extends Car {
    protected String gearType;

    public Combustor(String manufacturer, String model, int year, int numDoors, String fuelType, String gearType) {
        super(manufacturer, model, year, numDoors, fuelType);
        this.gearType = gearType;
    }

    @Override
    public void refuel() {
        System.out.println("Refueled with " + fuelType);
    }
}
