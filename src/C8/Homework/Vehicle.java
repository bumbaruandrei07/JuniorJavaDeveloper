package C8.Homework;

public class Vehicle {

    private final String serialNumber;
    private int noPersons;
    private String name;

    public Vehicle(String serialNumber, int noPersons) {
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
    }

    public Vehicle(String serialNumber, int noPersons, String name) {
        this(serialNumber, noPersons); //using the first constructor
        this.name = name;
    }

    // the method is final because we will not overwrite it in the derived classes
    public final String getSerialNumber() {
        return serialNumber;
    }

    //    The method is used to simulate the movement of the vehicle.
    //    Being an abstract vehicle, which cannot move (i.e. the details by which it can move are not known), the method will only display an error message and return false
    public boolean goTo(double positionX, double positionY) {
        System.out.println("Error: unknown vehicle cannot move…");
        return false;
    }

    // The method is used to simulate the fuel supply of the vehicle.
    // As in the previous case, it is not possible to add fuel because the (concrete) specifications of the vehicle are not known (eg fuel type, fuel mode, etc.). Therefore, the method will get an error message and will always return false.

    public boolean addFuel(double amount) {
        System.out.println("Error: unknown type of vehicle…");
        return false;
    }

    public void printInfo() {
        System.out.println("Vehicle properties:\n" +
                "\t\t - serial number:  " + this.serialNumber + "\n" +
                "\t\t - capacity: " + this.noPersons + " persons\n" +
                "\t\t - name: " + this.name
        );
    }
}
