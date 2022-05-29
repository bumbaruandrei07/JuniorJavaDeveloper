package subiecteExamen1.alteGrile.ex04;

public class Runner {
    public static void main(String[] args){
        Writer w = new Programmer(); //referinta de tipul Writer la un obiect de tipul Programmer
        w.write();  //daca metoda write este suprascrisa de catre clasa-copil Programmer, atunci se va apela metoda suprascrise
        //metoda fiind in schimb statica, se va apela metoda din clasa-parinte, metoda statica nu poate fi suprascrisa
    }
}
