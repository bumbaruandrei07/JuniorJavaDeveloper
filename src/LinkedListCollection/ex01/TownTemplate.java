package LinkedListCollection.ex01;

import java.util.ArrayList;
import java.util.Collections;

public class TownTemplate implements Comparable<TownTemplate> {
    private String name;
    private int distance;

    public TownTemplate(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public TownTemplate() {

    }

    public double getDistance() {
        return this.distance;
    }

    @Override
    public int compareTo(TownTemplate town) {
        if (distance == town.distance) {
            return 0;
        } else if (distance > town.distance) {
            return 1;
        } else return -1;
    }

    public static void main(String[] args) {
        ArrayList<TownTemplate> towns = new ArrayList<>();
        towns.add(new TownTemplate("Bucuresti", 23));
        towns.add(new TownTemplate("Bucuresti", 23));
        towns.add(new TownTemplate("Arad", 13));
        towns.add(new TownTemplate("Pitesti", 213));
        Collections.sort(towns);
        for (TownTemplate town : towns) {
            System.out.println(town.name + " " + town.distance);
        }
    }
}
