package InnerClasses.quiz.ex01;

public class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }

    class Wheel {
        String type;

        public Wheel(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Type: " + type;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n Type: ";
     }
}