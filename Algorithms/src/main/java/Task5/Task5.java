package Task5;

public class Task5 {
    /**
     * Napisać metodę, której argumentem będzie tablica
     * typów prostych  int i zwracać będzie tablicę posortowaną.
     * Opis działania algorytmu sortującego
     * Zwrócić uwagę na „warunki brzegowe”: - działanie metody
     * dla pustej tablicy - działanie metody dla tablicy jednoelementowej
     */
    public static void main(String[] args) {
        int[] numbers = {5, 34, 5, 7, 12, -1};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Tablica posortowana");
        bubbleSort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }


    public static int[] bubbleSort(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = 0; j < unsortedArray.length - 1; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = 0;
                    temp = unsortedArray[j + 1];
                    unsortedArray[j + 1] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }
        return unsortedArray;
    }

}
