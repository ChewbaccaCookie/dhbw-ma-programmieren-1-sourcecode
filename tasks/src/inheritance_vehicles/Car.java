package inheritance_vehicles;

public class Car extends Vehicle {
    protected int numDoors;
    protected String fuelType;

    private boolean isMotorStarted = false;

    public Car(String manufacturer, String model, int year, int numDoors, String fuelType) {
        super(manufacturer, model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    public void stopMotor(){
        if(isMotorStarted) {
            isMotorStarted = false;
            System.out.println("Motor successfully stopped!");
        }else {
            System.out.println("Motor is already stopped.");
        }
    }

    public void startMotor(){
        if(!isMotorStarted) {
            isMotorStarted = true;
            System.out.println("Motor successfully started!");
        }else {
            System.out.println("Motor is already started.");
        }
    }

    public void accelerate(){
        if(!isMotorStarted) {
            System.out.println("Motor needs to be started.");
        }
    }
}
