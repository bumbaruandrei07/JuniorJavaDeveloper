package LinkedListCollection.course;

import java.util.*;

public class LinkedListCollection {
    public static void main(String[] args) {

        LinkedList<String> towns = new LinkedList<>();

// inserarea in lista se realizeaza la finalul acesteia
        towns.add("Cluj");
        towns.add("Targu Jiu");
        towns.add("Suceava");
        towns.add("Bucuresti");
        towns.add("Brasov");


        //in cazul unui arraylist, aceasta parcurgere ar fi avut o complexitate liniara, pt ca am fi parcurs de la 0 pana la dimensiunea array-ului respectiv
        //aceeasi implementare pt un LinkedList are o compexitate patratica, pt ca odata avem o parcurgere cu un for care merge la 0 la size(),
        // si apoi un get(), accesul la un element pt linkedlist se face in timp liniar
        //Practic, implementarea metodei get() pentru un LinkedList presupune si ea o parcurgere a listei pana la un anumit index ca sa ajunge cu referinta acolo
        //Practic, o astfel de parcurgere pentru un LinkedList este total nerecomandata

//        for (int i=0; i<towns.size(); i++) { //facem n iteratii aici
//            System.out.println("Current town is: " + towns.get(i)); //si aici facem n iteratii
//        }
//        System.out.println();


        // iterate over a list, using a standard iterator:
        //Iterator este ca un wrapper peste acel it cu care iteram in noduri
        Iterator<String> i = towns.iterator(); //primeste o lista de stringuri pe care le va itera
        //iterator() este metoda specifica listelor, Linkedlist o suprascrie si implementeaza Iterable
        //practic adaugam capacitatea listei de a itera
        while (i.hasNext()) { // echivalent cu node.next() != null, ne indica daca mai avem un element dupa, am ce sa parcurg, exista un next diferit de null
            System.out.println("Current town is: " + i.next()); //next() face 2 lucruri : returneaza urmatorul element in iteratia noastra dar si o sa deplaseze iteratorul
            //iterator.next() returneaza urmatoarea valoare si o sa mute iteratorul cu o pozitie
        }
        System.out.println();

        //o alta abordare la fel de eficienta este sa folosim un enhanced for
        //enhanced for in spate foloseste iteratorul (cursorul) = pozitia curenta in parcurgerea noastra
        for (String town : towns) {
            System.out.println("Current town is: " + town);
        }
        System.out.println();


        //Colectia Linkedlist este implementata in spate folosind un DoubleLinkedList
        //Stiind ca lucram cu o lista dubu inlantuita putem sa parcurgem si inainte si inapoi, avem atat next() cat si previous()
        //Interfata ListIterator
        //Iteratorul nu o sa fie o referinta directa catre un element, el in sine o sa aiba un cursor intern, o sa fie intre elemente sau inainte primului si dupa ultimul
        //nu retine un element, ci intre ce elemente se afla
        //cand apelam hasNext() pe un iterator, el va verifica daca exista un element imediat dupa el
        //cand apelam next() este returnat elementul si iteratorul isi si schimba pozitia, face 2 operatii practic


        // iterate over a list, using a specialized LinkedList iterator:
        //are si metoda previous() care poate fi folosit pe un LinkedList care are in spate o lista dublu inlantuita
        //ListIterator este cea mai buna varianta pentru liste, vine cu un set mai bogat de metode

        //putem da ca parametru pozitia de la care sa porneasca
        //daca ii dam dimensiunea atunci o sa plece de la final
        //ListIterator<String> listIt = towns.listIterator(towns.size());
        ListIterator<String> listIt = towns.listIterator();

// I. forward
        System.out.println("Parcurgerea listei de la inceput spre final");
        while (listIt.hasNext()) {
            System.out.println("Current town is: " + listIt.next());
        }
        System.out.println();

// II. backward
        System.out.println("Parcurgerea listei de la final spre inceput");
        while (listIt.hasPrevious()) {
            System.out.println("Current town is: " + listIt.previous());
        }
        System.out.println();


        iterate(towns);

        //cautarea unui element
        System.out.println(towns.contains("Bacau"));
        System.out.println(towns.contains("Cluj"));
        System.out.println(towns.contains("brasov"));
        //cautarea folosind un index -> return 4, "Brasov" se afla pe a 4 pozitie in lista noastra
        System.out.println(towns.indexOf("Brasov"));


        // Dureaza un timp unitar operatiile de cautare a elementelor in lista?
        //Nu, deoarece toate aceste operatii presupun parcurgerea listei. Prin urmare, toate operatiile au complexitate liniara, fiind necesara iterarea listei.


        System.out.println("Numarul de aparitii a orasului Bucuresti in lista este: ");
        System.out.println(countOccurrences(towns, "Bucuresti"));

        System.out.println("Numarul de aparitii a orasului X in lista este: ");
        System.out.println(countOccurrences(towns, "X"));

        System.out.println("Numarul de aparitii a orasului Cluj este: ");
        System.out.println(countOccurrencesWithEnhancedFor(towns, "Cluj"));

    }


