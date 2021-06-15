/*
 * Задача №3
 * Необходимо написать функцию, которая на вход получает массив строк,
 * в формате имя_игрока количество_очков.
 * Необходимо вывести победителя данной игры. Победителем считается тот,
 * кто раньше набрал максимальное количество очков.
 * Входные данные = "Ivan 5", "Petr 3", "Alex 10", "Petr 8", "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"
 */
 
import models.Car;
 
import java.util.*;
 
public class HW3_ex3 {
    public static void main(String[] args) {
        System.out.println("Задача № 3");
        String[] players = {"Ivan 5", "Petr 3", "Alex 10", "Petr 10", "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"};
 
        System.out.println("Было: " + Arrays.toString(players));
        System.out.println("Победитель: " + howWinner(players));
    }
 
    public static String howWinner(String[] players) {
        HashMap<Integer, String> playersCollection = new HashMap<>();
 
        for (String player : players) {
            String playerName = player.split(" ")[0];
            int playerScore = Integer.valueOf(player.split(" ")[1]);
 
            if (playersCollection.getOrDefault(playerScore, "").isEmpty())
                playersCollection.put(playerScore, playerName);
        }
 
        int winnerKey = Collections.max(playersCollection.keySet());
        return playersCollection.get(winnerKey);
    }
}
