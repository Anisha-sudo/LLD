package snake$ladder;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
public class Game {
      boolean winner;
      Board board;
      Deque<Player> playerQueue;
      Dice dice;

    public Game(int boardSize){
        playerQueue = new ArrayDeque<>();
        this.board=new Board(boardSize);
        dice=new Dice(1);
        winner=true;
        initializeGame();
    }

    public void initializeGame(){
        board.addSnakes$Ladder(2,2);

        addPlayers();
        startGame();

    }
    public void startGame(){
        System.out.println("Starting game..........");
        while(winner){
            Player activePlayer=playerQueue.removeFirst();
            System.out.println(activePlayer.getName()+" is playing");
            int diceValue=dice.rollDice();

            activePlayer.move(diceValue);
            int newPosition=activePlayer.getPosition();
            int x=newPosition/10;
            int y=newPosition%10;

            if(newPosition < board.size && board.cells[x][y]!=null && board.cells[x][y].jump!=null &&
            board.cells[x][y].value==newPosition ) {
                System.out.println(activePlayer.getName()+" jumped from "+newPosition+" to "+board.cells[newPosition / 10][newPosition % 10].jump.to);
                activePlayer.move(board.cells[newPosition / 10][newPosition % 10].jump.to);
            }
            if(activePlayer.getPosition()==board.size-1){
                winner=false;
                System.out.println(activePlayer.getName()+" won the game");
            }
            playerQueue.addLast(activePlayer);

        }
    }
    public void addPlayers(){
        System.out.println("Adding players to board");
        Player p1=new Player(1,"anisha");
        Player p2=new Player(2,"aditi");
        playerQueue.addAll(Arrays.asList(p1,p2));
    }



}
