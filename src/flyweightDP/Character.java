package flyweightDP;

public class Character {
    char character;//intrinsic
    String fontType;//intrinsic
    int size;//intrinsic
    int row;//extrinsic
    int col;//extrinsic
    String color;//intrinsic

    Character (char character,String fontType,int size,int row,int col,String color){
        this.character=character;
        this.fontType=fontType;
        this.size=size;
        this.row=row;
        this.col=col;
        this.color=color;
    }
    //getters and setters
}
