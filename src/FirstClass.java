/**
 * Created by arabk on 29.07.2017.
 */
public class FirstClass {
    public static void main(String[] args) {
        double[] t = new double[10];
        for(int i = 0; i < t.length; i++) {
            t[i]=i+10;
           // System.out.println(t[i]);
        }
        for (double i: t
             ) {
            System.out.println(i);
        }
    }
}
