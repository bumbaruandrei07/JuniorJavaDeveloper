package TrickyProblems.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class CountAndSay {

    public static String countAndSay(int n) {

        //creare arraylist initial la care adaugam primul element 1
        ArrayList<Integer> seq = new ArrayList<>();
        seq.add(1);

        //parcurgem de la 1 la nr. dat ca parametru in metoda
        for (int step = 1; step < n; step++) {
            //creare arraylist auxiliar
            ArrayList<Integer> nextSeq = new ArrayList<>();

            //initializare counter
            int counter = 1;

            //parcurgere arraylist initial
            for (int i = 0; i < seq.size() - 1; i++) {
                if (seq.get(i) == seq.get(i + 1)) { //daca elementul de pe pozitia i este egal cu elementul de pe pozitia urmatoare crestem counter-ul
                    counter++;
                } else {
                    nextSeq.add(counter);
                    nextSeq.add(seq.get(i));
                    counter = 1;
                }
            }
            nextSeq.add(counter);
            nextSeq.add(seq.get(seq.size() - 1));
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
