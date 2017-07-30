package interfaces;

/**
 * Created by arabk on 30.07.2017.
 */
public class SimpleMatOpsImpl implements SimpleMatOps {
    @Override
    public double mult(double a, double b) {
        return a*b;
    }

    @Override
    public int factorial(int n) {
        int out = 1;
        while (n > 0) {
            out *= n;
            n--;
        }
        return out;
    }
}
