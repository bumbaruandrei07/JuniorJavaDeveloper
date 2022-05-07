package THE_LORD_OF_JAVA.classes;

public abstract class Creature implements ICreature, Comparable<Creature> {

    private Abilities abilities;
    private String nickname;
    private long score;

    public Creature(double stamina, double speed, int agility, String nickname, long score) {
        this.abilities = new Abilities(stamina, speed, agility);
        this.nickname = nickname;
        this.score = score;
    }

    @Override
    public void updateScore(long amount) throws NumberFormatException {
        if (amount < 0) {
            throw new NumberFormatException("Expecting positive bonus value, got:" + amount);
        }
        this.score += amount;
    }

    @Override
    public String getNickname() {
        return this.nickname;
    }

    @Override
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void powerUp(double stamina, double speed, int agility) {
        abilities.update(stamina, speed, agility);
    }


    //TODO COMPARARE A DOUA CREATURI FOLOSIND METODA ABILITITES (prin delegare)
    @Override
    public int compareTo(Creature other) {
        return this.abilities.compareTo(other.abilities);
    }

    @Override
    public String toString() {
        return "Nickname:" + this.nickname + "\n"
                + "Score: " + this.score + "\n"
                + "Abilities: Player has a power of: " + this.abilities;
    }
}
