package C12.abstractTech;

public class Speaker {

    private int maxVolume;
    private int crtVolume;

    public Speaker(int maxVolume) {
        this.maxVolume = maxVolume;
        crtVolume = maxVolume / 4;
    }

    public Speaker(int maxVolume, int crtVolume) {
        this(maxVolume);
        this.crtVolume = crtVolume;
    }

    public boolean increaseVolume() {
        if (crtVolume < maxVolume) {
            crtVolume++;
            return true;
        }
        return false;
    }


    public boolean decreaseVolume() {
        if (crtVolume > 0) {
            crtVolume--;
            return true;
        }
        return false;
    }

    public void setSilenceMode() {
        this.crtVolume = 0; //mute mode
    }

    @Override
    public String toString() {
        return "Max volume: " + this.maxVolume +
                ", current volume: " + this.crtVolume;
    }
}
