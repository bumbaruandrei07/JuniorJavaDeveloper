package C04.quiz;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int value = str.length(); //valoarea lungimii intregului string
        char chValue = str.charAt(0); //caracterul de pe prima pozitie

        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) { //numara de cate ori apare fiecare caracter in parte
                    counter++;
                }
            }
            //daca value > counter atunci value este actualizat cu primul caracter din sir
            //daca aveam value >= counter => afisam ultimul caracter cu nr. minim de aparitii
            if (value > counter) {
                value = counter;
                chValue = str.charAt(i);
            }
        }

        System.out.println(chValue);
    }
}
