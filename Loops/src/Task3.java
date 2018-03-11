import java.util.Random;
public class Task3 {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNo = randomGenerator.nextInt();
            System.out.println(randomNo);
        }

    }
}
