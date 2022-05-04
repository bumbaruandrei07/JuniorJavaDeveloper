package subiecteExamen1;

public class Ex04 {

    private static int computeValue(int value) {
        int returnValue = 0;
        while (value > 0) {
            int lastDigit = value % 10;
            value /= 10;
            if (lastDigit % 10 == 0) {
                continue;
            }
            returnValue = returnValue * 10 + (10 - lastDigit);
        }
        return returnValue;
    }

    public static void main(String[] args) {
        System.out.println(computeValue(401009));
    }
}
