package JavaGenerics.deepOceanBlueApp.noGenerics;

public class AquariumManager {

    public static void main(String[] args) {



        Shark shark = new Shark("Jow");
        Tuna tuna = new Tuna("Waty");
        Dolphin dolphin = new Dolphin("Dora");


        // o constrangere e ca nu putem sa adaugam tipuri diferite de pesti in acelasi acvariu, adica sa nu avem tipuri diferite de pesti, adica un rechin si un delfin in acelasi acvariu
        // practic adaugam 3 tipuri diferite de pesti in acelasi acvariu folosindu-ne de tipul lor comun, adica acvariu
        Aquarium aquarium1 = new Aquarium("Deep oceans blue");
        aquarium1.addFish(shark);
        aquarium1.addFish(tuna);
        aquarium1.addFish(dolphin);

        //fie implementam un acvariu pentru fiecare specie... dar o sa avem cod duplicat, crestem mult codebase-ul
        // sau... mai bine.. java generics

        System.out.println("Number of fishes: " + aquarium1.numberOfFishes());

        // Problem: fishes are not compatible!
        // Solution: One aquarium should hold only one species
        // Options:
        //   I. Could define for each type of fish a type of aquarium (i.e. child-class)
        //   -> problems: duplicate code,
        //                child-classes are useful when extra or specific functionality
        //                is required (not the case here - classes would have identic code)
        //   II. Using generics!
    }
}