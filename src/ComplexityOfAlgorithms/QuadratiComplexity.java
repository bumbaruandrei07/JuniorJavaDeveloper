package ComplexityOfAlgorithms;

/**
 * quadratic complexity - COMPLEXITATE PATRATICA (APARE DESEORI LA CALCUL CU MATRICE)
 * Atat Metoda Bulelor cat si Sortarea prin selectie au complexitatea O(n2)
 * deoarece presupun, in cel mai defavorabil caz, parcurgerea tuturor elementelor prin 2 bucle imbricate.
 * Astfel se ajunge la un numar de pasi de aproximativ n2.
 */


import java.util.Scanner;

/**
 * Sa consideram un program care are complexitatea temporala si spatiala O(n2):
 * <p>
 * Scrie un program care genereaza o matrice patratica, bordata cu valorile citite de la tastatura. Se va citi initial numarul de elemente urmat de fiecare valoare, in ordine.
 * Bordarea se face dinspre exteriorul matricei spre interior.
 * O(1) adaugat la cv este useless, nu modfica ordinul
 */
public class QuadratiComplexity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //pas constant
        int n = sc.nextInt(); // pas constant

        int[] values = new int[n];
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }

        int[][] matrix = new int[2 * n - 1][2 * n - 1]; //pas constant

        //parcurgem dim pe linii
        // apoi toti indifii simetric
        //primul for face n pasi
        // al doilea de la 0 la 2*n - 1 -> 2 * n - 1 pasi
        // nr de pasi rezulta prin inmultirea nr. de pasi de la fiecare for in pas -> in total avem n (( 2* n) -1 )
        for (int i = 0; i < n; i++) {
            for (int j = i; j < matrix.length - i; j++) {
                matrix[i][j] = values[i];
                matrix[j][i] = values[i];
                matrix[j][matrix.length - i - 1] = values[i];
                matrix[matrix.length - i - 1][j] = values[i];
            }
        }

        //afisare matrice -> complexitate (2 * n -1) la patrat
        // are complexitate patratica pentru ca 2 este puterea cea mai mare, gradul polinomului dicteaza complexitatea
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
