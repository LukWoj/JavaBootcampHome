import java.util.Scanner;

public class DataReader {
    private Scanner sc;

    public DataReader() {
        sc = new Scanner(System.in);
    }

    public void close(){
        sc.close();
    }

    public Scanner getSc() {
        return sc;
    }
}
