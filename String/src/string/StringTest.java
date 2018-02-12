package string;

public class StringTest {


    public static void main(String[] args) {

        String name = "Wojech";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));
        System.out.println(name.toUpperCase());
        System.out.println("(nazwiska w języku polskim się odmienia… ale my sobie to darujemy \uF04A):" +
                " \n Szanowny Panie " + name +
                ". Jest Pan świetnym programistą. Gratuluję!");

        String sentence =
                String.format("(nazwiska w języku polskim się odmienia… ale my sobie to darujemy \uF04A):" +
                        "\n Szanowny Panie %s. Jest Pan świetnym programistą. Gratuluję!", name);

        System.out.println(sentence);

        System.out.println(checkLetter(name));

    }

    public static boolean checkLetter(String name) {
        String nameLowerCase = name.toLowerCase();
        char letter = nameLowerCase.charAt(0);
        for (int i = 0; i < nameLowerCase.length(); i++) {
            if (letter == name.charAt(i)) return true;
        }
        return false;
    }

}

