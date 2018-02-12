package Task1;

import java.util.Scanner;

public class ExTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error = true;
        while (error) {
            try {
                System.out.println("type number:");
                int a = sc.nextInt();
                System.out.println("type number");
                int b = sc.nextInt();
                sc.nextLine();
                System.out.println(Number.divide(a, b));
                error = false;
            } catch (DivideZeroException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
