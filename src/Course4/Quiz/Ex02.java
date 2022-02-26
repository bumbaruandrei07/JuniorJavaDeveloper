package Course4.Quiz;

public class Ex02 {
    public static void main(String[] args){
        String sent = "Never underestimate a TALeNTED person Who Is willing TO SUCCeed!";

        int counter = 0;
        int localCounter = 0;
        for (int i = 0; i < sent.length(); i++) {
            char ch = sent.charAt(i);
            if (!Character.isLetter(ch)) {
                counter += (localCounter > 0 ? 1 : 0);
                localCounter = 0;
                continue;
            }
            if(Character.isUpperCase(ch)) {
                localCounter++;
            } else {
                localCounter--;
            }
        }
        System.out.println(counter);
    }
}
