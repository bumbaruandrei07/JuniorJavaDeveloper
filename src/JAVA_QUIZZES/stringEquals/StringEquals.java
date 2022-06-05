package JAVA_QUIZZES.stringEquals;


//JAVA String Pool


public class StringEquals {

    public static void main(String[] args){

        String s = "a";
        String s2 = "a";
        String newS = new String("a");
        System.out.println(s.equals(s2)); //true
        System.out.println(s.equals(newS)); //true
        System.out.println(s == s2); //true
        System.out.println(s == newS); //false !


    }

}
