package exceptions.course;

public class BloodPressureException extends RuntimeException {
    public BloodPressureException() {
        super();
    }
    public BloodPressureException(String message) {
        super(message);
    }
}