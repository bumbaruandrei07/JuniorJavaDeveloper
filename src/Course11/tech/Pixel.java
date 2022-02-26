package C11.tech;

public class Pixel {

    private String color;

    public Pixel() {
        this.color = "#FFFFFF"; //white color by default
    }

    public Pixel(String color) {
        this.color = color;
    }

    public void setPixel(String color) {
        this.color = color;
    }

    public String getPixel() {
        return this.color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
