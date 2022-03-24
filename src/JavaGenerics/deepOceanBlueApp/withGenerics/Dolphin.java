package JavaGenerics.deepOceanBlueApp.withGenerics;

public class Dolphin extends AquaticAnimal {

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {
        // both objects have the same type
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        return super.equals(obj);
    }
}