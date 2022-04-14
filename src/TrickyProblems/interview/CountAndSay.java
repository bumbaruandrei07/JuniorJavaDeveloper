package TrickyProblems.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class CountAndSay {

    public static String countAndSay(int n) {

        //creare arraylist initial la care adaugam primul element 1
        ArrayList<Integer> seq = new ArrayList<>(); //definim o secventa initiala pe care o folosim sa transformam, sa trecem de la un pas la altul
        seq.add(1); //si aceasta secventa initiala o sa fie 1, pentru ca atat este countAndSay de 1, de la care pornim

        //iteram de la 1 la n ca sa ajungem practic pana la ultima secventa
        for (int step = 1; step < n; step++) {
            //creare arraylist auxiliar
            ArrayList<Integer> nextSeq = new ArrayList<>(); //la fiecare pas o sa facem un nextSeq
            //nextSeq reprezinta ce construim pentru pasul urmator, nextSeq este raspunsul pentru countAndSay de la pasul urmator
            //daca avem countAndSay(1), cu nextSeq determinam countAndSay(2)


            int counter = 1; //pornim de la acel 1 simplu pe care il cunoastem

            //sa gasim grupuri de cifre consecutive care au aceeasi valoare
            for (int i = 0; i < seq.size() - 1; i++) { //mergem pana la seq.size() - 1 pentru ca o sa ne comparam cu cifra urmatoare
                if (seq.get(i) == seq.get(i + 1)) { //daca cifra curenta este egala cu cifra urmatoare
                    counter++; //crestem counter-ul
                    //si facem treaba asta pana cand, la un moment dat, la o iteratie, nu o sa mai fie egale cele 2 cifre pe care le intalnim

                } else {
                    nextSeq.add(counter);  // si in nextSeq o sa adaugam ce au insemnat ele
                    //daca am gasit 3, counter-ul meu a fost 3, si aceste cifre au fost toate 1 de exemplu, noi aici adaugam 3, care e counter-ul
                    nextSeq.add(seq.get(i)); // si dupa adaugam cifra in sine
                    //daca am 1 1 1 , acest algortim o sa ne puna 3 1
                    counter = 1; //resetam counter-ul pentru ca trecem la o noua iteratie

                }
            }
            //ideea e ca ultima secventa nu are cu ce sa o mai comparam ca sa o invalidam si sa putem sa o salvam si atunci mai trebuie sa facem un pas

            //dupa toata iteratia mai trebuie sa facem un pas, aici ajungem cand suntem la ultimul element 
            nextSeq.add(counter); //adaugam counter-ul curent
            nextSeq.add(seq.get(seq.size() - 1)); //adaugam din ce a fost formata ultima secventa
            //practic asa construim secventa urmatoare

            //inlocuim secventa curenta cu secventa urmatoare si o luam de la capat
            seq = nextSeq;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seq.size(); i++) {
            sb.append(seq.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
        System.out.println(countAndSay(15));


        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(3);
        arrayList1 = arrayList2; //mutam elementele din 2 in 1, array-ul 1 va avea elementele celui de-al doilea array
        System.out.println(Arrays.asList(arrayList1));


    }
}
