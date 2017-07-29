package taskGame;

/**
 * Created by arabk on 29.07.2017.
 */
public class MainForGame {
    public static void main(String[] args) {
        Player p1 = new Player("Luk1", "user1");
        Player p2 = new Player("Luk2", "user2");
        Player p3 = new Player("Luk3", "user3");

        p1.setPoints(101);
        p2.setPoints(102);
        p3.setPoints(1000);

        Game game = new Game("Kulki");

        game.addPlayer(p1);
        game.addPlayer(p2);
        game.addPlayer(p3);

        System.out.println("wygrał: "+game.winner());
        p2.addPoints(10000);
        System.out.println("a teraz: "+game.winner());

    }
}
