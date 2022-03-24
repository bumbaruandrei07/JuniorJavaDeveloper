package JavaGenerics.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class NoGenerics {
    public static void noGenerics() { // as was before Java 5

        // notice the warning
        // no type check is done
        ArrayList fishNames = new ArrayList();

        fishNames.add("Dolphin");
        fishNames.add("Sharks");
        fishNames.add("Salmon");
        fishNames.add("Tuna");

        fishNames.add(3); // no compile error
        fishNames.add(new Scanner(System.in)); // no compile error

        for (Object el : fishNames) {
            System.out.println(el); // It works! Unfortunately...
        }

        // I. trying to be more specific
        // Comment this section after observing the compile error.
//        for (String el : fishNames) {// Error: the container doesn't
//            // have an associated type
//            System.out.println(el + "is swimming");
//        }


        // II. trying to print something specific
        // still no compile error! Unfortunately...
        // error is not detected until runtime..
        for (Object el : fishNames) {
            System.out.println((String)el + " is a type of fish!");
            // Force casting
            // trying to cast to strings will throw an exception
            // for incompatible objs
            // FIX: can catch the exception, but what is the point
            //      of having such code?
        }
    }

    public static void main(String[] args) {
        noGenerics();
    }
}
