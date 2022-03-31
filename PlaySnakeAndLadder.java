package snakeandladder;

import java.util.*;

public class PlaySnakeAndLadder {
    public static void main(String[] args) {
        Dice dice=new Dice(1);
        Player player1=new Player("1","Cuchu");
        Player player2=new Player("2","Tuku");
        Queue<Player> allPlayers=new LinkedList<>();
        allPlayers.add(player1);
        allPlayers.add(player2);
        Jumper l1=new Jumper(23,78);
        Jumper l2=new Jumper(33,55);
        List<Jumper> ladders=new ArrayList<>();
        ladders.add(l1);
        ladders.add(l2);
        List<Jumper> snakes=new ArrayList<>();
        Jumper s1=new Jumper(62,34);
        Jumper s2=new Jumper(96,26);
        ladders.add(s1);
        ladders.add(s2);
        Map<String,Integer> playersCurrentPosition=new HashMap<>();
        playersCurrentPosition.put("Cuchu",0);
        playersCurrentPosition.put("Tuku",0);
        GameBoard gb=new GameBoard(dice,allPlayers,snakes,ladders,playersCurrentPosition,100);
        gb.startGame();
    }
}
