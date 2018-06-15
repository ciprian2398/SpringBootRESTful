package factory;

import model.Player;
import model.Specification;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository {
    List<Player> players = new ArrayList<>();

    {
        Player p1 = new Player(new Specification("Maradonna", 30));
        players.add(p1);
        Player p2 = new Player(new Specification("Dima", 18));
        players.add(p2);
        Player p3 = new Player(new Specification("Adrian", 1));
        players.add(p3);

    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void insertPlayer(Player player) {
        players.add(player);
    }

    public Player getPlayer(String name){
        List<Player> players = new ArrayList<>();
        players.stream().filter(player -> player.getName().equals(name)).forEach(players::add);
        return players.isEmpty()?null:players.get(0);
    }
}
