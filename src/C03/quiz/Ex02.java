package C03.quiz;

public class Ex02 {
    public static char printNumber(int number) {
        if (number <= 0) {
            return '\0'; // \0 caracterul null pt caractere, caracter vid
        }
        number--;
        System.out.print(printNumber(number)); //fiecare apel de metoda trebuie sa creeze un nou context in care sa opereze
        System.out.print(number);
        return ' ';
    }

    public static void main(String[] args) {
        printNumber(5);

        String x = null; //obiectul acesta nu e creat, nu exista
        String y = " "; //obiectul este creat si este vid
    }
}
