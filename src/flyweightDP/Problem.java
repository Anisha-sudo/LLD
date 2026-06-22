package flyweightDP;

public class Problem {
    public static void main(String[] args) {
        String text="Hello World";
        for(int i=0;i<text.length();i++){
            //each time we make new object even if we get same character again.
         Character character=new Character(text.charAt(i),"Arial",12,i,0,"black");
        }
    }
}
