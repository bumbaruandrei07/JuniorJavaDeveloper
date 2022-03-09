package InnerClasses.quiz.ex02;

import java.util.Scanner;

public class InnerClassPlayground {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter if-block? Y/N");
        if (sc.next().equalsIgnoreCase("Y")) {
            //clasa interna locala, neanonima
            class Name {
                String firstName;
                String lastName;
                public Name(String firstName, String lastName) {
                    super(); //se apeleaza oricum, si daca nu-l apelam explicit
                    this.firstName = firstName;
                    this.lastName = lastName;
                }

                @Override
                public String toString() {
                    return this.firstName + " " + this.lastName;
                }
            }
            System.out.println("Enter inner if-block? Y/N");
            if (sc.next().equalsIgnoreCase("Y")) { //daca testam y se apeleaza toString()
                System.out.println(new Name("James", "Bond")); // Here:  instantiem clasa locala.

//                blocul if in care avem tot scope-ul clasei are vizibilitate la clasa, este mai adanc ca si nivel de imbricare
//                nu avem : quiz12.InnerClassPlayground$1Name@4aa298b7 pentru ca SUPRASCRIEM metoda toString() din clasa interna locala
            }
        }
    }
}