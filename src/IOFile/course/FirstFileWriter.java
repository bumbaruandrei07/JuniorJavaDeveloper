package IOFile.course;

import java.io.FileWriter;
import java.io.IOException;

public class FirstFileWriter {
    private static String[] getData() {
        String[] cities =  {"London", "Bucharest", "Berlin", "Moscow"};
        return cities;
    }

    /**
     * operatiile de lucru cu fisiere arunca exceptii de tipul IOException, care nu au fost tratate. Evenimentele de tipul IOException sunt exceptii checked, prin urmare tratarea acestora este obligatorie (sau altfel programul nu va compila).
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String[] dataToWrite = getData();
        FileWriter outputFile = null;
        try {
            outputFile = new FileWriter("output.txt");

            for (String city : dataToWrite) {
                outputFile.write(city + " ");
            }
        } catch (IOException e) {
            System.out.println("Something wrong has happened...");
            e.printStackTrace();
        } finally {
            try {
                if (outputFile != null) {
                    outputFile.close();
                }
            } catch (IOException e) {
                System.out.println("Exception raised when attempting to close the file");
                e.printStackTrace();
            }
        }
    }
}
