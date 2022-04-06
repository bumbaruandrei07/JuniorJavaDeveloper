package LinkedList.quiz;

import LinkedList.Node;

public class CodingWithNodes {

    private static Node<String> makeList(String[] values) {
        Node<String> head = new LinkedList.Node<>(); //nodul gol de la care pornim, numit si fals sau santinela
        //se creaza un nod gol, deci un nod "fals", nod santinela. Am nevoie de el ca sa stiu unde incepe lista

        Node<String> it = head; //aici avem primul element, de aici incepem
        for (String el : values) { //pentru fiecare element din aceasta lista, o sa trebuiasca sa-l adaugam la final
            Node<String> newNode = new Node<>(el);
            it.next(newNode); //setam valoarea next a iteratorului cu noul nod adaugat
            //asta creeaza legatura cu primul nod valid, initial. Ulterior taie legatura null si arata catre urmatorul nod

            it = it.next(); //returneaza o referinta catre urmatorul obiect de tip Node
            //asta ne returneaza referinta din nodul curent care de fapt aia ne trimite la nodul urmator
        }
        return head.next(); //  returnam primul nod valid
    }

    public static void iterate(Node<String> listHead) {
        Node<String> it = listHead; // iteratorul pointeaza catre primul element din lista
        while (it != null) { // daca este null atunci am terminat de parcurs lista
            String crtElement = it.value(); // extragem valoarea din interiorul nodului curent referintiat prin iterato
            // value este un getter pentru field-ul value
            System.out.print(crtElement); // for demo purpose: printing the element
            it = it.next(); // suprascrie referinta mea initiala catre head cu o referinta catre umatorul nod de dupa head si o sa inceapa o noua iteratie
            //echivalent cu i++ cu iterarea peste un array
        }
    }

//    Metoda transforma lista simplu inlantuita intr-una simplu inlantuita circulara
    public static Node<String> useList(Node<String> list) {
        Node<String> dup = list;
        while (dup.next() != null) {
            dup = dup.next();
        }
        dup.next(list);
        return list;
    }

    //returneaza 2 pentru lista noastra pentru ca o sa crestem counter-ul atata timp cat urmatorul element, cat si vecinul vecinului sunt diferite de null
    public static int useList2(Node<String> list) {
        int count = 0;
        while (list.next() != null && list.next().next()!= null) {
            list = list.next();
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String[] values = {"A ->", "B ->", "C ->", "D ->", "E ->", null};
        Node<String> listHead = makeList(values); //returneaza primul nod, transformând un array într-o listă simplu înlănțuită
        iterate(listHead);
        System.out.println();

        //What output will prodouce this piece of code?
        Node<String> it = listHead;
        while (it.next() != null && it.next().next() != null) { //cat timp elementul urmator nu e null si elementul vecin urmatorului nod nu e null (vecinul vecinului)
            it.next(it.next().next()); //apelam next pe it si sarim cu 2 vecini
            it = it.next(); //actualizam it cu it.next() adica cu next().next()
        }
        iterate(listHead);

        Node<String> listHead2 = makeList(values);
        useList(listHead2);
        System.out.println();
//        iterate(listHead2); -> va produce bucla infinita, fiind lista circulara intotdeauna referinta next a ultimului nod va fi primul nod al listei, nu null

        System.out.println(useList2(listHead));
    }
}
