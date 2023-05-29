import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game2 {
    HashMap<String, Player> players = new HashMap<>();

    public void register(Player player) {
        players.put(player.getName(), player);// в отличие от коллекции arraylist здесь метод put

    }

    public int round(String playerName1, String playerName2) {
        Player player1 = players.get(playerName1); //кладем сразу 2 игроков со значением их имени, которое вынимаем методом get
        Player player2 = players.get (playerName2); // в отличие от arraylist, где мы сначала кладем пустые значения, а потом после перебора всех игроков, заполняем нужными значениями

        if (player1 == null) { //здесь именно самого игрока нет в списке регистрации, а не его имени
            throw new NotRegisteredException(playerName1);
        }

        if (player2 == null) {
            throw new NotRegisteredException(playerName2);
        }

        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }

        if (player2.getStrength() > player1.getStrength()) {
            return 2;
        }
        return 0;
    }

}
