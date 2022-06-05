package JAVA_QUIZZES.equals;

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
        return cod == persoana.cod;
    }

    public int hashCode() {
        return Objects.hash(cod);
    }
}
