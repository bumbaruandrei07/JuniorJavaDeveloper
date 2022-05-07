package interfaces;

class RockStar extends Singer implements ICanDance {

    public RockStar(String lastName, String firstname, int age) {
        super(lastName, firstname, age);
    }

    @Override
    public void dance(String melody) {
        System.out.println("I'm a rockstar and I can dance on " + melody);
    }
}
