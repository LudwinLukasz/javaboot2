/**
 * Created by arabk on 29.07.2017.
 */
public class Function3 {
    private static int howMany(int[] array, int a, int b) {
        int sum=0;
        for (int i = 0; i < array.length;i++) {
            if (array[i]>=a && array[i]<=b) sum+=array[i];
        }
        return sum;
    }

    private static void transp(int[][] m) {
        int size = m.length;
        for(int i = 0; i < size; i++) {
            for(int j=i+1; j < size;j++) {
                int tmp = m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=tmp;
            }
        }

    }

    public static void main(String[] args) {
        //int[] in = {1,2};
        System.out.println("Suma elementów: "+howMany(new int[] {1,2,3,2,4,3,1,2,3,5,7,8}, 1,3));
        int[][] arr = {{1,2,3,4},{4,5,6,7},{7,8,9,10},{8,9,10,11}};
        System.out.println("tablica:");
        for (int[] a:arr
                ) {
            System.out.println("");
            for (int b: a
                    ) {
                System.out.print(b);
            }
        }
        transp(arr);
        System.out.println("\ntranspozycja tablicy:");
        for (int[] a:arr
             ) {
            System.out.println("");
            for (int b: a
                 ) {
                System.out.print(b);
            }
        }
    }
}
