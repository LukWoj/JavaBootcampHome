/*Napisz program który wyświetli tylko liczby parzyste od numeru 10 do 50 (razem z 50)*/

public class Task2 {
    public static void main(String[] args) {
        for (int i = 10; i < 51; i++) {
            if (i % 2 == 1) continue;
            System.out.println(i);
        }
    }
}
