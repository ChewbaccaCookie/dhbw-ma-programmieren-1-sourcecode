package inheritance_vehicles;

public class Mountainbike extends Bicycle{
    protected String suspension;
    
    private boolean isInOffRoadMode = false;

    public Mountainbike(String manufacturer, String model, int year, int numGears, String suspension) {
        super(manufacturer, model, year, numGears);
        this.suspension = suspension;
    }

    public void offRoadMode() {
        isInOffRoadMode = !isInOffRoadMode;
        System.out.println("Off road mode switched to " + this.isInOffRoadMode);
    }
}
