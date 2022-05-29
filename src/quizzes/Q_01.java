package quizzes;

public class Q_01 {

    public static void main(String[] args) {

        int[] a = {2, 3, 4};
        int[] b = {10, 20, 30};
        interchange(a, b, 2);
        System.out.println(a[2]);
        System.out.println(b[2]);

    }

    public static void interchange(int[] a, int[] b, int index) {
        a[index] = b[index];
        b[index] = a[index]; // va fi egal practic cu el insusi, deoarece deja a[index] = b[index]
    }
}
