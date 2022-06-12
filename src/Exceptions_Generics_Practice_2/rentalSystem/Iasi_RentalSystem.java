package Exceptions_Generics_Practice_2.rentalSystem;

import Exceptions_Generics_Practice_2.rentalSystem.exceptions.NoDaysException;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Iasi_RentalSystem {

    private static final Scanner sc = new Scanner(System.in);
    private Map<String, Integer> rentalCarsIasi = new HashMap<>(100, 0.5f);

    public enum Cars {Regular, Premium, Mini}

    private static int TotalIncome;
    private static int regularValue;
    private static int premiumValue;
    private static int miniValue;
    private int frequentRentalPoints;
    private static Iasi_RentalSystem rentalSystemIASI = new Iasi_RentalSystem();


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

    public void run() throws NoDaysException {
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
                            frequentRentalPoints = 1;  // first rented car
                            rentalCarsIasi.put(newCustomer, frequentRentalPoints);
                        }

                        //clientul este deja inregistrat in sistem, va primi in plus un punct de loialitate
                        else {
                            frequentRentalPoints++;
                            rentalCarsIasi.put(newCustomer, frequentRentalPoints);
                        }

                        if (rentalCarsIasi.get(newCustomer) >= 5) {
                            miniValueAux -= 0.05 * miniValueAux;
                            miniValue += miniValueAux;
                        }
                        System.out.printf("Clientul %s a inchiriat o masina de tipul %s la pretul de %d, avand %d puncte de loialitate\n", newCustomer, Cars.Mini, miniValueAux, frequentRentalPoints);

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
                            frequentRentalPoints = 1; // first rented car
                            rentalCarsIasi.put(newCustomer, frequentRentalPoints);
                        } else {
                            frequentRentalPoints++;
                            rentalCarsIasi.put(newCustomer, frequentRentalPoints);

                        }
                        if (rentalCarsIasi.get(newCustomer) >= 5) {
                            regularValueAux -= 0.05 * regularValueAux;

                        }
                        regularValue += regularValueAux;

                        System.out.printf("Clientul %s a inchiriat o masina de tipul %s la pretul de %d avand %d puncte de loialitate\n", newCustomer, Cars.Regular, regularValueAux, frequentRentalPoints);
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
                            frequentRentalPoints = 2;
                            rentalCarsIasi.put(newCustomer, frequentRentalPoints);
                        } else if (!rentalCarsIasi.containsKey(newCustomer) && choseNoDays < 2) {
                            frequentRentalPoints = 1;
                            rentalCarsIasi.put(newCustomer, frequentRentalPoints);
                        } else if (rentalCarsIasi.containsKey(newCustomer) && choseNoDays >= 2) {
                            frequentRentalPoints += 2;
                            rentalCarsIasi.put(newCustomer, frequentRentalPoints);
                        } else {
                            frequentRentalPoints++;
                            rentalCarsIasi.put(newCustomer, frequentRentalPoints);
                        }

                        if (rentalCarsIasi.get(newCustomer) >= 5) {
                            premiumValueAux -= 0.05 * premiumValueAux;
                            premiumValue += premiumValueAux;
                        }

                        System.out.printf("Clientul %s a inchiriat o masina de tipul %s la pretul de %d avand %d puncte de loialitate\n", newCustomer, Cars.Premium, premiumValueAux, frequentRentalPoints);

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
                    break;
                default:
                    System.out.println("Unknown command. Choose from:");
                    printOptions();
            }
        }
        TotalIncome += miniValue;
        TotalIncome += regularValue;
        TotalIncome += premiumValue;
        System.out.printf("Total income:             %dEUR\nMini Income:              %dEUR\nRegular Income:           %dEUR\nPremium Income:           %dEUR", TotalIncome, miniValue, regularValue, premiumValue);
    }


    public static void main(String[] args) throws NoDaysException {
        rentalSystemIASI.run();
    }
}
