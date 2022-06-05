package JAVA_QUIZZES.hashCode;

import java.util.Objects;

public class Persoana {

    int cod;
    String nume;

    public Persoana(int cod, String nume) {
        this.cod = cod;
        this.nume = nume;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Persoana persoana = (Persoana) o;
        return cod == persoana.cod && Objects.equals(nume, persoana.nume);
    }

    //implementarea metodei hashCode este gresita, deoarece se va genera intotdeauna acelasi cod hash si pentru 2 obiecte diferite
    // Daca doua obiecte sunt egale conform objectA.equals(objectB), atunci obligatoriu ambele obiecte vor avea acelasi hashCode, adica: objectA.hashCode() == objectB.hashCode().
    public int hashCode() {
        return 13;
    }
}