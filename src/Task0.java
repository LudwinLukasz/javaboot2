import java.util.Scanner;

/**
 * Created by arabk on 29.07.2017.
 */
public class Task0 {

    public static void main(String[] args) {
        System.out.println("podaj rozmar tablicy: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
      //  int[] array2 = new int[size];
        for (int i = size-1; i >= 0; i-- ) {
            System.out.println(array[i]);
        }

//        for (int i = 0; i < size; i++) {
//            array2[i] = array[size-i-1];
//        }
//        for (int t:array2
//             ) {
//            System.out.println(t);
//        }
        int i = 0 ;
        int j = size-1;
        while (i<j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        for (int r:array
             ) {
            System.out.println(r);
        }
    }

}
