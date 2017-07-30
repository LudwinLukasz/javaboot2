package figures;

/**
 * Created by arabk on 30.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,4);
        Circle c1 = new Circle(p1,1);
        Circle c2 = new Circle(p2,3);
        Circle c3 = new Circle(p1,2);

        System.out.println(c1.outerIndependent(c3));
    }
}
