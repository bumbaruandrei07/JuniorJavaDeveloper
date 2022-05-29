package THE_FINAL_EXAMEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class AlgoRunner {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        int maxFreq = 0;

        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == max) {
                maxFreq++;
            }

            if (candles.get(i) > max) {
               max = candles.get(i);
               maxFreq = 1; // the first time when we got this element with maximum value
            }

        }
        return maxFreq;
    }

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(4);
        myList.add(1);
        myList.add(5);

        System.out.println(birthdayCakeCandles(myList));

    }
}
