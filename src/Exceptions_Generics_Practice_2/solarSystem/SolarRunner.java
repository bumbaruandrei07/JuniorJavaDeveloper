package Exceptions_Generics_Practice_2.solarSystem;

public class SolarRunner {

    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        solarSystem.addPlanet("Venus");
        solarSystem.addPlanet("Mars");
        solarSystem.addPlanet("Jupiter");
        solarSystem.addPlanet("Terra");
        System.out.println("Adding a new planet on the first position: ");
        solarSystem.addPlanetSpecificIndex(0, "Saturn");
        System.out.println(solarSystem.getPlanets());
        System.out.println("===================");
        System.out.println("Replace a planet with another: ");
        solarSystem.replacePlanet(0, "Uranus");
        System.out.println(solarSystem.getPlanets());
        System.out.println("Swap planet 1 with 2 {index 0 with 1}: ");
        solarSystem.swapPlanets(0, 1);
        System.out.println(solarSystem);
        System.out.println("Reverse the list of planets: ");
        solarSystem.reversePlanets();
        System.out.println(solarSystem);
        System.out.println("Remove the last planet: ");
        solarSystem.removePlanet(4);
        System.out.println(solarSystem);
    }
}
