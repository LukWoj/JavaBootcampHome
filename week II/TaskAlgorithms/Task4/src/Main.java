import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] tab = {1, 2, 2, 2, 2, 6, 4, 2, 2, 2};
        //System.out.println(findKye(tab, 0));
        //System.out.println(isSorted(tab));
        //findDuplicates(tab);
        System.out.println(checkMainVal1(tab));//złożoność O(n^2)
        System.out.println(checkMainVal2(tab));//złożoność O(n)
        System.out.println(checkMainVal3(tab));//złożoność O(n)
        //findDupCollection(tab);
        //findDupCollection2(tab);

    }

    //check if table has main value: O(n^2) Nested Loop
    public static int checkMainVal1(int[] tab) {
        if (isSorted(tab) == false) {
            Arrays.sort(tab);
        }
        int maxOccur = 0;
        for (int i = 0; i < tab.length; i++) {
            int count = 1;
            for (int j = i + 1; j < tab.length; j++) {
                if ((tab[i] == tab[j]) && (i != j)) {
                    count++;
                    if (count > maxOccur) {
                        maxOccur = count;
                        if (maxOccur > tab.length / 2) return 1;

                    }
                }

            }
        }
        return -1;
    }

    //check if table has main value: O(n)
    public static int checkMainVal2(int[] tab) {
        if (isSorted(tab) == false) {
            Arrays.sort(tab);
        }
        int maxOccur = 0;
        int count = 1;
        for (int i = 1; i < tab.length; i++) {

            if ((tab[i - 1] == tab[i])) {
                count++;
                if (count > maxOccur) {
                    maxOccur = count;
                    if (maxOccur > tab.length / 2) return 1;
                }
            } else {
                count = 1;
            }
        }
        return -1;
    }

    // check if table has main value: O(n) hashMap
    public static int checkMainVal3(int[] tab) {
        int maxOccur = 0;
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (Integer key : tab) {
            Integer count = tempMap.get(key);
            if (count == null) {
                tempMap.put(key, 1);
            } else {
                tempMap.put(key, ++count);
            }
        }

        for (Map.Entry<Integer, Integer> entry : tempMap.entrySet()) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();

            if (val > maxOccur) {
                maxOccur = val;
                if (maxOccur > tab.length / 2) return 1;
            }
        }
        return -1;
    }

    //finds duplicated elements O(n^2) Nested Loop
    public static void findDuplicates(int[] tab) {
        if (isSorted(tab) == false) {
            System.out.println("Tablica musi być posortowana rosnąco");
            return;
        }
        //Arrays.sort(tab); alternatywne sortowanie
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if ((tab[i] == tab[j]) && (i != j)) {
                    System.out.println("Index: " + j + " ==> equals " + tab[j] + " - is duplicated");

                }
            }
        }
    }

    // finds key in some input array.
    public static int findsKye(int[] tab, int key) {
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == key) {
                count++;
            }
        }
        return count;
    }

    //check if array is sorted
    public static boolean isSorted(int[] tab) {
        boolean sorted = false;

        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] < tab[i + 1] || tab[i] == tab[i + 1]) {
                sorted = true;
            } else {
                sorted = false;
                break;
            }
        }
        return sorted;
    }

    // check if table has main value: O(n) hashSet
    public static void findDupCollection1(int[] tab) {
        Set<Integer> set = new HashSet<Integer>();
        for (Integer x : tab) {
            if (set.add(x) == false) {
                System.out.println(x + " is duplicated");
            }
        }
    }
}


