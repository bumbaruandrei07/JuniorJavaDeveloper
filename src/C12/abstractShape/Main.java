package C12.abstractShape;

import java.util.ArrayList;

/* TODO - > Aminteste-ti aplicatia cu forme geometrice proiectata anterior: Exercitiu - Geometric Shapes. Actualizeaza ierarhia de clase folosind corect keyword-ul abstract pentru a:

- restrictiona crearea de obiecte invalide (i.e. obiecte de tip Shape).
- evita implementarea metodelor generice, care ar trebui sa fie (in mod corect) abstracte
- forta programatorul care extinde clasa abstracta Shape sa implementeze toate metodele specifice unei forme propriu-zise

 ***** solution -> we will make the class Shape abstract and the method getSize() from the class Shape *****

 */


public class Main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(20, 12);
        Rectangle r2 = new Rectangle("Huge rectangle", "sand", 2, 3);
        Rectangle r3 = r2;
        r1.displayRectangleHeight();
        r2.displayRectangleHeight();
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
        tr1.displayTriangleHeight();
        tr2.displayTriangleHeight();
        System.out.println(tr1);
        System.out.println(tr2);
        System.out.println(tr1.getSize());
        System.out.println(tr2.getSize());
        System.out.println("Triangle one is equal to triangle two? Answer: " + tr1.equals(tr2));
        System.out.println("Triangle two is equal to triangle three? Answer: " + tr2.equals(tr3));
        System.out.println("Hashcode for the first triangle object: " + tr1.hashCode());
        System.out.println("Hashcode for the second triangle object: " + tr2.hashCode());
        System.out.println("Hashcode for the third triangle object: " + tr3.hashCode());


        ArrayList<Shape> shapes = new ArrayList<>();
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
                Triangle triangleRef = (Triangle) shapes.get(i);
                triangleRef.displayTriangleHeight();
            } else if (shapes.get(i) instanceof Rectangle) {
                Rectangle rectangleRef = (Rectangle) shapes.get(i);
                rectangleRef.displayRectangleHeight();
            } else {
                System.out.println("Error: unknown type of shape...");
            }
        }
    }
}
