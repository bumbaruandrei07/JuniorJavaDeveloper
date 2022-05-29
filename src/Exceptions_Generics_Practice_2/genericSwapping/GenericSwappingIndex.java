package Exceptions_Generics_Practice_2.genericSwapping;

import java.util.Arrays;

//TODO
// Write a generic class that has a method to exchange the positions of two different elements in an array.
// The method should return the new array (wherein the two elements have been swapped).
// - As parameters, provide the array itself, the index of the first element to swap and index of the second element to swap.
// - As return type, use the type of the array.
public abstract class GenericSwappingIndex {

    public static int[] swapp(int[] arr, int indexA, int indexB) {
        int aux = 0;
        aux = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = aux;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
