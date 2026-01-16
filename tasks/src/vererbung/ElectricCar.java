package vererbung;

public class ElectricCar extends Car {
    protected int batteryCapacity; // in KWh
    private int battery = 0;

    public ElectricCar(String manufacturer, String model, int year, int numDoors, String fuelType,
            int batteryCapacity) {
        super(manufacturer, model, year, numDoors, fuelType);
        this.batteryCapacity = batteryCapacity;
    }

    // one KWh per minute
    public void charge(int time) {
        if (battery + time > batteryCapacity) {
            battery = batteryCapacity;
            return;
        }
        battery += time;
    }

    @Override
    public void startMotor() {
        if (motorOn) {
            System.out.println("Motor ist bereits gestartet.");
            return;
        }
        if (battery <= 0) {
            System.out.println("Bitte erst laden!");
            return;
        }
        motorOn = true;
        System.out.println("Motor wurde gestartet");
    }

    @Override
    public void accelerate() {
        if (!motorOn) {
            System.out.println("Start Motor first");
            return;
        }
        if (battery == 0) {
            System.out.println("Batteriekapazität reicht nicht aus zum beschleunigen");
            stopMotor();
            return;
        }
        battery -= 1;
        System.out.println("Current battery capacity: " + battery + " KWh");
    }

}
