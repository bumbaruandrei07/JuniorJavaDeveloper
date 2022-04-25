package IOFile.course;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FirstFileReader {

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new FileReader("output.txt"))) {
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                // use the next line in program
            }
        }
    }
}

