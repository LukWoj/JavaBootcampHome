import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        int sum = 0;
        int endSum = 30;
        do {
            System.out.println("Podaj liczbe.");
            Scanner scanner = new Scanner(System.in);
            sum += scanner.nextInt();
            System.out.println("Suma:" + sum);
        } while (sum <= endSum);

        System.out.println(sum + " > " + endSum + ". Koniec sumowania.");
    }
}
