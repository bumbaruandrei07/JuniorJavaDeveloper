package AlgoTips;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class SubstringArrayList {

    public static List<String> findSubString(String search, ArrayList<String> strings) {

        List<String> firstLetter = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {

            if (strings.get(i).toLowerCase().charAt(0) == search.charAt(0)) {
                firstLetter.add(strings.get(i));
            }
        }
        return firstLetter;

    }


    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Ana");
        myList.add("ana");
        myList.add("ana");
        myList.add("andrei");
        String searchedString = "a";
        System.out.println(findSubString(searchedString, myList));
    }
}
