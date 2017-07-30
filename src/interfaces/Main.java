package interfaces;

/**
 * Created by arabk on 30.07.2017.
 */
public class Main {

    // funkcja jako arg przyjmie ref na obiekt klasy implementujacej intesfejs
    // wtedy jako argument moze byc obiekt z dowolnej klasy implementujacej ten interfejs
    // przyklad - uzyjemy silni ale potem zaleznie od obiektu jaki przekaze algorytm silni moze byc rozny
    private static int mat(int x,SimpleMatOps mathop) {
        return 2*x + mathop.factorial(x);
    }
    public static void main(String[] args) {
        SimpleMatOpsImpl mo = new SimpleMatOpsImpl();
        SimpleMatOps mo2 = new SimpleMatOpsImpl();// moge przez interfejs ale potem musi klasa
        SimpleMatOpsNewImp mo3 = new SimpleMatOpsNewImp();
        System.out.println(mo3.factorial(4));
        System.out.println(mo2.mult(2,3));
        System.out.println(mo.factorial(4));
// przyklad tego ze do ta fukcja przyjmuje cokolwiek implementujacego interfejs
        System.out.println(mat(4,mo));
        System.out.println(mat(4,mo3));

    }
}


