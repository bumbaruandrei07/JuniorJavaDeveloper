package JavaGenerics.deepOceanBlueApp.withGenerics;

import java.util.ArrayList;

// 1 adding generic type
//este folosit E de obicei, ca si coding style, ca si conventie
//mentionam ca primim un parametru de tip
//public class Aquarium<E> {
//
//    private String description;
//
//    // 2. fishes have the type of the aquarium
//    //arraylistul va trebui si el sa primeasca acelasi parametru de tip
//    //cand se creeaza obiectul meu vom inlocui acest E
//    //acest param de tip va fi tipul elementelor pe care le stocam
//    private ArrayList<E> fishes = new ArrayList<>();
//
//    public Aquarium(String description) {
//        this.description = description;
//    }
//
//    // 3. adding a new fish... of the same type E as the aquarium
//    public boolean addFish(E fish) {
//        if (fishes.contains(fish)) {
//            // 3.1 Fixing the error implies a forced casting
//            System.out.println("Error: Fish " +
//                    ((AquaticAnimal)fish).getName() +
//                    " is already in aquarium.");
//            return false;
//        }
//
//        fishes.add(fish);
//        // 3.2. Fixing the error implies a forced casting
//        System.out.println("Fish " +
//                ((AquaticAnimal)fish).getName() +
//                " added in aquarium.");
//        return true;
//    }
//
//    // 4. removing fish of type E
//    public E removeFish() {
//        return fishes.remove(fishes.size() - 1);
//    }
//
//    public int numberOfFishes() {
//        return fishes.size();
//    }
//
//    public boolean isEmpty() {
//        return fishes.isEmpty();
//    }
//
//    // 5. Reinforce merge of same type of aquarium
//    public void mergeAquarium(Aquarium<E> other) {
//        while(!other.isEmpty()) {
//            this.addFish(other.removeFish());
//        }
//    }
//}
import java.util.ArrayList;

// 1 upper bounded type parameter

//Last Improvement
// nu mai putem crea containere de tipul Aquarium care sa fie de alt tip, doar daca mai extindem
// nu mai e nevoie de un cast fortat!
// o sa putem apela direct metoda getName() din AquaticAnimal (clasa de baza, cea abstracta) pe obiectul fish de tipul E, pt ca stiu ca E trebuie sa mosteneasca AquaticAnimal
// si astfel proprietatile lui AquaticAnimal sunt prezentre in obiectul fish
//am adaugat astfel o constrangere, nu mai putem crea Aquarium care sa retina elemente intregi sau Stringuri
public class Aquarium<E extends AquaticAnimal> {

    private String description;
    private ArrayList<E> fishes = new ArrayList<>();

    public Aquarium(String description) {
        this.description = description;
    }

    public boolean addFish(E fish) {
        if (fishes.contains(fish)) {
            // 2.1 No need to force casting -> code is much cleaner and
            //     will not throw exceptions for incompatible objects
            //     (because they will be fixed at compile time)
            System.out.println("Error: Fish " + fish.getName() + " is already in aquarium.");
            return false;
        }

        fishes.add(fish);
        // 3.2. Same as 3.1
        System.out.println("Fish " + fish.getName() + " added in aquarium.");
        return true;
    }

    public E removeFish() {
        return fishes.remove(fishes.size() - 1);
    }

    public int numberOfFishes() {
        return fishes.size();
    }

    public boolean isEmpty() {
        return fishes.isEmpty();
    }

    public void mergeAquarium(Aquarium<E> other) {
        while(!other.isEmpty()) {
            this.addFish(other.removeFish());
        }
    }
}