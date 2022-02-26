package C4.Quiz;

public class Ex03 {
    public static void main(String []args){
        String query = "ONE Simple sentence";
        query.toLowerCase(); //nu face nimic, pt ca stringul query este immutable... si nu stocheaza noua valoare intr-un alt string
        query = query.replace("one", "The");
        System.out.println(query);
        String newQuery = query.toLowerCase();
        System.out.println(newQuery);

    }
}
