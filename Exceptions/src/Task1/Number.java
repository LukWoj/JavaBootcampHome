package Task1;

public class Number {
    public static double divide(double a, double b) throws DivideZeroException {
        double result = 0;
        if (b == 0) {
            throw new DivideZeroException("Dividing by zero is not allowed:");
        }
        result = a / b;
        return result;
    }
}
