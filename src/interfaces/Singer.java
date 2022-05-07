package interfaces;

public class Singer extends Person implements IHasName, ICanSing {

    public Singer(String lastName, String firstname, int age) {
        super(lastName, firstname, age);
    }

    // Note: no need to implement getName() as the method has already
    //       an implementation inherited from class 'Person'

    @Override
    public void sing(String song) {
        System.out.println("I am singing: " + song);
    }
}

