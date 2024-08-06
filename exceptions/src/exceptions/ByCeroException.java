package exceptions;

public class ByCeroException extends Exception {
    public ByCeroException() {
        super("Its not possible to divide by zero");
    }

    public ByCeroException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
