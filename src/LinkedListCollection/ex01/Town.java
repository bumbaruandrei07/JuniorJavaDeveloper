package LinkedListCollection.ex01;

import java.util.*;

public class Town<T extends Comparable<T>> implements Comparable<Town> {

    private final String name;
    private final int distance;

    public Town(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }


    private List<T> elements = new LinkedList<>();


    public boolean addInOrderedList(T town) {
        ListIterator<T> li = elements.listIterator();

        while (li.hasNext()) {
            int comparison = li.next().compareTo(town);

            if (comparison < 0) { // this element is smaller
                // will go to the next() element
            } else if (comparison > 0) { // found a bigger element
                // insertion should happen before it
                li.previous();
                li.add(town); // insert the element after the iterator
                return true;
            } else { // elements are equal => ignore the element
                return false;
            }
        }
        // if reach here => no greater element was found in the list
        //                  NOR the element is duplicated
        //   => should be inserted now, at the end
        li.add(town);
        return true;
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
        String ret = "";
        for(T el : elements) {
            ret += el + " ";
        }
        return ret;
    }


    public static void main(String[] args) {

        ArrayList<Town> towns = new ArrayList<>();
        towns.add(new Town("Bucuresti", 20));
        towns.add(new Town("Iasi", 10));
        towns.add(new Town("Sighisoara", 30));
        towns.add(new Town("Arad", 40));

        Collections.sort(towns);
        for(Town town: towns){
            System.out.println(town.name + town.distance);
        }
//
//        Town <String> towns2 = new Town<>();
//        towns2.addInOrderedList();
//        towns2.addInOrderedList(new Town("Arad",18));
//        towns2.addInOrderedList(new Town("Pitesti",12));
//        System.out.println(towns2);


    }
}