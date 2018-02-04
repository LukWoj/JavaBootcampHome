/**
 * Mamy dane dwa punkty P1(x1, y1), P2(x2, y2) oraz punkt P(x,y).
 * Napisać metodę wyznaczającą punkt leżący na prostej k wyznaczonej przez punkt P1 i P2
 * oraz na prostej prostopadłej do k przechodzącej przez punkt (x,y).
 * Do reprezentacji punktu można napisać klasę Point zawierającą dwa atrybuty typu double: x i y.
 */
public class AppTest {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(0);
        point.setY(3);
        point.linePoint(0, 1, 2, 3);
    }
}
