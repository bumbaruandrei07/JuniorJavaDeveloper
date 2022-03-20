package LambdaExpressions.homework.ex02;

import java.util.Scanner;

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
            if (x == 0) {
                System.out.println("Numarul este nul");
                return true;
            } else {
                System.out.println("Numarul este nenul");
                return false;
            }
        };

        IVerifyProperty isMagic = (x) -> {

            int firstSum = 0;
            while (x > 0) {
                int lastDigit = x % 10;
                firstSum += lastDigit;
                x /= 10;
            }

            System.out.println("First sum of digits: " + firstSum);

            int secondSum = 0;

            while (firstSum > 0) {
                int lastDigit = firstSum % 10;
                secondSum += lastDigit;
                firstSum /= 10;
            }

            System.out.println("The sum with one digit of the initial number: " + secondSum);

            if (secondSum == 3 || secondSum == 7 || secondSum == 9) {
                System.out.println("The number is magic!");
                return true;
            }

            System.out.println("The number isn't magic!");
            return false;

        };

        System.out.println(isNull.hasProperty(0));
        System.out.println(isNull.hasProperty(1));
        System.out.println(isNull.hasProperty(-1));

        System.out.println(isMagic.hasProperty(7));
        System.out.println(isMagic.hasProperty(987));
        System.out.println(isMagic.hasProperty(984));

    }


}
