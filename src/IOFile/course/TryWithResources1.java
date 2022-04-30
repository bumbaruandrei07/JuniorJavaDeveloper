package IOFile.course;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Daca avem exit with code 1 atunci program se incheie fortat si avem eroare
//daca prindem si tratam eroarea atunci avem exit with code 0 si programul se va incheia in mod normal
//nu putem sa definim resurse care nu au o metoda de close
public class TryWithResources1 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(new FileReader("Numbers2.txt"))) {
            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();
                System.out.println(nextLine);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong...");
            e.printStackTrace();
        }

    }
}
