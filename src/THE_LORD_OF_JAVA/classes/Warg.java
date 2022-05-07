package THE_LORD_OF_JAVA.classes;

public class Warg extends Creature{

    private double bitePower;


    public Warg(double stamina, double speed, int agility, String nickname, long score, double bitePower) {
        super(stamina, speed, agility, nickname, score);
        this.bitePower = bitePower;
    }

    @Override
    public void powerUp(double newStamina, double newSpeed, int newAgility) {
        super.powerUp(newStamina / 2, newSpeed * 4, newAgility );
    }
}
