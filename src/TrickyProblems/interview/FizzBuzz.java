package TrickyProblems.interview;

import java.util.ArrayList;

public class FizzBuzz {

    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> myStringArrayList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
//            String s = String.valueOf(i);
            if (i % 3 == 0 && i % 5 == 0) {
                myStringArrayList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                myStringArrayList.add("Fizz");
            } else if (i % 5 == 0) {
                myStringArrayList.add("Buzz");
            } else {
                myStringArrayList.add(Integer.toString(i));
            }
        }
        return myStringArrayList;
    }


    public static void main(String[] args) {
        System.out.println(fizzBuzz(1));
    }
}
