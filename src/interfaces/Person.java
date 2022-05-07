package interfaces;

public class Person implements IMovable {

    private String lastName;
    private String firstname;
    private int age;
    private double distance;

    public Person(String lastName, String firstname, int age) {
        this.lastName = lastName;
        this.firstname = firstname;
        this.age = age;
    }

    public String getName() {
        return this.firstname + " " + this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.firstname + " " + this.lastName + " are " + this.age + " ani";
    }

    @Override
    public void moveForward() {
        this.distance += 0.9; // 0.9m is the size of a step forward
        System.out.println("Person took a step forward");
    }

    @Override
    public void moveLeft() {
        this.distance += 0.5; // 0.5m is the size of a step left
        System.out.println("Person took a step to the left");
    }

    @Override
    public void moveRight() {
        this.distance += 0.5; // 0.5m is the size of a step right
        System.out.println("Person took a step to the right");
    }

    @Override
    public double getDistanceWalked() {
        return this.distance * metersToKilometers;
    }
}

