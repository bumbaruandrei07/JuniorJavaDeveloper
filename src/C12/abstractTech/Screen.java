package C12.abstractTech;

import java.util.ArrayList;

public class Screen {
    private ArrayList<Pixel> pixels;
    private Dimensions dimensions;


    public Screen(int numberOfPixels, int width, int length, int depth) {
        this.pixels = new ArrayList<>(numberOfPixels); //cu "numberOfPixels" initializam field-ul "pixels"

        //populare ArrayList
        for (int i = 0; i < numberOfPixels; i++) {
            this.pixels.add(i, new Pixel());
        }
        this.dimensions = new Dimensions(width, length, depth);
    }

    public void setPixel(int indexOfPixel, String color) {
        this.pixels.get(indexOfPixel).setPixel(color);
    }

    public void colorScreen(String color) {
        for (Pixel pixel : this.pixels) {
            pixel.setPixel(color);
        }
    }


//TODO method for printing the pixels from our Arraylist
//    public void printPixel() {
//        for (Pixel pixel : pixels) {
//            System.out.println(pixel.getPixel());
//        }
//    }

    @Override
    public String toString() {
        return "Screen: " +
                "\n pixels: " + this.pixels +
                "\n dimensions: " + this.dimensions;
    }
}
