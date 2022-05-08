package IOFile.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//3. Se citeste de la tastatura o lista de cuvinte (i.e. siruri de caractere fara spatii), separate prin newline (\n). Sa se genereze un fisier result.txt care sa contina:
//
//cel mai scurt cuvant
//cel mai lung cuvant
//primul cuvant in ordine alfabetica
//ultimul cuvant in ordine alfabetica
//numarul total de cuvinte
//Fiecare informatie mentionata anterior va fi scrisa pe o linie individuala, alaturi de un mesaj relevant.


public class ex03 {

    private static final Scanner sc = new Scanner(System.in);

    private static String[] getArray() throws InputMismatchException {
        try {
            System.out.println("Introduceti lungimea array-ului: ");
            int n = sc.nextInt();

            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            return arr;
        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println("Introduceti valori numerice!");
        }
        return null;
    }

    private static String smallest(String[] words) throws java.lang.NullPointerException {
        if (words == null || words.length < 1) {
            throw new java.lang.NullPointerException("Array-ul nu contine niciun cuvant");
        }
        String smallest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }
        return smallest;
    }

    private static String longest(String[] words) throws java.lang.NullPointerException {
        if (words == null || words.length < 1) {
            throw new java.lang.NullPointerException("Vectorul nu contine niciun cuvant!");
        }
        String longest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        return longest;
    }

    private static String getFirstAlphabeticalWord(String[] arr) {
        int m = arr.length;
        String aux;
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }

        return arr[0];
    }

    private static String getLastAlphabeticalWord(String[] arr) {

        String aux;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        return arr[arr.length - 1];
    }

    private static int getLength(String[] arr) {

        return arr.length;

    }


    public static void main(String[] args) throws IOException {
//        FileWriter outputFile = new FileWriter("results.txt");
        String[] arr = getArray();
        //optimizare : try-with-resources + utilizarea unui BufferedWriter
        try(BufferedWriter outputFile = new BufferedWriter(new FileWriter("results.txt"))) {
            outputFile.write("The shortest string in the array: " + smallest(arr) +
                    "\n" + "The longest word in the array:  " + longest(arr) +
                    "\n" + "The first word in alphabetical order: " + getFirstAlphabeticalWord(arr) +
                    "\n" + "The last word in alphabetical order: " + getLastAlphabeticalWord(arr) +
                    "\n" + "Total words number: " + getLength(arr));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
            System.out.println("The data has been successfully saved");
        }

    }
}
