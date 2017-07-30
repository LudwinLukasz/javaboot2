package firmaIntefaces;

/**
 * Created by arabk on 30.07.2017.
 */
public class Main {
    public static void main(String[] args) {
     //   Person per = new Person(2L,"ala","nie");
        Employee emp = new Employee(1L,"ala","patafian",100);
        System.out.println(emp.getName());
        String s = emp.toString();
        System.out.println(s);
        System.out.println(emp);
Person prac = new Employee(3L,"ala","Makota");
prac.getId(); //spoko ,oge traktowac pracownika jako osobe, ale tu nie ma metody getsalary, bo zrzutowalem na person
emp.getSalary(); //tu jest dostep do getSalary
    }
}
