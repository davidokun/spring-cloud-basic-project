package com.singletonapps.game.service;

import com.singletonapps.game.model.Game;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    private List<Game> gameList;

    @PostConstruct
    public void init(){
        gameList = new ArrayList<>();

        gameList.add(new Game(1, "The Legend of Zelda"));
        gameList.add(new Game(2, "Final Fantasy"));

    }

    public List<Game> getGames(){

        return gameList;
    }

    public Optional<Game> getGame(int id){

        return gameList
                .stream()
                .filter(g -> g.getId() == id)
                .findFirst();
    }
}
