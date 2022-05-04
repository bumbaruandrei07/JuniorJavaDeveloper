package subiecteExamen1;

public class Ex05 {

    private static void processArray(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0) {
                continue;
            }
            arr[0] += arr[i];
        }
    }

    public static void main(String[] args) {
        double[] arr = {1, 3, 0, 4, 2.25};
        processArray(arr);
        System.out.println(arr[0]);
    }
}
