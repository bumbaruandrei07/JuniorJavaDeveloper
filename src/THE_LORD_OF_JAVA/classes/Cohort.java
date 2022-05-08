package THE_LORD_OF_JAVA.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//ii dam un parametru de tip ce extinde clasa Creature
//toate obiectele pe care vrem sa le extindem trebuie sa fie de tipul Creature
//daca foloseam Creature in loc de C extends Creature, atunci peste tot in cod as fi avut referinta de tipul Creature,
//asa am referinta de tipul C care poate fi interpretata de mine mai departe cum se doreste, in mai multe moduri
//ca parametru de tip nu putem folosi o clasa, clasa concreta se da in momentul instantierii
//daca am pune Creature ar inseamna acelasi lucru, dar nu putem sa folosim in mod direct Creature, putem sa mentionam ca C o sa fie parametru de tip Creature
public class Cohort<C extends Creature> {
    private Map<String, C> citizens = new HashMap<>();


    public void addNewCitizen(String address, C creature) {
        citizens.put(address, creature);
    }

    public ArrayList<C> getAllCitizensToFight() {
        //metoda values() specifica unui map o sa returneze valorile retinute in hashmap
        ArrayList<C> allAligned = new ArrayList<>(citizens.values());
        Collections.sort(allAligned);
        return allAligned;
    }

    //obtinem valoarea asociata cheii
    public C getCitizenAT(String address) {
        return citizens.get(address);
    }

    public int size() {
        return citizens.size();
    }

    public boolean isEmpty() {
        return citizens.isEmpty();
    }

    //apelam getAllCitizensToFight ca sa obtinem array-ul sortat de elemente de tipul Creature, in ordine crescatoare
    @Override
    public String toString() {
        ArrayList<C> citizensAligned = getAllCitizensToFight();
        String ret = "";
        for (C creature : citizensAligned) {
            ret += creature + "\n";
        }
        return ret;
    }
}