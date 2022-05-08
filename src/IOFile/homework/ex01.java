package IOFile.homework;

import java.io.*;
import java.util.Scanner;

//TODO  Se da urmatorul fisier text, TextInput.txt. Scrie un program care primeste de la tastatura doua cuvinte (i.e. siruri de caractere fara spatii) si inlocuieste in text toate aparitiile primului cu cel de-al doilea.
public class ex01 {

    public static void main(String[] args) throws IOException {
        String fileText = "";
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("TextInput.txt")))) {
            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();
                fileText += nextLine + "\n";
            }
        }
        System.out.println(fileText.replace("de", "la"));

        try (BufferedWriter outputFile = new BufferedWriter(new FileWriter("TextInput.txt"))) {
            outputFile.write(fileText.replace("de", "la"));
        }
    }
}
