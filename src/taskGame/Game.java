package taskGame;

/**
 * Created by arabk on 29.07.2017.
 */
public class Game {
    private String name;
    // stala globalmna max ilosc graczy w grze;
    private static final int MAXPLAYERS= 4;
    private int actualPlayesrNum=0;
    private Player[] players = new Player[MAXPLAYERS];

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
    public void addPlayer(Player p) {
        if (actualPlayesrNum == MAXPLAYERS) {
            System.out.println("za duzo graczy, max to "+MAXPLAYERS);
            return; //zeby przerwac metode
        }
        players[actualPlayesrNum++] = p; // w jednej linii pierwsze wstawieni potem dodanie
       // actualPlayesrNum++;
}

    public Player winner() {
//        Player winner = null;
//        int maxPoints=0;
//        for (int i = 1; i < actualPlayesrNum;i++) {
//            if (this.players[i].getPoints() > 100 && this.players[i].getPoints() > maxPoints) {
//                maxPoints = this.players[i].getPoints();
//                winner = this.players[i];
//            }
//        }
//        return winner;
        Player winner = players[0];
        int maxPoints=0;
        for (int i = 1; i < actualPlayesrNum;i++) {
            if (this.players[i].getPoints() > winner.getPoints()) {
                winner = this.players[i];
            }
        }
        if (winner.getPoints() > 100) {
            return winner;
        } else return null;
    }
}
