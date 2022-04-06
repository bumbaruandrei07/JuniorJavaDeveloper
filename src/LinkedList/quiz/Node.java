package LinkedList.quiz;

/**
 * Observatii
 * <p>
 * Pana in prezent, nu am definit clase generice(i.e. folosind <E>), insa am utilizat una - ArrayList<E>.
 * Prin urmare, poti considera implementarea clasei Node ca fiind deja data, similar cu functionalitatea oferita de Java(i.e. JDK)
 * <p>
 * Clasa Node defineste intr-un mod simplist un nod generic al unei liste simplu inlantuite. Prin urmare, aceasta va contine doua campuri:
 * <p>
 * 1) elementul propriu-zis: al carui tip va fi stabilit in functie de tipul listei
 * Obs: acest lucru permite definirea de liste inlantuite cu diverse tipuri de elemente, similar cu cazul ArrayList(ex: ArrayList<String>,
 * ArrayList<Animal>
 * <p>
 * 2) referinta next la nodul urmator, care asigura inlantuirea propriu-zisa a listei.
 * Implementarea clasei Node va fi utilizata si in implementarea aparitiilor cu liste
 *
 */


//folosim generics ca sa putem retine orice tip de elemente in cadrul clasei noastre
public class Node<E> {
    private E value; // de tip E
    private Node<E> next; //referinta catre urmatorul element tot de tipul Node si cu parametrul de tip E
    //trebuie sa ne duca la urmatorul nod din lista, retine urmatorul care vine dupa el, de aceea este de tip Node

    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }

    public Node(E value) {
        this(value, null);
    }

    public Node() {
    }

    public void value(E value) {
        this.value = value;
    }

    public E value() {
        return value;
    }

    public Node<E> next() {
        return next;
    }

    public void next(Node<E> next) {
        this.next = next;
    }

    public static int useList2(Node<Integer> list) {
        int count = 0;
        while (list.next() != null && list.next().next() != null) {
            list = list.next();
            count++;
        }
        return count;
    }
}