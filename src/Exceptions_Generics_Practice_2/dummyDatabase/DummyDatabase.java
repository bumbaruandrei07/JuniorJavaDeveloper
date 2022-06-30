package Exceptions_Generics_Practice_2.dummyDatabase;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DummyDatabase {

    Random random = new Random();
    //val cuprinde valori intre 0 si 4 inclusiv
    private final int val = random.nextInt(5);
    private boolean isConnected;
    private static final Scanner sc = new Scanner(System.in);
    private ArrayList<String> wordsSaved = new ArrayList<>();


    public void connect() throws DummyDatabaseConnectionException {
        if (val >= 5) {
            isConnected = false;
            throw new DummyDatabaseConnectionException("The connection has failed!");

        } else {
            isConnected = true;
            System.out.println(getConnection());

            //saveWord is executed only if the connection is established
            //  String newWord = sc.nextLine();
            System.out.println("Save a new word: ");
            String wordToSave1 = sc.next();
            System.out.println("Save a new word: ");
            String wordToSave2 = sc.next();
            System.out.println("Save a new word: ");
            String wordToSave3 = sc.next();
            System.out.println("Save a new word: ");
            String wordToSave4 = sc.next();
            System.out.println("Save a new word: ");
            String wordToSave5 = sc.next();
            System.out.println("Save a new word: ");
            String wordToSave6 = sc.next();

            saveWord(wordToSave1, wordsSaved);
            saveWord(wordToSave2, wordsSaved);
            saveWord(wordToSave3, wordsSaved);
            saveWord(wordToSave4, wordsSaved);
            saveWord(wordToSave5, wordsSaved);
            saveWord(wordToSave6, wordsSaved);

        }
        disconnect();
    }

    public boolean getConnection() {
        return isConnected;
    }

    public void disconnect() {
        isConnected = false;
    }

    public void saveWord(String wordToSave, ArrayList<String> wordsSaved) throws DummyDatabaseConnectionException {


        wordsSaved.add(wordToSave);
        if (wordsSaved.size() == 6) {
            throw new DummyDatabaseConnectionException("You can only add 5 words into the database!");
        }
        System.out.println("The word: " + wordToSave + " has been added into the database!");
    }

    public static void main(String[] args) throws DummyDatabaseConnectionException {

        DummyDatabase db = new DummyDatabase();
        System.out.println(db.getConnection());
        db.connect();

    }
}

