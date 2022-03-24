package JavaGenerics.deepOceanBlueApp.noGenerics;

public class Tuna extends AquaticAnimal {

    public Tuna(String name) {
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