    private static Scanner scanner = new Scanner(System.in);

    public static void printManual() {
        System.out.println("Options are:\n" +
                "\t0 - quit\n" +
                "\t1 - next element\n" +
                "\t2 - previous element\n" +
                "\t3 - this list\n");
    }
//
//    public static void iterate(LinkedList<String> towns) {
//        ListIterator<String> li = towns.listIterator();
//        printManual();
//
//        while(true) {
//            int option = scanner.nextInt();
//            switch (option) {
//                case 0:
//                    return;
//                case 1:
//                    if (li.hasNext()) {
//                        System.out.println(li.next());
//                    }
//                    break;
//                case 2:
//                    if (li.hasPrevious()) {
//                        System.out.println(li.previous());
//                    }
//                    break;
//                case 3:
//                    printManual();
//                    break;
//                default:
//                    System.out.println("Unknown command");
//                    printManual();
//                    break;
//            }
//        }
//    }

    // Pentru a obtine functionalitatea corecta, trebuie sa memoram (i.e. intr-o variabla boolean) directia curenta de parcugere
    // a listei. Astfel, la schimbarea directiei, vom mai efectua o operatie next() / previous() suplimentara pentru a sari
    // peste elementul afisat deja in operatia anterioara.
    // Concret, metoda iterate(LinkedList<String>) devine:

    public static void iterate(LinkedList<String> towns) {
        ListIterator<String> li = towns.listIterator();
        printManual();
        boolean moveForward = true; //ne va spune daca directa de deplasare este in ordine sau invers

        while (true) {
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    return;
                case 1:
                    //m-am deplasat inapoi si vreau sa fac next
                    //daca vreau sa evit duplicarea , marchez ca deplasarea mea este inainte
                    //si dam skip la o deplasare fara sa o afisez cu un next()
                    if (!moveForward) { // if we iterated backwards previously
                        moveForward = true;
                        if (li.hasNext()) {
                            li.next(); // move one position forward to skip already printed
                            // element (i.e. in the previous backward step)
                        }
                    }
                    //daca moveForward este deja true atunci doar il verificam si il afisam
                    if (li.hasNext()) {
                        System.out.println(li.next());
                    }
                    break;
                case 2:
                    if (moveForward) { // if we iterated forward previously
                        moveForward = false; //schimbam directia de deplasare prin schimbarea variabilei de control
                        //dam skip iar cu un previous() daca mergem inapoi
                        if (li.hasPrevious()) {
                            li.previous(); // move one position backwards to skip already printed
                            // element (i.e. in the previous forward step)
                        }
                    }
                    if (li.hasPrevious()) {
                        System.out.println(li.previous());
                    }
                    break;
                case 3:
                    printManual();
                    break;
                default:
                    System.out.println("Unknown command");
                    printManual();
                    break;
            }
        }
    }

    //numarul de aparitii folosind iterator
    public static int countOccurrences(LinkedList<String> list, String key) {
        int counter = 0;
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) { //initializare + conditia de oprire (hasNext())
            if (it.next().equals(key)) {  //pasul are loc cand apelam next si ne returneaza obiectul in sine, pe obiectul returnat apelam equals() si comparam cu o cheie pe care o cautam
                counter++;
            }
        }
        return counter;
    }

    //numarul de aparitii folosind un enhanced for
    public static int countOccurrencesWithEnhancedFor(LinkedList<String> list, String key) {
        int counter = 0;
        for (String el : list) {
            if (el.equals(key)) {
                counter++;
            }
        }
        return counter;
    }
//    Implementeaza o metoda simpla care intoarce numarul de aparitii ale unui element intr-un ArrayList folosind Iterator pentru a parcurge colectia.

    //implementarea coincide
    public static int countOccurrencesWithArraylist(ArrayList<String> list, String key) {
        int counter = 0;
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) { //initializare + conditia de oprire (hasNext())
            if (it.next().equals(key)) {  //pasul are loc cand apelam next si ne returneaza obiectul in sine, pe obiectul returnat apelam equals() si comparam cu o cheie pe care o cautam
                counter++;
            }
        }
        return counter;
    }

    //Modifica doar semnatura metodei scrise anterior pentru a putea primi ca parametru atat un ArrayList cat si un LinkedList.
    //Cum pot fi tratate cele 2 obiecte, dintr-o perspectiva comuna? Analizeaza paginile API pentru fiecare (Hint: inheritance).

    //atat Arraylist cat si Linkedlist implementeaza interfata List, avem o interfata comunca prin care le putem referentia pe ambele prin upcasting, din perspectiva unei liste


    //Putem utiliza interfata comuna List. Deoarece interfata List extinde Collection (i.e. o lista este o colectie de elemente cu cateva proprietati suplimentare), aceasta cuprinde metoda iterator().

    public static int countOccurrencesOptimized(List<String> list, String key) {
        int counter = 0;
        for(String el : list) {
            if (el.equals(key)) {
                counter++;
            }
        }
        return counter;
    }

}

