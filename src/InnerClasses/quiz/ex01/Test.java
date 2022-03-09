package InnerClasses.quiz.ex01;

public class Test {
    public static void main(String[] args) {
        Car vw = new Car("VW Golf");

        // instantiation of a wheel:


        //trebuie sa creem prin intermediul obiectului
        // apel new Wheel in contextul obiectului Car creat anterior

        Car.Wheel wheel = vw.new Wheel("Michelin");
        System.out.println(wheel);



    }


}
