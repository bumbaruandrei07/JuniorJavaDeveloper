package C06.practice;

import java.util.ArrayList;

//daca nu avem index -> se adauga la final
public class Ex04 {
    public static void main(String[] args){
        ArrayList<String> weights = new ArrayList<String>(); //arraylist de stringuri
        weights.add("orange");
        weights.add(0, "red");
        weights.add(1, "purple");
        weights.add("blue");
        weights.remove(0);
        weights.add("black");
        System.out.println(weights.get(1));
    }
}
