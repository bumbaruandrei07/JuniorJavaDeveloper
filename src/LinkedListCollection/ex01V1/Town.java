package LinkedListCollection.ex01V1;

public class Town extends OrderedList implements Comparable<Town> {
    private final String name;
    private final int distance;

    public Town(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public int compareTo(Town newElement) {
        if (distance == newElement.distance) {
            return 0;
        } else if (distance > newElement.distance) {
            return 1;
        } else return -1;
    }

    @Override
    public String toString() {
        return name + " " + distance + "\n";
    }

    public static void main(String[] args) {

        OrderedList<Town> townOrderedList = new OrderedList<>();
        townOrderedList.addInOrderedList(new Town("Cluj", 12));
        townOrderedList.addInOrderedList(new Town("Arad", 10));
        townOrderedList.addInOrderedList(new Town("Bucuresti", 2));
        townOrderedList.addInOrderedList(new Town("Maramures", 200));
        System.out.println(townOrderedList);


    }
}
