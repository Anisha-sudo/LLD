package CompositeDP.arithmeticWxp;

public class Number implements ArithmeticExp{
    int num;
    public Number(int num){
        this.num=num;
    }
    public int evaluate(){
        System.out.println("this is a num "+num);
        return num;
    }
}
