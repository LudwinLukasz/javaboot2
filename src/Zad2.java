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

    public static void abso(int[][] m) {
        for(int i =0; i< m.length;i++) {
            for(int j = 0; j < m[i].length;j++) {
                if(m[i][j] < 0) m[i][j]*=-1;
            }
        }
    }

    public static void main(String[] args) {
        int[][] d = {{1,-1},{-2,-3},{4,-5}};
        absolute(d); //ja
        abso(d); //zajecia
        for (int[] a:d
             ) {
            for (int b: a
                 ) {
                System.out.print(b+" ");
            }
            System.out.println("");
        }

    }
}
