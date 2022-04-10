package stackDeque.course;

public class TestQueue {
    public static void main(String[] args) {
        PersonsQueue theQueue = new PersonsQueue("LinkedList");

        System.out.println(theQueue.areMorePersons());

        theQueue.addPerson("Andrew");
        theQueue.addPerson("Diana");
        theQueue.addPerson("Lary");

        //returneaza Andrew, prima persoana adaugata, conform FIFO
        System.out.println(theQueue.whoIsNext());

        theQueue.addPerson("Amy");
        theQueue.addPerson("Anna");

        theQueue.servePerson();

        System.out.println(theQueue.whoIsNext());

        theQueue.addPerson("Bill");

        while (theQueue.areMorePersons()) {
            System.out.println(theQueue.servePerson());
        }
    }

}
