package THE_FINAL_EXAMEN;

public class UserLogging implements ILogging{
    private final String username;
    private String password;
    boolean logged; //variabila de control
    public UserLogging(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    public boolean login(String password) {
        if(password.equals(this.password)){
            logged = true;
            return true;
        }
        return false;
    }

    @Override
    public void logout() {
        System.out.println("Log out");
        logged = false;
    }

    @Override
    public boolean isLoggedIn() {
        if(login(password)){
            return true;
        }
        return false;
    }
}
