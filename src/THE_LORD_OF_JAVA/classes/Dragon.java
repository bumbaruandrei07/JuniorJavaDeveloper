package THE_LORD_OF_JAVA.classes;

public class Dragon extends Creature implements IBurn {
    private double flamesPower;
    private int flySpeed;

    public Dragon(double stamina, double speed, int agility,
                  String nickname, long score,
                  double flamesPower, int flySpeed) {
        super(stamina, speed, agility, nickname, score);
        this.flamesPower = flamesPower;
        this.flySpeed = flySpeed;
    }

//Clasa suprascrie metoda powerUp(double newStamina, double newSpeed, int newAgility)
    @Override
    public void powerUp(double stamina, double speed, int agility) {
        super.powerUp(stamina * 2, speed / 2, agility * 3);
    }

    @Override
    public double getFlamesPower() {
        return flamesPower;
    }

    @Override
    public int getFlyingSpeed() {
        return flySpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFlames power: " + this.flamesPower +
                "\nFly speed: " + this.flySpeed;
    }
}
