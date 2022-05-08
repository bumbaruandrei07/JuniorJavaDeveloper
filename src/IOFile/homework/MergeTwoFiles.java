package IOFile.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//2. Se dau 2 fisiere ce contin fiecare cate un sir de numere ordonate, separate prin spatiu.
// Scrie un program care produce un al treilea fisier ce va contine sirul de numere ordonat crescator.
// In cadrul rezolvarii, nu ai voie sa folosesti niciun tip de colectie.
public class MergeTwoFiles {

    public static void main(String[] args) {
        Scanner sc1 = null;
        Scanner sc2 = null;
        PrintWriter pw = null;
        int c = 0, d = 0;
        boolean isLeftConsumed = true;
        boolean isRightConsumed = true;
        try {
            sc1 = new Scanner(new FileReader("Numbers1.txt"));
            sc2 = new Scanner(new FileReader("Numbers2.txt"));
            pw = new PrintWriter(new FileWriter("NumbersMerge.txt"));

            //Keep reading as long as both files have numbers left
            while (sc1.hasNextInt() && sc2.hasNextInt()) {

                //Reading the number from the first file only if this has been consumed or on the first read
                if (isLeftConsumed) {
                    c = sc1.nextInt();
                    isLeftConsumed = false;
                }

                //Reading the number from the second file only if this has been consumed or on the first read
                if (isRightConsumed) {
                    d = sc2.nextInt();
                    isRightConsumed = false;
                }

                if (c < d) {
                    pw.print(String.format("%d ", c));
                    isLeftConsumed = true;
                } else if (c > d) {
                    pw.print(String.format("%d ", d));
                    isRightConsumed = true;
                } else {
                    pw.print(String.format("%d ", c));
                    pw.print(String.format("%d ", d));
                    isLeftConsumed = true;
                    isRightConsumed = true;
                }
            }

            //Writing the remaining numbers from the first file
            while (sc1.hasNextInt()) {

                //Reading the number from the first file only if this has been consumed or on the first read
                if (isLeftConsumed) {
                    c = sc1.nextInt();
                    isLeftConsumed = false;
                }

                //If the last number from the second file hasn't been written yet, then we keep checking whether it can be added or not
                if (!isRightConsumed) {
                    if (c < d) {
                        pw.print(String.format("%d ", c));
                        isLeftConsumed = true;
                    } else if (c > d) {
                        pw.print(String.format("%d ", d));
                        isRightConsumed = true;
                    } else {
                        pw.print(String.format("%d ", c));
                        pw.print(String.format("%d ", d));
                        isLeftConsumed = true;
                        isRightConsumed = true;
                    }
                } else {
                    //Case where the last number from the second file has been written and there are still numbers left from the first file
                    pw.print(String.format("%d ", c));
                    isLeftConsumed = true;
                }
            }

            //Writing the remaining numbers from the second file
            while (sc2.hasNext()) {

                //Reading the number from the second file only if this has been consumed or on the first read
                if (isRightConsumed) {
                    d = sc2.nextInt();
                    isRightConsumed = false;
                }

                //If the last number from the first file hasn't been written yet, then we keep checking whether it can be added or not
                if (!isLeftConsumed) {
                    if (c < d) {
                        pw.print(String.format("%d ", c));
                        isLeftConsumed = true;
                    } else if (c > d) {
                        pw.print(String.format("%d ", d));
                        isRightConsumed = true;
                    } else {
                        pw.print(String.format("%d ", c));
                        pw.print(String.format("%d ", d));
                        isLeftConsumed = true;
                        isRightConsumed = true;
                    }
                } else {
                    //Case where the last number from the first file has been written and there are still numbers left from the second file
                    pw.print(String.format("%d ", d));
                    isRightConsumed = true;
                }
            }

            //Checking whether the last number from the first file hasn't been written yet (case of the greatest of all)
            if (!isLeftConsumed) {
                pw.print(String.format("%d ", c));
            }

            //Checking whether the last number from the second file hasn't been written yet (case of the greatest of all)
            if (!isRightConsumed) {
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


