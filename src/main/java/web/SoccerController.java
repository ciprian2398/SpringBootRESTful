package web;

import enums.PlayerRole;
import factory.GameFactory;
import model.Player;
import model.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SoccerController {
    private GameFactory gameFactory = new GameFactory();

    @RequestMapping("/all")
    public List<Player> greeting() {
        return gameFactory.getAllPlayers();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public Player greeting(
            @RequestParam(value = "name", defaultValue = "dafaultName") String name,
            @RequestParam(value = "speed", defaultValue = "dafaultSpeed") int speed,
            @RequestParam(value = "role", defaultValue = "dafaultRole") String role
    ) {
        Specification specification = new Specification(name,speed, PlayerRole.ATTACKER);

        gameFactory.addPlayer(new Player(specification));
        return gameFactory.getPlayer(name);
    }

}
