package pr17;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException(String errorMessage) {
        super(errorMessage);
    }
}