package IOFile.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MergeTwoFiles2 {

    public static void main(String[] args) throws IOException {
        // FileWriter object for File3.txt
        FileWriter outputFle = new FileWriter("File3.txt");

        // BufferedReader object for file1.txt
        BufferedReader br1 = new BufferedReader(new FileReader("Numbers1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("Numbers2.txt"));
        int line1 = Integer.parseInt(br1.readLine());
        int line2 = Integer.parseInt(br2.readLine());


        // loop to copy each line of
        // file1.txt to  file3.txt
        while (br1.readLine() != null || br1.readLine() != null) {
            if (line1 < line2) {
                outputFle.write(line1);
                line1 = Integer.parseInt(br1.readLine());
            }
            else outputFle.write(line2);
        }


        br1.close();
        br2.close();

        System.out.println("Merged file1.txt and file2.txt into file3.txt");
    }

}
