package C05.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex01 {

    public static void printDoubleArrayList(ArrayList<Double> doubles) {
        for (int i = 0; i < doubles.size(); ++i) {
            System.out.println(doubles.get(i));
        }
        System.out.println();
    }

    public static void printStringArrayList(ArrayList<String> elements) {
        for (int i = 0; i < elements.size(); ++i) {
            System.out.println(elements.get(i));
        }
        System.out.println();
    }


    public static void main(String[] args) {

//        first arrayList
        ArrayList<Double> doubleElements = new ArrayList<Double>();
        doubleElements.add(0, Double.valueOf(10.5));
        doubleElements.add(0, Double.valueOf(0));
        doubleElements.add(0, Double.valueOf(-14.9));

        System.out.println("Colectia contine urmatoarele elemente, in ordine: ");
        printDoubleArrayList(doubleElements);
        doubleElements.add(10.2);
        doubleElements.add(null);
        doubleElements.add(0, 121.2);
        printDoubleArrayList(doubleElements);
        System.out.println(doubleElements.contains(10.5));
        System.out.println("Elementul de pe prima pozitie este: " + doubleElements.get(0));
        System.out.println("The index of item 10.2 in the ArrayList is:  " + doubleElements.indexOf(10.2));
        System.out.println("Removing the element from index 0: " + doubleElements.remove(0));
        System.out.println("The ArrayList after removing the element from index 0: ");
        printDoubleArrayList(doubleElements);
        System.out.println(doubleElements.lastIndexOf(0));
        System.out.println("The number of elements: " + doubleElements.size());
        doubleElements.set(0, 1000.12);
        printDoubleArrayList(doubleElements);
        System.out.println("The number of elements: " + doubleElements.size());
        doubleElements.remove(null);
        printDoubleArrayList(doubleElements);
        System.out.println("The number of elements: " + doubleElements.size());


//        second arrayList

        ArrayList<String> stringElements = new ArrayList<String>(Arrays.asList("Andrei", "Nicu", "XoXo", "Maria"));
        printStringArrayList(stringElements);
        stringElements.add("Florin");
        stringElements.add(null);
        printStringArrayList(stringElements);
        System.out.println(stringElements.contains("FLOrIn"));
        System.out.println(stringElements.contains("Florin"));
        System.out.println(stringElements.get(0));
        System.out.println(stringElements.indexOf("Nicu"));
        System.out.println(stringElements.indexOf("XoXo"));
        System.out.println(stringElements.indexOf("Maria"));
        System.out.println(stringElements.remove(0));
        stringElements.remove("Maria");
        System.out.println(stringElements.lastIndexOf("XoXo"));
        System.out.println("The number of elements: " + stringElements.size());
        stringElements.set(0, "Root");
        printStringArrayList(stringElements);
        System.out.println("The number of elements: " + stringElements.size());
        stringElements.remove(null);
        printStringArrayList(stringElements);
        System.out.println("The number of elements: " + stringElements.size());


    }


}
