package vererbung;

public class Car extends Vehicle {
    protected int numDoors;
    protected String fuelType;
    protected boolean motorOn = false;

    public Car(String manufacturer, String model, int year, int numDoors, String fuelType) {
        super(manufacturer, model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    public void stopMotor() {
        if (motorOn) {
            motorOn = false;
            System.out.println("Motor ausgeschaltet");
        } else {
            System.out.println("Motor bereits ausgeschaltet");
        }
    }

    public void startMotor() {
        if (!motorOn) {
            motorOn = true;
            System.out.println("Motor eingeschaltet");
        } else {
            System.out.println("Motor bereits eingeschaltet");
        }
    }

    public void accelerate() {
        if (motorOn) {
            System.out.println("Beschleunigen");
        }
    }

}
