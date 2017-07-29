/**
 * Created by arabk on 29.07.2017.
 */
public class Function1 {
    private static boolean ifNegative(int number) {
        //(number<0) ? return true: return false;
        return number < 0;
    }

    public static void main(String[] args) {
        boolean result = ifNegative(-3);
        System.out.println(result);
        result = ifNegative(3);
        System.out.println(result);
    }
}
