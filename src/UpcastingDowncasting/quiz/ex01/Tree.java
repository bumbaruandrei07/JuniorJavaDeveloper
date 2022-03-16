package UpcastingDowncasting.quiz.ex01;

public class Tree {
    private int height;
    private String species;
    private double sunAmount;

    public Tree(int height, String species, double sunAmount) {
        super(); //apel redundant -> ar fi aparut oricum, fie ca-l apelam noi explicit sau nu
        this.height = height;
        this.species = species;
        this.sunAmount = sunAmount;
    }
    public static void movementSound() {
        System.out.println("Generic tree sound");
    }
}