package UpcastingDowncasting.quiz.ex02;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + height;
        result = prime * result + ((species == null) ? 0 : species.hashCode());
        long temp;
        temp = Double.doubleToLongBits(sunAmount);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {   //daca referinta este aceeasi
            return true;
        }
        if (obj instanceof Tree) { //daca obiectul este o instanta a lui Tree
            Tree other = (Tree) obj;  //AppleTree este un obiect de tipul Tree prin lantul de mostenire
            if (this.height == other.height &&  //daca au acelasi height
                    this.species.equals(other.species) && //daca au acelasi species
                    Math.abs(this.sunAmount - other.sunAmount) < 0.0000001) { //daca diferenta este mai mica este valoarea indicata
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "height = " + height + ",  species = " +
                species + ",  sunAmount = " + sunAmount;
    }


}