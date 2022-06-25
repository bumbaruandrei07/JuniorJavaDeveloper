package C03.quiz;

public class Ex05 {
    //nu se face swap, first ia valoarea lui second si second a lui first, i.e. second.
    //cand se apeleaza o metoda, se parseaza o copie a primitevelor, nu o referinta
    //noi primim doua elemente din array, sunt puse pe stiva, dar nu e modificat array-ul, ci doar cele 2 variabile locale
    //facem swap, dar doar pentru un context care nu are nicio legatura cu ce se intampla in array.
    public static void swap(double first, double second) {
        double aux = first;
        first = second;
        second = first;
    }
    //ca sa avem accest, fie pasam in metoda cei 2 indecsi si array-ul, fie aveam accest la array intr-un context specific clasei.
    //ne intereseaza doar elementele de la adresa respectiva din memorie, nu valoarea lor.
    //in metoda swap se pune doar valoarea, nu si referinta.

    //varianta corecta
    //temperatures este de fapt o adresa ce este salvata pe stiva, este o adresa catre un array si mergem in heap si facem modificarile la adresa corecta
    //
    public static void correctSwap(int first, int second, double[] temperatures) {
        double aux = temperatures[first];
        temperatures[first] = temperatures[second];
        temperatures[second] = aux;

    }


    public static void main(String[] args) {
//        double[] temperatures = {21.5, -3, 38.2, 15.5, 19};
//
//        for (int i = 0; i < temperatures.length; i++) {
//            swap(temperatures[i], temperatures[temperatures.length - i - 1]);
//        }
//
//        for (int i = 0; i < temperatures.length; i++) {
//            System.out.print(temperatures[i] + " ");
//        }
//        System.out.println();

        double[] temperatures = {21.5, -3, 38.2, 15.5, 19};
        for (int i = 0; i < temperatures.length / 2; i++) {
            correctSwap(i, temperatures.length - i - 1, temperatures);
        }

        for (int i = 0; i < temperatures.length; i++) {
            System.out.print(temperatures[i] + " ");
        }
        System.out.println();


    }
}
