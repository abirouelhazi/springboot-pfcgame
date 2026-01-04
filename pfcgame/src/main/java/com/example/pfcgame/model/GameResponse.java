package com.example.pfcgame.model;

public class GameResponse {
    private String playerChoice;
    private String computerChoice;
    private String result;

    public GameResponse(String playerChoice, String computerChoice, String result) {
        this.playerChoice = playerChoice;
        this.computerChoice = computerChoice;
        this.result = result;
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public String getResult() {
        return result;
    }
}
