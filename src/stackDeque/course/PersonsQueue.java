package stackDeque.course;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;


//TODO Aplicatie - Coada la ghiseu
public class PersonsQueue {
    private Queue<String> personsQ;

    public PersonsQueue(String containerType) {
        switch (containerType) {
            case "LinkedList":
                personsQ = new LinkedList<String>();
                break;
            case "ArrayDeque":
                personsQ = new ArrayDeque<String>();
                break;
            default:
                System.out.println("Error: Invalid type. Using the default: ArrayDeque");
                personsQ = new ArrayDeque<String>();
                break;
        }
    }

    public PersonsQueue(Queue<String> container) {
        this.personsQ = container;
    }

    public PersonsQueue() {
        personsQ = new ArrayDeque<String>();
    }

    //returneaza persoana din front
    public String whoIsNext() {
        return personsQ.peek();
    }

    //foloseste metoda offer() care adauga o persoana in coada
    public void addPerson(String person) {
        personsQ.offer(person);
    }

    //extrage o persoana din coada
    public String servePerson() {
        return personsQ.poll();
    }

    public boolean areMorePersons() {
        return !personsQ.isEmpty();
    }
}