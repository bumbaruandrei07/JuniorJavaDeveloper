package C11.tech;

import java.util.ArrayList;

public class TestDevices {
    public static void main(String[] args) {


        Smartphone XiaomiRedmiNote9 = new Smartphone(10, 20, 20, 15, 100, 10, 100, 50);
        XiaomiRedmiNote9.pressVolumeDown();
        System.out.println(XiaomiRedmiNote9);
        XiaomiRedmiNote9.muteMicrophone();
        XiaomiRedmiNote9.colorScreen("RED");
        XiaomiRedmiNote9.setPixel(0, "BLUE");
        XiaomiRedmiNote9.setPixel(2, "PURPLE");
        System.out.println(XiaomiRedmiNote9);
        XiaomiRedmiNote9.increaseMicrophoneVolume();
        XiaomiRedmiNote9.increaseMicrophoneVolume();
        System.out.println(XiaomiRedmiNote9);

        Smartphone SamsungS22 = new Smartphone(20, 25, 25, 25, 100, 56, 100, 25);
        SamsungS22.increaseMicrophoneVolume();
        SamsungS22.pressVolumeUp();
        SamsungS22.pressPowerButton();
        SamsungS22.colorScreen("BLACK");
        System.out.println(SamsungS22);
        SamsungS22.setPixel(0, "BLUE");
        SamsungS22.setPixel(1, "WHITE");
        SamsungS22.setPixel(2, "WHITE");
        System.out.println(SamsungS22);
        SamsungS22.pressVolumeDown();
        SamsungS22.pressVolumeDown();
        System.out.println(SamsungS22);


    }
}