package THE_LORD_OF_JAVA.classes;


//clasa Parameters stocheaza toti parametrii jocului -> denumite si metadate pentru orice aplicatie
public class Parameters {

    private String OS;
    private String gamePath;
    private String credentials;
    private int noLives;

    public Parameters(String OS, String gamePath, String credentials, int noLives) {
        this.OS = OS;
        this.gamePath = gamePath;
        this.credentials = credentials;
        this.noLives = noLives;
    }

    @Override
    public String toString() {
        return "OS: " + this.OS + "\n" +
                "Game Path: " + this.gamePath + "\n" +
                "Credentials: " + this.credentials + "\n" +
                "No. lives remaining: " + this.noLives;
    }
}
