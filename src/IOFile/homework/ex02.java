package IOFile.homework;

import java.io.*;
import java.util.Scanner;

// 1.1. Modifica implementarea anterioara astfel:
//textul se va scrie in alt fisier (ex: TextOutput.txt)
//programul nu va stoca tot textul si va face „conversia“ textului linie cu linie, urmand pasii:
//se citeste o noua linie din fisierul de intrare
//se inlocuieste cuvantul cheie
//se scrie in fisierul de output linia curenta
public class ex02 {

    public static void main(String[] args) throws IOException {
        String fileText = "";
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("TextInput.txt")))) {
            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();
                fileText += nextLine + "\n";
            }
        }
        System.out.println(fileText.replace("sah", "fotbal"));

        try (BufferedWriter outputFile = new BufferedWriter(new FileWriter("TextOutput.txt"))) {
            outputFile.write(fileText.replace("sah", "fotbal"));
        }
    }
}
