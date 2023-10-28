package pr23;

public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber(String errormessage) {
        super(errormessage);
    }
}