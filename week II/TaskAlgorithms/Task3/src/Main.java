/**
 * Napisać metodę przyjmującą tablicę typów int oraz liczbę k>0 typu int.
 * Metoda powinna zwracać tablicę po k rotacjach. Rotacją tablicy nazywamy przesunięcie
 * elementów w lewo o jeden indeks w taki sposób, że pierwszy element staje się drugim,
 * drugi staje się trzecim itd. Ostatni element staje się pierwszym elementem tablicy.
 * Przykład: Mamy tablicę [3,9,5,5,1,0,5,7] i mamy wykonać k=3 rotacji tej tablicy.
 * Wynikiem metody powinna być tablica: [0,5,7,3,9,5,5,1]
 * Zastanowić się nad optymalizacją algorytmu pod względem czasu działania
 * i ilości złużywanej pamięci (deklaracja każdej tablicy jest potencjalnie pamięciożerna).
 * Metoda powinna działać dla warunków brzegowych. Np. pusta tablica,
 * tablica jednoelementowa, k=0 itp.
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Input: [1,2,3,4,5,6,7]");
        int[] tab = {1, 2, 3, 4, 5, 6, 7};
        System.out.println();
        rotateModulo(tab, 3);
        System.out.print("Output 1: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        int[] tab2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println();
        rotateDivArray(tab2, 3);
        System.out.print("Output 2: ");
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + " ");
        }
    }

    public static int[] rotateModulo(int[] tab, int k) {// k - parametr rotacji tablicy, ilosc pierwszych liczb do przesuniecia
        if (tab == null || tab.length == 0 || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        if (k > tab.length) {
            k = k % tab.length;
        }
        int[] tempTab = new int[tab.length];// tablica pomocnicza

        for (int i = 0; i < k; i++) {
            tempTab[i] = tab[tab.length - k + i];// skopiowanie k pierwszych elementow do tablicy tymczasowej
        }

        int j = 0;
        for (int i = k; i < tab.length; i++) {

            tempTab[i] = tab[j];
            j++;
        }

        System.arraycopy(tempTab, 0, tab, 0, tempTab.length);
        return tab;
    }

    public static void rotateDivArray(int[] tab, int range) {

        if (tab == null || tab.length == 0 || range < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
      /*  if (tab.length == 1 ) {
            reverseArray(tab,0,0);
        }*/
        int a = 0;
        a = a % tab.length;// granica przedziału odwracania tablicy wyznaczona przez modulo

        reverseArray(tab, 0, a - 1);
        reverseArray(tab, a, tab.length - 1);
        reverseArray(tab, 0, tab.length - 1);
    }

    public static void reverseArray(int[] tab, int left, int right) {
        while (left < right) {//left right granice przedzialu odwracania łancucha znaków
            int temp = tab[left];
            tab[left] = tab[right];
            tab[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * metoda rotująca tablicę.
     * public static void  reverseArray(int[] tab) {
     for (int i = 0; i <tab.length/2 ; i++) {
     int temp = tab[i];
     tab[i]=tab[tab.length-1-i];
     tab[tab.length-1-i] = temp;
     }
     */
}


