package firmaIntefaces;

/**
 * Created by arabk on 30.07.2017.
 */
public class Employee extends Person {

    private double salary;

    public Employee(Long id, String name, String surname) {
        super(id, name, surname);// wywolanie konstruktora z klasy nadr// zednej
    }

    public Employee(Long id, String name, String surname, double salary) {
        super(id, name, surname);// wywolanie konstruktora z klasy nadr// zednej
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return"Pracownik imię:"+name+" nazwisko: "+surname+" pensja: "+salary;
    }
}
