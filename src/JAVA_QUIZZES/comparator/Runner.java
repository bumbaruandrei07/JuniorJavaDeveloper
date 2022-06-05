package JAVA_QUIZZES.comparator;

import JAVA_QUIZZES.hashCode.Persoana;
import JAVA_QUIZZES.overriding.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Person maria = new Person(1, "Maria");
        Person ion = new Person(2, "Ion");
        Person vasile = new Person(3, "Vasile");

        List<Person> persoane = Arrays.asList(maria, ion, vasile);
        persoane.sort(new Comparator<Person>() {


            @Override
            public int compare(Person o1, Person o2) {
                return o1.nume.compareTo(o2.nume);
            }
        });
        System.out.println(persoane);
    }
}
