package THE_FINAL_EXAMEN;

public class Challenge implements Unique {
    private final String id;
    private final int maxScore;
    private int score;
    private int attempts;

    public Challenge(String id, int maxScore) {
        this.id = id;
        this.maxScore = maxScore;
    }

    @Override
    public String getUniqueID() {
        return this.id;
    }

    void setScore(int score) {
        if (score > this.score) {
            this.score = score;
        }
        this.attempts++;
    }

    int getScore() {
        return this.score;
    }

    int getAttempts() {
        return this.attempts;
    }

    @Override
    public String toString() {

        return "Challenge {" + getUniqueID() + "}: Score:\n{" + getScore() + "} / {" + this.maxScore + "}  (Attemps: {" + getAttempts() + "})";
    }
}
