package inheritance_vehicles;

public class Vehicle {
    protected String manufacturer;
    protected String model;
    protected int year;

    public Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public String toString() {
        return "Manufacturer: " + this.manufacturer 
        + "\nModel: " + this.model
        + "\nYear: " + this.year;
    }

    public static void main(String[] args) {
        Car audi = new Car("Audi", "RS4", 2022, 5, "Benzin");
        Motorbike bmw = new Motorbike("BMW", "S1000RR", 2021, "Supersport", "1000qm");
        Mountainbike cube = new Mountainbike("Cube", "Mountainbike 1", 2023, 7, "Fully");
        Motorbike honda = new Motorbike("Honda", "CB500F", 2022, "Naked", "500");
        ElectricCar tesla = new ElectricCar("Tesla", "Model 3", 2022, 5, "60kwh");

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(cube);
        System.out.println(honda);
        System.out.println(tesla);

        Vehicle[] vehicles = {audi, bmw, cube, honda, tesla};
        for(int i = 0; i < vehicles.length; ++i){
            System.out.println(vehicles[i]);
            System.out.println();
        }

        System.out.println("===========");
        System.out.println("For-Each Schleifenausgabe");
        System.out.println("===========");

        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            System.out.println();
        }

        System.out.println("===========");
        System.out.println("Sub class actions");
        System.out.println("===========");

        audi.startMotor();
        tesla.startMotor();

        audi.startMotor();
        tesla.stopMotor();

        cube.pedal();
        cube.pedal();

        cube.offRoadMode();
        cube.offRoadMode();

        audi.accelerate();
        tesla.accelerate();
    }
}
