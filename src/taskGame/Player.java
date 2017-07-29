package taskGame;

/**
 * Created by arabk on 29.07.2017.
 */
public class Player {
    private String name,username;
    private int points;

    public Player(String name, String username) {
        this.name = name;
        this.username = username;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public String fullName(){
        return "Imię: "+this.name + " Nick: " + this.username;
    }
    public void addPoints(int val) {
        this.points +=val;
    }
}
