package JAVA_QUIZZES.finalClass;

//se vor genera erori de compilare, deoarece field-urile final trebuie initializate
public final class PersonFinal {

    final int cod;
    final String nume;

    //solution -> using a constructor to initialize each final field

    public PersonFinal(int cod, String nume) {
        this.cod = cod;
        this.nume = nume;
    }

    public int getCod() {
        return cod;
    }

    public String getNume() {
        return nume;
    }

}
