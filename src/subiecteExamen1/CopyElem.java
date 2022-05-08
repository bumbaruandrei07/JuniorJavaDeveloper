package subiecteExamen1;

public class CopyElem {
    public static int beautifulDays(int i, int j, int k) {
        int nrInvers;
        int xCopy, ultimaCifra;
        int counter = 0;
        for (int x = i; x <= j; x++) {
            nrInvers = 0;
            xCopy = x;
            while (xCopy > 0) {
                ultimaCifra = xCopy % 10;
                xCopy /= 10;
                nrInvers = 10 * nrInvers + ultimaCifra;
            }
            System.out.println("Numarul " + x + "vs invers" + nrInvers);
            int difference = Math.abs(x - nrInvers);
            if (difference % k == 0) {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(beautifulDays(20,23,6));
    }

}