package subiecteExamen1;

public class Ex03 {

    private static void printByLimits(int start, int end) {
        start += start % 2;
        for(int i = start; i<=end; i+=2){
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        printByLimits(17,29); //afiseaza numerele pare intre start si (inclusiv) end
    }
}
