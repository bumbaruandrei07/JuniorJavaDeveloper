package exceptions.course;

public class TooLowBloodPressureException extends BloodPressureException {
    public TooLowBloodPressureException() {
        super();
    }
    public TooLowBloodPressureException(String message) {
        super(message);
    }
}