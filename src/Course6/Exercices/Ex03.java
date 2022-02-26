package C6.Exercices;


import java.util.ArrayList;

public class Ex03 {

        public static ArrayList<Integer> incValues(ArrayList<Integer> ages) {  //metoda statica ce primeste un arraylist de integer
            for (int i=0; i<ages.size(); i++) {
                ages.set(i, ages.get(i) + 1);
            }
            return ages;
        }

        public static void main(String[] args) {
            ArrayList<Integer> ages = new ArrayList<Integer>();
            ages.add(15);
            ages.add(23);
            ages.add(19);

            incValues(ages);

            System.out.println(ages);
        }
    }

