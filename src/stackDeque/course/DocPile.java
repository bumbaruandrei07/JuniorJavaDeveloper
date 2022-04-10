package stackDeque.course;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DocPile {
    private Deque<String> pile;

    public DocPile(String containerType) {
        switch (containerType) {
            case "LinkedList":
                pile = new LinkedList<String>();
                break;
            case "ArrayDeque":
                pile = new ArrayDeque<String>();
                break;
            default:
                System.out.println("Error: Invalid type. Using the default: ArrayDeque");
                pile = new ArrayDeque<String>();
                break;
        }
    }

    //primeste ca parametru un container in sine, obiect care implementeaza interfata Deque
    public DocPile(Deque<String> container) {
        this.pile = container;
    }

    //constructor default
    public DocPile() {
        pile = new ArrayDeque<String>();
    }

    //intoarce varful stivei
    public String readDoc() {
        return pile.peek();
        //daca folosim getFirst(), o sa avem eroare la runtime pentru ca stack-ul este gol, in loc sa primim null
    }

    //adauga un nou element in stiva
    public void addDoc(String doc) {
        pile.push(doc);
    }

    public String removeDoc() {
        return pile.pop();
    }

    public boolean isEmpty() {
        return pile.isEmpty();
    }
}