package TrickyProblems.interview;

import java.util.Random;


public class GuessNumber {

    public static int guessNumberV1(int n) {
        Random random = new Random();
        int m = random.nextInt();
        if (m < n) {
            System.out.println("Your guess is higher than the number I picked");
            System.out.println(-1);
        } else if (m > n) {
            System.out.println("Your guess is lower than the number I picked");
            System.out.println(1);
        } else if (m == n) {
            System.out.println("Your guess is equal to the number I picked");
            System.out.println(0);
        }
        System.out.println("The number that I picked is: ");
        return m;
    }

    public static void main(String[] args) {
        System.out.println(guessNumberV1(5));
    }

}
