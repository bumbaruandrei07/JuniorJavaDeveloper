package exceptions.course;

public class TestOperationCorrectness{
    private static Exception createException() {
        return new ArithmeticException("The operation is not correct");
    }

    private static Exception testOperation(boolean isCorrect) {
        if (!isCorrect) {
            return createException();
        }
        return null;
    }

    public static void main(String[] args) {
        Exception exception = testOperation(false);
        //apelurile de functii sunt retinute pe stiva
        //cand facem o astfel de instanta, obiect care mosteneste Throwable face un fel de snapshot al stivei in momentul respectiv
        //folosind stiva o sa avem o ordine a modului in care au fost apelate si ne ofera contextul in care apere eroare
        //runtimeStack inseamna ce avem pe stiva
        exception.printStackTrace();
    }
}