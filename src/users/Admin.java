package users;

/**
 * Created by arabk on 30.07.2017.
 */
public class Admin extends User {
    private String rootPassword;

    public Admin(String username, String password, String name, String surname, double salary, Long id, String rootPassword) {
        super(username, password, name, surname, id, salary);
        this.rootPassword = rootPassword;
    }


    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", rootPassword='" + rootPassword + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
