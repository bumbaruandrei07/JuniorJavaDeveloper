package UpcastingDowncasting.nature;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Terrestrial teraCreature = new Terrestrial(false, 10, 100, "Reptiles", 0, 2);
        teraCreature.move(10); //   OK - call the 'Terrestrial'-overridden method 'move(int)'
        teraCreature.fight(); // OK - call the 'Terrestrial'-specific method 'fight()'
        System.out.println();

    //Desi atunci cand referim un animal terestru printr-un parinte (ex: Animal, Object) nu mai putem accesa anumite metode / campuri specifice obiectului,
// putem oricand sa referim obiectul din nou cu o referinta Terrestrial (i.e. prin downcasting) si sa accesam intreaga functionalitate.
// Case I - Upcasting:
// We can treat the object 'animalRef' as an 'Animal', by
// referring the object using an 'Animal' reference

        Animal animalRef = teraCreature; // upcasting
        animalRef.move(10); // OK - call the 'Terrestrial'-overridden method 'move(int)'
//        animalRef.fight(); // ERROR - even if the object is a 'Terrestrial' and implicitly
        // has the 'fight()' method, it cannot be called using an 'Animal'
        // reference (i.e. because 'Animals' don't have that behavior)
        System.out.println();


// Case II - Further Upcasting:
        Object object = teraCreature; // upcasting
        Object object2 = animalRef; //  // upcasting II - equivalent to previous line
//        object.move(10); // ERROR - Similar case: class 'Object' doesn't have that method
//        object.fight(); // ERROR - Similar case...


// =====================================================================================================================


        Zebra zebra = new Zebra(false, 25, 40, "Mountain Zebra", 4, 2);
        Tiger tiger = new Tiger(true, 40, 70, "Siberian tiger", 4, 2);
        Tiger tiger2 = new Tiger(true, 40, 70, "Bengal tiger", 4, 2);
        Rhino rhino = new Rhino(false, 80, 70, "White rhino", 4, 2);

        ArrayList<Terrestrial> zoo = new ArrayList<Terrestrial>();
        zoo.add(zebra); // 'Zebra' object upcasting to 'Terrestrial' ref.
        zoo.add(tiger); // 'Tiger' object upcasting to 'Terrestrial' ref.
        zoo.add(tiger2); // 'Tiger' object upcasting to 'Terrestrial' ref.
        zoo.add(rhino); // 'Rhino' object upcasting to 'Terrestrial' ref.

// Vocal show at the zoo:
        for (int i = 0; i < zoo.size(); i++) {
            zoo.get(i).saySomething();
            zoo.get(i).camouflage();
        }

// Downcast zoo animals to their actual type
        Zebra theZebra = (Zebra) zoo.get(0);
        Tiger theFstTiger, theSndTiger;
        theFstTiger = (Tiger) zoo.get(1);
        theSndTiger = (Tiger) zoo.get(2);
        Rhino theRhino = (Rhino) zoo.get(3);


//        Once again - upcasting vs downcasting

        Terrestrial newTerrestrial = (Zebra) animalRef;

        Terrestrial terrestrialRef = new Zebra(false, 25, 40, "Mountain Zebra", 4, 2);
        System.out.println(terrestrialRef instanceof Zebra); // true
        System.out.println(terrestrialRef instanceof Terrestrial); //true
        System.out.println(terrestrialRef instanceof Animal); // true
//        System.out.println(terrestrialRef instanceof Aquatic); // false
        System.out.println(terrestrialRef instanceof Tiger); // false
        System.out.println(terrestrialRef instanceof Object);


        for (int i = 0; i < zoo.size(); i++) {
            if (zoo.get(i) instanceof Rhino) {
                Rhino rhinoRef = (Rhino) zoo.get(i);
                rhinoRef.horn();
            } else if (zoo.get(i) instanceof Tiger) {
                Tiger tigerRef = (Tiger) zoo.get(i);
                tigerRef.agility();
            } else if (zoo.get(i) instanceof Zebra) {
                Zebra zebraRef = (Zebra) zoo.get(i);
                zebraRef.stripes();
            } else {
                System.out.println("Error: unknown kind of animal");
            }
        }

        // Call only the specialCharacteristic() method
        // -> will execute the specific implementation for each type of object
        for (Terrestrial terrestrial : zoo) {
            terrestrial.specialCharacteristic();
        }

//        Varianta cu for clasic:
//        for(int i=0; i< zoo.size(); ++i){
//            zoo.get(i).specialCharacteristic();
//        }

    }


//    static int dummyHash(String s){
//        int prime = 31;
//        int result = 1;
//        for(int i = 0; i<s.length(); i++){
//
//        }
}






