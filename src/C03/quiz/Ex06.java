package C03.quiz;

public class Ex06 {
    public static int recursiveNumberAnalyser(int value) {
        if (value == 0) {
            return 0;
        }

        //daca ultima cifra este para
        if (value % 10 % 2 == 0) {
            return recursiveNumberAnalyser(value / 10);
        }
        //daca ultima cifra este impara adunam 1
        return 1 + recursiveNumberAnalyser(value / 10);
    }
    public static void main(String[] args){
        System.out.println(recursiveNumberAnalyser(5219044));
    }
}
