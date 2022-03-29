package interview1;

//Explanation

// count = 1 , stops[1].length() < 8 (are mai mult de 8 caractere decat primul element din array)
// count = 2, are mai putin de 8 elemente din array, il incrementeaza si facem break
// Se va afiza counter = 2...
public class Ex02 {

    private static int count;
    private static String[] stops = new String[]{"Washington", "Monroe", "Jackson", "LaSalle"};

    public static void main(String[] args) {
        while (count < stops.length) {
            if (stops[count++].length() < 8) {
                break;
            }
        }
        System.out.println(count);
    }
}
