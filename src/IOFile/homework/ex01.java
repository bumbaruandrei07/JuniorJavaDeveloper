package IOFile.homework;

import java.io.*;
import java.util.Scanner;

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

        try (BufferedWriter outputFile = new BufferedWriter(new FileWriter("TextOutput.txt"))) {
            outputFile.write(fileText.replace("de", "la"));
        }
    }
}
