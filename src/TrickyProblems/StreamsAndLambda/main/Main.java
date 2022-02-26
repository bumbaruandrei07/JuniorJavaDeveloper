package TrickyProblems.StreamsAndLambda.main;

import C10.Homework.Rectangle;
import TrickyProblems.StreamsAndLambda.classes.Sum;
import TrickyProblems.StreamsAndLambda.interfaces.BinaryOperator;
import TrickyProblems.StreamsAndLambda.interfaces.Moveable;
import TrickyProblems.StreamsAndLambda.interfaces.UnaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Main {

    public static int transform(int x) {
        if (x % 2 == 0) {
            return x / 2;
        } else {
            return 2 * x;
        }
    }

    //Lambda expressions and Streams -> au aparut incepand cu Java 8
    // interfetele abstractizeaza un comportament
    // first u are smth, then you do smth

    public static void main(String[] args) {

        //Clasa Random - generem numere aleatoare

        Random random = new Random();
        BinaryOperator binaryOperator;
        //pot controla comportamentul la runtime
        //functie virtuala
        //pe langa colectii ce suporta streamuri mai avem si alte clase
        if (random.nextInt() % 2 == 0) {
            binaryOperator = new Sum();
        } else {
            binaryOperator = new BinaryOperator() {   //clasa anonima
                @Override
                public double operate(double operand1, double operand2) {
                    return operand1 - operand2;
                }
            };
        }
        System.out.println(binaryOperator.operate(5, 3));


        BinaryOperator operator = new Sum();
        System.out.println(operator.operate(5, 3));


        //clasa anonoma - nu are nume, a fost instantiata si adresa ei a fost salvata in "operator"
        //clasa derivata din BinaryOperator si supradefineste metoda si face operand1 - operand2, dar n-are nume

        operator = new BinaryOperator() {   //clasa anonima
            @Override
            public double operate(double operand1, double operand2) {
                return operand1 - operand2;
            }
        };

        //obiect anonim - Sum()
        //la urmatoarea linie de cod , obiectul este pierdut, Garbage Collector il dezaloca, nu-l mai pot folosi in alta parte
        //traieste cat apeleaza metoda asta


        new Sum().operate(3, 2);  //obiect anonim

        //expresia lambda - functie anonima, nu are nume, are doar lista de parametrii si implementarea, daca o folosim trebuie sa o salvam undeva

        operator = (o1, o2) -> o1 * o2;  //am salvat aceasta expresie lambda in "operator"
        //operator salveaza adresa acestei functii anonime
        System.out.println(operator.operate(3, 5));

        //daca vreau sa fac mai multe prelucrari, de exemplu sa ridic la putere folosind Math.pow, sau sa facem media, atunci putem face astfel:
        //daca in expresia lambda nu se folosesc parantezele acolade nu e nevoie de return, daca punem acolade atunci e obligatoriu sa folosim keywordul return, doar daca nu e void
        operator = (x, y) -> {
            double sum = x + y;
            return sum / 2;
        };

        Moveable m = () -> System.out.println("The car is moving");
        m.move();

        //daca am mai multe metode abstracte in interfata, care dintre ele va fi expresia lambda?
        //daca aveam si stop() de pilda?
        // !!! DOAR INTERFETELE CU O SINGURA METODA ABSTRACTA POT FI FOLOSITE CA BAZA PENTRU EXPRESII LAMBDA -> SE NUMESC "INTERFETE FUNCTIONALE"


        //avem un singur parametru

        UnaryOperator op = (o) -> ++o;  // echivalent cu
        UnaryOperator op2 = o -> ++o;
        System.out.println(op.operate(5)); //de fiecare data cand am o expresie lambda a carei functie din spate are un singur parametru nu mai este obligatoriu sa avem paranteze
        System.out.println(op2.operate(9));


        //STREAMS - Au aparut cu Java 8
        //STREAMS - modalitate de prelucrare  in-memory pentru colectii... axata pe colectii, eu in memorie sa pot face filtrari, sortari, map-reduce
        //sunt un fel de SQL aplicat pentru colectii
        //LINQ (Language Integreted Querry) - preluat de java de la C#

        List<Integer> list = Arrays.asList(3, 4, 1, 5, 1, 8, 12);

        //cate sunt pare? prelucrare rapida:

        long number = list.stream().filter(e -> (e % 2) == 0).count();
        System.out.println("the number of even numbers in the list is: " + number);

        //elementele distincte mai mici decat 8 pe care le salvam intr-o noua lista

        List<Integer> newList = list.stream().distinct().filter(e -> e < 8).sorted().collect(Collectors.toList());

        for (Integer i : newList) {
            System.out.println(i);
        }

        List<String> stringList = Arrays.asList("something", "something else", "a", "ab", "abc");

        String result = stringList.stream().filter(s -> s.length() > 2).collect(Collectors.joining(", "));
        System.out.println(result);

        list.stream().distinct().sorted().map(e -> e * e).forEach(e -> System.out.println(e));

        //method reference - metoda de referinta  ->se aseamana cu operatorul de rezolutie din C++
        //se aseamana cu operatorul de rezolutie din C++
        // ATUNCI CAND AM METODA CARE COINCIDE METODEI CE VREAU SA FIE INLOCUITA IN EXPRESIA LAMBDA, POT SA ZIC DIRECT NUMELE METODEI
        random.ints().limit(5).sorted().forEach(System.out::println);


        //daca e par obtin jumatate, altfel dublu
        //daca vreau in loc de functie lambda sa loflosesc o functie existenta si daca e statica punem :: pe clasa si numele functiei
        // daca functia e non-statica pot sa pun pe pachet :: println
        list.stream().map(Main::transform).forEach(System.out::println);


        //Conceptul de parallel stream !!!

        //sa obtin doar stringurile care incep cu a

        String filteredList = stringList.parallelStream().filter(e -> e.startsWith("a")).collect(Collectors.joining(","));
        System.out.println(filteredList);

        //in situtia in care pc ul are mai multe core-uri , se imparte jobul
        //daca avem valori foarte mari, giga de date
        //imparte problema
        //face procesarea in paralele pe fiecare core si la final agrega rezultatele
        //face prelucrare paralela si la sfarsit la agrega pe toate - programare paralela
        //pot sa fac paralelism si fara mai multe fire de executie
        //putem sa folosim paralelismul ca sa deschidem mai multe fire de executie
        //paralelism nu inseamna multithreading, coincid dar nu total,  pot sa am paralelism si fara mai multe fire de executie (ex: folosirea core-urilor separate)
        // pot sa am mai multe fire de executie dar sa nu am paralelism ( ex: asincronicitate)


    }
}
