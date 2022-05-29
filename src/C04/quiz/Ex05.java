package C04.quiz;

public class Ex05 {

    public static void main(String[] args){
        String quote = "Always aim HIGH!";
        //extrage tot stringul quote, il face lowerCase apoi UpperCase
        String result = quote.substring(0, quote.length()).toLowerCase().toUpperCase();
        System.out.println(result);
    }
}
