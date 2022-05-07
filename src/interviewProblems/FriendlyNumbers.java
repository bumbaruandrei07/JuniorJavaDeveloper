package interviewProblems;

public class FriendlyNumbers {

    public static boolean isFriendly(int n, int m) {
        int nDivSum = 0;
        int mDivSum = 0;
        //insumam divizorii lui n
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                nDivSum += i;
            }
        }
        //insumam divizorii lui m
        for (int j = 1; j < m; j++) {
            if (j % m == 0) {
                mDivSum += j;
            }
        }
        //daca suma divizorilor lui n este egala cu m atunci numerele sunt amicale
        if (nDivSum == m) {
            return true;
            //reciproca : daca suma divizorilor lui m este egala cu numarul n atunci numerele m si n sunt amicale
        } else if (mDivSum == n) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(isFriendly(220, 284));
    }

}
