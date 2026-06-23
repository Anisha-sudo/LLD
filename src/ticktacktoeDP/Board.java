package ticktacktoeDP;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    public Symbol[][]board;

    public Board(int size){
        this.size=size;
        board= new Symbol[size][size];
    }
    public boolean addPiece(Symbol symbol,int x,int y){
        if(board[x][y]!=null){
            return false;
        }
        board[x][y]=symbol;
        return true;
    }
    public List<Pair<Integer,Integer>> getFreeCells(){
        List<Pair<Integer,Integer>> freeCells= new ArrayList<>();
        for(int i=0;i<size;i++ ){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    freeCells.add(new Pair<>(i,j));
                }
            }
        }
        return freeCells;
    }
}
