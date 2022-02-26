package C11.Polymorphism_Static_VS_Dynamic_Exemple1;

public class Laptop {


    private boolean statutoryHoliday;
    private final String productCode;
    private int price;

    public enum LaptopType {
        GAMING, BUSINESS, TwoInOne, ULTRAPORTABLE
    }

    LaptopType type;

    public Laptop(LaptopType type, String productCode, boolean statutoryHoliday, int price) {
        this.productCode = productCode;
        this.type = type;
        this.statutoryHoliday = statutoryHoliday;
        this.price = price;
    }

    public Laptop(String productCode, int price, boolean statutoryHoliday) {
        this.productCode = productCode;
        this.price = price;
        this.statutoryHoliday = statutoryHoliday;
    }


    //overloading -> static polymorphism ->  at compile time
    public void applyDiscount(int discountValue) {
        if (discountValue > 100) {
            this.price = (price * 50) / 100;
            System.out.println("The price is: " + this.price + " USD");
        } else this.price -= 100;
        System.out.println("The price is: " + this.price + " USD");
    }

    //overloading -> static polymorphism ->  at compile time
    public void applyDiscount(LaptopType type) {
        if (statutoryHoliday) {
            if (type == LaptopType.BUSINESS) {
                this.price -= 100;
                System.out.println("The price is: " + this.price + " USD");
            } else if (type == LaptopType.GAMING) {
                this.price -= 500;
                System.out.println("The price is: " + this.price + " USD");
            } else if (type == LaptopType.TwoInOne) {
                this.price -= 1000;
                System.out.println("The price is: " + this.price + " USD");
            } else if(type == LaptopType.ULTRAPORTABLE) {
                this.price -= 1500;
                System.out.println("The price is: " + this.price + " USD");
            }
           else System.out.println("UNKNOWN TYPE");
        }

    }


    public void CPUTemperature() {
        System.out.println("Does not overheat");
    }

    public void display() {
        System.out.println("15'6 inches");
    }


    public void functions() {
        System.out.println("Universal");
    }


    @Override
    public String toString() {
        return "Laptop product code: " + this.productCode + ", price: " + this.price + "USD, type: " + this.type;
    }
}
