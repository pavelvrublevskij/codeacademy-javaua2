import model.BasketballPlayer;
import model.FootballPlayer;
import model.Player;
import model.Team;

public class Main {

    public static void main(String[] args) {
        System.out.println("hey");

        BasketballPlayer sabonis = new BasketballPlayer("Arvydas", "Sabonis", 11, 2.20);
        BasketballPlayer jasikevicius = new BasketballPlayer("Sarunas", "Jasikevicius", 13, 1.92);

        Team<BasketballPlayer> zalgiris = new Team<>();
        zalgiris.addPlayer(sabonis);
        zalgiris.addPlayer(jasikevicius);

        FootballPlayer ronaldo = new FootballPlayer("Cristiano", "Ronaldo", 7, 0.86);
        FootballPlayer benzema = new FootballPlayer("Karim",  "Benzema", 11, 0.90);

        Team<FootballPlayer> realMadrid = new Team<>();
        realMadrid.addPlayer(ronaldo);
        realMadrid.addPlayer(benzema);

        Team<Player> allPlayers = new Team<>();
        allPlayers.addPlayer(sabonis);
        allPlayers.addPlayer(ronaldo);



    }

}
