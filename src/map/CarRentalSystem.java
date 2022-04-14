package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CarRentalSystem {

    private static Scanner sc = new Scanner(System.in);
    private HashMap<String, String> rentedCars = //primeste 2 parametri de tip, acestia sunt amandoi de tip string, dar ei pot sa difere
            new HashMap<String, String>(100, 0.5f); //default este 0,75, il suprscrie

    private HashMap<String, RentedCars> whoRented =
            new HashMap<String, RentedCars>(100, 0.5f);


    private static ArrayList<String> cars = new ArrayList<>();

    private static String getPlateNo() {
        System.out.println("Introduceti numarul de inmatriculare:");
        return sc.nextLine();
    }

    private static String getOwnerName() {
        System.out.println("Introduceti numele proprietarului:");
        return sc.nextLine();
    }

    private static ArrayList<String> getCars() {

        System.out.println("Introduceti numele masinii: ");
        cars.add(sc.nextLine());
        return cars;
    }


    //verificam existenta cheii ownerName in map-ul whoRented
    private boolean isOwnerExisting(String ownerName) {
        return whoRented.containsKey(ownerName);
    }

    private void addNewCar(String ownerName, RentedCars whoRentedCars) {

        if (!isOwnerExisting(ownerName)) {
            whoRented.put(ownerName, new RentedCars(getCars()));

        } else {
            System.out.println("Proprietarul exista deja in sistem!");
        }
    }

    //get the car associated to an owner

    private RentedCars getOwnerOfCar(String ownerName) {
        if (!isOwnerExisting(ownerName)) {
            return null;
        } else {
            return whoRented.get(ownerName);
        }
    }

    private void getSize(String ownerName) {
        if (isOwnerExisting(ownerName)) {
            System.out.println("Numarul de masini inchiriate de catre proprietarul:" + ownerName + " este" + getOwnerOfCar(getOwnerName()));
        }
    }

    //daca o masina este inchiriata, returneaza rezultatul metodei containsKey, ne va spune daca este o pereche cu cheia plateNo data ca parametru
    //toate operatiile se realizeaza pe cheie, valoarea este asociata cheii
    // search for a key in hashtable
    private boolean isCarRent(String plateNo) {
        return rentedCars.containsKey(plateNo);
    }

    //cine a inchiriat masina, valoarea pentru cheie, cheia este plateNo, valoarea ownerName
    // get the value associated to a key
    private String getCarRent(String plateNo) {
        if (!isCarRent(plateNo)) {
            return "Nu exista masina pentru care se cauta soferul";
        } else {
            return rentedCars.get(plateNo);
        }
    }

    //adaugarea unei masini, adica a unei perechi<cheie,valoare>
    // add a new (key, value) pair
    private void rentCar(String plateNo, String ownerName) {
        if (!isCarRent(plateNo)) {
            rentedCars.put(plateNo, ownerName);
            System.out.println("Masina a fost adaugata cu succes!");
        } else {
            System.out.println("Masina exista deja in sistem!");
        }
    }


    //stergerea unei masini
    // remove an existing (key, value) pair
    private void returnCar(String plateNo) {
        if (isCarRent(plateNo)) {
            rentedCars.remove(plateNo);
            System.out.println("Masina a fost eliminata din sistem cu succes!");
        } else {
            System.out.println("Eroare: Masina nu exista in sistem!");
        }
    }

    private static void printCommandsList() {
        System.out.println("help         - Afiseaza aceasta lista de comenzi");
        System.out.println("add          - Adauga o noua pereche (masina, sofer)");
        System.out.println("check        - Verifica daca o masina este deja luata");
        System.out.println("remove       - Sterge o masina existenta din hashtable");
        System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
        System.out.println("quit         - Inchide aplicatia");
        System.out.println("totalRented  - Numarul total de masini inchiriate in prezent");
    }

    public void run() {
        boolean quit = false;
        int newSize = rentedCars.size();
        while (!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            String command = sc.nextLine();
            switch (command) {
                case "help":
                    printCommandsList();
                    break;
                case "add":
                    rentCar(getPlateNo(), getOwnerName());
                    newSize++;
                    break;
                case "check":
                    System.out.println(isCarRent(getPlateNo()));
                    break;
                case "remove":
                    returnCar(getPlateNo());
                    newSize--;
                    break;
                case "getOwner":
                    System.out.println(getCarRent(getPlateNo()));
                    break;
                case "getCarsNo":

                    break;
                case "getCarsList":
                    System.out.println();
                    break;
                case "totalRented":
                    System.out.println("Numarul total de masini inchiriate in prezent este: " + newSize);
                    break;
                case "quit":
                    System.out.println("Aplicatia se inchide...");
                    quit = true;
                    break;
                default:
                    System.out.println("Unknown command. Choose from:");
                    printCommandsList();
            }
        }
    }

    public static void main(String[] args) {

        // create and run an instance (for test purpose)
        new CarRentalSystem().run();

    }
}