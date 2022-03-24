package JavaGenerics.deepOceanBlueApp.withGenerics;

public class AquariumManager {

    public static void main(String[] args) {
        Shark shark = new Shark("Jow");
        Tuna tuna = new Tuna("Waty");
        Dolphin dolphin = new Dolphin("Dora");

        // notice the diamond
        Aquarium<Shark> aquarium1 = new Aquarium<>("Ferocious beasts");
        aquarium1.addFish(shark);
        aquarium1.addFish(new Shark("Ferorino"));
        aquarium1.addFish(new Shark("Dangerino"));
//        aquarium1.addFish(tuna);  ERROR because we can add only sharks
        // notice the diamond
        Aquarium<Dolphin> aquarium2 = new Aquarium<>("Swim with dolphins");
        aquarium2.addFish(dolphin);
        aquarium2.addFish(new Dolphin("Laughy"));
        aquarium2.addFish(new Dolphin("Ginger"));

        System.out.println(aquarium1.numberOfFishes());

        // Compile time error for trying to create
        // an aquarium with an incompatible inner type. Nice!
//        Aquarium<Integer> aq3 = new Aquarium<>("An aquarium with numbers?");
//        Aquarium<String> aq4 = new Aquarium<>("An aquarium with letters?");

        // No exception thrown because compiler detects first the bug!
//        aq3.addFish(3); //nu pot sa fac cast de la un integer la un AquaticAnimal
        //nu mai putem sa avem elemente amestecate!
//        aq4.addFish("String");


    }
}