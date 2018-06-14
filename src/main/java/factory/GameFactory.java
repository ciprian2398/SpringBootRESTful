package factory;

import model.Player;
import model.Specification;

import java.util.List;

public class GameFactory {


    PlayerRepository playerRepository = new PlayerRepository();

    public Player createPlayer() {
        return new Player(new Specification("Default Name", 25));
    }

    public Player createPlayer(Specification specification) {
        return new Player(specification);
    }

    public void addPlayer(Player player) {
        playerRepository.insertPlayer(player);
    }

    public List<Player> getAllPlayers() {
        return playerRepository.getPlayers();
    }

    public Player getPlayer(String name){
        return playerRepository.getPlayer(name);
    }
}