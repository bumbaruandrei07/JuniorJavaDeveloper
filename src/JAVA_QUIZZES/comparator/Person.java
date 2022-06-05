package JAVA_QUIZZES.comparator;

public class Person {

    int cod;
    String nume;

    public Person(int cod, String nume) {
        this.cod = cod;
        this.nume = nume;
    }

    public String toString() {
        return cod + " - " + nume;
    }


}
