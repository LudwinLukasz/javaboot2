package usersMain;

import users.*;

import java.util.List;

/**
 * Created by arabk on 30.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        //UsersManager menager = new UsersManager(); // nie potrzebuje obiektu bo mam w niej statuczna metode
        Admin admin = new Admin("bolek","ala","boleslaw","wielki",2000,1L,"root");
        CommonUser com1 = new CommonUser("ala","1234","alicja","aaa",2L,2000);
        com1.addPermission(Permission.INSERT);
        com1.addPermission(Permission.DELETE);
        CommonUser com2 = new CommonUser("sdsd","12s","alic","asd",3L,3000);
        com2.addPermission(Permission.DELETE);
        UsersManager.addUser(admin);
        UsersManager.addUser(com1);
        UsersManager.addUser(com2);

        List<User> userss = UsersManager.getAll();
        for(User u: userss) {
            //System.out.println(u.getName()+" "+ u.getSurname());
            System.out.println(u);
        }
        //dodaje project managera
        ProjectManager pm = new ProjectManager("pm","123","franek","lok",5L,"alabama",10000);
        UsersManager.addUser(pm);
        System.out.println(pm.getCommonUsers());
        pm.addCommonUsers(new CommonUser[]{com1,com2});

        System.out.println(pm.getCommonUsers());
        System.out.println(pm);

        System.out.println(com1.getSalary());
        pm.givePayRise(2L,100);
        System.out.println(com1.getSalary());
    }
}
