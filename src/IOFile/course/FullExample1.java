package IOFile.course;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FullExample1 {


    public static void main(String[] args) throws IOException {

        FileWriter outputFile = null;
        Scanner sc = null;
        try {
            //citirea fisierului se realizarea folosind o instanta a clasei Scanner si in loc de System.in pentru citirea de la consola,
            // vom crea un FileReader ce primeste ca parametru numele fisierului din care vom citi
            sc = new Scanner(new FileReader("Numbers1.txt"));

            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();
                System.out.println(nextLine);
            }


        } catch (IOException e) {
            System.out.println("Something wrong has happened...");
            e.printStackTrace();
        } finally {
            //Closing the scanner will automatically close the FileReader
            if (sc != null) {
                sc.close();
            }
        }
    }
}

