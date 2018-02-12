package Task1;/*public class DivideZeroException extends RuntimeException {
    public DivideZeroException(String message) {
        super(message);
    }
}*/

public class DivideZeroException extends Exception {
    public DivideZeroException(String message) {
        super(message);
    }
}

