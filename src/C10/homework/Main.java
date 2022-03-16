package C10.homework;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         *  Shape firstGenericShape = new Shape("M", "Snow");
         *         Shape secondGenericShape = new Shape("M", "Sand");
         *         Shape testingSimpleShape = new Shape();
         *         Shape fourthGenericShape = secondGenericShape;
         *         System.out.println(firstGenericShape.getSize());
         *         System.out.println(firstGenericShape);
         *         System.out.println(testingSimpleShape.equals(firstGenericShape));    //corner case - comparing the shape object using default constructor
         *         System.out.println("Generic shape two is equal to generic shape three? Answer: " + secondGenericShape.equals(fourthGenericShape));
         *         System.out.println("Hashcode for shape one: " + firstGenericShape.hashCode());
         *         System.out.println("Hashcode for the second generic shape: " + secondGenericShape.hashCode());
         *         System.out.println("Hashcode for the third generic shape: " + fourthGenericShape.hashCode());
         *         System.out.println("=====================================================");
         */


        Rectangle r1 = new Rectangle(20, 12);
        Rectangle r2 = new Rectangle("Huge rectangle", "sand", 2, 3);
        Rectangle r3 = r2;
        r1.displayHeight();
        r2.displayHeight();
        System.out.println(r1.getSize());
        System.out.println(r2.getSize());
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Rectangle one is equal to rectangle two? Answer:" + r1.equals(r2));
        System.out.println("Rectangle two is equal to rectangle three? Answer:" + r2.equals(r3));
        System.out.println("Hashcode for the first rectangle object: " + r1.hashCode());
        System.out.println("Hashcode for the second rectangle object: " + r2.hashCode());
        System.out.println("Hashcode for the third rectangle object: " + r3.hashCode());
        System.out.println("=====================================================");

        Triangle tr1 = new Triangle(17, 19);
        Triangle tr2 = new Triangle("Unknown", "Unknown", 20, 12);
        Triangle tr3 = tr2;
        tr1.displayHeight();
        tr2.displayHeight();
        System.out.println(tr1);
        System.out.println(tr2);
        System.out.println(tr1.getSize());
        System.out.println(tr2.getSize());
        System.out.println("Triangle one is equal to triangle two? Answer: " + tr1.equals(tr2));
        System.out.println("Triangle two is equal to triangle three? Answer: " + tr2.equals(tr3));
        System.out.println("Hashcode for the first triangle object: " + tr1.hashCode());
        System.out.println("Hashcode for the second triangle object: " + tr2.hashCode());
        System.out.println("Hashcode for the third triangle object: " + tr3.hashCode());


        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(r1);
        shapes.add(r2);
        shapes.add(tr1);
        shapes.add(tr2);

        System.out.println("Iterate through all the shapes:");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));
            //  display the area for each shape from the arrayList
            System.out.println(shapes.get(i).getSize());


//            Downcastig : we call the method specific to each form, depending on its origin class

            if (shapes.get(i) instanceof Triangle) {
                Triangle triangleRef = (Triangle) shapes.get(i); //downcasting
                triangleRef.displayHeight();
            } else if (shapes.get(i) instanceof Rectangle) {
                Rectangle rectangleRef = (Rectangle) shapes.get(i);
                rectangleRef.displayHeight();
            } else {
                System.out.println("Error: unknown type of shape...");
            }
        }

        //TODO - V2

        System.out.println();
        System.out.println("! Metoda displayHeight este suprascrisa in fiecare clasa pentru a evita instanceOf si downcasting! ");
        for (Shape shape : shapes) {
            shape.displayHeight();
        }
    }
}
