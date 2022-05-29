package Exceptions_Generics_Practice_2.solarSystem;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    private List<String> planets = new ArrayList<>();

    //   Create a method in SolarSystem to add a new planet to the end of the list.
    public void addPlanet(String planet) {
        planets.add(planet);
    }

    //   Create a method in SolarSystem to insert a new planet at a specific index of the list.
    public void addPlanetSpecificIndex(int index, String planet) {
        planets.add(index, planet);
    }

    //   Create a method in SolarSystem to remove a planet from the list.
    public void removePlanet(int index) {
        planets.remove(index);
    }

    //   Create a method in SolarSystem to replace a planet with another at a specific index from the list
    public void replacePlanet(int index, String planet) {
        planets.set(index, planet);
    }

    //   Create a method in SolarSystem to swap two planets in the list based on their index
    public void swapPlanets(int indexA, int indexB) {
        String aux = planets.get(indexA);
        planets.set(indexA, planets.get(indexB));
        planets.set(indexB, aux);
    }

    //   Create a method in SolarSystem to reverse the current order of the planets in the list.
    public void reversePlanets() {
        List<String> reversedPlanets = new ArrayList<>();
        for (int i = planets.size() - 1; i >= 0; i--) {
            reversedPlanets.add(planets.get(i));
        }
        planets = reversedPlanets;
    }

    //    Create a method in SolarSystem to properly print all the planets from the list
    public void displayPlanets() {
        for (String planet : planets) {
            System.out.println(planet);
        }
    }

    //    getter
    public List<String> getPlanets() {
        return this.planets;
    }

    @Override
    public String toString() {
        return "Planets: " + planets;
    }
}
