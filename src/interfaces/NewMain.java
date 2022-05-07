package interfaces;

public class NewMain {
    public static void recordSong(ICanSing singer) {
        System.out.println("Start song recording...");
        singer.sing("The greatest");
        System.out.println("Stop recording...");
    }

    public static void main (String[] args) {
        recordSong(new Singer("David", "Rea", 23)); // call method with a 'Singer' obj
        recordSong(new RockStar("Emily", "Vanger", 19)); // using a 'RockStar' obj
    }

}
