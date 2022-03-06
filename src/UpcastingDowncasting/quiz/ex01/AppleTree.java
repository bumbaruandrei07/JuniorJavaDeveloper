package UpcastingDowncasting.quiz.ex01;

public class AppleTree extends Tree {
    private double fruitsQuantity;
    private boolean isBio;

    public AppleTree(int height, String species, double sunAmount,
                     double fruitsQuantity, boolean isBio) {
        super(height, species, sunAmount);
        this.fruitsQuantity = fruitsQuantity;
        this.isBio = isBio;
    }

    public static void movementSound() {
        System.out.println("Apple tree sound");
    }
}