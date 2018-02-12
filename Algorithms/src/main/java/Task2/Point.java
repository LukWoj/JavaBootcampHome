package Task2;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void linePoint(double x1, double y1, double x2, double y2) {
        double a = 0;
        double b = 0;

        a = (y1 - y2) / (x1 - x2);// wspolczynnik kierun. prostej przechodzacej przez dwa punkty
        b = y1 - (((y1 - y2) / (x1 - x2)) * x1);// wspolczynnik b prostej przez dwa punkty
        System.out.println("Prosta przez dwa punkty y=" + a + "*x" + " + " + b);


        double a1 = (-1) / (a);//wspolczynnik kierunkowy prostopadłej do prostej
        System.out.println("Współczynnik kierunkowy a prostej prostopadłej: " + a1);
        double b1 = getY() - (a1 * getX());//parametr b do rownania prostopadlej
        System.out.println("Współczynnik kierunkowy b prostej prostopadłej: " + b1);
        System.out.println("szukana prosta prostopadla to y= " + a1 + "*x" + " + " + b1);

        double x = (b1 - b) / (a - a1);
        double y = a1 * ((b1 - b) / (a - a1)) + b1;

        System.out.println("Punkt przecięcia prostych: (" + x + ";" + y + ")");

    }
}