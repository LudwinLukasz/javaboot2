package figures;

/**
 * Created by arabk on 30.07.2017.
 */
public class Circle extends ShapeImpl {
    private double r;
    public Circle(Point point, double r) {
        super(point);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double getCircuit() {
        return 2*Math.PI * r;
    }

    public boolean outerIndependent(Circle c2) {
        double dx=point.getX()-c2.getPoint().getX();
        double dy=point.getY()-c2.getPoint().getY();
        return Math.sqrt(dx*dx+dy*dy) > r + c2.getR();
    }
}
