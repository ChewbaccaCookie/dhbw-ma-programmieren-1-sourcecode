package interfaces_abstract_vehicles;

public abstract class MotorVehicle extends Vehicle {
    private boolean isMotorStarted = false;

    public MotorVehicle(String manufacturer, String model, int year) {
        super(manufacturer, model, year);
    }

    public void stopMotor() {
        if (isMotorStarted) {
            isMotorStarted = false;
            System.out.println("Motor successfully stopped!");
        } else {
            System.out.println("Motor is already stopped.");
        }
    }

    public void startMotor() {
        if (!isMotorStarted) {
            isMotorStarted = true;
            System.out.println("Motor successfully started!");
        } else {
            System.out.println("Motor is already started.");
        }
    }

    public void accelerate() {
        if (!isMotorStarted) {
            System.out.println("Motor needs to be started.");
        }
    }

    public abstract void refuel();

}
