package ComplexityOfAlgorithms;

import java.util.Scanner;

//sunt 4 pasi indiferent de datele de intrate, adica sunt independenti de datele de intrate, atunci avem complexitate constanta!
// i.e. O(1)
//mereu cand rulez algoritmul o sa am mereu acelasi numar de pasi, indiferent de input
public class ConstantComplexity {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The list has an even number of elements.");
        } else {
            System.out.println("The list has an odd number of elements.");
        }
    }
}
