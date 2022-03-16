package C10.homework;

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

    // will become abstract
    public double getSize() {
        System.out.print("The area of the shape is by default: ");
        return -1;
    }



    // nu va devini abstracta pentru ca nu o mai pot apela cu super din Rectangle si Triangle
    // ar fi ca si cum spun ca nu are implementare
    // dar eu am nevoie de aceasta implementare in clasele derivate, pentru a o folosi
    @Override
    public String  toString() {
        return String.format("made of %s, contains the text: \"%s\".", this.material, this.text);
    }

    //idem cazul toString()
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

    // varianta optima pentru displayHeight la obiecte (evitare instanceOf SI downcasting)
    // i.e. metoda displayHeight devine abstracta

    public abstract void displayHeight();

}
