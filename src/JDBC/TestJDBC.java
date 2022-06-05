package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) {

        //try-with-resources
        //avem un obiect de tipul Connection care o sa incerce sa ne conecteze la baza de date
        //acest obiect o sa fie returnat de metoda getConnection, metoda statica din DriverManager, clasa ce o sa gestioneze operatiile pe care o sa le efectuam pe baza de date
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/andrei.bumbaru/Desktop/Orders/orders2.db");
             //salvam obiectul conn intr-o variabila de tipul Statement
             //e ca si cum suntem conectati in consola de MySQL (prin variabila statement)
             Statement statement = conn.createStatement()) {
            //cream baza de date
            statement.execute("CREATE TABLE IF NOT EXISTS persoane (nume TEXT, adresa TEXT, limba TEXT)");
            //este o exceptie specifica operatiilor pe bazele de date
        } catch (SQLException e) {
            System.out.print("An error occured: ");
            e.printStackTrace();
        }
    }
}