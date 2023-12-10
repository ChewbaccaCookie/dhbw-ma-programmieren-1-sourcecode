package inheritance_vehicles;

public class Bicycle extends Vehicle {
    protected int numGears;
    protected boolean pedalIsMoved = false;
    
    public Bicycle(String manufacturer, String model, int year, int numGears) {
        super(manufacturer, model, year);
        this.numGears = numGears;
    }

    public void pedal() {
        pedalIsMoved = !pedalIsMoved;
        System.out.println("Pedals are moving: " + pedalIsMoved);
    }
}