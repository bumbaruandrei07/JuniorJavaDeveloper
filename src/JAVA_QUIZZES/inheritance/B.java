package JAVA_QUIZZES.inheritance;

public class B extends A {
    protected int b = 100;

    @Override
    protected void print() {
        System.out.println(super.b);
    }
}
