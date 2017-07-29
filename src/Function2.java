/**
 * Created by arabk on 29.07.2017.
 */
public class Function2 {
    private static int equalValues(double[] t, double num) {
        int count = 0;
        for (double el:t
             ) {
            if (el == num) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        double[] array = {1,2,3,4,3,6,7};
        System.out.println(equalValues(array,3));
    }
}
