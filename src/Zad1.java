/**
 * Created by arabk on 29.07.2017.
 */
public class Zad1 {
    public static int najmniejsza(int a, int b, int c) {
        //int mess;
        if (a<b && a<c) {
           return a;
        } else if (b<a && b<c) {
            return b;
        } else return c;
        //System.out.println(mess);
    }
    public static double min(double a, double b, double c ) {
        if (a<b) {
            if(a<c) {
                return a;
            } else return c;

        } else if (b <c) {
            return b;
        }else return c;
    }
    public static void main(String[] args) {
        System.out.println(najmniejsza(3,25,-10)); //ja
        System.out.println(min(3,25,-10)); //zajecia
    }
}
