package C11.Polymorphism_Static_VS_Dynamic_Exemple1;

public class Gaming extends Laptop {

    private final String videoCard;
    private boolean isPerforming;
    private Brand brand;
    private int GbRAM;

    public enum Brand {
        ASUS_ROG, HP_OMEN, HP_PAVILION, LENOVO_IDEA_PAD, LENOVO_LEGYON, ACER_PREDATOR
    }

    public Gaming(String videoCard, String productCode, int price, boolean statutoryHoliday, int GbRAM, boolean isPerforming, Brand brand) {
        super(productCode, price, statutoryHoliday);
        this.videoCard = videoCard;
        this.GbRAM = GbRAM;
        this.isPerforming = isPerforming;
        this.brand = brand;
    }

    public void performance() {
        if (this.brand == Brand.HP_PAVILION) {
            this.isPerforming = true;
            System.out.println(Brand.HP_PAVILION + "is performing?  Answer: " + this.isPerforming);
        }
    }


    public void runGame(Brand brand) {
        if (brand == Brand.ASUS_ROG)
            switch (GbRAM) {
                case 8:
                    System.out.println("One slot occuped");
                    break;
                case 16:
                    System.out.println("Two slots occuped");
                    break;
                default:
                    System.out.println(this.GbRAM + "GB RAM Occuped");
            }

    }


    //overriding -> dynamic polymorphism ->  at runtime
    @Override
    public void CPUTemperature() {
        System.out.println("It overheats !!!");
    }

    @Override
    public void display() {
        System.out.println("17.3' inches");
    }

    @Override
    public void functions() {
        System.out.println("For GAMING");
    }

    @Override
    public String toString() {

        return super.toString() + "video card: " + this.videoCard;

    }
}
