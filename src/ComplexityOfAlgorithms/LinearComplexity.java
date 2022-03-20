package ComplexityOfAlgorithms;

//TODO O(n) sau complexitatea liniara depinde in mod direct sa fie direct propertional datele de intrare cu nr. de pasi.
// Sa consideram un program care are complexitatea temporala si spatiala O(n):

//   Se citeste de la tastatura o lista de n numere naturale, data prin numarul de elemente urmat de fiecare element al listei. Sa se afiseze lista in ordine inversa, dupa insumarea fiecarui element cu simetricul sau din lista.

//Elemente ce au complexitate O(1) : crearea scannerului, citirea unui element, crearea unei liste, afisarea si verificarea sunt constante
//o sa ne ia mereu acelasi timp sa citim un nr, sa facem o verificare etc..

//

import java.util.Scanner;

public class LinearComplexity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        //daca citesc n = 100, in for-ul aceasta o sa fac 100 de pasi, e direct proportional nr de pasi al acestui for cu dimensiunea datelor de intrare
        // acest for are complexitatea O(n) pt ca face n pasi. ruleaza in functie de input!

        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }

        //aduna elementele simetrice
        //parcurge pana la jumatate, nr de pasi o sa fie n/2, n/2 intra in continuare in clasa de complexitate O(n) pt ca depinde in mod direct de dimensiunea input-ului
        // atunci acest for intra ca si in complexitate tot in O(n)
        for (int i = 0; i < list.length / 2; i++) {
            int aux = list[i];
            list[i] += list[n - i - 1];
            list[n - i - 1] += aux;
        }


        if (n % 2 == 1) {
            list[n / 2] *= 2;
        }

// Note that we can print the list in the initial order
// because the list has become symmetric ;)

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

    }
}

//complexitatea temporala este O(n) deoarece numarul total de operatii este direct proportional cu n, fiind aproximativ:

// 3 + n + 3 * (1/2)n  + 1 + n

// 3 -> primele trei instrctiuni din cod, 3 pasi, presupun crearea unui scanner, citirea de la tastatura si initializarea array-ului
// n -> n pasi ca sa citeasca cele n elemente de la tastatura
// un for care o sa faca n/2 pasi si la fiecare pas are 3 instrctiuni si o sa fie 3 * (1/2)n
// un if este ceva constant ce nu depinde de n-ul de la instrare -> un pas = 1
// n pasi pentru afisarea listei
// ar mai fi si ultimul sout dar nu e relevant, nu ne influenteaza complexitatea

// calcul : (7/2) * n + 7 -> functie de gradul I, algoritmul se incadreaza in clasa de complexitate liniara!