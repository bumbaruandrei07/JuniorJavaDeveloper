package C02;

//TODO Implementeaza o metoda recursiva (i.e. reverseNumberR(int number)) care primeste ca parametru un numar intreg, pozitiv si returneaza inversul numarului.
public class reverseNumberR {
    public static int reverseNumberR(int n) {
        if (n < 10) {
            return n;
        }

        // reverse(n) = n % 10 * 100..00 + reverse(n/10)
        int reverse = reverseNumberR(n / 10);

        int mul;
        for(mul=1; mul<=n/10; mul*=10);

        return (n % 10) * mul + reverse;
    }
}
