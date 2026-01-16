package vererbung;

public class Combustor extends Car {
    protected String gearType;

    public Combustor(String manufacturer, String model, int year, int numDoors, String fuelType, String gearType) {
        super(manufacturer, model, year, numDoors, fuelType);
        this.gearType = gearType;
    }
}
