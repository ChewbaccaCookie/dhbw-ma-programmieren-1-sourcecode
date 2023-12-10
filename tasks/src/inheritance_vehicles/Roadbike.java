package inheritance_vehicles;

public class Roadbike extends Bicycle{
    protected int tireWidth;

    private boolean isInSpeedMode = false;

    public Roadbike(String manufacturer, String model, int year, int numGears, int tireWidth) {
        super(manufacturer, model, year, numGears);
        this.tireWidth = tireWidth;
    }

    public void speedMode() {
        this.isInSpeedMode = !this.isInSpeedMode;
        System.out.println("Speed mode switched to: " + this.isInSpeedMode);
    }
}
