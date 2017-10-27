package com.singletonapps.game.controller;

import com.singletonapps.game.model.Game;
import com.singletonapps.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("v1")
public class GameController {


    @Autowired
    private GameService gameService;


    @GetMapping("game")
    public List<Game> getAllGames(){

        return gameService.getGames();
    }


    @GetMapping("game/{id}")
    public Game getGame(@PathVariable int id){

        return gameService.getGame(id);
    }

}
