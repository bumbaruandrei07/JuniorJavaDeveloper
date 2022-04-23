package interviewProblems.asteroids;

import java.util.Arrays;

public class DestroyingAsteroids {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        //sortam vectorul
        selectionSort(asteroids);
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
        selectionSort(arr);
        System.out.println(asteroidsDestroyed(5, arr));
    }
}
