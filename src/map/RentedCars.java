package map;


import java.io.Serializable;
import java.util.*;

//proprietarul este key
//masina este value
//un proprietar poate sa detina mai multe masini in acelasi timp
public class RentedCars implements Serializable {

    private static Scanner sc = new Scanner(System.in);
    private ArrayList<String> cars;

    public void addCar(String vehicleName) {
        cars.add(vehicleName);
    }

    public int getSize(){
        return cars.size();
    }

    public RentedCars() {
        this.cars = new ArrayList<>();
    }

    public RentedCars(ArrayList<String> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Masinile inchiriate de catre proprietar sunt: " + this.cars;
    }






    //    private static boolean isCarRent(String vehicleName) {
//        return cars.contains(vehicleName);
//    }
//
//    private static ArrayList<String> addCar(String vehicleName) {
//        if (!isCarRent(vehicleName)) {
//            cars.add(vehicleName);
//            return cars;
//        }
//        return null;
//    }


    //stergerea unei masini
    // remove an existing (key, value) pair
//    private static void returnCar(String vehicleName) {
//        if (isCarRent(vehicleName)) {
//            cars.remove(vehicleName);
//            System.out.println("Masina a fost eliminata din sistem cu succes!");
//        } else {
//            System.out.println("Eroare: Masina nu exista in sistem!");
//
//        }
//    }


//    private static void displayValues() {
//        Iterator<String> itr = rentedCars.values().iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//    }
//
//    private static void displayKeys() {
//        Iterator<String> iterator = rentedCars.keySet().iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }
//
//    public static void display() {
//
//        for (String key : rentedCars.keySet()) {
//            System.out.println("key: " + key);
//            System.out.println("value: " + rentedCars.get(key));
//        }
//    }

    public static void main(String[] args) {

//        System.out.println(addCar(getVehicleName()));
//        System.out.println(addCar(getVehicleName()));
//        System.out.println(addCar(getVehicleName()));
//        System.out.println();
//        returnCar(getVehicleName());
    }
}
