/*Napisz program który wydrukuje liczb z przedziału 20 do 40
 z pominięciem liczb od 30 do 35. (Jedna Pętla for)*/

public class Task4 {
    public static void main(String[] args) {
        for (int i = 20; i < 41; i++) {
            if ((i > 29 && i < 36)) continue;
            System.out.print(i + " ");
        }
    }
}