package JAVA_QUIZZES.reflection;

public class Reflection {

    private static void test(){
        System.out.println("Buna ziua!");
    }

    //nu se poate realiza apelul metodei utilizand reflection pentru ca este o metoda statica!
    public static void main(String[] args){
//        this.getClass().getDeclaredMethods("test").invoke(this);
    }

}
