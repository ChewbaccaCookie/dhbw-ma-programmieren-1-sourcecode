package vererbung;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "A3", 2023, 5, "Benzin");
        car.startMotor();
        car.accelerate();

        ElectricCar electricCar = new ElectricCar("VW", "ID.4", 2024, 5, "Electric", 46);
        electricCar.charge(1);
        electricCar.startMotor();
        electricCar.accelerate();
        electricCar.accelerate();

        Car eCar = electricCar;
        eCar.startMotor();
        eCar.accelerate();
    }
}
