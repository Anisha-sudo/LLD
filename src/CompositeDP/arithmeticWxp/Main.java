package CompositeDP.arithmeticWxp;

public class Main {

    public static void main(String[] args) {
        ArithmeticExp number1=new Number(6);
        ArithmeticExp number2=new Number(5);
        ArithmeticExp number3=new Number(3);
        ArithmeticExp childexp=new Expression(number1,number2,Operation.MUL);
        ArithmeticExp mainExp=new Expression(childexp,number3,Operation.ADD);
        mainExp.evaluate();

    }
}
