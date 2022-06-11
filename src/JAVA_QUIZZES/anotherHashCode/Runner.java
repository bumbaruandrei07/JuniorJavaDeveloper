package JAVA_QUIZZES.anotherHashCode;

public class Runner {

    public static void main(String[] args) {

        Person p1 = new Person(20, "Andrei");
        Person p2 = new Person(20, "Andrei");
        Person p3 = new Person(10, "Mihai");
        System.out.println(p1.hashcode());
        System.out.println(p2.hashcode());
        System.out.println(p3.hashcode());

    }

}
