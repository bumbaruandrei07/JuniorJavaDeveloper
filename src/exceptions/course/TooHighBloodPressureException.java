package exceptions.course;

public class TooHighBloodPressureException extends BloodPressureException {
    public TooHighBloodPressureException() {
        super();
    }
    public TooHighBloodPressureException(String message) {
        super(message);
    }
}