package C04.quiz;

public class Ex04 {

//Se da urmatoarea secventa de cod.
// Pentru ce valoare a String-ului name (dintre urmatoarele variante)
// se va afisa Case 3?
//    Johny Smith
//    David Snowman
//    John Snow
//    In cel putin 2 dintre variantele anterioare.
    public static String printString(String name){
        if (name.startsWith("John")){
            System.out.println("Case 1");
        } else if (name.endsWith("Snow")) {
            System.out.println("Case 2");
        } else if (name.startsWith("John") || name.endsWith("Snowman")) {
            System.out.println("Case 3");
        }
        return name;
    }


    public static void main(String[] args){
        System.out.println(printString("Johny Smith"));
        System.out.println(printString("David Snowman"));
    }
}
