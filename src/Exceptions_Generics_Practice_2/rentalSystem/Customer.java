package Exceptions_Generics_Practice_2.rentalSystem;

import Exceptions_Generics_Practice_2.rentalSystem.exceptions.NoDaysException;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Customer {

    private static final Scanner sc = new Scanner(System.in);
    private Map<String, RentalSystem_IASI.Cars> rentalCarsIasi = new HashMap<>(100, 0.5f);
    private static int TotalIncome;
    private static int noDays;
    private int frequentRentalPoints;
    private static int regularValue;
    private static int premiumValue;
    private static int miniValue;
    private static Customer customer = new Customer();


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

    public void add() throws NoDaysException {
        boolean quit = false;
        while (!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            String option = sc.next();
            switch (option) {
                case "add":
                    System.out.println("Ce tip de masina doriti sa inchiriati? Regular/Premium/Mini");
                    String carType = sc.next();
                    String newCustomer = addCustomer();

                    if (carType.equals("Mini")) {
                        System.out.println("Pentru cate zile doriti sa inchiriati masina?");
                        int choseNoDays = sc.nextInt();
                        int miniValueAux = 0;
                        if (choseNoDays <= 0) {
                            throw new NoDaysException("Numarul de zile pentru care se va inchiria masina trebuie sa fie o valoare pozitiva!");
                        }
                        if (choseNoDays <= 3) {

                            miniValueAux += choseNoDays * 15;
                            miniValue += miniValueAux;

                        } else {
                            int additionalDay = choseNoDays - 3;
                            miniValueAux += 45 + additionalDay * 10;
                            miniValue += miniValueAux;
                        }


                        rentalCarsIasi.put(newCustomer, RentalSystem_IASI.Cars.Mini);
                        System.out.printf("Clientul %s a inchiriat o masina de tipul %s la pretul de %d\n", newCustomer, RentalSystem_IASI.Cars.Mini, miniValueAux);


                    }

                    if (carType.equals("regular")) {

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
        System.out.printf("Total income:             %d\nMini Income:              %d", TotalIncome, miniValue);
    }


    public static void main(String[] args) throws NoDaysException {
        customer.add();
    }

}
