package JAVA_QUIZZES.equals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Runner {
    public static void main(String[] args){
        Persoana maria = new Persoana(1, "Maria");
        Persoana ion = new Persoana(2, "Ion");
        Persoana altIon = new Persoana(2, "Ion");
        Persoana vasile = new Persoana(3, "Vasile");


        Set<Persoana> mySet = new HashSet<>(Arrays.asList(maria,ion,altIon,vasile));
        System.out.println(mySet.size());
    }
}
