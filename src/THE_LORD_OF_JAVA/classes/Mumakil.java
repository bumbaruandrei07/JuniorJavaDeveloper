package THE_LORD_OF_JAVA.classes;

public class Mumakil extends Creature {

    public Mumakil(double stamina, double speed, int agility, String nickname, long score) {
        super(stamina, speed, agility, nickname, score);
    }

    @Override
    public void powerUp(double stamina, double speed, int agility) {
        super.powerUp(stamina * 0.75, speed + 10, agility);
    }

    @Override
    public String toString() {
        return super.toString() + "\n A creature of type Mumakil.";
    }
}
