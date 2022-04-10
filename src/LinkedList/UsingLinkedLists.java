package LinkedList;

//foloseste clasa Node implementata anterior in acelasi package LinkedList

public class UsingLinkedLists {
    // helper method to create a list from an array of values
    private static Node<Double> makeList(double[] values) {
        Node<Double> head = new Node<>(); //nodul gol de la care pornim, numit si fals sau santinela
        //se creaza un nod gol, deci un nod "fals", nod santinela. Am nevoie de el ca sa stiu unde incepe lista

        Node<Double> it = head; //aici avem primul element, de aici incepem
        for (double el : values) { //pentru fiecare element din aceasta lista, o sa trebuiasca sa-l adaugam la final
            Node<Double> newNode = new Node<>(el);
            it.next(newNode); //setam valoarea next a iteratorului cu noul nod adaugat
            //asta creeaza legatura cu primul nod valid, initial. Ulterior taie legatura null si arata catre urmatorul nod

            it = it.next(); //returneaza o referinta catre urmatorul obiect de tip Node
            //asta ne returneaza referinta din nodul curent care de fapt aia ne trimite la nodul urmator
        }
        return head.next(); //  returnam primul nod valid
    }

    //it va fi o referinta catre noul nod adaugat, it va face referire la obiectul intreg de tip nod, ce are 2 fielduri, valoarea si referinta next
    // iterate over all elements of a linked list
    public static void iterate(Node<Double> listHead) {
        Node<Double> it = listHead; // iteratorul pointeaza catre primul element din lista
        while (it != null) { // daca este null atunci am terminat de parcurs lista
            double crtElement = it.value(); // extragem valoarea din interiorul nodului curent referintiat prin iterato
            // value este un getter pentru field-ul value
            System.out.println(crtElement); // for demo purpose: printing the element
            it = it.next(); // suprascrie referinta mea initiala catre head cu o referinta catre umatorul nod de dupa head si o sa inceapa o noua iteratie
            //echivalent cu i++ cu iterarea peste un array
        }
    }


    private static final double EPS = 0.0000001; // maximum accepted error for comparison

    // search for a certain key in a linked list
    public static boolean find(Node<Double> listHead, double searchKey) {

        // using a for loop for iteration
        for (Node<Double> it = listHead; it != null; it = it.next()) {
            // initializam it-ul la listHead primit ca parametru
            //conditia de oprire o sa fie cea ca it sa fie diferit de null
            //it = it.next() este echivalentul lui i++, adica iteratorul nu o sa mai referentieze nodul curent
            //ci o sa referentieze nodul catre care are nodul curent o legatura
            //o sa trecem la nodul urmator in lista noastra

            if (Math.abs((it.value() - searchKey)) < EPS) { // comparing 2 double values
                //luam modului, valoarea abosluta dintre valoarea curenta si ceea ce cautam noi si sa verificam
                //daca este mai mica decat o anumita valoare EPS
                //daca aveam String, atunci aveam it.value().equals()
                return true;
            }
        }
        return false;
    }


    // insert the 'newValue' in the list at the 'pos' position
    public static Node<Double> insert(Node<Double> listHead, double newValue, int pos) {
        // Special case - inserting in place of the head of the list
        //corner case - vrem sa adaugam ceva la inceputul listei
        if (pos == 0) {
            // create a new node containing the new inserted element
            // cream noul nod cu valoarea setata din constructor
            Node<Double> newNode = new Node<>(newValue);
            //daca devine noul nod din capul lisei, atunci capul curent al listei va fi urmatorul nod de dupa el
            // newNode's next element is the old head of the list
            newNode.next(listHead);
            // head of the resulting list is the newly created node
            return newNode; //intoarcem referinta catre head-ul listei actualizate
            //newNode o sa devina noul head
        }
        // Insertion steps:
        // (0) - move the iterator 'it' on the node *before* the insertion
        Node<Double> it = listHead;
        for (int i = 0; i < pos - 1; i++) {
            it = it.next(); //o sa ne oprim exact cu un nod inainte de nodul pe care vrem sa-l mutam mai la dreapta
        }

        // (1) - create a node containing the new inserted element
        Node<Double> newNode = new Node<>(newValue);

        // (2) - newNode indicates the 'after' node
        newNode.next(it.next()); //seteaza valoarea lui next de la newNode cu it.next()

        // (3) - previous node indicates the new created node
        it.next(newNode);

/** Daca am fi avut lista dubla inlantuita si adaugam un nou nod
 *
 *      newNode.next(it.next()); a  -> y
 *      it.next().prev(newNode); a  <- y
 *
 *      newNode.prev(it);        x  <- a
 *      it.next(newNode);        x  -> a
 */
        return listHead;
    }


    // return the new list head
    public static Node<Double> remove(Node<Double> listHead, int pos) {
        // Special case - removing the head of the list
        if (pos == 0) {
            //acesta este cazul de baza
            // return the successor of the old head node
            //returnam practic al doilea element, nodul urmator primului nod, adica nodului urmator nodului head
            return listHead.next();
        }
        // Removal steps:
        // (0) - move the iterator 'it' on the node *before* the one removed
        //ne oprim cu 1 inainte, daca vrem sa stergem nodul 3, vrem sa mutam legatura de la nodul 2 la nodul 4
        //astfel incat sa sarim peste nodul 3
        Node<Double> it = listHead;
        for (int i = 0; i < pos - 1; i++) {
            it = it.next();
        }
        // (1) - update the reference of the previous node
        //       to indicate the node after the deleted one
        //it.next() este nodul urmator, iar daca mai apelam inca o data next() atunci avem al doilea nod de dupa nodul initial
        //dam skip la nodul urmator nodului pe care vrem sa-l stergem, practic stergerea consta in a sari peste acest nod
        it.next(it.next().next());

        // return the current list head
        return listHead;
    }




    public static void main(String[] args) {
        double[] values = {24.15, 24.15, 3.33, 1.01, 19.30, 16.11};
        Node<Double> listHead = makeList(values); //returneaza primul nod, transformând un array într-o listă simplu înlănțuită
        iterate(listHead);
        double searchKey = 12.45;
        System.out.println("Element " + searchKey + " exists? Answer: " + find(listHead, searchKey));

        listHead = insert(listHead, 87.26, 2);
        iterate(listHead);

        listHead = remove(listHead, 4);
        iterate(listHead);
    }
}

