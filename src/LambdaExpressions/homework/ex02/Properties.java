package LambdaExpressions.homework.ex02;

public class Properties {

    public static void main(String[] args) {

        IVerifyProperty isEven = (x) -> {

            if (x % 2 == 0) {
                System.out.println("Numarul este par!");
                return true;
            } else {
                System.out.println("Numarul nu este par! Este impar...");
                return false;
            }
        };

        System.out.println(isEven.hasProperty(21));
        System.out.println(isEven.hasProperty(20));
        System.out.println(isEven.hasProperty(0));
        System.out.println(isEven.hasProperty(-1));
        System.out.println(isEven.hasProperty(-3));
        System.out.println(isEven.hasProperty(-18));


        IVerifyProperty isNegative = (x) -> {
            if (x < 0) {
                System.out.println("Numarul este negativ!");
                return true;
            } else {
                System.out.println("Numarul este pozitiv!");
                return false;
            }
        };

        System.out.println(isNegative.hasProperty(20));
        System.out.println(isNegative.hasProperty(-1));
        System.out.println(isNegative.hasProperty(0));

        IVerifyProperty isNull = (x) -> {
            if(x == 0){
                System.out.println("Numarul este nul");
                return true;
            }
            else{
                System.out.println("Numarul este nenul");
                return false;
            }
        };

        System.out.println(isNull.hasProperty(0));
        System.out.println(isNull.hasProperty(1));
        System.out.println(isNull.hasProperty(-1));

    }


}
