package UpcastingDowncasting.quiz.ex02;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(fruitsQuantity);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppleTree) {
            AppleTree other = (AppleTree) obj;
            if (super.equals(obj) &&  //partea din superclasa celor 2 obiecte este identica, preia implementarea equals din Tree, daca in Tree nu aveam metoda asta equals implementata, atunci facea super din super-clasa Object!
                    Math.abs(this.fruitsQuantity - other.fruitsQuantity) < 0.0000001) { //verifica fieldul fruitsQuqntity dar nu si isBio
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "AppleTree: fruitsQuantity = " + fruitsQuantity +
                ",  isBio = " + isBio + ", " + super.toString();
    }
}