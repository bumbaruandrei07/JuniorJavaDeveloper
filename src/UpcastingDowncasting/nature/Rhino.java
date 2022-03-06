package UpcastingDowncasting.nature;

public class Rhino extends Terrestrial {

    public Rhino(boolean carnivore, int weight, int size,
                 String species, int legs, int eyes) {
        super(carnivore, weight, size, species, legs, eyes);
    }

    @Override
    public void saySomething() {
        System.out.println("Vveerrsseee... This rhino says something... ");
    }

    @Override
    public void camouflage() {
        System.out.println("I'm using my thick skin, strong horn and impressive large size to defend.");
    }

    public void horn() {
        System.out.println("I have a strong horn!");
    }

    @Override
    public void specialCharacteristic() {
        System.out.println("I have a strong horn!");
    }

}