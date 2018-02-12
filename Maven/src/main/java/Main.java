import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Stopwatch timer1 = Stopwatch.createStarted();
        squareByPow(1252);
        timer1.stop();
        System.out.println("Time using Math.pow():" + timer1.elapsed(TimeUnit.NANOSECONDS));

        System.out.println("******************************");

        Stopwatch timer2 = Stopwatch.createStarted();
        squareTraditionally(1252);
        timer2.stop();
        System.out.println("Time using x^2:       " + timer2.elapsed(TimeUnit.NANOSECONDS));

    }

    public static double squareTraditionally(int number) {
        double result = number * number;
        return result;
    }

    public static double squareByPow(int number) {
        double result = Math.pow(number, 2);
        return result;
    }
}
