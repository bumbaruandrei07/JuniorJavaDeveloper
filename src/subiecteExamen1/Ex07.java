package subiecteExamen1;

public class Ex07 {

    public static void main(String[] args) {
        String sentence = "Every year I visit each and every family member during Christmas";
        sentence = sentence.substring(0, sentence.length() - 9);
        sentence.replace("I", "you"); //se ingora pentru ca Stringurile sunt immutable
        System.out.println(sentence);
    }
}
