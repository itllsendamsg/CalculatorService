import java.math.BigInteger;

public class CalculatorService {

    public BigInteger factorial(int n) {
        if (n < 0) {
            return BigInteger.ZERO;
        } else if (n == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}
