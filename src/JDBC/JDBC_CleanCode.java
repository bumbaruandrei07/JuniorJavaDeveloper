package JDBC;

import java.sql.*;

//TODO imbunatatirea aplicatiei consta in utilizarea variabilelor de configurare (exprimate prin constante)
// si implementarea unor metode dedicate de comunicare cu baza de date.
public class JDBC_CleanCode {


    public static final String DB_NAME = "orders2.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:/Users/andrei.bumbaru/Desktop/Orders/" + DB_NAME;
    public static final String TABLE_PERSONS = "persoane";
    public static final String COLUMN_NAME = "nume";
    public static final String COLUMN_ADDRESS = "adresa";
    public static final String COLUMN_LANGUAGE = "limba";
    public static final String COLUMN_AGE = "varsta";


    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING);
             Statement statement = conn.createStatement()) {

            // avoid duplicate rows by first removing the table entirely
            statement.execute("DROP TABLE IF EXISTS " + TABLE_PERSONS);

            statement.execute("CREATE TABLE IF NOT EXISTS " +
                    TABLE_PERSONS +
                    " (" + COLUMN_NAME + " TEXT, " +
                    COLUMN_ADDRESS + " TEXT, " +
                    COLUMN_LANGUAGE + " TEXT," + COLUMN_AGE + " INT" +
                    ")");

            insertPerson(statement, "Popescu G.", "Buhusi", "RO", 22);
            insertPerson(statement, "Marian V.", "Cluj", "EN", 21);
            insertPerson(statement, "Marta I.", "Brasov", "RO", 22);
            insertPerson(statement, "Balcan M.", "Timisoara", "RO", 47);
            insertPerson(statement, "Raveica R.", "Timis", "FR", 34);
            insertPerson(statement, "Andrei B.", "Bucharest", "RO", 22);

            statement.execute("UPDATE persoane SET limba='DE' WHERE nume='Raveica R.'");

            statement.execute("DELETE FROM persoane WHERE limba='EN'");

            statement.execute("SELECT * FROM persoane ORDER BY varsta");

            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getString(COLUMN_ADDRESS) + " " +
                        results.getString(COLUMN_LANGUAGE) + " " + results.getInt(COLUMN_AGE) + " ani");
            }

            results.close();

        } catch (SQLException e) {
            System.out.print("An error occured: ");
            e.printStackTrace();
        }
    }

    private static void insertPerson(Statement statement, String name, String address,
                                     String language, int age) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_PERSONS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LANGUAGE + ", " + COLUMN_AGE +
                " ) " +
                "VALUES('" + name + "', '" + address + "', '" + language + "', '" + age + "')");
    }

}
