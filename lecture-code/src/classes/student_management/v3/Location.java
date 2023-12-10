package classes.student_management.v3;

public class Location {

    public String street;
    public String houseNumber;
    public String zipCode;
    public String city;

    public Location(String street, String houseNumber, String zipCode, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String toString() {
        return this.street + " " + this.houseNumber + ", " + this.zipCode + " " + this.city;
    }
}
