package InnerClassesTopLevelClasses.geometry;

public interface IShape {
    void printShapeName();
}

// top level class, package-private
class Triangle implements IShape {
    @Override
    public void printShapeName() {
        System.out.println("A triangle!");
    }
}

// top level class, package-private
class Rectangle implements IShape {
    @Override
    public void printShapeName() {
        System.out.println("A rectangle!");
    }
}

// top level class, package-private
class Circle implements IShape {
    @Override
    public void printShapeName() {
        System.out.println("A circle!");
    }
}