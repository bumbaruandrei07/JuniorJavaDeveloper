package IOFile.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MergeTwoFiles {


    public static void main(String[] args) {
        Scanner sc1 = null;
        Scanner sc2 = null;
        PrintWriter pw = null;
        int c = 0, d = 0;
        try {
            sc1 = new Scanner(new FileReader("Numbers1.txt"));
            sc2 = new Scanner(new FileReader("Numbers2.txt"));
            pw = new PrintWriter(new FileWriter("NumbersMerge.txt"));

            if (sc1.hasNextInt() && sc2.hasNextInt()) {

                c = sc1.nextInt();
                d = sc2.nextInt();


                while (sc1.hasNextInt() && sc2.hasNextInt()) {
                    if (c < d) {
                        pw.print(String.format("%d ", c));
                        c = sc1.nextInt();
                    } else if (c > d) {
                        pw.print(String.format("%d ", d));
                        d = sc2.nextInt();
                    } else {
                        pw.print(String.format("%d ", c));
                        pw.print(String.format("%d ", d));
                        c = sc1.nextInt();
                        d = sc2.nextInt();
                    }
                }
            }

            while (sc1.hasNextInt()) {
                c = sc1.nextInt();
                pw.print(String.format("%d ", c));
            }

            while (sc2.hasNext()) {
                d = sc2.nextInt();
                pw.print(String.format("%d ", d));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sc1 != null) {
                sc1.close();
            }
            if (sc2 != null) {
                sc2.close();
            }
            if (pw != null) {
                pw.close();
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


