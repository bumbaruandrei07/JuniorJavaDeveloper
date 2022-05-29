package THE_LORD_OF_JAVA.classes;



//TO REMEMBER -> pentru delegare, incearca sa folosesti direct metodele clasei!
public class Abilities implements Comparable<Abilities> {

    private double stamina;
    private double speed;
    private int agility;

    public Abilities(double stamina, double speed, int agility) {
        this.stamina = stamina;
        this.speed = speed;
        this.agility = agility;
    }


    // -1 if this < other
    // 0 if this == other
    // 1 if this > other
    @Override
    public int compareTo(Abilities other) {
        if (this.stamina > other.stamina) {
            return 1;
        } else if (this.stamina < other.stamina) {
            return -1;
        } else if (this.stamina == other.stamina) {
            if (this.speed > other.speed) {
                return 1;
            } else if (this.speed < other.speed) {
                return -1;
            } else if (this.speed == other.speed) {
                if (this.agility > other.agility) {
                    return 1;
                } else if (this.agility < other.agility) {
                    return -1;
                }
            }

        }
        return 0;
    }

    public void update(double stamina, double speed, int agility) {
        this.stamina += stamina;
        this.speed += speed;
        this.agility += agility;
    }

    public int powerDifferenceApprox(Abilities other) {
        return (int) Math.abs(other.stamina - this.stamina);
    }

    @Override
    public String toString() {
        return this.stamina + ", the speed: " + this.speed + " and the agility: " + this.agility + ".";
    }
}
