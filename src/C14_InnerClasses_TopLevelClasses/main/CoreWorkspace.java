package C14_InnerClasses_TopLevelClasses.main;

//import C14_InnerClasses.geometry.Circle;

import C14_InnerClasses_TopLevelClasses.geometry.IShape;
import C14_InnerClasses_TopLevelClasses.geometry.ShapeWorkspace;
//import C14_InnerClasses.geometry.Rectangle;
//import C14_InnerClasses.geometry.Triangle;

//nu putem crea direct obiectele -> avem nevoie de un context din pachetul geometry, apelam metoda getArrayOfShapes() care creeaza obiectele
// cele 3 clase sunt accesibile doar in pachet, in afara va fi nevoie sa ni le expunem de acolo sub o interfata comuna si sa le utilizam in exterior printr-o interfata comuna
// asa cum ascundem field-uri , putem ascunde si clase, pe care le folosim in exterior printr-o interfata publica


public class CoreWorkspace {

    public static void main(String[] args) {

        IShape[] shapes = ShapeWorkspace.getArrayOfShapes(); // intoarce un vector de obiecte pe care le accesam in afara contextului prin interfata publica!
//        shapes[0] = new Circle();   eroare de compilare -> nu fac parte din acelasi pachet
//        shapes[1] = new Triangle();
//        shapes[2] = new Rectangle();
        //care vor fi utilizate, instantiate doar in interiorul acestui pachet
        //util pentru ascunderea functionalitatii


        for (int i = 0; i < shapes.length; i++) {
            shapes[i].printShapeName();
        }

    }
}
