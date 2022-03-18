package LambdaExpressions.homework.ex01;

public class Operations {

    public static void main(String[] args) {
        IOperator sum = (a, b) -> a + b;

        System.out.println(sum.operation(1, 2));
        System.out.println(sum.operation(5, 5));
        System.out.println(sum.operation(10, 10));

        IOperator dif = (x, y) -> x - y;

        System.out.println(dif.operation(10, 5));
        System.out.println(dif.operation(5, 10));
        System.out.println(dif.operation(10, 20));

        IOperator multiply = (x, y) -> x * y;
        System.out.println(multiply.operation(10, 10));
        System.out.println(multiply.operation(5, 5));
        System.out.println(multiply.operation(0, 1));

        IOperator div = (x, y) -> x / y;
        System.out.println(div.operation(10, 2));
        System.out.println(div.operation(9, 4));
        System.out.println(div.operation(1, 2));
        System.out.println(div.operation(1, 2)); //0

        IOperator modulo = (x, y) -> x % y;
        System.out.println(modulo.operation(1, 4));
        System.out.println(modulo.operation(10, 2));
        System.out.println(modulo.operation(5, 4));


    }
}