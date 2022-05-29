package THE_FINAL_EXAMEN;

import java.util.HashMap;
import java.util.Map;

public class UserProfile extends UserLogging implements Comparable<UserProfile> {

    private int score;
    private Map<String, Integer> solved = new HashMap<String, Integer>();


    public UserProfile(String username, String password) {
        super(username, password);
    }

    @Override
    public int compareTo(UserProfile o) {
        if (this.score > o.score) {
            return 1;
        } else if (this.score < o.score) {
            return -1;
        }
        //daca au acelasi scor
        return 0;
    }
    public int getScore(){
        return score;
    }

    public void solve(Challenge ch){

    }

}
