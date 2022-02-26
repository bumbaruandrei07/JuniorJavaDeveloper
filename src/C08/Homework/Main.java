package C08.Homework;

public class Main {

    public static void main(String[] args) {
        System.out.println(" =================Testing the genericVehicle object ==================");
        Vehicle genericVehicle = new Vehicle("3FDS9DFF8FSD7", 4, "Generic Vehicle");
        genericVehicle.printInfo();
        System.out.println();
        genericVehicle.addFuel(10);
        System.out.println();
        genericVehicle.goTo(120, 213);
        System.out.println();
        System.out.println("Serial number using getter: " + genericVehicle.getSerialNumber());
        System.out.println();

        System.out.println(" =================Testing the onRoad object ==================");
        OnRoad onRoad = new OnRoad("3FDS9DFF8FSD7", 4, "BMW", 2, 3);
        onRoad.goTo(21.3, 12.88);
        onRoad.addFuel(24);
        onRoad.printInfo();
        System.out.println();

        System.out.println(" =================Testing the onWater object ==================");
        OnWater onWater = new OnWater("3FDS9DFF8FSD7", 2, "Submarine", 2, 1000);
        onWater.addFuel(20);
        onWater.goTo(2000, 12000);
        onWater.printInfo();
        System.out.println();

        System.out.println(" =================Testing the first onAir object ==================");
        OnAir plane = new OnAir("2SF89SS8DAD89", 50, "Tarom", 12, true);
        plane.addFuel(200);
        plane.goTo(15600, 20900);
        plane.printInfo();
        System.out.println();

        System.out.println(" =================Testing the second onAir object ==================");
        OnAir helicopter = new OnAir("2SA19GS8DAF98", 10, "AirStriker", 8, false);
        helicopter.addFuel(50);
        helicopter.goTo(2004, 9880);
        helicopter.printInfo();
    }
}
