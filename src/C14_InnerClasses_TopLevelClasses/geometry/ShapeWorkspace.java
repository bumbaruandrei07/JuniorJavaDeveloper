package C14_InnerClasses_TopLevelClasses.geometry;

//ne limiteaza scopul in care vor fi folosite clasele

public class ShapeWorkspace {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[3]; // an array of shapes
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Rectangle();


        //Clasele Circle, Triangle si Rectangle vor fi utilizate, instantiate doar in interiorul acestui pachet (sunt package-private)
        //Doar IShape va putea fi folosit in afara pachetului pentru ca este public !
        //util pentru ascunderea functionalitatii


        for (int i = 0; i < shapes.length; i++) {
            shapes[i].printShapeName();
        }
    }

    public static IShape[] getArrayOfShapes() {
        IShape[] shapes = new IShape[3];
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Rectangle();
        return shapes;
    }


}