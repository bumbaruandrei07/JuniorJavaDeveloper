package C08.practice;

public class Main {

    public static void main(String[] args) {
        // constructor initializes all fields (inherited + owned)
        Terrestrial aTerrestrialAnimal = new Terrestrial(false, 5, 10, "monkeys", 4, 2);

        aTerrestrialAnimal.eat(5); // call the inherited eat(int) method
        aTerrestrialAnimal.fight(); // call proprietary method
        aTerrestrialAnimal.description(); // call the inherited description() method

    }
}
