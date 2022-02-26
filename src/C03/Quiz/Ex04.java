package C03.Quiz;

public class Ex04 {

    public static void printArray(String[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] names = {"cow", "dog", "mouse", "zebra", "spider", "bee"};
        for (int i=0; i<names.length; i++) {
            String tmp = names[i];
            names[i] = names[names.length - i - 1];
            names[names.length - i - 1] = tmp;
        }
        printArray(names);
    }
}
