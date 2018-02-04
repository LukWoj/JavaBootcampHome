public class MathTest {
    public static void main(String[] args) {
        double numerator = 345;
        double denominator = 12;
        double radians = Math.toRadians(45);

        double sinus = Math.sin(radians);
        double divide = numerator / denominator;
        System.out.println(sinus);
        System.out.println((int) divide);
    }
}
