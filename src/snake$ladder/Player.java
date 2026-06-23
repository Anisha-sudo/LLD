package snake$ladder;

public class Player {
    int id;
    String name;
    int position;
    Player(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getPosition(){
        return this.position;
    }
    public String getName(){
        return name;
    }
    public void move(int steps){
        this.position=this.position+steps;
    }

}
