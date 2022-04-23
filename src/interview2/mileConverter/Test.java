package interview2.mileConverter;

public class Test {


    public static void main(String[] args) {

        System.out.println(new MilesToKmConverter().milesToKm(1));
        System.out.println(new NauticalMilesToKmConverter().milesToKm(1));


        //   System.out.println(((NauticalMilesToKmConverter) new MilesToKmConverter()).milesToKm(1));
        //echivalenta cu primul sout
        //Output: 1.609


        System.out.println(((MilesToKmConverter) new NauticalMilesToKmConverter()).milesToKm(1));
        //1.852 -> cast-ul este inutil, Nautical este deja obiect de tipul MilesToKmConverter

    }
}
