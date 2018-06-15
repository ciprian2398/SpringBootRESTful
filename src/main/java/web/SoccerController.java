package web;

import enums.PlayerRoleConverter;
import factory.GameFactory;
import model.Player;
import model.Specification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/game")
@RestController
public class SoccerController {
    @Autowired
    private GameFactory gameFactory;

    @RequestMapping("/all")
    public List<Player> greeting() {
        return gameFactory.getAllPlayers();
    }

    @RequestMapping(value = "/insert",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public @ResponseBody Player greeting(
            @RequestParam(value = "name", defaultValue = "dafaultName") String name,
            @RequestParam(value = "speed", defaultValue = "dafaultSpeed") int speed,
            @RequestParam(value = "role", defaultValue = "dafaultRole") String role
    ) {
        Specification specification = new Specification(name, speed, PlayerRoleConverter.getRole(role));

        gameFactory.addPlayer(new Player(specification));
        return gameFactory.getPlayer(name);
    }

}
