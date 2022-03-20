package C12.abstractShape;

public abstract class Shape {

    private String text;
    private String material;

    public Shape() {
        this.text = "UNKNOWN TEXT";
        this.material = "UNKNOWN MATERIAL";
    }

    public Shape(String text, String material) {
        this.text = text;
        this.material = material;
    }

    public abstract double getSize();

    // i can use this
    public abstract String toString();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Shape childShape = (Shape) obj;
        if (this.material.equals(childShape.material) && (this.text.equals(childShape.text))) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 7;
        int result = 1;
        result = prime * result + ((material == null) ? 0 : material.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        return result;
    }
}
