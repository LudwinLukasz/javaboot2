package interfaces;

/**
 * Created by arabk on 30.07.2017.
 */
public class SimpleMatOpsNewImp implements SimpleMatOps{
    @Override
    public double mult(double a, double b) {
        double result = a*b;
        return result;
    }

    @Override
    public int factorial(int n) {
//        int out=1;
//        if (n > 0) {
//            out = factorial(n - 1) * n;
//        }
        if (n == 0) return 1;
        return factorial(n-1)*n;
    }
}
// ciag fibonaciego
// 1 2 3 4
// 1 1 2 3
//
// fn = fn-1 + fn-2 n>2

//f5 = f4+f3= f3+f2+f3 = f2+f1 + 1 + f2 +f1