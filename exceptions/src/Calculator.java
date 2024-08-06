import exceptions.ByCeroException;

public class Calculator {
    public int divide(int a, int b) throws ByCeroException {
        // if (b == 0) throw new ByCeroException();
        if (b == 0) throw new ByCeroException("The divisor cannot be zero");
        
        return a / b;
    }
}
