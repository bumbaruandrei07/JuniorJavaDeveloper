package C03.Quiz;

public class Ex02 {
    public static char printNumber(int number) {
        if (number <= 0) {
            return '\0';
        }

        number--;
        System.out.print(printNumber(number));
        System.out.print(number);
        return ' ';
    }

    public static void main(String[] args) {
        printNumber(5);
    }
}
