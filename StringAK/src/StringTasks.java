import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
        //task 1
        String word = "sentence";
        System.out.println(word.length());

        DataReader reader = new DataReader();
        System.out.println("Type some word");
        String someWord = reader.getSc().next();
        System.out.println("Type some number");
        int number = reader.getSc().nextInt();

        String nameAndSurname = reader.getSc().nextLine();

        // task 2
        System.out.println(someWord.substring(someWord.length() - number));
        //task 3
        System.out.println(endmChecker(someWord));
        //task 4
        System.out.println(isDigitChecker(someWord));
        //task 5
        System.out.println(firstEqualsLastTest(someWord));
        //Task 6
        writeNameSurname();
        //task 7
        System.out.println("\"Mowa jest srebrem, a milczenie złotem\"");
        //Task 8
        System.out.println(stringEqualsChecker("Ala", "Ala"));

    }

    //Task3
    public static String endmChecker(String sentence) {
        String yes = "tak";
        String no = "nie";
        String last = sentence.substring(sentence.length());
        last.toLowerCase();
        if (last.endsWith("m")) return yes;
        return no;
    }

    //Task4
    public static String isDigitChecker(String sentence) {
        String yes = "tak";
        String no = "nie";
        if (sentence.startsWith("0")) return yes;
        return no;
    }

    //Task5
    public static String firstEqualsLastTest(String sentence) {
        String yes = "first letter equals last";
        String no = "first letter equals last ";
        if (sentence.charAt(0) == sentence.charAt(sentence.length() - 1)) return yes;
        return no;
    }

    //Task 6
    public static void writeNameSurname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write name and surname in a single line");
        String nameSurname = sc.nextLine();
        System.out.println("Your name and surname is: " + nameSurname);
    }

    //task 8
    public static String stringEqualsChecker(String word1, String word2) {
        String yes = "two words are equal";
        String no = "two words are not equal ";
        if (word1.equals(word2)) return yes;
        return no;
    }








}
