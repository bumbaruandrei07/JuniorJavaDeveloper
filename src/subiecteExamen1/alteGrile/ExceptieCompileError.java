package subiecteExamen1.alteGrile;

//daca primul catch era Exception e1 atunci aveam compile-time error, pt ca ArithmeticException e2 este inclusa in Exception...
// primeam eroarea -> exception already caught
public class ExceptieCompileError {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        try {
            for (int z = 2; z >= 0; z--) {
                int ans = x / z;
                System.out.print(ans+ " ");
            }
        } catch (ArithmeticException e2) {
            System.out.println("E2");
        }
        catch (Exception e1) {
            System.out.println("E1");
        }
    }
}
