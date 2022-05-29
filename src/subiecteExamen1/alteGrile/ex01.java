package subiecteExamen1.alteGrile;

import java.util.ArrayList;
import java.util.List;

public class ex01 {
    public static void main(String[]args){
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        int firstElement = myList.get(1); //An IndexOutOfBounds will be thrown at runtime, cause position 1 doesn't exist
        System.out.println(firstElement);
    }
}
