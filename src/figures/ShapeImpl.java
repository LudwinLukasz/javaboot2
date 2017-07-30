package figures;

/**
 * Created by arabk on 30.07.2017.
 */
public abstract class ShapeImpl implements Shape{
//punkt zaczepienia
    protected Point point;
    //public abstract boolean outerIndependent();
    public ShapeImpl(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }
}
