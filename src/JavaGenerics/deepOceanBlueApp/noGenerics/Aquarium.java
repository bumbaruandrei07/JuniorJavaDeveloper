package JavaGenerics.deepOceanBlueApp.noGenerics;

import java.util.ArrayList;

//nu prea se apeleaza in mod deosebit in afara de getName().
//
public class Aquarium {

    private String description;
    private ArrayList<AquaticAnimal> fishes = new ArrayList<>(); // notice the diamond
    // <> notation! (starting Java 8) - in momentul in care folosim constructoul si validam parametrul de tip zice ca nu e nevoie sa-l dam explicti si aici
    // feature care nu a fost introdus de la inceput in java

    public Aquarium(String description) {
        this.description = description;
    }

    //primeste un AquaticAnimal si il adauga in arraylist daca nu exista deja
    public boolean addFish(AquaticAnimal fish) {
        if (fishes.contains(fish)) { //daca cumva el deja se afla in arraylist-ul meu returnez false
            System.out.println("Error: Fish " + fish.getName() + " is already in aquarium.");
            return false;
        }
    //daca nu se afla in arraylist il adaug
        fishes.add(fish);
        System.out.println("Fish " + fish.getName() + " added in aquarium.");
        return true;
    }

    //elimina ultimul element din acvariu
    public AquaticAnimal removeFish() {
        return fishes.remove(fishes.size() - 1);
    }

    public int numberOfFishes() {
        return fishes.size();
    }

    public boolean isEmpty() {
        return fishes.isEmpty();
    }
    //primeste un acvariu ca parametru si goleste un acvariu si adauga tot in celalalt acvariu, asemanator cu bag-ul de la proiect!
    public void mergeAquarium(Aquarium other) {
        while(!other.isEmpty()) {
            this.addFish(other.removeFish());
        }
    }
}