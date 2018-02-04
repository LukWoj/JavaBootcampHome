import java.util.Scanner;

public class DataReader {
    public Scanner sc;

    public DataReader() {
        sc = new Scanner(System.in);
    }

    public void close() {
        sc.close();
    }
}
