package classes.a380;

public class ImprovedA380 {

    public static final String MODEL = "A380";
    public static final String MANUFACTURER = "Airbus";

    public String name;
    public String airline;
    public double currentAttitudeFt = 0;
    public String homeAirport;
    public double[] position = new double[] { 43.653929074948806, 1.3574489636964786 };

    public ImprovedA380(String airline, String name) {
        this.airline = airline;
        this.name = name;
    }

    public static void main(String[] args) {
        ImprovedA380 plane1 = new ImprovedA380("Lufthansa", "D-ABPE");
        System.out.println(plane1);
        ImprovedA380 plane2 = plane1.clone();
        System.out.println(plane1.equals(plane2));
    }

    public boolean equals(ImprovedA380 plane) {
        return plane.name.equals(this.name) && plane.airline.equals(this.airline);
    }

    public ImprovedA380 clone() {
        return new ImprovedA380(this.airline, this.name);
    }

    public String toString() {
        return this.airline + " " + ImprovedA380.MANUFACTURER + " " + ImprovedA380.MODEL + " - " + this.name;
    }

    public void printPosition() {
        System.out.println("Long: " + this.position[0] + ", Lat: " + this.position[1]);
    }
}
