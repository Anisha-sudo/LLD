package ticktacktoeDP;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Game {

    Deque<Player> players = new ArrayDeque<>();
    Board board;

    public Game(){
       initializeGame();
    }

    public void initializeGame(){
        SymbolO symbolO=new SymbolO();
        Player p1=new Player(symbolO,"anisha");

        SymbolX symbolX=new SymbolX();
        Player p2= new Player(symbolX,"sasank");

        players.add(p1);
        players.add(p2);

        board = new Board(3);
    }

    public String startGame(){
        boolean noWinner=true;

        while(noWinner) {

            Player playerTurn = players.removeFirst();

            List<Pair<Integer,Integer>> freeSpaces= board.getFreeCells();
            if(freeSpaces.isEmpty()){
                noWinner=false;
                continue;
            }

            System.out.println("Player :" +playerTurn.name +" \nEnter row,col: ");
            Scanner sc= new Scanner(System.in);
            String s= sc.nextLine();
            String[] values =s.split(",");
            int inputRow =Integer.valueOf(values[0]);
            int inputCol =Integer.valueOf(values[1]);

            boolean pieceAdd= board.addPiece(playerTurn.symbol,inputRow,inputCol);
            if(!pieceAdd){
                System.out.println("Incorrect position,try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn); 

            boolean winner=isThereWinner(inputRow,inputCol,playerTurn.symbol);
            if(winner){
                return "winner is:"+playerTurn.name;
            }
        }
        return "tie";

    }

    boolean isThereWinner(int x,int y, Symbol symbol){
       boolean isRowMatch=true;
       boolean isColMatch=true;
       boolean isLeftDiagonalMatch=true;
       boolean isRightDiagonalMatch=true;

       for(int i=0;i<board.size;i++){
           if(board.board[i][x]!=symbol || board.board[i][y]==null){
               isRowMatch=false;
           }
       }
        for(int i=0;i<board.size;i++){
            if(board.board[y][i]!=symbol || board.board[y][i]==null){
                isColMatch=false;
            }
        }
        for(int i=0,j=0;i<board.size;i++,j++){
            if(board.board[i][j]!=symbol || board.board[i][j]==null){
                isLeftDiagonalMatch=false;
            }
        }
        for(int i=0,j=board.size-1;i<board.size;i++,j--){
            if(board.board[i][j]!=symbol || board.board[i][j]==null){
                isRightDiagonalMatch=false;
            }
        }
        return isRowMatch || isColMatch || isLeftDiagonalMatch || isRightDiagonalMatch;
    }
}
