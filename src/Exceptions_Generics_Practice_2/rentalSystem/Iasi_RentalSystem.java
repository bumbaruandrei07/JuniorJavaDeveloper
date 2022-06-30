package Exceptions_Generics_Practice_2.rentalSystem;

import Exceptions_Generics_Practice_2.rentalSystem.exceptions.NoCustomerException;
import Exceptions_Generics_Practice_2.rentalSystem.exceptions.NoDaysException;

import java.io.*;
import java.util.*;

public class Iasi_RentalSystem implements Serializable {

    private static final Scanner sc = new Scanner(System.in);
    private Map<String, Integer> rentalCarsIasi = new HashMap<>(100, 0.5f);

    public enum Cars {Regular, Premium, Mini}

    private int TotalIncome;
    private int regularValue;
    private int premiumValue;
    private int miniValue;

    public static final long serialVersionUID = 1L;
//    private List<Integer> myList = new ArrayList<>();

    public String addCustomer() {
        System.out.println("Adaugati un client nou: ");
        String newCustomer = sc.next();
        if (!newCustomer.matches("[a-zA-Z]+")) {
            throw new InputMismatchException("Numele clientului nu poate contine decat litere!");
        }
        return newCustomer;
    }


    public String searchCustomer() {
        System.out.println("Pentru care client doriti sa aflati numarul de puncte de loialitate acumulate?");
        String newCustomer = sc.next();
        if (!newCustomer.matches("[a-zA-Z]+")) {
            throw new InputMismatchException("Numele clientului nu poate contine decat litere!");
        }
        return newCustomer;
    }


    public int getFrequentRentalPointForCustomer(String customer) throws NoCustomerException {
        if (!rentalCarsIasi.containsKey(customer)) {
            throw new NoCustomerException("Clientul cautat nu exista in sistem!");
        }
        return rentalCarsIasi.get(customer);
    }

    public static void printOptions() {
        System.out.println("Adaugati un client nou:  add");
        System.out.println("Inchideti aplicatia:     quit");
        System.out.println("Aflati numarul punctelor de loialitate pentru un anumit client: points");
        System.out.println("Stergeti datele salvate in sistem:  reset\n");
    }

