package classes.a380;

public class A380 {

    public static final String MODEL = "A380";
    public static final String MANUFACTURER = "Airbus";

    public String name = "D-ABPE";
    public String airline = "Lufthansa";
    public double currentAttitudeFt = 568.88;
    public String homeAirport = "Frankfurt";
    public double[] position = new double[] { 47.2879611830445, 2.2187573079787364 };

    public static void main(String[] args) {
        // Initialisierung
        A380 plane1 = null;
        plane1 = new A380();
        A380 plane2 = new A380();

        plane1.printPosition();
        plane2.printPosition();
    }

    public String toString() {
        return this.airline + " " + A380.MANUFACTURER + " " + A380.MODEL + " - " + this.name;
    }

    public void printPosition() {
        System.out.println("Long: " + this.position[0] + ", Lat: " + this.position[1]);
    }
}
