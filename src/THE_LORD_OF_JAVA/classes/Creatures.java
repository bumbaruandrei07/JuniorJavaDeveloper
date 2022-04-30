package THE_LORD_OF_JAVA.classes;

public abstract class Creatures implements ICreature, Comparable<Creatures> {

    private Abilities abilities;
    private String nickname;
    private long score;

    public Creatures(double stamina, double speed, int agility, String nickname, long score) {
        this.abilities = new Abilities(stamina, speed, agility);
        this.nickname = nickname;
        this.score = score;
    }

    @Override
    public void updateScore(long amount) throws NumberFormatException {
        if (amount < 0) {
            throw new NumberFormatException("Expecting positive bonus value, got: <AMOUNT>");
        }
        this.score += amount;
    }

    @Override
    public void powerUp(double stamina, double speed, int agility) {
        abilities.update(stamina, speed, agility);
    }


    //TODO COMPARARE A DOUA CREATURI FOLOSIND METODA ABILITITES
    @Override
    public int compareTo(Creatures other) {
        return this.abilities.compareTo(other.abilities);
    }
}
