package vererbung;

public class Motorbike extends Vehicle {
    protected String type;
    protected String displacement;
    private boolean motorOn = false;

    public Motorbike(String manufacturer, String model, int year, String type, String displacement) {
        super(manufacturer, model, year);
        this.displacement = displacement;
        this.type = type;
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
