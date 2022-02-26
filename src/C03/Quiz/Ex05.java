package C03.Quiz;

public class Ex05 {
    public static void swap(double first, double second) {
        double aux = first;
        first = second;
        second = first;
    }

    public static void main(String[] args) {
        double[] temperatures = {21.5, -3, 38.2, 15.5, 19};

        for (int i = 0; i < temperatures.length; i++) {
            swap(temperatures[i], temperatures[temperatures.length - i - 1]);
        }

        for (int i = 0; i < temperatures.length; i++) {
            System.out.print(temperatures[i] + " ");
        }
        System.out.println();
    }
}
