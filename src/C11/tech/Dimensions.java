package C11.tech;

public class Dimensions {

    private final int width;
    private final int lenght;
    private final int depth;

    public Dimensions(int width, int lenght, int depth) {
        this.width = width;
        this.lenght = lenght;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return  "\n         width: " + this.width +
                "\n         lenght: " + this.lenght +
                "\n         depth: " + this.depth;
    }
}
