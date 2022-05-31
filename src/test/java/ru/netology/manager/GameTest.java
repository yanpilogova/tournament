package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Player;
import ru.netology.exception.NotRegisteredException;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game = new Game();

    @Test
    void findPlayerNull() {

        assertThrows(NotRegisteredException.class, () -> {
            game.round("Ivan", "Vlad");
        });
    }

    @Test
    void shouldCheckForRegisteredPlayers() {
        Player player1 = new Player(1, "Ivan", 100, true);
        Player player2 = new Player(2, "Vlad", 110, true);
        game.register(player1);
        game.register(player2);

        int expected = 2;
        int actual = game.round("Ivan", "Vlad");

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckForRegisteredPlayers2() {
        Player player1 = new Player(2, "Vlad", 110, true);
        Player player2 = new Player(3, "Tolya", 110, true);
        game.register(player1);
        game.register(player2);

        int expected = 0;
        int actual = game.round("Vlad", "Tolya");

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckForRegisteredPlayers3() {
        Player player1 = new Player(2, "Vlad", 110, true);
        Player player2 = new Player(3, "Tolya", 1100, true);
        game.register(player1);
        game.register(player2);

        int expected = 2;
        int actual = game.round("Vlad", "Tolya");

        assertEquals(expected, actual);
    }

    @Test
    void register() {
    }

    @Test
    void findStrength() {
    }

    @Test
    void round() {
    }
}