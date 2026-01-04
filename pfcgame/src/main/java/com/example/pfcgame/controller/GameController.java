package com.example.pfcgame.controller;


import com.example.pfcgame.model.GameRequest;
import com.example.pfcgame.model.GameResponse;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@CrossOrigin(origins = "*") // Permet au frontend Angular d'appeler l'API
public class GameController {

    private static final String[] CHOICES = {"pierre", "feuille", "ciseaux"};

    @PostMapping("/play")
    public GameResponse play(@RequestBody GameRequest request) {
        String playerChoice = request.getPlayerChoice();
        String computerChoice = getRandomChoice();
        String result = getResult(playerChoice, computerChoice);
        return new GameResponse(playerChoice, computerChoice, result);
    }

    private String getRandomChoice() {
        Random random = new Random();
        int index = random.nextInt(3);
        return CHOICES[index];
    }

    private String getResult(String player, String computer) {
        if (player.equals(computer)) return "égalité";

        if (
            (player.equals("pierre") && computer.equals("ciseaux")) ||
            (player.equals("feuille") && computer.equals("pierre")) ||
            (player.equals("ciseaux") && computer.equals("feuille"))
        ) {
            return "gagné";
        }
        return "perdu";
    }
}