    public static void writeToBinaryObject(Iasi_RentalSystem iasi_rentalSystem) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("customers.dat")))) {
            objectOutputStream.writeObject(iasi_rentalSystem);
        }
    }

    public static Iasi_RentalSystem readFromBinaryFile() throws IOException {
        Iasi_RentalSystem iasi_rentalSystem = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("customers.dat")))) {
            iasi_rentalSystem = (Iasi_RentalSystem) objectInputStream.readObject();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return iasi_rentalSystem;
    }

    public void resetApp() {
        rentalCarsIasi.clear();
        miniValue = 0;
        regularValue = 0;
        premiumValue = 0;
        TotalIncome = 0;
        System.out.println("Aplicatia a fost resetata cu succes!");
    }

    public void run() throws NoDaysException, NoCustomerException {
        printOptions();
        boolean quit = false;
        while (!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            String option = sc.next();
            switch (option) {
                case "add":
                    String newCustomer = addCustomer();
                    System.out.println("Ce tip de masina doriti sa inchiriati? Regular/Premium/Mini");
                    String carType = sc.next();
                    if (carType.equalsIgnoreCase("Mini")) {
                        System.out.println("Pentru cate zile doriti sa inchiriati masina?");
                        int choseNoDays = sc.nextInt();
                        int miniValueAux = 0;
                        if (choseNoDays <= 0) {
                            throw new NoDaysException("Numarul de zile pentru care se va inchiria masina trebuie sa fie o valoare pozitiva!");
                        }
                        if (choseNoDays <= 3) {
                            miniValueAux += choseNoDays * 15;
                        } else {
                            int additionalDays = choseNoDays - 3;
                            miniValueAux += 45 + additionalDays * 10;
                        }
                        miniValue += miniValueAux;

                        //daca nu este inregistrat atunci va primi primul punct de loialitate
                        if (!rentalCarsIasi.containsKey(newCustomer)) {
                            rentalCarsIasi.put(newCustomer, 1); // first rented car
                        }

                        //clientul este deja inregistrat in sistem, va primi in plus un punct de loialitate
                        else {
                            rentalCarsIasi.put(newCustomer, rentalCarsIasi.get(newCustomer) + 1);
                        }

                        if (rentalCarsIasi.get(newCustomer) >= 5) {
                            miniValueAux -= 0.05 * miniValueAux;
                            miniValue += miniValueAux;
                        }
                        System.out.printf("Clientul %s a inchiriat o masina de tipul %s pentru %d zile la pretul de %d EURO, avand %d puncte de loialitate.\n", newCustomer, Cars.Mini, choseNoDays, miniValueAux, rentalCarsIasi.get(newCustomer));

                    } else if (carType.equalsIgnoreCase("Regular")) {
                        System.out.println("Pentru cate zile doriti sa inchiriati masina?");
                        int choseNoDays = sc.nextInt();
                        int regularValueAux = 0;
                        if (choseNoDays <= 0) {
                            throw new NoDaysException("Numarul de zile pentru care se va inchiria masina trebuie sa fie o valoare pozitiva!");
                        }

                        if (choseNoDays <= 2) {
                            regularValueAux += choseNoDays * 20;
                        } else {
                            int additionalDays = choseNoDays - 2;
                            regularValueAux += 40 + additionalDays * 15;
                        }

                        //daca este deja inregistrat
                        if (!rentalCarsIasi.containsKey(newCustomer)) {
                            rentalCarsIasi.put(newCustomer, 1); // first rented car

                        } else {
                            rentalCarsIasi.put(newCustomer, rentalCarsIasi.get(newCustomer) + 1);
                        }
                        if (rentalCarsIasi.get(newCustomer) >= 5) {
                            regularValueAux -= 0.05 * regularValueAux;

                        }
                        regularValue += regularValueAux;

                        System.out.printf("Clientul %s a inchiriat o masina de tipul %s pentru %d zile la pretul de %d EURO, avand %d puncte de loialitate.\n", newCustomer, Cars.Regular, choseNoDays, regularValueAux, rentalCarsIasi.get(newCustomer));
                    } else if (carType.equalsIgnoreCase("Premium")) {
                        System.out.println("Pentru cate zile doriti sa inchiriati masina?");
                        int choseNoDays = sc.nextInt();
                        int premiumValueAux = 0;
                        if (choseNoDays <= 0) {
                            throw new NoDaysException("Numarul de zile pentru care se va inchiria masina trebuie sa fie o valoare pozitiva!");
                        } else {
                            premiumValueAux += choseNoDays * 30;
                        }
                        premiumValue += premiumValueAux;

                        if (!rentalCarsIasi.containsKey(newCustomer) && choseNoDays >= 2) {
                            rentalCarsIasi.put(newCustomer, 2);
                        } else if (!rentalCarsIasi.containsKey(newCustomer) && choseNoDays < 2) {
                            rentalCarsIasi.put(newCustomer, 1);
                        } else if (rentalCarsIasi.containsKey(newCustomer) && choseNoDays >= 2) {
                            rentalCarsIasi.put(newCustomer, rentalCarsIasi.get(newCustomer) + 2);
                        } else {
                            rentalCarsIasi.put(newCustomer, rentalCarsIasi.get(newCustomer) + 1);
                        }

                        if (rentalCarsIasi.get(newCustomer) >= 5) {
                            premiumValueAux -= 0.05 * premiumValueAux;
                            premiumValue += premiumValueAux;
                        }

                        System.out.printf("Clientul %s a inchiriat o masina de tipul %s pentru %d zile la pretul de %d EURO, avand %d puncte de loialitate.\n", newCustomer, Cars.Premium, choseNoDays, premiumValueAux, rentalCarsIasi.get(newCustomer));

                    } else {
                        System.out.println("Trebuie sa alegeti una dintre optiunile: Regular/Premium/Mini");
                        continue;
                    }
                    break;
                case "help":
                    printOptions();
                    break;
                case "quit":
                    quit = true;
                    sc.close();
                    break;
                case "points":
                    System.out.println(getFrequentRentalPointForCustomer(searchCustomer()));
                    break;
                case "reset":
                    resetApp();
                    break;
                case "income":

                default:
                    System.out.println("Unknown command. Choose from:");
                    printOptions();
            }
        }
        TotalIncome = miniValue + regularValue + premiumValue;
        System.out.printf("Total income:             %dEUR\nMini Income:              %dEUR\nRegular Income:           %dEUR\nPremium Income:           %dEUR", TotalIncome, miniValue, regularValue, premiumValue);

    }


    public static void main(String[] args) throws NoDaysException, NoCustomerException, IOException {
        Iasi_RentalSystem iasi_rentalSystem = new Iasi_RentalSystem();
        iasi_rentalSystem = Iasi_RentalSystem.readFromBinaryFile();
        iasi_rentalSystem.run();
        Iasi_RentalSystem.writeToBinaryObject(iasi_rentalSystem);

    }
}