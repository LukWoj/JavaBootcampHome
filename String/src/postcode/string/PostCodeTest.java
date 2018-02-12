package postcode.string;

import java.util.Scanner;

public class PostCodeTest {

    public static void main(String[] args) {

        System.out.println("Correct post code is: xx-xxx or xxxxxx , for example 93-313");
        System.out.println("Please type your post code");
        Scanner sc = new Scanner(System.in);

        while (true) {
            String postcode = sc.next();
            if (postCodeChecker(postcode)) return;
            System.out.println("Wrong post code format");
        }
    }

    private static boolean postCodeChecker(String postcode) {

        boolean digitChecker = isDigitChecker(postcode);

        for (int i = 0; i < postcode.length(); i++) {
            if (Character.isDigit(postcode.charAt(i)) && postcode.length() == 5) {
                return true;
            } else if (postcode.length() == 6 && digitChecker && postcode.charAt(2) == '-') {
                return true;
            }
        }
        return false;
    }

    private static boolean isDigitChecker(String sentence) {
        boolean flag = true;
        for (int j = 0; j < sentence.length(); j++) {
            if (j == 2) continue;
            if (!Character.isDigit(sentence.charAt(j))) {
                flag = false;
            }
        }
        return flag;
    }
}

