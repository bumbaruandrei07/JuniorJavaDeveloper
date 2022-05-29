package Exceptions_Generics_Practice_2.dummyDatabase;

public class DummyDatabaseConnectionException extends Exception {
    public DummyDatabaseConnectionException(String message) {
        super(message);
    }
}
