import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class GameTest {
    @Test
    public void testWhenPlayer2Wins() { //пишем название теста
        Player john = new Player(23, "John", 10); //кладем игроков
        Player nick = new Player(73, "Nick", 12);
        Game game = new Game();// кладем объект
        game.register(john); //регистрируем каждого игрока, кладем переменную
        game.register(nick);

        int expected = 2;
        int actual = game.round("John", "Nick"); //
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWhenPlayer1Wins() { //пишем название теста
        Player john = new Player(23, "John", 12); //кладем игроков
        Player nick = new Player(73, "Nick", 10);
        Game game = new Game();// кладем объект
        game.register(john); //регистрируем каждого игрока
        game.register(nick);

        int expected = 1;
        int actual = game.round("John", "Nick"); // кладем значения переменных
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWhenPlayersAreEqual() { //пишем название теста
        Player john = new Player(23, "John", 10); //кладем игроков
        Player nick = new Player(73, "Nick", 10);
        Game game = new Game();// кладем объект
        game.register(john); //регистрируем каждого игрока
        game.register(nick);

        int expected = 0;
        int actual = game.round("John", "Nick"); // кладем значения переменных
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWhenPlayerNotExist() { //пишем название теста
        Player john = new Player(23, "John", 10); //кладем игроков
        Player nick = new Player(73, "Nick", 10);
        Game game = new Game();// кладем объект
        game.register(john); //регистрируем каждого игрока
        game.register(nick);
        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Mike", "Nick"));

    }

    @Test
    public void testWhenPlayerNotExist2() { //пишем название теста
        Player john = new Player(23, "John", 10); //кладем игроков
        Player nick = new Player(73, "Nick", 10);
        Game game = new Game();// кладем объект
        game.register(john); //регистрируем каждого игрока
        game.register(nick);
        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("John", "Mike"));

    }

    @Test
    public void testWhenPlayerNotExist3() { //пишем название теста
        Player john = new Player(23, "John", 10); //кладем игроков
        Player nick = new Player(73, "Nick", 10);
        Game game = new Game();// кладем объект
        game.register(john); //регистрируем каждого игрока
        game.register(nick);
        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Kate", "Mike"));

    }
}

