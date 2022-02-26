package C12.abstractTech;

public abstract class Case {

    public abstract void pressPowerButton();

    public abstract void pressVolumeUp();

    public abstract void pressVolumeDown();

    @Override
    public String toString() {
        return "Phone Case calling...";
    }
}