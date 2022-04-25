package IOFile.course;

import java.io.*;
import java.util.Scanner;

public class BufferedReaderWriter {
    private static String[] getData() {
        String[] cities =  {"London", "Bucharest", "Berlin", "Moscow"};
        return cities;
    }



    //clasa Scanner nu va mai efectua citirea direct din fisierul input.txt ci din instanta BufferedReader, care la randul sau va efectua citiri din fisier (i.e. in tamponul intern.
    public static void main(String[] args) throws IOException {

        String[] dataToWrite = getData();

        try(Scanner sc = new Scanner(new java.io.BufferedReader(new FileReader("output.txt")))){
            while (sc.hasNextLine()){
                String nextLine = sc.nextLine();
            }
        }
        try(BufferedWriter outputFile = new BufferedWriter(new FileWriter("output.txt"))) {
            for (String city : dataToWrite) {
                outputFile.write(city + " ");
            }
        }
    }
}
