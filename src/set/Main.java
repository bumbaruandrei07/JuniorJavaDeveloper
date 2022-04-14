package set;

public class Main {
    public static void main(String[] args){

        SecurityCheck sc = new SecurityCheck();
        sc.goesIn("someone");
        sc.goesIn("another one");
        sc.goesIn("someone");
        sc.goesIn("another one");
        sc.goesOut("RANDOM PERSON");

    }
}
