/*Stwórz 2 pętlę (jedna w drugiej) w którym pierwsza odlicza od 10 do 30
        a druga o 1 do 10. Gdy pierwsza będzie miała 15 a druga 3
        przerwie działanie pierwszej pętli jedną instrukcją.
        (Wykorzystując etykietę)*/
public class Task8 {
    public static void main(String[] args) {
        labelOuter:
        for (int i = 10; i < 31; i++) {
            System.out.println("Iteration: " + i);
            for (int j = 1; j < 11; j++) {
                System.out.println("count: " + j);
                if (i == 15 && j == 3) break labelOuter;
            }
        }
    }
}

