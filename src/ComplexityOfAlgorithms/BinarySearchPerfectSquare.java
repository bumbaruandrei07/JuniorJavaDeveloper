package ComplexityOfAlgorithms;

/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * <p>
 * Follow up: Do not use any built-in library function such as sqrt.
 */

public class BinarySearchPerfectSquare {

    public static boolean isPerfectSquare(int n) {
        if (n == 1) {
            System.out.println("Is perfect square!");
            return true;
        }
        int left = 1;
        int right = n / 2;
        while (left <= right) {
            long middle = (left + right) / 2;
            long currSquare = middle * middle;
            if (currSquare == n) {
                return true;
            } else if (n < currSquare) {
                right = (int) middle - 1;
            } else if (n > currSquare) {
                left = (int) middle + 1;
            }
        }
        System.out.println("The number isn't a perfect square!");
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(121));
        System.out.println(isPerfectSquare(90));
        System.out.println(isPerfectSquare(1));

    }
}
