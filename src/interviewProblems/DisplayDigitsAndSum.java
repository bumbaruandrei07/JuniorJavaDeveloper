package interviewProblems;

/*
Scrie o metodă care primește ca parametru un număr natural x și apoi afișează:

cifrele numărului (în ordine inversă)
suma cifrelor
 */


public class DisplayDigitsAndSum {

    public static void displayDigitsAndSum(int x) {
        int sum = 0;
        System.out.print("Cifrele numărului sunt: ");
        while (x > 0) {
            int lastDigit = x % 10;
            System.out.print(lastDigit + ", ");
            sum += lastDigit;
            x /= 10;
        }
        System.out.println();
        System.out.println("Suma cifrelor este: " + sum);
    }



    public static void main(String[] args) {

    displayDigitsAndSum(2340);

    }


}
