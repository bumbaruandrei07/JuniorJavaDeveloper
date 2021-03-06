package Random;

import java.util.Random;

public class Generator {
    public static void main(String[] args) {

        Random random = new Random();

        //il retin intr-o variabila
        int n = random.nextInt();

        //si il afisez
        System.out.println(Math.abs(n));
        //sau il afisam direct
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());

        //afisare numar random pozitiv

        System.out.println(Math.abs(random.nextInt()));

        //random cu setarea unor limite - bound

        //genereaza un numar random intre 0 si 20
        int m = random.nextInt(20);
        System.out.println("Random number between 0 and 20: " + m);

        //generare numar random pozitiv intre 0 si 5

        int p = random.nextInt(5);
        System.out.println("Random number between 0 and 5: " + p);

        int c = random.nextInt();
        int d = random.nextInt();
        int e = c - d;
        System.out.println("Diferenta dintre 2 numere random este: " + e);
        System.out.print("Valoarea absoluta a diferentei dintre 2 numere random este: ");
        System.out.println(Math.abs(e));

    }
}
