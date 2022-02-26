package C9.nature;

public class Zebra extends Terrestrial {

    public Zebra(boolean carnivore, int weight, int size,
                 String species, int legs, int eyes) {
        super(carnivore, weight, size, species, legs, eyes);
    }

    @Override
    public void saySomething() {
        System.out.println("Wzzeeaaaa... This zebra says something...");
    }

    @Override
    public void camouflage() {
        System.out.println("Quick! Grouping all together confuses the predator!");
    }

    public void stripes() {
        System.out.println("I have particular stripes!");
    }

    @Override
    public void specialCharacteristic() {
        System.out.println("I have particular stripes!");
    }
}