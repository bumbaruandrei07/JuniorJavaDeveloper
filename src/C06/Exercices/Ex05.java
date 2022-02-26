package C06.Exercices;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex05 {
    public static void main(String [] args){
        ArrayList<String> names = new ArrayList<String>(
                Arrays.asList("Dan", "VALI", "Andreea", "Stefania", "Marius"));

        for (int i=0; i<names.size(); i++)
            names.set(i, names.get(i).toLowerCase());

//        null este un obiect inexistent , valoarea default pe care o primeste obiectul
//        null = obiect vid
        names.set(names.size() - 1, null); //Transforma ultima pozitie in null -> "Marius" va deveni null
        names.set(0, "");
        names.set(2, null);
        names.add("dory");
        System.out.println(names.size());
    }
}
