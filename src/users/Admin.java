package users;

/**
 * Created by arabk on 30.07.2017.
 */
public class Admin extends User {
    private double salary;

    public Admin(String username, String password, String name, String surname, double salary) {
        super(username, password, name, surname);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void increaseSalry(int val) {
        salary +=val;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", salary=" + salary +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
