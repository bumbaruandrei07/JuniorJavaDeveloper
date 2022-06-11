package JAVA_QUIZZES.maxim_appearances;

public class Max {


    private static int getMax(int[] arr) {

        int max = Integer.MIN_VALUE;
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                pos = i;

            }
        }
        System.out.println("Pozitia maximului in vector este: " + pos);
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 1};
        System.out.println(getMax(arr));

    }

}
