package THE_LORD_OF_JAVA.classes;

import java.util.ArrayList;

public class LordOfJava {
    private Parameters parameters;
    private Cohort<Dragon> dragons = new Cohort<Dragon>();
    private Cohort<Warg> wargs = new Cohort<Warg>();
    private Cohort<Mumakil> mumakils = new Cohort<Mumakil>();

    public LordOfJava(String OS, String gamePATH, String credentials, int noLives) {
        this.parameters = new Parameters(OS, gamePATH, credentials, noLives);
    }

    /**
     * Adauga o noua creatura, in functie de specia acesteia, la una dintre cele 3 hoarde.
     * Precum se observa din definitie, metoda primeste o referinta abstracta la creatura.
     * Determinarea tipului (concret) al acestei instante se va realiza in cadrul metodei, printr-un operator specific.
     * Mai mult, in caz de eroare (i.e. creatura nu apartine niciuneia dintre speciile cunoscute),
     * metoda va arunca o exceptie de tipul IllegalArgumentException cu mesajul: „Creature type unknown: <CLASS_NAME>“.
     * Hint: pentru a obtine numele clasei de care apartine o instanta se poate utiliza: object.getClass().getName()
     */

    public void addCreature(Creature creature, String address) {
        //trebuie sa facem downcasting fortat la tipul creaturii si o adaugam in cohortul fiecareia
        //daca primim o creatura care nu e in niciuna din cele 3 tipuri aruncam exceptia IllegalArgumentException
        if (creature instanceof Dragon) {
            dragons.addNewCitizen(address, (Dragon) creature);
        } else if (creature instanceof Warg) {
            wargs.addNewCitizen(address, (Warg) creature);
        } else if (creature instanceof Mumakil) {
            mumakils.addNewCitizen(address, (Mumakil) creature);
        } else {
            throw new IllegalArgumentException("Creature type unknown:" + creature.getClass().getName());
        }
    }

    /**
     * Modeleaza un duel intre hoarda de dragoni si cea de wargi, intorcand ulterior rezultatul duelului. Regulile de castigare a unei batalii sunt prezentate in continuare:
     * daca cele doua hoarde au numar diferit de luptatori, castiga intotdeauna hoarda cu mai multi luptatori. Intr-un astfel de scenariu, metoda va returna:
     * -1: in cazul in care castiga wargii
     * +1: in cazul in care castiga dragonii
     * daca cele 2 armate au numar egal de camarazi, acestia vor fi comparati 1-1. Practic, deoarece fiecare armata de creaturi este deja ordonata, duelele se vor da intre creaturi aflate pe acceasi pozitie in armata (i.e. dragons[i] se va duela cu wargs[i]). Fiecare duel (i.e. 1-1) este punctat astfel:
     * -1: in cazul in care castiga duelul wargul
     * +1: in cazul in care castiga duelul dragonul
     * 0: in caz de egalitate, caz in care mor amandoi in lupta.
     * Scorul final al bataliei este dat de suma tuturor duelurilor. Intutiv, semnul rezultatului va indica hoarda castigatoare iar valoarea in modul va reprezenta magnitudinea victoriei (i.e. o valoare mai mare va reprezenta o victorie zdrobitoare).
     */

    public int battleDragonsWargs() {
        if (dragons.size() < wargs.size()) {
            return -1;
        } else if (dragons.size() > wargs.size()) {
            return 1;
        }

        //arrayList-urile ce contin creaturile sortate prin metoda specifica implementata in clasa generica
        ArrayList<Dragon> dragonsToFight = dragons.getAllCitizensToFight();
        ArrayList<Warg> wargToFight = wargs.getAllCitizensToFight();
        int score = 0;
        for (int i = 0; i < wargs.size(); i++) {
            int duelResult = dragonsToFight.get(i).compareTo(wargToFight.get(i));
            score += duelResult > 0 ? +1 : duelResult < 0 ? -1 : 0;
            //daca am obtinut un rezultat pozitiv adaugam 1, daca e negativ scadem 1, altfel avem 0
            //e ca un if -else if- else

        }
        return score;
    }

    @Override
    public String toString() {
        return "" + parameters + "\n" + "\n" +
                dragons + "\n" + wargs + "\n" + mumakils;
    }
}
