package C11.tech;

import java.util.ArrayList;

public class Smartphone {
    // Composition:
    private Screen theScreen;
    private Case theCase;
    private Speaker theSpeaker;
    private Microphone theMicrophone;
    private Pixel thePixel;


    public Smartphone(Screen theScreen, Case theCase,
                      Speaker theSpeaker, Microphone theMicrophone) {
        this.theScreen = theScreen;
        this.theCase = theCase;
        this.theSpeaker = theSpeaker;
        this.theMicrophone = theMicrophone;
    }

    public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol,
                      int speakerCrtVol, int microMaxVol, int microCrtVol) {
        this.theScreen = new Screen(pixelsNo, width, length, depth);
        this.theCase = new Case();
        this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
        this.theMicrophone = new Microphone(microMaxVol, microCrtVol);
    }


    // in this case we implement wrapper methods for all the methods we want to expose
    // i.e. for power button, volume UP and volume DOWN:
    public void pressPowerButton() {
        // delegate the responsibility to the object specific method
        // Obs: reusing the object functionality
        //System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressPowerButton();
    }

    public void pressVolumeUp() {
        // delegate the responsibility to the object specific method
        // Obs: reusing the object functionality
        //System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressVolumeUp();
//        Speaker→increaseVolume()
        this.theSpeaker.increaseVolume();
    }

    public void pressVolumeDown() {
        // delegate the responsibility to the object specific method
        // Obs: reusing the object functionality
        // System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressVolumeDown();
        this.theSpeaker.decreaseVolume();
    }

    public void setPixel(int indexOfPixel, String color) {
        //TODO -> Class Smartphone: delegate to Screen and then delegate to Pixel, i.e. double delegation
        this.theScreen.setPixel(indexOfPixel, color);
    }

    public void colorScreen(String color) {
        this.theScreen.colorScreen(color);
    }

    public void increaseMicrophoneVolume() {
        this.theMicrophone.increaseVolume();
    }

    public void decreaseMicrophoneVolume() {
        this.theMicrophone.decreaseVolume();
    }


    public void muteMicrophone() {
        //
        this.theMicrophone.muteMicrophone();
    }

    public void setSilence() {
        //TODO class Smartphone -> delegate to Speaker and mute speaker volume
        this.theSpeaker.setSilenceMode();
    }

    @Override
    public String toString() {
        return " Smartphone{" +
                "\n the Screen: " + theScreen +
                "\n the Case: " + theCase +
                "\n the Speaker: " + theSpeaker +
                "\n the Microphone: " + theMicrophone +
                " }";
    }
}
