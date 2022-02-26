package C10.Homework;

public class Rectangle extends Shape {


    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String text, String material, int width, int height) {
        super(text, material);
        this.width = width;
        this.height = height;
    }

    public void displayRectangleHeight() {
        System.out.println("Rectangle height is:" + this.height);
    }

    @Override
    public double getSize() {
        double area = this.width * this.height;
        System.out.print("The area of the rectangle is: ");
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle: height is " + this.height + ", width is: " + this.width + ", made of steel, contains the text: Yellow rectangle";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // for performance reasons
            return true;
        }
        if (obj == null) {
            return false;
        }
        // both objects have the same type
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangleChild = (Rectangle) obj;
        if (super.equals(rectangleChild) && this.height == rectangleChild.height && this.width == rectangleChild.width) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int prime = 17;
        int result = super.hashCode();
        result = prime * result + width;
        result = prime * result + height;
        return result;
    }
}
