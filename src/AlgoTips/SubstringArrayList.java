package AlgoTips;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class SubstringArrayList {

    public static ArrayList<String> findSubString(String search, ArrayList<String> strings) {
        ArrayList<String> matches = new ArrayList<String>();

        //case insensitive corner case -> we can transform the elements from our arrayList to lower case to compare with a subsequence
        for (String str : strings) {
            String caseInsensitive = str.toLowerCase();
            strings.set(strings.indexOf(str), caseInsensitive);
            if (caseInsensitive.contains(search)) {
                matches.add(caseInsensitive);
            }
        }
        return matches;
    }


    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Ana", "Andrei", "DAN", "dan"));
        System.out.println(strings);
        System.out.println(findSubString("a", strings));
        System.out.println(findSubString("d",strings));

    }

}
