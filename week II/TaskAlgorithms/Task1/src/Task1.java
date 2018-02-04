/***************************************************************
 Napisać dwie metody przyjmującą dwie liczby typu int.
 Pierwsza metoda powinna zwracać Największy Wspólny.
 Dzielnik obu tych liczb.Druga metoda ma zwracać
 Najmniejsza Wspólną Wielokrotność dla obu tych liczb.
 Jest kilka metod wyznaczania NWD.Można je zaimplementować
 w osobnych metodach.W przyszłoście będziemy mogli porównać
 czasy działania różnych implementacji.
 ****************************************************************/


import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NWD: " + nwd(12, 18));
        System.out.println("NWW: " + nww(12, 18));
    }

    public static int nwd(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("!!Method arguments can not be 0!!");
        }
        int a1 = a;
        int b1 = b;
        int nwd = 0;
        while (a1 != b1) {
            if (a1 > b1) {
                a1 -= b1;

            } else if (a1 < b1) {
                b1 -= a1;
            }
        }
        return a1;
    }

    //NWW(9, 12) = 9*12 / NWD(9, 12)
    public static int nww(int c, int d) {
        int a1 = c;
        int a2 = d;
        int nww_ret = 0;
        nww_ret = (a1 * a2) / nwd(a1, a2);
        return nww_ret;
    }
}