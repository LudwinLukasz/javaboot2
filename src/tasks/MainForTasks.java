package tasks;

/**
 * Created by arabk on 29.07.2017.
 */
public class MainForTasks {
    public static void main(String[] args) {
        Person p1 = new Person("Luk","Lud",true,31);
        System.out.println(p1.getName());
        Car c1 = new Car("fiat","maluch",500);
        Car c2 = new Car("fiat","500",5000);
        System.out.println(c1.show());
        System.out.println(c2.show());
    }
}
