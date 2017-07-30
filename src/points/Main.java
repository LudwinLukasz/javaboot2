package points;

/**
 * Created by arabk on 30.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Point2D p12d = new Point2D();
        Point2D p22d = new Point2D(3,4);
        Point3D p13d = new Point3D();
        Point3D p23d = new Point3D(1,2,3);
        System.out.println(p13d);
        int Y = p22d.getY();
        System.out.println(Y);
        System.out.println(p23d);
        System.out.println(p12d);
        System.out.println(p22d);
    }
}
