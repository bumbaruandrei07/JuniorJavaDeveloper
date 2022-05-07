package interfaces;

public class Main {
    public static void main(String[] args){

        RockStar rockStar = new RockStar("Barret", "John", 32);
        IHasName iHasNameRef = rockStar; //can cast to 'IHasName' because it is inherited from 'Singer' class
        System.out.println("The rockstar name is: " + rockStar.getName());

        //ICanSing iCanSingRef = iHasNameRef; // Error - needs manual casting,
        // because it is not upcasting
        ICanSing iCanSingRef = (ICanSing) iHasNameRef;

        ICanSing iCanSingRef2 = rockStar;
        iCanSingRef2.sing("The best");

        ICanSing singer1 = new Singer("Jackson", "Michael", 49);
        singer1.sing("Thriller");


    }
}
