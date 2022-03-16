package ArtificiuClasaStatica;

//clasa final nu poate fi mostenita !
//clasa abstracta nu poate fi instantiata!
// artificiu : clasa va fi final si va avea (de forma) un constructor privat, ca sa nu-l putem apela (sa cream un obiect)
// obligatoriu, toate metodele clasei vor fi statice, altfel nu vor putea fi folosite

public final class GatherSurprises {

    private GatherSurprises(){

    }

    public static void gather(){
        System.out.println("Gahtering...");
    }

}
