package subiecteExamen1.alteGrile;

public class ex03 {
    public static void main(String[] args){
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4);
        int foundAt = s1.indexOf(s2); //in stringul s1 care este primul indice de la care incepe stringul s2 -> 4
        System.out.println(foundAt);
    }
}
