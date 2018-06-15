package web;

import factory.GameFactory;
import factory.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @Autowired
    public GameFactory gameFactory(PlayerRepository playerRepository){
        return new GameFactory(playerRepository);
    }

    @Bean
    public PlayerRepository playerRepository(){
        return new PlayerRepository();
    }

}
