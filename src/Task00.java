import java.util.Scanner;

/**
 * Created by arabk on 29.07.2017.
 */
public class Task00 {
    public static void main(String[] args) {
        System.out.println("podaj rozmar tablicy: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        int multi=1;
        for (int i = 0; i < size;i++){
            if(array[i]%2 == 0) multi = multi * array[i];
        }
        System.out.println(String.format("Iloczyn: %d",multi));
    }

}
