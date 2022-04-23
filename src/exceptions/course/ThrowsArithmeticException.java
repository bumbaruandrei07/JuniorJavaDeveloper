package exceptions.course;

public class ThrowsArithmeticException {
    private static int division(int dividend, int divisor) throws ArithmeticException{
        if (divisor == 0) {
            throw new ArithmeticException("'divisor' cannot be 0!");
        }
        return dividend / divisor;
    }

    public static void main(String[] args){
        System.out.println(division(0, 9));
        System.out.println(division(10, 0));
    }

}
