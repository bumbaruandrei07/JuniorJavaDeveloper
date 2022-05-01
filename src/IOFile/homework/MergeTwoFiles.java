package IOFile.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MergeTwoFiles {


    public static void main(String[] args) throws IOException {
        FileWriter outputFile;
        Scanner sc1 = null;
        Scanner sc2 = null;
        try {
            //citirea fisierului se realizeaza folosind o instanta a clasei Scanner si in loc de System.in pentru citirea de la consola,
            // vom crea un FileReader ce primeste ca parametru numele fisierului din care vom citi
            sc1 = new Scanner(new FileReader("Numbers1.txt"));
            sc2 = new Scanner(new FileReader("Numbers2.txt"));
            outputFile = new FileWriter("NumbersMerge.txt");
            int c = sc1.nextInt();
            int d = sc2.nextInt();
            while (sc1.hasNext() && sc2.hasNext()) {
                if (c < d) {
                    outputFile.write(Integer.toString(c) + " ");
                    sc1.nextLine();
                } else if (c > d) {
                    outputFile.write(Integer.toString(d) + " ");
                    sc2.nextLine();
                } else {
                    outputFile.write(Integer.toString(c) + " ");
                    outputFile.write(Integer.toString(d) + " ");
                    sc1.nextLine();
                    sc2.nextLine();
                }
            }
            if (sc1.hasNext()) {
                outputFile.write(Integer.toString(c) + " ");
                sc1.nextLine();
            }
            if (sc2.hasNext()) {
                outputFile.write(Integer.toString(d) + " ");
                sc2.nextLine();
            }
            outputFile.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sc1 != null && sc2 != null) {
                sc1.close();
                sc2.close();
            }
        }
    }
}

//            while (sc1.hasNextLine() && sc2.hasNextLine()) {
//                int nextInt1 = sc1.nextInt();
//                int nextInt2 = sc2.nextInt();
//                System.out.print(nextInt1 + " ");
//                System.out.print(nextInt2 + " ");
//                outputFile.write(nextInt1);
//                outputFile.write(nextInt2);
//               // outputFile.flush();
//            }


