package subiecteExamen1;

/**
 * Defineste o metoda care primeste drept parametru un numar si returneaza:
 * 0 daca numarul respectiv este numar perfect:
 * Un numar perfect are suma tuturor divizorilor proprii plus divizorul 1 egala cu numarul insusi
 * Exemple:
 * 6 == 1 + 2 + 3
 * 28 == 1 + 2 + 4 + 7 + 14
 * -1 daca numarul respectiv este numar deficient:
 * Un numar deficient are suma tuturor divizorilor proprii plus divizorul 1 mai mica decat numarul insusi.
 * Exemple:
 * 4 > 1 + 2
 * 21 > 1 + 3 + 7
 * +1 daca numarul respectiv este numar abundent:
 * Un numar abundent are suma tuturor divizorilor proprii plus divizorul 1 mai mare decat numarul insusi
 * Exemple:
 * 12 < 1 + 2 + 3 + 4 + 6
 * 18 < 1 + 2 + 3 + 6 + 9
 *
 * Operatori aritmetici
 *
 *
 */

public class Ex01 {

    public static int type(int n) {
        int sumDiv = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumDiv += i;

            }
        }
        //perfect number
        if (n == sumDiv) {
            System.out.println("Number: " + n + " is a perfect one");
            return 0;
        }
        //deficient number
        if (sumDiv < n) {
            System.out.println("Number: " + n + " is deficient");
            return -1;
        } else if (sumDiv > n) {
            System.out.println("Number: " + n + " is abundant ");
            return 1;

        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(type(6)); //perfect number
        System.out.println(type(28));//perfect number
        System.out.println(type(12)); //abundant
        System.out.println(type(4)); //deficient

    }
}
