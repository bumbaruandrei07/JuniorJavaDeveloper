package interviewProblems;

public class HappyNumber {

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        if (n < 5) {
            return false;
        }
        int total = 0;

        while (n != 0) {
            total += (n % 10) * (n % 10);
            n = n / 10;
        }

        return isHappy(total);
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }
}
