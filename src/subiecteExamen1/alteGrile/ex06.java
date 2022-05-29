package subiecteExamen1.alteGrile;

import java.util.ArrayList;
import java.util.List;

public class ex06 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Pen");
        myList.add("Pencil");
        myList.add("Box");
        for (String i : myList) {
            if (i.indexOf("P") == 0) { //daca stringul incepe cu litera "P"
                continue; //atunci il sarim
            } else {
                System.out.println(i + " "); //afisam cuvintele care nu incep cu P -> "Box"
            }
        }
    }
}
