package ru.netology.manager;

import ru.netology.domain.Player;
import ru.netology.exception.NotRegisteredException;

import java.util.ArrayList;
import java.util.Collection;

public class Game {
    private Collection<Player> players = new ArrayList<>();

    public Game() {
    }

    public Game(Collection<Player> players) {
        this.players = players;
    }

    public Collection<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Collection<Player> players) {
        this.players = players;
    }

    public void register(Player player) {
        players.add(player);
    }

    public int findStrength(String playerName) {
        for (Player player : players) {
            if (player.getName().equals(playerName)) {
                return player.getStrength();
            }
        }
        return 0;
    }

    public int round(String playerName1, String playerName2) {

        int strengthPLayer1 = findStrength(playerName1);
        int strengthPLayer2 = findStrength(playerName2);

        if (strengthPLayer1 == 0) {
            throw new NotRegisteredException("Игрок не зарегистрирован");
        }
        if (strengthPLayer2 == 0) {
            throw new NotRegisteredException("Игрок не зарегистрирован");
        }
        if (strengthPLayer1 > strengthPLayer2) {
            return 1;
        }
        if (strengthPLayer2 > strengthPLayer1) {
            return 2;
        }
        return 0;
    }
}


