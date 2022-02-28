package C08.practice;

public class Terrestrial extends Animal {

    private int legs;
    private int eyes;

    public Terrestrial(boolean carnivore, int weight, int size, String species) {
        // call the constructor of Animal with the list of 4 parameters
        super(carnivore, weight, size, species);
    }

    public Terrestrial(boolean carnivore, int weight, int size, String species,
                       int legs, int eyes) {
        super(carnivore, weight, size, species);
        this.legs = legs;
        this.eyes = eyes;
    }

    public void fight() {
        System.out.println("The terrestrial animal is now fighting!!");
    }

    @Override
    public void description() {
        System.out.println("The terrestrial animal has: " + this.legs
                + " legs and " + this.eyes + " eyes");
        super.description();
    }
}