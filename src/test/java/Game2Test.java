import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class Game2Test {
    @Test
    public void testWhenPlayer2Wins() { //пишем название теста
        Player john = new Player(23, "John", 10); //кладем игроков
        Player nick = new Player(73, "Nick", 12);
        Game2 game2 = new Game2();// кладем объект
        game2.register(john); //регистрируем каждого игрока, кладем переменную
        game2.register(nick);

        int expected = 2;
        int actual = game2.round("John", "Nick"); //
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWhenPlayer1Wins() { //пишем название теста
        Player john = new Player(23, "John", 12); //кладем игроков
        Player nick = new Player(73, "Nick", 10);
        Game2 game2 = new Game2();// кладем объект
        game2.register(john); //регистрируем каждого игрока
        game2.register(nick);

        int expected = 1;
        int actual = game2.round("John", "Nick"); // кладем значения переменных
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWhenPlayersAreEqual() { //пишем название теста
        Player john = new Player(23, "John", 10); //кладем игроков
        Player nick = new Player(73, "Nick", 10);
        Game2 game2 = new Game2();// кладем объект
        game2.register(john); //регистрируем каждого игрока
        game2.register(nick);

        int expected = 0;
        int actual = game2.round("John", "Nick"); // кладем значения переменных
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWhenPlayerNotExist() { //пишем название теста
        Player john = new Player(23, "John", 10); //кладем игроков
        Player nick = new Player(73, "Nick", 10);
        Game2 game2 = new Game2();// кладем объект
        game2.register(john); //регистрируем каждого игрока
        game2.register(nick);
        Assertions.assertThrows(NotRegisteredException.class, () -> game2.round("Mike", "Nick"));

    }

    @Test
    public void testWhenPlayerNotExist2() { //пишем название теста
        Player john = new Player(23, "John", 10); //кладем игроков
        Player nick = new Player(73, "Nick", 10);
        Game2 game2 = new Game2();// кладем объект
        game2.register(john); //регистрируем каждого игрока
        game2.register(nick);
        Assertions.assertThrows(NotRegisteredException.class, () -> game2.round("John", "Mike"));

    }

    @Test
    public void testWhenPlayerNotExist3() { //пишем название теста
        Player john = new Player(23, "John", 10); //кладем игроков
        Player nick = new Player(73, "Nick", 10);
        Game2 game2 = new Game2();// кладем объект
        game2.register(john); //регистрируем каждого игрока
        game2.register(nick);
        Assertions.assertThrows(NotRegisteredException.class, () -> game2.round("Kate", "Mike"));

    }
}