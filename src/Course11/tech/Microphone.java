package C11.tech;

public class Microphone {
    private int maxVolume;
    private int crtVolume;

    public Microphone(int maxVolume) {
        this.maxVolume = maxVolume;
        crtVolume = (maxVolume / 4);
    }

    public Microphone(int maxVolume, int crtVolume) {
        this.crtVolume = crtVolume;
        this.maxVolume = maxVolume;
    }

    public Microphone() {

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

    public void muteMicrophone() {
        this.crtVolume = 0; //mute mode
    }


    @Override
    public String toString() {
        return "Microphone current volume: " + this.crtVolume + "\n" + " max volume: " + this.maxVolume;
    }
}
