package interfaces_abstract_vehicles;

public class Motorbike extends MotorVehicle {
    protected String type;
    protected String displacement;

    public Motorbike(String manufacturer, String model, int year, String type, String displacement) {
        super(manufacturer, model, year);
        this.type = type;
        this.displacement = displacement;
    }

    public String toString() {
        return super.toString()
                + "\nType: " + type
                + "\nDisplacement: " + displacement;
    }

    @Override
    public void refuel() {
        stopMotor();
        System.out.println("");

    }
}
