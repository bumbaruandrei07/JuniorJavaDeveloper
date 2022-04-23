package interviewProblems;

/**
 * /**
 * * Forward declaration of guess API.
 * * @param  num   your guess
 * * @return 	     -1 if num is higher than the picked number
 * *			      1 if num is lower than the picked number
 * *               otherwise return 0
 * * int guess(int num);
 */

public class GuessNumber {


    static int guess(int num) {
        return 0;
    }

    public static int guessNumber(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int target = guess(mid);
            if (target == -1) {
                end = mid - 1;
            } else if (target == 1) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        System.out.println(guessNumber(20));
    }


}
