package JavaReflection;

public class Student {

    private final String name; //read-only
    private final int age; //read-only

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    private void study() {
        System.out.println("Studying...");
    }

    private void moreStudy() {
        System.out.println("More studying...");
    }

    private int rest(int hours) {
        System.out.println("Rested " + hours + " hours");
        return 1;
    }

    private boolean isRested() {
        return true;
    }

    //pentru aflarea tipului la runtime din Reflection API!
    private Student generator(){
        return new Student("Ioana",21);
    }


}
