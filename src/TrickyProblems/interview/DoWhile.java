package TrickyProblems.interview;

//OUTPUT: 3
//2 < 10
//2 + 2 = 4 < 10
// 4 + 4 = 8 < 10
//8 + 8 = 16 > 10 -> STOP
public class DoWhile {
    public static void main(String[] args) {
        int i = 2;
        int counter = 0;
        do {
            System.out.println(i);
            i += i;
           ++counter;
        } while (i < 10);
        System.out.println("Valoare counter: " + counter);
    }
}
