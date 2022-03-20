package TrickyProblems.interview;

/**
 * Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
 */
public class SumOfSquareNumber {

    public static boolean judgeSquareNumber(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i * i + j * j == n) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(judgeSquareNumber(5));
        System.out.println(judgeSquareNumber(3));
    }
}
