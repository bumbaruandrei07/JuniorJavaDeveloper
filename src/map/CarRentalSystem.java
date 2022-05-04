package map;

import C13_Matrix.Ex;
import exceptions.course.NullPointerException;

import java.io.*;
import java.util.*;

public class CarRentalSystem implements Serializable {

    private static Scanner sc = new Scanner(System.in);
    private static final long serialVersionUID = 1L;
    private HashMap<String, String> rentedCars = //primeste 2 parametri de tip, acestia sunt amandoi de tip string, dar ei pot sa difere
            new HashMap<String, String>(100, 0.5f); //default este 0,75, il suprscrie

    private HashMap<String, RentedCars> whoRented =
            new HashMap<String, RentedCars>(100, 0.5f);


    private static ArrayList<String> cars = new ArrayList<>();

    private static String getPlateNo() throws InputMismatchException {
        System.out.println("Introducere numar inmatriculare: ");
        String search = sc.nextLine();
        //daca stringul este format doar din cifre
        if (search.matches("[0-9]+")) {
            throw new InputMismatchException("Numele de inmatriculare nu poate fi format doar din cifre!");
        }
        return search;
    }

    private static String getOwnerName() throws InputMismatchException {
        System.out.println("Introduceti numele proprietarului:");
        String search = sc.nextLine();
        //daca stringul este format doar din cifre
        if (search.matches("[0-9]+")) {
            throw new InputMismatchException("Numele proprietarului nu poate contine cifre!");
        }
        return search;
    }

    private int totalRented() {
        return rentedCars.size();
    }

    //verificam existenta cheii ownerName in map-ul whoRented
    private boolean isOwnerExisting(String ownerName) {
        return whoRented.containsKey(ownerName);
    }

    private void addNewCar(String ownerName, String vehicleName) {
        if (!isOwnerExisting(ownerName)) {
            RentedCars newRentedCar = new RentedCars();
            newRentedCar.addCar(vehicleName);
            whoRented.put(ownerName, newRentedCar);
            System.out.println("Proprietarul a fost adaugat cu succes!");

        } else {
            RentedCars rentedCars2;
            rentedCars2 = whoRented.get(ownerName);
            rentedCars2.addCar(vehicleName);
            System.out.println("Masina prorpietarului existent deja in sistem a fost adaugata cu succes!");
        }
    }

    //get the cars associated to an owner
    private RentedCars getOwnerOfCar(String ownerName) throws java.lang.NullPointerException {
        if (!whoRented.containsKey(ownerName)) {
            throw new java.lang.NullPointerException("Nu exista proprietarul in sistem!");
        }
        return whoRented.get(ownerName);
    }


    //daca o masina este inchiriata, returneaza rezultatul metodei containsKey, ne va spune daca este o pereche cu cheia plateNo data ca parametru
    //toate operatiile se realizeaza pe cheie, valoarea este asociata cheii
    // search for a key in hashtable
    private boolean isCarRent(String plateNo) {
        return rentedCars.containsKey(plateNo);
    }

    //cine a inchiriat masina, valoarea pentru cheie, cheia este plateNo, valoarea ownerName
    // get the value associated to a key
    private String getCarRent(String plateNo) throws RuntimeException {
        if (!isCarRent(plateNo)) {
            throw new RuntimeException("Masina nu exista in sistem!");
        }
        return rentedCars.get(plateNo);
    }

    //adaugarea unei masini, adica a unei perechi<cheie,valoare>
    // add a new (key, value) pair
    private void rentCar(String plateNo, String ownerName) {
        if (!isCarRent(plateNo)) {
            System.out.printf("Adaugare autoturism..." + "%nPlate No.: %s | Owner name: %s %n", plateNo, ownerName);
            rentedCars.put(plateNo, ownerName);

            //daca nu a mai inchiriat nicio masina
            if (!isOwnerExisting(ownerName)) {
                RentedCars listOfCars = new RentedCars(); //creez obiectul RentedCars care retine lista de masini inchiriate in prezent
                listOfCars.addCar(plateNo); //adaugarea unei noi masini in obiectul creat
                whoRented.put(ownerName, listOfCars); //salvarea asocierii dintre owner si lista lui de masini
            } else {
                whoRented.get(ownerName).addCar(plateNo);
            }
        } else {
            System.out.println("ERROR: Adaugarea autoturismului a esuat");
            System.out.printf("Autoturismul cu numarul de inmatriculare " + " %s este inchiriat de catre %s.%n", plateNo, rentedCars.get(plateNo));
        }
    }

    //obtinerea numarului de masini detinute de catre un proprietar
    private int getCarsNo(String ownerName) throws java.lang.NullPointerException {
        if (whoRented.containsKey(ownerName)) {
            return whoRented.get(ownerName).getSize();
        } else throw new java.lang.NullPointerException("Nu exista proprietarul in sistem!");
    }

    //stergerea unei masini
    // remove an existing (key, value) pair
    private void returnCar(String plateNo) throws java.lang.NullPointerException {
        if (isCarRent(plateNo)) {
            rentedCars.remove(plateNo);
            System.out.println("Masina a fost eliminata din sistem cu succes!");
        } else {
            throw new java.lang.NullPointerException("Eroare: Masina nu exista in sistem!");
        }
    }

    public static void writeCarsRentedToBinaryFile(CarRentalSystem carRentalSystem) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("rentedCars.dat")))) {
            objectOutputStream.writeObject(carRentalSystem);
        }
    }

    public static CarRentalSystem readCarsRentedFromBinaryFile() throws IOException {
        CarRentalSystem carRentalSystem = null;
        try (ObjectInputStream binaryFileIn = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("rentedCars.dat")))) {
            carRentalSystem = (CarRentalSystem) binaryFileIn.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println("A class not found exception: " + e.getMessage());
        }
        return carRentalSystem;
    }

    private void clearCache() {
        whoRented.clear();
        rentedCars.clear();
    }


    private void deleteFile() {
        try {
            File file = new File("rentedCars.dat");
            file.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
        System.out.println("getCarsNo    - Numarul de masini detinute de catre un proprietar");
        System.out.println("getCarsList  - Afiseaza lista de masini detinute de catre un proprietar");
        System.out.println("deleteFile   - Sterge fisierul ce contine datele salvate in sistem");
        System.out.println("reset        - Sterge datele din sistem");
    }

    public void run() {
        boolean quit = false;
        while (!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            String command = sc.nextLine();
            switch (command) {
                case "help":
                    printCommandsList();
                    break;
                case "add":
                    rentCar(getPlateNo(), getOwnerName());
                    break;
                case "add2":
                    addNewCar(getOwnerName(), getPlateNo());
                    break;
                case "check":
                    System.out.println(isCarRent(getPlateNo()));
                    break;
                case "remove":
                    returnCar(getPlateNo());
                    break;
                case "getOwner":
                    System.out.println(getCarRent(getPlateNo()));
                    break;
                case "getCarsNo":
                    System.out.println(getCarsNo(getOwnerName()));
                    break;
                case "getCarsList":
                    System.out.println(getOwnerOfCar(getOwnerName()));
                    break;
                case "totalRented":
                    System.out.println("Numarul total de masini inchiriate in prezent este: " + totalRented());
                    break;
                case "deleteFile":
                    deleteFile();
                    System.out.println("Stergerea fisierului ce contine datele a fost realizata cu succes!");
                    break;
                case "reset":
                    clearCache();
                    System.out.println("Stergerea datelor salvate in fisier a fost realizata cu succes!");
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
}