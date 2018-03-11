import java.util.Scanner;

public class Task7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wysokość");
        int hight = sc.nextInt();
        int i;
        for (i = 1; i < hight; i++) {
            System.out.print("*");
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
