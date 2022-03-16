package C13_Matrix.quiz;

public class Ex01 {

    // nu pot accesa direct o coloana dintr-o matrice, coloana face parte dintr-un alt array
    // mai intai trebuie sa accesam fiecare linie in parte ca sa accesam elementul de pe o anumita coloana in mod direct
    // tine cont de modul in care matricele sunt reprezentate intern, trebuie aduse niste date cache si in momentul in care parcurgem linii si coloane sunt niste mecanisme interconectate care duc la prob. de performante
    // sunt lucruri low-level (accesul la memorie) dar Java este high level, in general embedded (dispozitie micutie cu memorie mica) se pune aceasta problema a imbunatatirii performantei


    //TODO What is the output?
    public static void main(String[] args) {
        int dim = 5;
        char[][] shape = new char[dim][dim];

        for (int i = 0; i < shape.length; i++) {
            //suprascriem fiecare linie cu un nou array, am pierdut referintele catre primele 2 arrayuri ([dim][dim]), preluate de catre Garbage Collector
            shape[i] = new char[i + 1]; //prima linie va avea lungimea i + 1 -> prima linie va avea o singura coloana, a doua linie 2 coloane s.a.m.d
            for (int j = 0; j < shape[i].length; j++) {
                shape[i][j] = '*';
            }
        }

        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                System.out.print(shape[i][j]);
            }
            System.out.println();
        }

    }
}
