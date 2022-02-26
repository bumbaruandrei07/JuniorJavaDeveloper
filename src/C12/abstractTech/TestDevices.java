package C12.abstractTech;

public class TestDevices {
    public static void main(String[] args) {

        /*
        TODO -> Aminteste-ti arhitectura unui smartphone, implementata la capitolul Compunere si Agregare. Actualizeaza corespunzator aplicatia folosind cuvantul cheie abstract si argumenteaza cu trainerul deciziile de proiectare luate.

         Solution : este recomandata evitarea abstractizarii, deoarece daca setam clasele "componente" clasei Smartphone ca fiind abstracte nu mai putem instantia componentele unui obiect de tip smartphone.
         NEW FEATURE : abstractizarea clasei "Case" si a metodelor sale specifice ce vor fi suprascrise in clasa Smartphone ce contine o componenta de tipul clasei "Case"
         */


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
        System.out.println("<><><><><><><><>");
        XiaomiRedmiNote9.pressPowerButton();
        System.out.println("<><><><><><><><>");
        System.out.println(XiaomiRedmiNote9);

        Smartphone SamsungS22 = new Smartphone(20, 25, 25, 25, 100, 56, 100, 25);
        SamsungS22.pressPowerButton();
        System.out.println("<><><><><><><><>");
        SamsungS22.increaseMicrophoneVolume();
        System.out.println("<><><><><><><><>");
        SamsungS22.pressVolumeUp();
        System.out.println("<><><><><><><><>");
        SamsungS22.pressVolumeDown();
        System.out.println("<><><><><><><><>");
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