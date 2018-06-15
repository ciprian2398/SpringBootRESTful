package model;

import enums.PlayerRole;
import enums.Skill;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Player {
    public Skill skill;
    private String name;
    private PlayerRole playerRole;

    public Player() {
    }

    public Player(Specification specification) {
        this.name = specification.getName();
        this.playerRole = specification.getPlayerRole();
        if (specification.getSpeed() < 10) {
            this.skill = Skill.AMATEOUR;
        } else if (specification.getSpeed() < 20) {
            this.skill = Skill.PRPOFESSIONAL;
        } else {
            this.skill = Skill.GODLIKE;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public PlayerRole getPlayerRole() {
        return playerRole;
    }

    public void setPlayerRole(final PlayerRole playerRole) {
        this.playerRole = playerRole;
    }


    public Skill getSkill() {
        return skill;
    }

    public void setSkill(final Skill skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Iaka model.Player{" +
                "skill=" + skill +
                ", name='" + name + '\'' +
                ", playerRole=" + playerRole +
                '}';
    }
}