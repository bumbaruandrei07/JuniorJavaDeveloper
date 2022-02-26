package Course3.Quiz;

public class Ex06 {
    public static int recursiveNumberAnalyser(int value) {
        if (value == 0) {
            return 0;
        }

        if (value % 10 % 2 == 0) {
            return recursiveNumberAnalyser(value / 10);
        }
        return 1 + recursiveNumberAnalyser(value / 10);
    }
    public static void main(String[] args){
        System.out.println(recursiveNumberAnalyser(5219044));
    }
}
