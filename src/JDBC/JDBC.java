package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/andrei.bumbaru/Desktop/Orders/orders2.db");
             Statement statement = conn.createStatement()) {

            // avoid duplicate rows by first removing the table entirely
            statement.execute("DROP TABLE persoane");

            statement.execute("CREATE TABLE IF NOT EXISTS persoane " +
                    " (nume TEXT, adresa TEXT, limba TEXT)");

            statement.execute("INSERT INTO persoane (nume, adresa, limba) " +
                    "VALUES('Popescu G.','Buhusi','RO')");

            statement.execute("INSERT INTO persoane (nume, adresa, limba) " +
                    "VALUES('Marian V.','Cluj','EN')");

            statement.execute("INSERT INTO persoane (nume, adresa, limba) " +
                    "VALUES('Marta I.','Brasov','RO')");

            statement.execute("INSERT INTO persoane (nume, adresa, limba) " +
                    "VALUES('Balcan M.','Timisoara','RO')");

            statement.execute("INSERT INTO persoane (nume, adresa, limba) " +
                    "VALUES('Raveica R.','Timis','FR')");

            statement.execute("INSERT INTO persoane (nume,adresa,limba)" + "VALUES ('Andrei B.','Bucuresti','RO')");

            statement.execute("UPDATE persoane SET limba='DE' WHERE nume='Raveica R.'");

            statement.execute("DELETE FROM persoane WHERE limba='EN'");

            //ordonam alfabetic dupa nume folosind ORDER BY
            statement.execute("SELECT * FROM persoane ORDER BY nume ");

            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString("nume") + " " +
                        results.getString("adresa") + " " +
                        results.getString("limba"));
            }

            results.close();

        } catch (SQLException e) {
            System.out.print("An error occured: ");
            e.printStackTrace();
        }
    }
}
