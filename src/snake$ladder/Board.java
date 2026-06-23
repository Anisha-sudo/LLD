package snake$ladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    int size;
    public Cell[][] cells;
    Board(int size){
        this.size=size;
        cells=new Cell[size/10][size/10];
    }
    public void addSnakes$Ladder(int snakeCount,int ladderCount){
        System.out.println("Adding Snakes and Ladders to board");
        while(snakeCount>0){
            int from= ThreadLocalRandom.current().nextInt(1, size);
            int to=ThreadLocalRandom.current().nextInt(1, size);
            if(to<from){
                System.out.println("Snake added from "+from+" to "+to);
                cells[from/10][from%10]=new Cell(from,new Jump(from ,to));
                snakeCount--;
            }
        }
        while(ladderCount>0){
            int from= ThreadLocalRandom.current().nextInt(1, size);
            int to=ThreadLocalRandom.current().nextInt(1, size);

            if(to>from){
                System.out.println("Ladder added from "+from+" to "+to);
                cells[from/10][from%10]=new Cell(from,new Jump(from ,to));
                ladderCount--;
            }
        }
    }

}
