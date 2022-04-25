package IOFile.homework;

import java.io.*;
import java.util.Scanner;

public class ex01 {

    private static final Scanner sc = new Scanner(System.in);

    private static void modifyFile(String filePath, String oldString, String newString) {
        File fileToBeModified = new File(filePath);

        StringBuilder oldContent = new StringBuilder();

        BufferedReader reader = null;

        FileWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(fileToBeModified));

            //Reading all the lines of input text file into oldContent

            String line = reader.readLine();

            while (line != null) {
                oldContent.append(line).append(System.lineSeparator());

                line = reader.readLine();
            }

            //Replacing oldString with newString in the oldContent

            String newContent = oldContent.toString().replaceAll(oldString, newString);

            //Rewriting the input text file with newContent

            writer = new FileWriter(fileToBeModified);

            writer.write(newContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Closing the resources
                reader.close();
                writer.close();
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Introduceti cuvantul care va fi inlocuit: ");
        String oldString = sc.nextLine();

        System.out.println("Introduceti cuvantul care sa inlocuiasca cuvantul de inlocuit: ");
        String newString = sc.nextLine();


        modifyFile("C:\\Users\\andrei.bumbaru\\Desktop\\{dev}mind\\TextInput.txt", oldString, newString);
    }

}
