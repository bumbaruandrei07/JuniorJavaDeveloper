package THE_LORD_OF_JAVA.runner;

import THE_LORD_OF_JAVA.classes.Abilities;

public class AbilitiesTest {


    public static void main(String[] args) {
        Abilities abilitiesI = new Abilities(2, 3, 2);
        Abilities abilitiesII = new Abilities(2, 3, 2);
        System.out.println(abilitiesI.compareTo(abilitiesII));

        abilitiesI.update(5,2,3);
        System.out.println(abilitiesI.compareTo(abilitiesII));
        System.out.println(abilitiesI.powerDifferenceApprox(abilitiesII));
        System.out.println(abilitiesI);
        System.out.println(abilitiesII);




    }
}
