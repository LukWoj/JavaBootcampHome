/*Napisz program który będzie chciał wydrukować liczby z przedziału
 10 do 40 lecz na 25 jego praca zostanie przerwana.
 (Zastosować jedna pętle for)*/

public class Task5 {
    public static void main(String[] args) {
        for (int i = 10; i < 41; i++) {
            if (i == 25) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
