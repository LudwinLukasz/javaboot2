package users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabk on 30.07.2017.
 */
public class UsersManager {
    private static List<User> users = new ArrayList<>();

    public static List<User> getAll() {
        return users;
    }

    public static void addUser(User user) {
        users.add(user);
    }

}
