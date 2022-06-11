package JAVA_QUIZZES.treeSet;

public class TreeSet {

    //treeSet-ul nu contine duplicate
    //ordoneaza folosind natural ordering valorile
    public static void main(String[] args){

        java.util.TreeSet<String> myTreeSet = new java.util.TreeSet<>();
        myTreeSet.add("3");
        myTreeSet.add("1");
        myTreeSet.add("8");
        myTreeSet.add("4");
        myTreeSet.add("8");
        System.out.println(myTreeSet + "," + myTreeSet.size());


    }

}
