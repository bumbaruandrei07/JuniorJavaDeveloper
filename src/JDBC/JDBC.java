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
                    " (nume TEXT, adresa TEXT, limba TEXT, varsta INT)");

            statement.execute("INSERT INTO persoane (nume, adresa, limba, varsta) " +
                    "VALUES('Popescu G.','Buhusi','RO',20)");

            statement.execute("INSERT INTO persoane (nume, adresa, limba, varsta) " +
                    "VALUES('Marian V.','Cluj','EN',30)");

            statement.execute("INSERT INTO persoane (nume, adresa, limba, varsta) " +
                    "VALUES('Marta I.','Brasov','RO',40)");

            statement.execute("INSERT INTO persoane (nume, adresa, limba, varsta) " +
                    "VALUES('Balcan M.','Timisoara','RO',20)");

            statement.execute("INSERT INTO persoane (nume, adresa, limba, varsta) " +
                    "VALUES('Raveica R.','Timis','FR',20)");

            statement.execute("INSERT INTO persoane (nume, adresa, limba, varsta)" + "VALUES ('Andrei B.','Bucuresti','RO',22)");

            statement.execute("UPDATE persoane SET limba='DE' WHERE nume='Raveica R.'");

            statement.execute("DELETE FROM persoane WHERE limba='EN'");

            //ordonam alfabetic dupa nume folosind ORDER BY
            statement.execute("SELECT * FROM persoane ORDER BY varsta ");

            //ResultSet va returna rezultatele obtinute, fiecare rand pe care l-am obtinut din ultimul statement - i.e. SELECT * FROM persoane...
            //fiecare rand obtinut va fi pus in acest obiect de tipul clasei ResultSet
            //parcurgem cu next() obtinand valoarea de la fiecare coloana in parte.
            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString("nume") + " " +
                        results.getString("adresa") + " " +
                        results.getString("limba") + " " +
                        results.getInt("varsta") + " ani");
            }

            results.close();

        } catch (SQLException e) {
            System.out.print("An error occured: ");
            e.printStackTrace();
        }
    }
}
