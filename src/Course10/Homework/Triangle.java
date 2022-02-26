package C10.Homework;

import java.util.Objects;

public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(String material, String text, int base, int height) {
        super(material, text);
        this.base = base;
        this.height = height;
    }

    public void displayTriangleHeight() {
        System.out.println("Triangle height is: " + this.height);
    }

    @Override
    public double getSize() {
        System.out.print("The area of the triangle is: ");
        return (this.base * this.height) / 2.0;
    }

    @Override
    public String toString() {
        return "Triangle: height is " + this.height + ", base is: " + this.base + ", made of glass, contains the text: I reflect light";
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
        Triangle childTriangle = (Triangle) obj;
        if (super.equals(childTriangle) && this.base == childTriangle.base && this.height == childTriangle.height) {
            return true;
        }
        return false;
    }


    @Override
    public int hashCode() {
        // This formula is used for better hash performance
        // by avoiding duplicates for non-equal objects
        int prime = 7;
        int result = super.hashCode();
        result = prime * result + base;
        result = prime * result + height;
        return result;
    }
}
