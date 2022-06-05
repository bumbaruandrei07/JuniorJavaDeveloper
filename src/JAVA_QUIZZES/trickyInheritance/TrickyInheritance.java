package JAVA_QUIZZES.trickyInheritance;


class A {
    int i = 7;
}

class B extends A {
    public int get() {
        return i;
    }
}

class Runner {

    public static void main(String[] args) {
        System.out.println(new B().get());
    }
}

