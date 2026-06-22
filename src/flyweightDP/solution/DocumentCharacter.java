package flyweightDP.solution;

public class DocumentCharacter implements  Letter{
     //class will be immutable
    //keep all intrinsic data that can be shared across objects private and only add getters for them;
    //can't make it static because static will overwrite the static values as one single memory location will be shared.
    //incase of flyweight we are just avoiding creating obj itself if we already have in cache with same char and make class such that
    //intrinsic data is not mutable(private and final only set once via constructor and no setter) and extrinsic data is mutable exposed via methods.
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
