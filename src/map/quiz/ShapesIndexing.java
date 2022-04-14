package map.quiz;

import java.util.HashMap;

public class ShapesIndexing {
    //numara numarul de elemente identice si nr. de aparitii al acestora
    public static int computeResult(String[] shapes) {
        HashMap<String, Integer> index = new HashMap<>(); //retine String - cheie si Integer - valoare, pentru fiecare String o sa retinem o valoare
        // care ne va spunem de cate ori am intalnit acest element
        int result = shapes.length > 0 ? 1 : 0; //valoarea initiala
        for (int i=0; i<shapes.length; i++) {
            if (index.containsKey(shapes[i])) {
                int newVal = index.get(shapes[i]) + 1; //crestem cu 1 nr. lui de aparitii
                index.put(shapes[i], newVal); //punem noua pereche actualizata pentru aceeasi cheie
                result = result > newVal ? result : newVal; //result - nr. maxim de aparitii, retine si actualizeaza care este numarul de aparitii al acestui element
            } else {
                index.put(shapes[i], 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] shapes = {"triangle", "rectangle", "circle", "oval", "sphere",
                "rectangle", "square", "rectangle", "circle"};
        System.out.println(computeResult(shapes)); //rectangle apare de cele mai multe ori, de 3 ori - result = 3
    }
}