package C11.Polymorphism_Static_VS_Dynamic_Exemple1;


public class TestLaptops {

    public static void main(String[] args) {
        Laptop firstGenericLaptop = new Laptop("UCV20FHV", 20000, true);
        firstGenericLaptop.applyDiscount(200);
        firstGenericLaptop.applyDiscount(Laptop.LaptopType.BUSINESS);
        firstGenericLaptop.CPUTemperature();
        firstGenericLaptop.display();
        firstGenericLaptop.functions();
        System.out.println(firstGenericLaptop);


        Gaming laptopGaming1 = new Gaming("NVidia RTX 3090", "UERBB9123", 20000, false, 16, true, Gaming.Brand.HP_OMEN);
        laptopGaming1.CPUTemperature();
        laptopGaming1.display();
        laptopGaming1.functions();
        laptopGaming1.runGame(Gaming.Brand.HP_OMEN);
        System.out.println(laptopGaming1);

        Gaming laptopGaming2 = new Gaming("NVidia GeForce 1060", "FRTH1293", 2000, false, 8, true, Gaming.Brand.HP_PAVILION);
        laptopGaming2.performance();


    }
}
