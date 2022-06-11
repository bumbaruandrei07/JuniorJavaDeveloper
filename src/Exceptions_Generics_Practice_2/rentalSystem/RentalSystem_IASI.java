package Exceptions_Generics_Practice_2.rentalSystem;

public class RentalSystem_IASI {

    public enum Cars {Regular, Premium, Mini}

    private static void print() {
        for (Cars cars : Cars.values()) {
            System.out.printf("%s            ", cars);
        }
    }

    public static void main(String[] args) {
        print();
    }
}
