package inheritance_vehicles;

public class Motorbike extends Vehicle{
    protected String type;
    protected String displacement;

    private boolean isMotorStarted = false;

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
