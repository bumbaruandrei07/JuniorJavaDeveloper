package map;


import java.util.*;

//proprietarul este key
//masina este value
//un proprietar poate sa detina mai multe masini in acelasi timp
public class RentedCars {

    private static Scanner sc = new Scanner(System.in);
    private static HashMap<String, String> rentedCars =
            new HashMap<String, String>(100, 0.5f);


    private static String getOwnerName() {
        System.out.println("Introduceti numele proprietarului:");
        return sc.nextLine();
    }

    private static String getVehicleName() {
        System.out.println("Introduceti numele masinii:");
        return sc.nextLine();
    }


    // search for a key in hashtable
    private static boolean isCarRent(String owner) {
        return rentedCars.containsKey(owner);
    }

    // get the value associated to a key
    private static String getCarRent(String ownerName) {
        if (!isCarRent(ownerName)) {
            System.out.println("Masina a fost inregistrata cu succes!");
            return rentedCars.get(getVehicleName());
        } else {
            return "Masina este deja inregistrata in sistem";
        }
    }


    //adaugarea unei masini, adica a unei perechi<cheie,valoare>
    // add a new (key, value) pair
    private static void rentCar(String ownerName, String rented) {
        if (!isCarRent(ownerName)) {
            rentedCars.put(ownerName, rented);
            System.out.println("Masina a fost adaugata cu succes!");
        } else {
            System.out.println("Masina exista deja in sistem!");
        }
    }

    //stergerea unei masini
    // remove an existing (key, value) pair
    private static void returnCar(String plateNo) {
        if (isCarRent(plateNo)) {
            rentedCars.remove(plateNo);
            System.out.println("Masina a fost eliminata din sistem cu succes!");
        } else {
            System.out.println("Eroare: Masina nu exista in sistem!");
        }
    }

    //numarul de masini
    private static int getSize() {
        return rentedCars.size();
    }


    private static void displayValues() {
        Iterator<String> itr = rentedCars.values().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    private static void displayKeys() {
        Iterator<String> iterator = rentedCars.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void display() {

        for (String key : rentedCars.keySet()) {
            System.out.println("key: " + key);
            System.out.println("value: " + rentedCars.get(key));
        }
    }

    public static void main(String[] args) {
        rentCar(getOwnerName(), getVehicleName());
        rentCar(getOwnerName(), getVehicleName());
        rentCar(getOwnerName(), getVehicleName());
        display();

    }
}
