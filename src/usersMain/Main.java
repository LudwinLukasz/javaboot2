package usersMain;

import users.*;

import java.util.List;

/**
 * Created by arabk on 30.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        //UsersManager menager = new UsersManager(); // nie potrzebuje obiektu bo mam w niej statuczna metode
        Admin admin = new Admin("bolek","ala","boleslaw","wielki",2000);
        CommonUser com1 = new CommonUser("ala","1234","alicja","aaa");
        com1.addPermission(Permission.INSERT);
        com1.addPermission(Permission.DELETE);
        CommonUser com2 = new CommonUser("sdsd","12s","alic","asd");
        com2.addPermission(Permission.DELETE);
        UsersManager.addUser(admin);
        UsersManager.addUser(com1);
        UsersManager.addUser(com2);

        List<User> userss = UsersManager.getAll();
        for(User u: userss) {
            //System.out.println(u.getName()+" "+ u.getSurname());
            System.out.println(u);
        }
    }
}
