package C04.quiz;

public class Ex03 {
    public static void main(String []args){
        String query = "ONE Simple sentence";
        query.toLowerCase(); //nu face nimic, pt ca stringurile sunt immutable..
        query = query.replace("one", "The");
        System.out.println(query);
        String newQuery = query.toLowerCase(); //doar daca il stocam in alt string
        System.out.println(newQuery);

    }
}
