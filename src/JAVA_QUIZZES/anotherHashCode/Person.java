package JAVA_QUIZZES.anotherHashCode;

import java.util.Objects;

public class Person {

    int cod;
    String nume;

    public Person(int cod, String nume){
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
        Person person = (Person) o;
        return cod == person.cod && Objects.equals(nume, person.nume);
    }

    public int hashcode() {
        return Objects.hash(cod, nume) / 2;
    }

}
