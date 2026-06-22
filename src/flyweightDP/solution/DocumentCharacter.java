package flyweightDP.solution;

public class DocumentCharacter implements  Letter{
     //class will be immutable
    //keep all intrinsic data that can be shared across objects private and only add getters for them;
    private final char character;//intrinsic
    private final String fontType;//intrinsic
    private final int size;//intrinsic
    private final String color;//intrinsic

    public DocumentCharacter(char character, String fontType, int size, String color){
        this.character=character;
        this.fontType=fontType;
        this.size=size;
        this.color=color;
    }

    public void display(int row,int col){
        System.out.println(character+"("+row+","+col+")"+"fontType:"+fontType+"size:"+size+"color:"+color);
    }

}
