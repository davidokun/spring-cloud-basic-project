package com.singletonapps.game.controller;

import com.singletonapps.game.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("v1")
public class GameController {

    @Autowired
    private Game game;

    @GetMapping("game")
    public List<Game> getAllGames(){

        return null;
    }

    @GetMapping("game/{id}")
    public Game getGame(@PathVariable int id){
        game.setId(id);
        return game;
    }




}
