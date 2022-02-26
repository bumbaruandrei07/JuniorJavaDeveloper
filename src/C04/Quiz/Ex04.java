package C04.Quiz;

public class Ex04 {


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
