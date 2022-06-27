package Exceptions_Generics_Practice_2.rentalSystem;

import Exceptions_Generics_Practice_2.rentalSystem.exceptions.FrequentRentalPointsException;
import Exceptions_Generics_Practice_2.rentalSystem.exceptions.NoDaysException;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Bucharest_RentalSystem {

    private static final Scanner sc = new Scanner(System.in);
    private Map<String, Integer> rentalSystemBucharest = new HashMap<>(100, 0.5f);

    public enum Cars {Regular, Premium, Mini, Luxury}

    private static int TotalIncome;
    private static int regularValue;
    private static int premiumValue;
    private static int miniValue;
    private static int luxuryValue;
    private static Bucharest_RentalSystem bucharest_rentalSystem = new Bucharest_RentalSystem();


    public String addCustomer() {
        System.out.println("Adaugati un client nou: ");
        String newCustomer = sc.next();
        if (newCustomer.matches("[0-9]+")) {
            throw new InputMismatchException("Numele clientului nu poate contine cifre!");
        }
        return newCustomer;
    }

    public static void printOptions() {
        System.out.println("Adaugati un client nou:  add");
        System.out.println("Inchideti aplicatia:     quit");
    }

    public void run() throws NoDaysException, FrequentRentalPointsException {
        printOptions();
        boolean quit = false;
        while (!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            String option = sc.next();
            switch (option) {
                case "add":
                    String newCustomer = addCustomer();
                    System.out.println("Ce tip de masina doriti sa inchiriati? Regular/Premium/Mini/Luxury");
                    String carType = sc.next();
                    if (carType.equalsIgnoreCase("Mini")) {

                        System.out.println("Pentru cate zile doriti sa inchiriati masina?");
                        int choseNoDays = sc.nextInt();
                        int miniValueAux = 0;
                        if (choseNoDays <= 0) {
                            throw new NoDaysException("Numarul de zile pentru care se va inchiria masina trebuie sa fie o valoare pozitiva!");
                        }
                        if (choseNoDays <= 3) {
                            miniValueAux += choseNoDays * 22.5;
                        } else {
                            int additionalDays = choseNoDays - 3;
                            miniValueAux += 67.5 + additionalDays * 15;
                        }
                        miniValue += miniValueAux;

                        //daca nu este inregistrat atunci va primi primul punct de loialitate
                        if (!rentalSystemBucharest.containsKey(newCustomer)) {

                            rentalSystemBucharest.put(newCustomer, 1);  // first rented car
                        }

                        //clientul este deja inregistrat in sistem, va primi in plus un punct de loialitate
                        else {

                            rentalSystemBucharest.put(newCustomer, rentalSystemBucharest.get(newCustomer) + 1);
                        }

                        if (rentalSystemBucharest.get(newCustomer) >= 5) {
                            miniValueAux -= 0.05 * miniValueAux;
                            miniValue += miniValueAux;
                        }


                        System.out.printf("Clientul %s a inchiriat o masina de tipul %s la pretul de %d EURO pentru %d zile, avand %d puncte de loialitate.\n", newCustomer, Cars.Mini, choseNoDays, miniValueAux, rentalSystemBucharest.get(newCustomer));


                    } else if (carType.equalsIgnoreCase("Regular")) {
                        System.out.println("Pentru cate zile doriti sa inchiriati masina?");
                        int choseNoDays = sc.nextInt();
                        int regularValueAux = 0;
                        if (choseNoDays <= 0) {
                            throw new NoDaysException("Numarul de zile pentru care se va inchiria masina trebuie sa fie o valoare pozitiva!");
                        }

                        if (choseNoDays <= 2) {
                            regularValueAux += choseNoDays * 30;
                        } else {
                            int additionalDays = choseNoDays - 2;
                            regularValueAux += 60 + additionalDays * 22.5;
                        }

                        //daca este deja inregistrat
                        if (!rentalSystemBucharest.containsKey(newCustomer)) {
                            rentalSystemBucharest.put(newCustomer, 1); // first rented car
                        } else {

                            rentalSystemBucharest.put(newCustomer, rentalSystemBucharest.get(newCustomer) + 1);
                        }
                        if (rentalSystemBucharest.get(newCustomer) >= 5) {
                            regularValueAux -= 0.05 * regularValueAux;
                        }
                        regularValue += regularValueAux;
                        System.out.printf("Clientul %s a inchiriat o masina de tipul %s pentru %d zile la pretul de %d EURO, avand %d puncte de loialitate.\n", newCustomer, Cars.Regular, choseNoDays, regularValueAux, rentalSystemBucharest.get(newCustomer));
                    } else if (carType.equalsIgnoreCase("Premium")) {
                        System.out.println("Pentru cate zile doriti sa inchiriati masina?");
                        int choseNoDays = sc.nextInt();
                        int premiumValueAux = 0;
                        if (choseNoDays <= 0) {
                            throw new NoDaysException("Numarul de zile pentru care se va inchiria masina trebuie sa fie o valoare pozitiva!");
                        } else {
                            premiumValueAux += choseNoDays * 45;
                        }


                        if (!rentalSystemBucharest.containsKey(newCustomer) && choseNoDays >= 2) {
                            rentalSystemBucharest.put(newCustomer, 2);
                        } else if (!rentalSystemBucharest.containsKey(newCustomer) && choseNoDays < 2) {
                            rentalSystemBucharest.put(newCustomer, 1);
                        } else if (rentalSystemBucharest.containsKey(newCustomer) && choseNoDays >= 2) {
                            rentalSystemBucharest.put(newCustomer, 2);
                        } else {
                            rentalSystemBucharest.put(newCustomer, 1);
                        }

                        if (rentalSystemBucharest.get(newCustomer) >= 5) {
                            premiumValueAux -= 0.05 * premiumValueAux;
                            premiumValue += premiumValueAux;
                        }
                        premiumValue += premiumValueAux;
                        System.out.printf("Clientul %s a inchiriat o masina de tipul %s pentru %d zile la pretul de %d EURO, avand %d puncte de loialitate.\n", newCustomer, Cars.Premium, choseNoDays, premiumValueAux, rentalSystemBucharest.get(newCustomer));

                    }

                    if (carType.equalsIgnoreCase("Luxury")) {

                        if (!rentalSystemBucharest.containsKey(newCustomer)) {
                            System.out.println("Un client neinregistrat nu poate inchiria acest tip de masina!");
                            continue;
                        }
                        if (rentalSystemBucharest.get(newCustomer) < 3) {
                            throw new FrequentRentalPointsException("Pentru a inchiria o masina de tip Luxury trebuie sa aveti cel putin 3 puncte de fidelitate! In acest moment clientul are " + rentalSystemBucharest.get(newCustomer) + " puncte de loialitate!");
                        }

                        System.out.println("Pentru cate zile doriti sa inchiriati masina?");
                        int choseNoDays = sc.nextInt();
                        int luxuryValueAux = 0;
                        if (choseNoDays <= 0) {
                            throw new NoDaysException("Numarul de zile pentru care se va inchiria masina trebuie sa fie o valoare pozitiva!");
                        }
                        luxuryValueAux += luxuryValueAux + choseNoDays * 70;
                        luxuryValue += luxuryValueAux;
                        if (!rentalSystemBucharest.containsKey(newCustomer)) {
                            rentalSystemBucharest.put(newCustomer, 1);
                        } else {
                            rentalSystemBucharest.put(newCustomer, rentalSystemBucharest.get(newCustomer) + 1);
                        }
                        System.out.printf("Clientul %s a inchiriat o masina de tipul %s pentru %d zile la pretul de %d EURO, avand %d puncte de loialitate.\n", newCustomer, Cars.Luxury, choseNoDays, luxuryValueAux, rentalSystemBucharest.get(newCustomer));
                    } else {
                        System.out.println("Trebuie sa alegeti una dintre optiunile: Regular/Premium/Mini/Luxury");
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
                default:
                    System.out.println("Unknown command. Choose from:");
                    printOptions();
            }
        }
        TotalIncome += miniValue;
        TotalIncome += regularValue;
        TotalIncome += premiumValue;
        TotalIncome += luxuryValue;
        System.out.printf("Total income:             %dEUR\nMini Income:              %dEUR\nRegular Income:           %dEUR\nPremium Income:           %dEUR\nLuxury Income:            %dEUR", TotalIncome, miniValue, regularValue, premiumValue, luxuryValue);
    }


    public static void main(String[] args) throws NoDaysException, FrequentRentalPointsException {
        bucharest_rentalSystem.run();
    }
}
