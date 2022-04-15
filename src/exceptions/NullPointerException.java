package exceptions;

import java.util.ArrayList;
import java.util.List;

public class NullPointerException {

    //LBYL (Look Before You Leap): abordare preventiva de scriere a codului
    //abordarea recomandata in general, deoarece vrem sa controlam mai mult input-ul, sa fim mai aware despre situatiile de gestionat
    public static String getElementLBYL(List<String> collection, int index) {
        if (index >= 0 && index < collection.size()) {
            return collection.get(index);
        }
        return null;
    }

    //EAFP (Easier to Ask for Forgiveness than Permission)
    //indiferent de valoarea index-ului o sa facem apelul metodei
    //inglobam instructiunile care ar putea genera exceptii intr-un bloc try-catch
    //blocul try-cath are 2 parti :
    //1. try block, rulam instructiunile noastre, se refera la imbricarea instructiunilor, daca bucatica noastra din cod genereaza exceptie o adaugam intr-un try
    //daca ne asteptam ca un segment din codul nostru genereaza exceptie atunci il imbricam intr-un bloc try-catch si tratam exceptia
    //
    public static String getElementEAFP(List<String> collection, int index) {
        try {
            return collection.get(index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    //adaugam lungimea stringului la contor
    public static int countChars(List<String> list) {
        int amount = 0;
        for (String word : list) {
            amount += word.length();
        }
        return amount;
    }
    //Ce se va intampla insa daca metoda primeste ca argument un List de forma [„tenis“, „fotbal“, null, „volei“]?
    //Programul va arunca o exceptie de tipul ''NullPointerException'', deoarece se incearca apelarea metodei ''length()'' pentru un element ''null''.

    public static int countCharsHandled(List<String> list) {
        int amount = 0;
        for (String word : list) {
            try {
                amount += word.length();
                //e este o variabila, este numele, ca si cum dam un parametru
                //daca punem Exception atunci o sa tratam toate exceptiile

                //intram doar cand o exceptie matchuieste cu ce avem aici
            } catch (java.lang.NullPointerException e) {
                System.out.println(e.getMessage());
                amount += 0;
            }
            finally {
                System.out.println("Counted some chars");
            }
        }
        return amount;
    }

    //iti dai seama de exceptii dupa testare sau in momentul implementarii
    //clasa Throwable este clasa parinte pentru toate clasele de exceptii
    //Throwable -> RuntimeException -> Exception -> NullPointerException, IndexOutOfBoundsException

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("tenis");
        list.add("fotbal");
        list.add(null);
        list.add("volei");
        //o sa ne calculeaza doar pentru stringurile valide in urma tratarii exceptiei
        System.out.println(countCharsHandled(list));
    }
}
