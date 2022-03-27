package TrickyProblems.interview.asteroids;

import java.util.Arrays;

public class DestroyingAsteroids {

    public static void bubbleSortDoubleArray(int[] array) {
        int n = array.length;
        boolean swapped;
        int aux;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {

                if (array[i - 1] > array[i]) {
                    aux = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = aux;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        //sortam vectorul
        bubbleSortDoubleArray(asteroids);
        System.out.println(Arrays.toString(asteroids));
        System.out.println();
        int n = asteroids.length;
        int counter = 0;

        for (int i = 0; i < asteroids.length; i++) {
            if (mass >= asteroids[i]) {
                mass += asteroids[i];
                counter++;
            }
        }
        System.out.println(mass);
        if(counter == n){
            return true;
        }

        return false;

    }


    public static void main(String[] args) {
        int[] arr = {4,9,23,4};
        bubbleSortDoubleArray(arr);
        System.out.println(asteroidsDestroyed(5, arr));
    }


}
