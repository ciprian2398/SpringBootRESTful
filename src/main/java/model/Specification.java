package model;

import enums.PlayerRole;

public class Specification {

    private PlayerRole playerRole;
    private String name;
    private Integer speed;

    public Specification() {
    }

    public Specification(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public Specification(String name, int speed, PlayerRole playerRole) {
        this.name = name;
        this.speed = speed;
        this.playerRole = playerRole;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    public PlayerRole getPlayerRole() {
        return playerRole;
    }

    public void setPlayerRole(final PlayerRole playerRole) {
        this.playerRole = playerRole;
    }
}
