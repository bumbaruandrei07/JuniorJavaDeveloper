package subiecteExamen1;

public class Ex06 {

    public static void main(String[] args) {
        String[] vals = {"John", "Dan", "Tom", "Anna", "Katy"};
        remix(vals);
        for (int i = 0; i < vals.length; i++) {
            System.out.print(vals[i] + " ");
        }
    }

    public static void remix(String[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            if (i % 2 == 1) {
                continue;
            }
            String aux = values[i];
            values[i] = values[i + 1];
            values[i + 1] = aux;
        }
    }
}
