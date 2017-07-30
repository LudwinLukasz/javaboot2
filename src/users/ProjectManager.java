package users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabk on 30.07.2017.
 */
public class ProjectManager extends CommonUser {
    private String projectName;
    private List<CommonUser> commonUsers = new ArrayList<>();

    public ProjectManager(String username, String password, String name, String surname, Long id, String projectName,double salary) {
        super(username, password, name, surname, id,salary);
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<CommonUser> getCommonUsers() {
        return commonUsers;
    }

    public void setCommonUsers(List<CommonUser> commonUsers) {
        this.commonUsers = commonUsers;
    }

    public void addCommonUsers(CommonUser[] commons) {
        for (CommonUser c: commons) {
            commonUsers.add(c);
        }
    }

    public void givePayRise(Long id,double val) {
        for (CommonUser c: commonUsers
             ) {
            if(c.getId().equals(id)) {
                c.increaseSalry(val);
                return;
            }
        }
    }
    @Override
    public String toString() {
        return "ProjectManager{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", projectName='" + projectName + '\'' +
                ", permissions=" + permissions +
                ", commonUsers=" + commonUsers +
                '}';
    }
}
