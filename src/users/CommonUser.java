package users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabk on 30.07.2017.
 */
public class CommonUser extends User {
    private List<Permission> permissions = new ArrayList<>();


    public CommonUser(String username, String password, String name, String surname) {
        super(username, password, name, surname);
    }

    public void addPermission(Permission permission) {
        permissions.add(permission);
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    @Override
    public String toString() {
        return "CommonUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
