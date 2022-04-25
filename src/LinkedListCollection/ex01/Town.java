package LinkedListCollection.ex01;

public class Town implements Comparable<Town> {
    private final String name;
    private final int distance;

    public Town(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public int compareTo(Town newElement) throws NullPointerException {
        if(newElement == null){
            throw new NullPointerException("The object doesn't exist!");
        }
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


}
