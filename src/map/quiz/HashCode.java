package map.quiz;

import java.util.HashMap;


/**
 *
 * Se dau urmatoarele elemente ce trebuie introduse intr-un hashtable gol, respectiv functia de hash. Care va fi numarul maxim de elemente per bucket?
 *
 *
 */

public class HashCode {

    public static int hashCode(int keyValue) {
        return keyValue % 10;
    }

    public static void main(String[] args){
        HashMap<Integer,Character> map = new HashMap<>(10,0.5f);
        map.put(28543, 'A');
        map.put(19571, 'T');
        map.put(8602, 'K');
        map.put(1000, 'U');
        map.put(4057, 'V');
        map.put(5342, 'X');
        map.put(3797, 'R');
        map.put(8602, 'M');
        System.out.println(hashCode(8602));

    }
}
