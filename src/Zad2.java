/**
 * Created by arabk on 29.07.2017.
 */
public class Zad2 {
    public static void absolute(int[][] array) {
        for (int[] a: array
             ) {
            for (int j = 0; j < a.length;j++) {
                a[j] = Math.abs(a[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] d = {{1,-1},{-2,-3},{4,-5}};
        absolute(d);
        for (int[] a:d
             ) {
            for (int b: a
                 ) {
                System.out.println(b);
            }
        }

    }
}
